
package prácticoextra7;

import javax.swing.JOptionPane;

public class Ventana2 extends javax.swing.JFrame {

    private Empresa empresa;
    
    public Ventana2(Empresa empresa) {
        initComponents();
        
        this.empresa=empresa;
        
        limpiarCampos();
    }
    
    public void limpiarCampos()
    {
        cboTipo.setSelectedIndex(-1);
        cboMarca.setSelectedIndex(-1);
        txtCodigo.setText("");
        txtModelo.setText("");
        cboProcedencia.setSelectedIndex(-1);
        txtPrecio.setText("");
        txtSistOperativo.setText("");
        txtCantMemoria.setText("");
        rbtBlanco.setSelected(false);
        rbtNegro.setSelected(false);
        chkA4.setSelected(false);
        chkA3.setSelected(false);
        chkA2.setSelected(false);
    }
    
    public boolean validarCampos()
    {
        boolean validar=true;
        if(cboTipo.getSelectedIndex()==-1)
        {
            validar=false;
        }
        if(cboMarca.getSelectedIndex()==-1)
        {
            validar=false;
        }
        if(txtCodigo.getText().equals(""))
        {
            validar=false;
        }
        if(txtModelo.getText().equals(""))
        {
            validar=false;
        }
        if(cboProcedencia.getSelectedIndex()==-1)
        {
            validar=false;
        }
        if(txtPrecio.getText().equals(""))
        {
            validar=false;
        }
        if(cboTipo.getSelectedIndex()==0)
        {
            if(txtSistOperativo.getText().equals(""))
            {
                validar=false;
            }
            if(txtCantMemoria.getText().equals(""))
            {
                validar=false;
            }
        }
        if(cboTipo.getSelectedIndex()==1)
        {
            if(rbtBlanco.isSelected()==false && rbtNegro.isSelected()==false)
            {
                validar=false;
            }
            if(chkA4.isSelected()==false && chkA3.isSelected()==false && chkA2.isSelected()==false)
            {
                validar=false;
            }
        }
        if(validar==false)
        {
            JOptionPane.showMessageDialog(null, "Debe Completar todos los Campos");
        }
        return validar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cboMarca = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cboProcedencia = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblSistema = new javax.swing.JLabel();
        txtSistOperativo = new javax.swing.JTextField();
        lblMemoria = new javax.swing.JLabel();
        txtCantMemoria = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblColor = new javax.swing.JLabel();
        rbtBlanco = new javax.swing.JRadioButton();
        rbtNegro = new javax.swing.JRadioButton();
        lblPapel = new javax.swing.JLabel();
        chkA4 = new javax.swing.JCheckBox();
        chkA3 = new javax.swing.JCheckBox();
        chkA2 = new javax.swing.JCheckBox();
        jSeparator5 = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Carga de Productos");

        jLabel2.setText("Tipo de Producto: ");

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computadora", "Impresora" }));
        cboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoActionPerformed(evt);
            }
        });

        jLabel3.setText("Marca: ");

        cboMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mac", "HP", "Samsung", "Lenovo" }));

        jLabel4.setText("Código: ");

        jLabel5.setText("Modelo:");

        jLabel6.setText("Procedencia:");

        cboProcedencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Argentina", "Estados Unidos", "China" }));

        jLabel7.setText("Precio: ");

        lblSistema.setText("Sistema Operativo:");

        lblMemoria.setText("Cantidad de Memoria: ");

        lblColor.setText("Color: ");

        rbtBlanco.setText("Blanco");

        rbtNegro.setText("Negro");

        lblPapel.setText("Papel que Soporta: ");

        chkA4.setText("A4");

        chkA3.setText("A3");

        chkA2.setText("A2");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator4)
            .addComponent(jSeparator5)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(94, 94, 94)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel2))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cboMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCodigo)
                                        .addComponent(cboProcedencia, 0, 176, Short.MAX_VALUE)
                                        .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSistema)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSistOperativo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblMemoria)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCantMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblColor)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbtBlanco)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rbtNegro)
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addGap(220, 220, 220)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPapel)
                                .addGap(18, 18, 18)
                                .addComponent(chkA4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkA3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkA2)))
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(btnRegistrar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cboProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSistema)
                            .addComponent(txtSistOperativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMemoria)
                            .addComponent(txtCantMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtBlanco)
                        .addGap(5, 5, 5))
                    .addComponent(lblColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtNegro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPapel)
                    .addComponent(chkA4)
                    .addComponent(chkA3)
                    .addComponent(chkA2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoActionPerformed
        
        if(cboTipo.getSelectedIndex()==0)
        {
            lblColor.setEnabled(false);
            rbtBlanco.setEnabled(false);
            rbtNegro.setEnabled(false);
            lblPapel.setEnabled(false);
            chkA4.setEnabled(false);
            chkA3.setEnabled(false);
            chkA2.setEnabled(false);
            lblSistema.setEnabled(true);
            txtSistOperativo.setEnabled(true);
            lblMemoria.setEnabled(true);
            txtCantMemoria.setEnabled(true);
        }
        if(cboTipo.getSelectedIndex()==1)
        {
            lblColor.setEnabled(true);
            rbtBlanco.setEnabled(true);
            rbtNegro.setEnabled(true);
            lblPapel.setEnabled(true);
            chkA4.setEnabled(true);
            chkA3.setEnabled(true);
            chkA2.setEnabled(true);
            lblSistema.setEnabled(false);
            txtSistOperativo.setEnabled(false);
            lblMemoria.setEnabled(false);
            txtCantMemoria.setEnabled(false);
        }
    }//GEN-LAST:event_cboTipoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(validarCampos()==true)
        {
            int marca=cboMarca.getSelectedIndex()+1;
            int codigo=Integer.parseInt(txtCodigo.getText());
            int modelo=Integer.parseInt(txtModelo.getText());
            int procedencia=cboProcedencia.getSelectedIndex()+1;
            float precio=Float.parseFloat(txtPrecio.getText());
            if(cboTipo.getSelectedIndex()==0)
            {
                String sistOperativo=txtSistOperativo.getText();
                int cantMemoria=Integer.parseInt(txtCantMemoria.getText());
                Computadora C=new Computadora(sistOperativo, cantMemoria, marca, codigo, modelo, procedencia, precio);
                empresa.agregarProducto(C);
            }
            if(cboTipo.getSelectedIndex()==1)
            {
                boolean color=true;
                if(rbtBlanco.isSelected())
                {
                    color=true;
                }
                else
                {
                    color=false;
                }
                int papel=0;
                if(chkA4.isSelected())
                {
                    papel=1;
                }
                if(chkA3.isSelected())
                {
                    papel=2;
                }
                if(chkA2.isSelected())
                {
                    papel=3;
                }
                Impresora I=new Impresora(color, papel, marca, codigo, modelo, procedencia, precio);
                empresa.agregarProducto(I);
            }
            
            JOptionPane.showMessageDialog(null, "Cargado Correctamente");
            
            limpiarCampos();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboMarca;
    private javax.swing.JComboBox<String> cboProcedencia;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JCheckBox chkA2;
    private javax.swing.JCheckBox chkA3;
    private javax.swing.JCheckBox chkA4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblMemoria;
    private javax.swing.JLabel lblPapel;
    private javax.swing.JLabel lblSistema;
    private javax.swing.JRadioButton rbtBlanco;
    private javax.swing.JRadioButton rbtNegro;
    private javax.swing.JTextField txtCantMemoria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSistOperativo;
    // End of variables declaration//GEN-END:variables
}
