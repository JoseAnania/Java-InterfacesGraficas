package prácticoextra6;

import javax.swing.JOptionPane;

public class Ventana extends javax.swing.JFrame {

    private Hotel hotel;

    public Ventana() {
        initComponents();

        hotel = new Hotel();

        limpiarCampos();
    }

    public void limpiarCampos() {
        cboReservas.setSelectedIndex(-1);
        txtNroHabitacion.setText("");
        txtDiasReservados.setText("");
        spiCantNinos.setValue(0);
        rbtSi.setSelected(false);
        rbtNo.setSelected(false);
    }

    public boolean validarCampos() {
        boolean validar = true;
        int tipoReserva=0;

        if (cboReservas.getSelectedIndex() == -1) {
            validar = false;
        }
        if (txtNroHabitacion.getText().equals("")) {
            validar = false;
        }
        if (txtDiasReservados.getText().equals("")) {
            validar = false;
        }
        if(tipoReserva==0)
        {
        if (spiCantNinos.getValue().equals(-1)) {
            validar = false;
        }
        }
        if(tipoReserva==1)
        {
        if(rbtSi.isSelected()==false && rbtNo.isSelected()==false)
        {
            validar=false;
        }
        }
        if (validar == false) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
        }
        return validar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNroHabitacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDiasReservados = new javax.swing.JTextField();
        lblNinos = new javax.swing.JLabel();
        cboReservas = new javax.swing.JComboBox<>();
        lblAsiste = new javax.swing.JLabel();
        rbtSi = new javax.swing.JRadioButton();
        rbtNo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtListado = new javax.swing.JTextArea();
        btnReservar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblFacturacion = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblRV = new javax.swing.JLabel();
        lblRN = new javax.swing.JLabel();
        spiCantNinos = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Reservas: ");

        jLabel2.setText("Nº de Habitación: ");

        jLabel3.setText("Días Reservados:");

        lblNinos.setText("Cantidad de Niños:");

        cboReservas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vacaciones", "Negocios" }));
        cboReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboReservasActionPerformed(evt);
            }
        });

        lblAsiste.setText("Asiste a Conferencia:");

        rbtSi.setText("Si");

        rbtNo.setText("No");

        txtListado.setColumns(20);
        txtListado.setRows(5);
        jScrollPane1.setViewportView(txtListado);

        btnReservar.setText("Reservar");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        jLabel6.setText("Total Facturado: ");

        lblFacturacion.setText("0");

        jLabel7.setText("Cantidad de Reservas de Vacaciones: ");

        jLabel8.setText("Cantidad de Reservas de Negocios: ");

        lblRV.setText("0");

        lblRN.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(lblNinos)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNroHabitacion)
                                    .addComponent(txtDiasReservados)
                                    .addComponent(cboReservas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spiCantNinos, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                        .addGap(86, 86, 86))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAsiste)
                                .addGap(18, 18, 18)
                                .addComponent(rbtSi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtNo)))
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(btnReservar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(lblFacturacion))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblRN))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(lblRV)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cboReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDiasReservados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNinos)
                            .addComponent(spiCantNinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAsiste)
                            .addComponent(rbtSi)
                            .addComponent(rbtNo)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(btnReservar)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblFacturacion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblRV))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblRN))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed

        if (validarCampos() == true) {
            int nroHabitacion = Integer.parseInt(txtNroHabitacion.getText());
            int diasReservados = Integer.parseInt(txtDiasReservados.getText());
            int tipoReserva = cboReservas.getSelectedIndex();

            if (tipoReserva == 0) {
                int cantNinos = (int) spiCantNinos.getValue();

                ReservaVacaciones RV = new ReservaVacaciones(cantNinos, nroHabitacion, diasReservados);
                hotel.agregarReserva(RV);
            }
            if (tipoReserva == 1) {
                boolean conferencia = true;

                if (rbtSi.isSelected()) {
                    conferencia = true;
                }
                if (rbtNo.isSelected()) {
                    conferencia = false;
                }

                ReservaNegocios RN = new ReservaNegocios(conferencia, nroHabitacion, diasReservados);
                hotel.agregarReserva(RN);
            }

            txtListado.setText(hotel.toString());
            lblFacturacion.setText("$" + hotel.calcularTarifa());
            lblRV.setText("" + hotel.cantidadPorTipo(0));
            lblRN.setText("" + hotel.cantidadPorTipo(1));

            limpiarCampos();
        }
    }//GEN-LAST:event_btnReservarActionPerformed

    private void cboReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboReservasActionPerformed
        
        if(cboReservas.getSelectedIndex()==0)
        {
            rbtSi.setVisible(false);
            rbtNo.setVisible(false);
            lblAsiste.setVisible(false);
            
            lblNinos.setVisible(true);
            spiCantNinos.setVisible(true);
        }
        if(cboReservas.getSelectedIndex()==1)
        {
            lblNinos.setVisible(false);
            spiCantNinos.setVisible(false);
            
            rbtSi.setVisible(true);
            rbtNo.setVisible(true);
            lblAsiste.setVisible(true);
        }
    }//GEN-LAST:event_cboReservasActionPerformed

    /**
     * @param args the command line arguments
     */
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
    private javax.swing.JButton btnReservar;
    private javax.swing.JComboBox<String> cboReservas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAsiste;
    private javax.swing.JLabel lblFacturacion;
    private javax.swing.JLabel lblNinos;
    private javax.swing.JLabel lblRN;
    private javax.swing.JLabel lblRV;
    private javax.swing.JRadioButton rbtNo;
    private javax.swing.JRadioButton rbtSi;
    private javax.swing.JSpinner spiCantNinos;
    private javax.swing.JTextField txtDiasReservados;
    private javax.swing.JTextArea txtListado;
    private javax.swing.JTextField txtNroHabitacion;
    // End of variables declaration//GEN-END:variables
}
