package prácticoextra4;

import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    private Editorial editorial;

    public Ventana() {
        initComponents();

        editorial = new Editorial();
        
        limpiarCampos();
        
    }

    public void limpiarCampos() {
        rbtNacional.setSelected(false);
        rbtInternacional.setSelected(false);
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtStock.setText("");
        cboTipoLibro.setSelectedIndex(-1);
        txtPrecio.setText("");
        cboProvincia.setSelectedIndex(-1);
        cboPais.setSelectedIndex(-1);
    }

    public boolean validarCampos() {
        boolean validar = true;

        if (!rbtNacional.isSelected() && !rbtInternacional.isSelected()) {
            validar = false;
        }
        if (txtCodigo.getText().equals("")) {
            validar = false;
        }
        if (txtDescripcion.getText().equals("")) {
            validar = false;
        }
        if (txtStock.getText().equals("")) {
            validar = false;
        }
        if (cboTipoLibro.getSelectedIndex() == -1) {
            validar = false;
        }
        if (txtPrecio.getText().equals("")) {
            validar = false;
        }
        if (validar == false) {
            JOptionPane.showMessageDialog(null, "Debe cargar todos los campos");
        }
        return validar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        cboTipoLibro = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JTextField();
        cboProvincia = new javax.swing.JComboBox<>();
        cboPais = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtListado = new javax.swing.JTextArea();
        btnAgregar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblStockLI = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblLIT = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblLIN = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblLIM = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblLII = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rbtNacional = new javax.swing.JRadioButton();
        rbtInternacional = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Agregar Libro"); // NOI18N

        jLabel1.setText("Código:");

        jLabel2.setText("Descripción:");

        jLabel3.setText("Stock: ");

        jLabel4.setText("Tipo Libro:");

        jLabel5.setText("Precio:");

        jLabel6.setText("Provincia: ");

        jLabel7.setText("País: ");

        cboTipoLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro de Texto", "Manual", "Novela", "Libro Infantil" }));

        cboProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Córdoba", "Santa Fe", "Buenos Aires" }));

        cboPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Italia", "Francia", "Alemania" }));

        txtListado.setColumns(20);
        txtListado.setRows(5);
        jScrollPane1.setViewportView(txtListado);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel8.setText("Precio del Libro: ");

        lblPrecio.setText("0");

        jLabel9.setText("Stock de Libros Internacionales: ");

        lblStockLI.setText("0");

        jLabel10.setText("Cantidad de Textos Internacionales:");

        lblLIT.setText("0");

        jLabel11.setText("Cantidad de Manuales Internacionales:");

        lblLIN.setText("0");

        jLabel12.setText("Cantidad de Novelas Internacionales: ");

        lblLIM.setText("0");

        jLabel13.setText("Cantidad de Infantiles Internacionales:");

        lblLII.setText("0");

        jLabel14.setText("Procedencia: ");

        rbtNacional.setText("Nacional");
        rbtNacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNacionalActionPerformed(evt);
            }
        });

        rbtInternacional.setText("Internacional");
        rbtInternacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtInternacionalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(lblPrecio))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(lblStockLI))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(lblLIT))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(lblLIN, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAgregar)
                                    .addComponent(lblLIM, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(lblLII)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPrecio))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(cboTipoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCodigo))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtStock))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(cboPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(cboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtNacional)
                                    .addComponent(rbtInternacional))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(rbtNacional)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                                .addComponent(rbtInternacional)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(35, 35, 35)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboTipoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cboPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblPrecio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblStockLI))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblLIT))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblLIM))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblLIN))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblLII))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (validarCampos() == true) {
            int codigo = Integer.parseInt(txtCodigo.getText());
            String descripcion = txtDescripcion.getText();
            int stock = Integer.parseInt(txtStock.getText());
            int tipoLibro = cboTipoLibro.getSelectedIndex() + 1;
            float precio = Float.parseFloat(txtPrecio.getText());

            if (rbtNacional.isSelected()) {
                int provincia = cboProvincia.getSelectedIndex() + 1;

                LibroNacional LN = new LibroNacional(provincia, codigo, descripcion, stock, tipoLibro, precio);
                editorial.agregarLibro(LN);
            }
            if (rbtInternacional.isSelected()) {
                int pais = cboPais.getSelectedIndex() + 1;

                LibroInternacional LI = new LibroInternacional(pais, codigo, descripcion, stock, tipoLibro, precio);
                editorial.agregarLibro(LI);
            }
            
            limpiarCampos();
            
            txtListado.setText(editorial.toString());
            lblPrecio.setText(""+editorial.calcularPrecio(tipoLibro));
            lblStockLI.setText(""+editorial.stockInternacionales());
            lblLIT.setText(""+editorial.cantidadLIporTipo(1));
            lblLIM.setText(""+editorial.cantidadLIporTipo(2));
            lblLIN.setText(""+editorial.cantidadLIporTipo(3));
            lblLII.setText(""+editorial.cantidadLIporTipo(4));
            
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void rbtNacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNacionalActionPerformed
        
        cboPais.setEnabled(false);
        cboProvincia.setEnabled(true);
    }//GEN-LAST:event_rbtNacionalActionPerformed

    private void rbtInternacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtInternacionalActionPerformed
        
        cboProvincia.setEnabled(false);
        cboPais.setEnabled(true);
    }//GEN-LAST:event_rbtInternacionalActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cboPais;
    private javax.swing.JComboBox<String> cboProvincia;
    private javax.swing.JComboBox<String> cboTipoLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLII;
    private javax.swing.JLabel lblLIM;
    private javax.swing.JLabel lblLIN;
    private javax.swing.JLabel lblLIT;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblStockLI;
    private javax.swing.JRadioButton rbtInternacional;
    private javax.swing.JRadioButton rbtNacional;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextArea txtListado;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
