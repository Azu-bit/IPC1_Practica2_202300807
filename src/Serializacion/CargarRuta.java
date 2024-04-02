package Serializacion;

import Clases.Ruta;
import Ventanas.Administrador;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class CargarRuta extends javax.swing.JFrame {
    ArrayList<Ruta> listarutas = new ArrayList<>();
    int maxId = 0;   //Contador para el Id de Ruta
    
    public ArrayList<Ruta> getRutas() {
        return listarutas;
    }
    
    public CargarRuta() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            this.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    Administrador admi = new Administrador();
                    admi.setVisible(true);
                    dispose(); // Cierra la ventana actual
                }
            });     
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        editardistancia = new javax.swing.JButton();
        crear = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        cargar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Inicio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Fin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Distancia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 153, 255));

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

        editardistancia.setBackground(new java.awt.Color(204, 204, 204));
        editardistancia.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        editardistancia.setText("Editar Distancia");
        editardistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editardistanciaActionPerformed(evt);
            }
        });

        crear.setBackground(new java.awt.Color(204, 204, 204));
        crear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        crear.setText("Crear Ruta");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(204, 204, 204));
        guardar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        cargar.setBackground(new java.awt.Color(204, 204, 204));
        cargar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        cargar.setText("Cargar");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Inicio");

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Fin");

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Distancia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(editardistancia)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(Distancia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(71, 71, 71))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(Fin)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(editardistancia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Distancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crear)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cargar)
                        .addComponent(guardar, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        Ruta ruta = new Ruta();
        ruta.setId(maxId++);
        ruta.setInicio(Inicio.getText());
        ruta.setFinal(Fin.getText());
        //ruta.setDistancia(Distancia.getText());
        try {
            double distancia = Double.parseDouble(Distancia.getText());
            ruta.setDistancia(distancia);
        } catch (NumberFormatException e) {
            System.out.println("La distancia debe ser un numero");
            return;
        }
        
        listarutas.add(ruta);
        
        Inicio.setText("");
        Fin.setText("");
        Distancia.setText("");
        
        CompletarTabla();
    }//GEN-LAST:event_crearActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        JFileChooser selecArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos csv", "csv");
        
        selecArchivo.setFileFilter(filtro);
        
        int seleccion = selecArchivo.showOpenDialog(this);
        
        if(seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = selecArchivo.getSelectedFile();
            CargarArchivo(archivo);
        }
    }//GEN-LAST:event_cargarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        GuardarArchivo();
        GuardarArchivoBin();
    }//GEN-LAST:event_guardarActionPerformed

    private void editardistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editardistanciaActionPerformed
        String idInput = JOptionPane.showInputDialog(this, "Ingrese el ID de la ruta:");
        String newDistancia = JOptionPane.showInputDialog(this, "Ingrese la Nueva Distancia: ");
        
        int id = Integer.parseInt(idInput);
        
        if(id >= 0 && id < listarutas.size()) {
            Ruta ruta = listarutas.get(id);
            //ruta.setDistancia(newDistancia);
            
            try {
                double distancia = Double.parseDouble(newDistancia);
                ruta.setDistancia(distancia);
            } catch (NumberFormatException e) {
                System.out.println("La distancia debe ser un numero");
                return;
            }
            //ACTUALIZAR LOS DATOS CORRESPONDIENTES
            CompletarTabla();
            //GUARDA EL NUEVO DATO
            GuardarArchivo();
            GuardarArchivoBin();
        } else {
            JOptionPane.showMessageDialog(this, "ID  de ruta no valido");
        }
    }//GEN-LAST:event_editardistanciaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Distancia;
    private javax.swing.JTextField Fin;
    private javax.swing.JTextField Inicio;
    private javax.swing.JButton cargar;
    private javax.swing.JButton crear;
    private javax.swing.JButton editardistancia;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void CompletarTabla() {
        DefaultTableModel mD = new DefaultTableModel(new String[]{"ID", "Inicio", "Fin", "Distancia"}, listarutas.size());
        
        jTable1.setModel(mD);
        
        TableModel tm = jTable1.getModel();
        
        for(int i = 0; i < listarutas.size(); i++) {
            Ruta rut = listarutas.get(i);
            tm.setValueAt(rut.getId(), i, 0);
            tm.setValueAt(rut.getInicio(), i, 1);
            tm.setValueAt(rut.getFinal(), i, 2);
            tm.setValueAt(rut.getDistancia(), i, 3);
        }
    }

    public void CargarArchivo(File archivo) {
        FileReader fr = null;
        BufferedReader br = null;
        
        try{
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            
            String linea;
            
            while((linea = br.readLine()) != null) {
                String arreglo[] = linea.split(",");
                
                if(arreglo.length >= 4) {
                    int id = Integer.parseInt(arreglo[0]);
                    //VER SI YA EXISTE RUTA
                    boolean existe = false;
                    for(Ruta rut: listarutas) {
                        if(rut.getId() == id) {
                            existe = true;
                            break;
                        }
                    }
                
                    if(!existe) {
                        Ruta rut = new Ruta();
                        rut.setId(id);
                        rut.setInicio(arreglo[1]);
                        rut.setFinal(arreglo[2]);

                        try {
                            double distancia = Double.parseDouble(arreglo[3]);
                            rut.setDistancia(distancia);
                        } catch (NumberFormatException e) {
                            System.out.println("La distancia debe ser un numero");
                            return;
                        }
                        listarutas.add(rut);
                    
                        if(id >= maxId) {
                            maxId = id + 1;
                        }
                    }
                } 
            }
            CompletarTabla();
        }catch(Exception ex){
             ex.printStackTrace();
        }
        finally{
            try{
                if(fr != null) {
                    fr.close();
                }
            }
            catch(Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private void GuardarArchivo() {
        FileWriter fi = null;
        PrintWriter pw = null;
        
        File archivoCSV = new File("C:\\Users\\Manager\\OneDrive\\Escritorio\\INGENIERIA\\TERCER SEMESTRE\\IPC 1\\IPC1_Practica2_20230007\\src\\Serializacion\\datosHistorial.bin");
        
        try{
            fi = new FileWriter(archivoCSV, false);  //Permitira agregar datos
            pw = new PrintWriter(fi);
            
            for(Ruta rut: listarutas) {
                String linea = rut.getId() + "," + rut.getInicio() + "," + rut.getFinal() + "," + rut.getDistancia();
                pw.println(linea);
            }
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
        finally{
            try{
                if(fi != null) {
                    fi.close();
                    //JOptionPane.showMessageDialog(null, "El archivo CSV ha sido guardado correctamente...");
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    private void GuardarArchivoBin() {
        ObjectOutputStream oos = null;
        File archivo = new File("C:\\Users\\Manager\\OneDrive\\Escritorio\\INGENIERIA\\TERCER SEMESTRE\\IPC 1\\IPC1_Practica2_20230007\\src\\Serializacion\\rutas.bin");
        
        try {
            oos = new ObjectOutputStream(new FileOutputStream(archivo));
            
            for(Ruta rut: listarutas) {
                oos.writeObject(rut);
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        finally{
            try {
                if(oos != null) {
                    oos.close();
                    JOptionPane.showMessageDialog(null, "El archivo ha sido guardado correctamente...");
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
//CARGAR PRIMERO EL ARCHIVO ANTES DE CREAR NUEVAS RUTAS