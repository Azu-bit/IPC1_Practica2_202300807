package Ventanas;

import Clases.Motocicleta;
import Clases.Piloto;
import Clases.Transporte;
import Clases.VehiculoEstandar;
import Clases.VehiculoPremium;
import Clases.Viaje;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VTransporte extends javax.swing.JFrame {
    //LSITAS HA UTILIZAR  
    /*ArrayList<Viaje> listaviajesGenerados = Undrive.Inicio.getListaViaje();
    
    public VTransporte() {
        this.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Usuario u = new Usuario();
                u.setVisible(true);
                dispose(); 
            }
        });  
        
        /*btnmotocicleta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                iniciarViaje("Motocicleta");
            }
        });

        btnestandar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                iniciarViaje("VehiculoEstandar");
            }
        });

        btnpremium.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                iniciarViaje("VehiculoPremium");
            }
        });*/      
    //}

    /*private void iniciarViaje(String tipoTransporte) {
        for (Viaje viaje : listaviajesGenerados) {
            Transporte transporte = viaje.getTransporte();
            if (transporte instanceof Motocicleta && tipoTransporte.equals("Motocicleta")) {
                iniciarRecorrido(transporte, viaje);
            } else if (transporte instanceof VehiculoEstandar && tipoTransporte.equals("VehiculoEstandar")) {
                iniciarRecorrido(transporte, viaje);
            } else if (transporte instanceof VehiculoPremium && tipoTransporte.equals("VehiculoPremium")) {
                iniciarRecorrido(transporte, viaje);
            }
        }
    }*/
    
    /*private void iniciarRecorrido(Transporte transporte, Viaje viaje) {
        Piloto piloto = transporte.getPilotoAsignado();
        Thread hilo = new Thread(transporte);
        this.add(transporte);
        
        JPanel panel = new JPanel();
        JButton btniniciar = new JButton("Iniciar");
        btniniciar.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        hilo.start();
                    }
                });
                panel.add(btniniciar);
                this.add(panel);
        
        //hilo.start();
        
        double comConsumido = transporte.getComConsumido();
        System.out.println("Combustible consumido: " + comConsumido);
        
        // Muestra la información del viaje en la interfaz
        String infoViaje = "Viaje iniciado en " + viaje.getInicio() + " y finaliza en " + viaje.getFIn() + " con distancia de " + viaje.getDistancia();
        System.out.println(infoViaje);
        
        if(piloto != null) {
            System.out.println("El piloto asignado es: " + piloto.getNombre());
            if(!piloto.Disponibilidad()) {
                System.out.println("El piloto no esta disponible para asignarle otro viaje");
            }
        } else {
            System.out.println("No hay piloto asignado al transporte ");
        }
        
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnmotocicleta = new javax.swing.JButton();
        btnestandar = new javax.swing.JButton();
        btnpremium = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnmotocicleta.setText("Iniciar Viaje");

        btnestandar.setText("Iniciar Viaje");

        btnpremium.setText("Iniciar Viaje");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(675, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnpremium)
                    .addComponent(btnestandar)
                    .addComponent(btnmotocicleta))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnmotocicleta)
                .addGap(109, 109, 109)
                .addComponent(btnestandar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(btnpremium)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnestandar;
    private javax.swing.JButton btnmotocicleta;
    private javax.swing.JButton btnpremium;
    // End of variables declaration//GEN-END:variables
}
