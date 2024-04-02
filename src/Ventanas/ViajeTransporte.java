package Ventanas;
import Clases.Historial;
import Clases.Lista;
import Clases.Transporte;
import Clases.Viaje;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ViajeTransporte extends JFrame {
    
    ArrayList<Viaje> listaviajesGenerados = Undrive.Inicio.getListaViaje();
    ArrayList<Historial> historialgenerado = Undrive.Inicio.getListaHistorial();
    Lista listageneral = Undrive.Inicio.listas;
    private int nViajes = 0;
    
    public ViajeTransporte() {
        this.setSize(1000,700);
        this.setLocationRelativeTo(this);
        dispose();
        this.setTitle("Recorrido...");
        this.setResizable(false);
        this.setLayout(new GridLayout(3,0));
        //this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        for(Viaje viaje : listaviajesGenerados) {
            
            if(nViajes >= 3) {
                System.out.println("No se pueden generar mas viajes en este momento");
                break;
            }
            if(!viaje.getTransporte().VCompleatdo()) {
                Thread hilo = new Thread(viaje.getTransporte());
                this.add(viaje.getTransporte());
                viaje.getTransporte().iniciarV(listageneral.obtenerDis(viaje.getInicio(), viaje.getFIn()));
                Historial historial = new Historial(viaje, viaje.getTransporte());
                historialgenerado.add(historial);
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
                nViajes++;
                
            }
        }
    }
}