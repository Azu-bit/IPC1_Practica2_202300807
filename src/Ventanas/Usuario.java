package Ventanas;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Usuario extends javax.swing.JFrame {
    
    public Usuario() {
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
        
        lbimagen.setIcon(new ImageIcon("C:\\Users\\Manager\\OneDrive\\Escritorio\\INGENIERIA\\TERCER SEMESTRE\\IPC 1\\IPC1_Practica2_20230007\\src\\imagenes\\viaje.png"));     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbimagen = new javax.swing.JLabel();
        btngenerar = new javax.swing.JButton();
        btnver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btngenerar.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        btngenerar.setForeground(new java.awt.Color(102, 102, 0));
        btngenerar.setText("GENERAR VIAJE");
        btngenerar.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btngenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarActionPerformed(evt);
            }
        });

        btnver.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        btnver.setForeground(new java.awt.Color(102, 102, 0));
        btnver.setText("VER VIAJE");
        btnver.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btnver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btngenerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbimagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btngenerar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnver)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarActionPerformed
        
        VViajes viaje = new VViajes();
        viaje.setVisible(true);       
    }//GEN-LAST:event_btngenerarActionPerformed

    private void btnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverActionPerformed
        
        ViajeTransporte transporte = new ViajeTransporte();
        transporte.setVisible(true);
    }//GEN-LAST:event_btnverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngenerar;
    private javax.swing.JButton btnver;
    private javax.swing.JLabel lbimagen;
    // End of variables declaration//GEN-END:variables
}
