package Ventanas;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnadmi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnusuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnadmi.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        btnadmi.setForeground(new java.awt.Color(102, 102, 0));
        btnadmi.setText("RUTA");
        btnadmi.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btnadmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadmiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("MENU");

        btnusuario.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        btnusuario.setForeground(new java.awt.Color(102, 102, 0));
        btnusuario.setText("VIAJE");
        btnusuario.setMargin(new java.awt.Insets(10, 14, 2, 14));
        btnusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnusuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnadmi, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(btnusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnadmi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnusuario)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnadmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadmiActionPerformed
        Administrador admi = new Administrador();
        admi.setVisible(true);
        
        /*String contraseña = "202300807";
        JPasswordField pf = new JPasswordField();
        int okCxl = JOptionPane.showConfirmDialog(null, pf, "Ingrese la contraseña:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (okCxl == JOptionPane.OK_OPTION) {
            String password = new String(pf.getPassword());
            if(password.equals(contraseña)){
                dispose(); //Cierra la ventana actual
                Administrador admi = new Administrador();
                admi.setVisible(true);
            }
        }*/
        /*if(JOptionPane.showInputDialog("Ingrese la contraseña:").equals(contraseña)){
            dispose(); //Cierra la ventana actual
            Administrador admi = new Administrador();
            admi.setVisible(true);
        }*/   
    }//GEN-LAST:event_btnadmiActionPerformed

    private void btnusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnusuarioActionPerformed
        dispose(); //Cierra la ventana actual
        Usuario usuario = new Usuario();
        usuario.setVisible(true);
    }//GEN-LAST:event_btnusuarioActionPerformed

    // Método para centrar la ventana en pantalla
    private void centrarVentana(JFrame ventana) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = ventana.getSize().width;
        int alto = ventana.getSize().height;

        int x = (dim.width - ancho) / 2;
        int y = (dim.height - alto) / 2;

        ventana.setLocation(x, y);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadmi;
    private javax.swing.JButton btnusuario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
