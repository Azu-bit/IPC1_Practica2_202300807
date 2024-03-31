package Ventanas;
import Clases.Historial;
import Clases.Lista;
import Clases.Piloto;
import Clases.Ruta;
import Clases.Transporte;
import Clases.Viaje;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;

public class VViajes extends javax.swing.JFrame {
    
    Lista listageneral = Undrive.Inicio.listas;
    ArrayList<Ruta> listarutas = Undrive.Inicio.getListaRutas();
    ArrayList<Transporte> listatransporte = Undrive.Inicio.getListaTransporte();
    ArrayList<Piloto> listapiloto = Undrive.Inicio.getListaPiloto();
    ArrayList<Viaje> listaviajes = Undrive.Inicio.getListaViaje();
    ArrayList<Historial> historialgenerado = new ArrayList<>();
    
    HashMap<Piloto, Boolean> pilotosDisponibles;
    
    public VViajes() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Usuario usuario = new Usuario();
                usuario.setVisible(true);
                dispose(); // Cierra la ventana actual
            }
        });
        
        this.listarutas = listarutas;
        
        cbInicio.removeAllItems();
        for(Ruta ruta: listarutas) {
            cbInicio.addItem(ruta.getInicio());
        }
        
        cbFinal.removeAllItems();
        for(Ruta ruta: listarutas) {
            cbFinal.addItem(ruta.getFinal());
        }
        
        cbTransporte.removeAllItems();
        for(Transporte transporte : listatransporte) {
            cbTransporte.addItem(transporte.getNombre());
        }
        
        pilotosDisponibles = new HashMap<>();
        for(Piloto piloto: listapiloto) {
            pilotosDisponibles.put(piloto, true);
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbInicio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbFinal = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbTransporte = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Seleccione Un Punto Inicial:");

        jLabel2.setFont(new java.awt.Font("Bodoni MT Black", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Seleccione Un punto Final:");

        jLabel3.setFont(new java.awt.Font("Bodoni MT Black", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Seleccione Tipo de Transporte:");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("Generar Viaje");
        jButton1.setMargin(new java.awt.Insets(9, 14, 2, 14));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(cbInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(83, 83, 83))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String inicio = (String) cbInicio.getSelectedItem();
        String fin = (String) cbFinal.getSelectedItem();
        String nTrans = (String) cbTransporte.getSelectedItem();
        
        Transporte transporte = null;
        for (Transporte t : listatransporte) {
            if (t.getNombre().equals(nTrans)) {
                transporte = t;
                break;
            }
        }
        if(transporte == null) {
            System.out.println("No se encontro el transporte: " + nTrans);
            return;
        }
        
        double distanciaP = listageneral.obtenerDis(inicio, fin);
        Viaje viaje = new Viaje(inicio, fin, distanciaP, transporte);
        
        System.out.println("*************** Nuevo viaje ***********************" );
        System.out.println("El viaje inicia en " + inicio + " y termina en " + fin);
        
        Piloto pilotoAsignado = null;
        for (Piloto piloto : pilotosDisponibles.keySet()) {
            if (pilotosDisponibles.get(piloto)) { // Si el piloto está disponible
                pilotoAsignado = piloto;
                pilotosDisponibles.put(piloto, false); // Marcamos al piloto como no disponible
                break;
            }
        }
        if (pilotoAsignado != null) {
            viaje.AsignarPViaje(pilotoAsignado);
            transporte.aaignarPTransporte(pilotoAsignado);
            System.out.println("Piloto asignado: " + pilotoAsignado.getNombre());
        // Iniciamos un nuevo hilo para el viaje
            new Thread(() -> {
                viaje.getTransporte().iniciarV(distanciaP);
            // Después de que el viaje ha terminado, creamos el objeto Historial
                Historial historial = new Historial();
                historialgenerado.add(historial);
            }).start();
            System.out.println("Transporte utilizado: " + transporte.getNombre());
        } else {
            System.out.println("No se puede iniciar el Viaje. No hay Pilotos disponibles.");
        }
    
        Undrive.Inicio.listaviajes.add(viaje);
         // Llamar al método para mostrar el viaje generado
        ArrayList<Viaje> viajesGenerados = new ArrayList<>();
        viajesGenerados.add(viaje);  
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbFinal;
    private javax.swing.JComboBox<String> cbInicio;
    private javax.swing.JComboBox<String> cbTransporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}