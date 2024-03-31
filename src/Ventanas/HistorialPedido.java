package Ventanas;

import Clases.Historial;
import Clases.Transporte;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class HistorialPedido extends javax.swing.JFrame {
    ArrayList<Historial> historialgenerado = Undrive.Inicio.listahistorial;
    private int ultimoID = 0;
    
    public HistorialPedido() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Administrador admi = new Administrador();
                admi.setVisible(true);
                dispose();
            }
        });
        CompletarTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnguardar = new javax.swing.JButton();
        btnleer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setText("HISTORIAL DE VIAJES");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnguardar.setBackground(new java.awt.Color(204, 204, 204));
        btnguardar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnleer.setBackground(new java.awt.Color(204, 204, 204));
        btnleer.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnleer.setText("Leer Datos");
        btnleer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnleerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnleer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jLabel1)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnleer))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        GuardarArchivo();
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnleerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnleerActionPerformed
        JFileChooser selecArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos csv", "csv");
    
        selecArchivo.setFileFilter(filtro);
                
        int seleccion = selecArchivo.showOpenDialog(null);
                
        if(seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = selecArchivo.getSelectedFile();
            LeerDatos(archivo);
        }
    }//GEN-LAST:event_btnleerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnleer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void CompletarTabla() {
        DefaultTableModel mD = new DefaultTableModel(new String[]{"ID", "Fecha y Hora Inicio", "Fecha y Hora Fin", "Distancia (km)", "Vehiculo", "Combustible consumido"}, historialgenerado.size());
        
        jTable1.setModel(mD);
        
        TableModel tm = jTable1.getModel();
        
        for(int i = 0; i < historialgenerado.size(); i++) {
            Historial hist = historialgenerado.get(i);
            Transporte trans = hist.getTransporte();
            
            if(trans != null) {
                tm.setValueAt(hist.getId(), i, 0);
                tm.setValueAt(hist.getFHInicio(), i, 1);
                tm.setValueAt(trans.getFHFinal(), i, 2);
                tm.setValueAt(hist.getDistancia(), i, 3);
                tm.setValueAt(hist.getNombre(), i, 4);
                tm.setValueAt(trans.getComConsumido(), i, 5);
            }
        }
    }
    
    public void GuardarArchivo() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        FileWriter writer = null;
        
        try {
            fos = new FileOutputStream("C:\\Users\\Manager\\OneDrive\\Escritorio\\INGENIERIA\\TERCER SEMESTRE\\IPC 1\\IPC1_Practica2_20230007\\src\\Serializacion\\datosHistorial.bin");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(historialgenerado);

            writer = new FileWriter("C:\\Users\\Manager\\OneDrive\\Escritorio\\INGENIERIA\\TERCER SEMESTRE\\IPC 1\\IPC1_Practica2_20230007\\src\\Serializacion\\datosHistorial.csv");
            writer.append("ID,Fecha y Hora Inicio,Fecha y Hora Fin,Distancia (km),Vehiculo,Combustible consumido\n");
            
            for (Historial historial : historialgenerado) {
                Transporte trans = historial.getTransporte();
                int id = Math.max(historial.getId(), ultimoID + 1);
                ultimoID = id;
                writer.append(id + ",");
                writer.append(historial.getFHInicio() + ",");
                writer.append(trans.getFHFinal() + ",");
                writer.append(historial.getDistancia() + ",");
                writer.append(historial.getNombre() + ",");
                writer.append(trans.getComConsumido() + "\n");
            }
            writer.flush();
            JOptionPane.showMessageDialog(null, "El archivo ha sido guardado correctamente...");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(oos != null) {
                    oos.close();
                }
                if(fos != null) {
                    fos.close();
                }
                if(writer != null) {
                    writer.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void LeerDatos(File archivo) {
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            br.readLine();
            String linea;
            
            while((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                
                if(datos.length >= 6) {
                    Transporte transporte = new Transporte();
                    transporte.setFHFinal(datos[2]);
                    transporte.setComConsumido(Double.parseDouble(datos[5]));
                    
                    int id = Integer.parseInt(datos[0]);
                    Historial historial = new Historial(id, datos[1], Double.parseDouble(datos[3]), datos[4], transporte);
                    historialgenerado.add(historial);
                    
                    if(id > ultimoID) {
                        ultimoID = id;
                    }
                }
            }
            br.close();
            CompletarTabla();
        } catch (IOException i) {
            i.printStackTrace();
        }
        finally {
            try {
                if(fr != null) {
                    fr.close();
                }
            }
            catch(Exception ex) {
                ex.printStackTrace();
            }
        }
    }

}
