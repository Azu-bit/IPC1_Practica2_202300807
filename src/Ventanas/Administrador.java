package Ventanas;

import Serializacion.CargarRuta;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Administrador extends javax.swing.JFrame {
    
    public Administrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Menu menu = new Menu();
                menu.setVisible(true);
                dispose(); // Cierra la ventana actual
            }
        });
        
        lbimagen.setIcon(new ImageIcon("C:\\Users\\Manager\\OneDrive\\Escritorio\\INGENIERIA\\TERCER SEMESTRE\\IPC 1\\IPC1_Practica2_20230007\\src\\imagenes\\ruta.png"));     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btncarga = new javax.swing.JButton();
        btnhistorial = new javax.swing.JButton();
        lbimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMINISTRADOR");

        btncarga.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        btncarga.setForeground(new java.awt.Color(102, 102, 0));
        btncarga.setText("Carga de Rutas");
        btncarga.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btncarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargaActionPerformed(evt);
            }
        });

        btnhistorial.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        btnhistorial.setForeground(new java.awt.Color(102, 102, 0));
        btnhistorial.setText("Historial de Pedidos");
        btnhistorial.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btnhistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btncarga))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnhistorial))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lbimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lbimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncarga)
                .addGap(18, 18, 18)
                .addComponent(btnhistorial)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargaActionPerformed
        dispose(); //Cierra la ventana actual
        CargarRuta cargar = new CargarRuta();
        cargar.setVisible(true);
    }//GEN-LAST:event_btncargaActionPerformed

    private void btnhistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhistorialActionPerformed
        dispose(); //Cierra la ventana actual
        HistorialPedido pedido = new HistorialPedido();
        pedido.setVisible(true);
    }//GEN-LAST:event_btnhistorialActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncarga;
    private javax.swing.JButton btnhistorial;
    private javax.swing.JLabel lbimagen;
    // End of variables declaration//GEN-END:variables
}
