package Clases;
import Clases.Piloto;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Transporte extends JPanel implements Runnable, Serializable{
    
    private String nombre;
    private String FHFinal;
    private boolean VEnCurso;
    private boolean VCompletado;
    private double comMaximo;
    private double comActual;
    private double Gastocom;
    private double comConsumido;
    private double distancia;
    private Piloto piloto;
    private transient Image imgTransporte;
    private String pathImagen;
    
    private int x;
    private int y;
    private int dx = 1;
    
    JButton btnrecarga1 = new JButton("Recargar gasolina");
    JLabel lbcombustible1 = new JLabel("");
    
    public Transporte(String nombre, double comMaximo, double Gastocom, String pathImagen) {
        this.nombre = nombre;
        this.comMaximo = comMaximo;
        this.comActual = comMaximo;
        this.Gastocom = Gastocom;
        this.pathImagen = pathImagen;
        this.imgTransporte = new ImageIcon(pathImagen).getImage().getScaledInstance(110, 90, Image.SCALE_DEFAULT);
        this.VEnCurso = false;
        this.setSize(1000,700);
        this.add(btnrecarga1);
        this.add(lbcombustible1);
    }
    
    public Transporte() {
        this.nombre = "";
        this.comMaximo = 0.0;
        this.Gastocom = 0.0;
        this.FHFinal = "";
        this.comConsumido = 0.0;
    }
    
    public boolean VEnCurso() {
        return this.VEnCurso;
    }
    
    public boolean VCompleatdo() {
        return this.VCompletado;
    }
    
    public void aaignarPTransporte(Piloto piloto) {
        this.piloto = piloto;
    }
    
    public Piloto getPilotoAsignado() {
        return piloto;
    }
    
    public void iniciarV(double distancia) {
        this.distancia = distancia;
        System.out.println(this.VEnCurso + " - " + comActual);
        if(!this.VEnCurso && comActual > 0) {
            this.VEnCurso = true;
            System.out.println("El Viaje ha iniciado...");
        } else {
            System.out.println("No se ha iniciado el Viaje");
        }
    }
    
    public void liberaPiloto() {
        if(piloto != null) {
            System.out.println("Se ha liberado el piloto " + piloto.getNombre());
            piloto.liberarPiloto();
            piloto = null;
        }
    }
    
    public void recargarCombustible() {
        this.comActual = this.comMaximo;
        retomarV();
        System.out.println("Ha sido recargado el Combustible " + this.comActual);
    }
    
    public void actualizarDis() {
        if(this.VEnCurso && comActual > 0) {
            double comAnterior = comActual;
            comActual -= Gastocom;
            this.comConsumido = comAnterior + comActual;
            
            this.distancia -= 1;
            this.comActual -= this.Gastocom;
            System.out.println("El transporte " + this.nombre + " ha recorrido " + this.distancia + " km");
            System.out.println("El combustible restante es: " + comActual);
            
            if(distancia == 0) {
                this.VEnCurso = false;
                LocalDateTime fehoFinal = LocalDateTime.now();
                DateTimeFormatter formatoh = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
                String fechahoraFormatada = fehoFinal.format(formatoh);
                
                this.FHFinal = fechahoraFormatada;
                
                System.out.println("El viaje ha finalizado para el transporte " + this.nombre);
                System.out.println("Fecha y Hora de finalizacion: " + fechahoraFormatada);
                JOptionPane.showMessageDialog(null, "El viaje ha finalizado para el transporte " + this.nombre);
                liberaPiloto(); 
                
                
            }
            if(comActual < Gastocom) {
                this.VEnCurso = false;
                btnrecarga1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        recargarCombustible();
                    }
                });
                System.out.println("El transporte " + this.nombre + " se ha quedado sin combustible");
            }
        }
    }
    
    public void retomarV() {
        if(!this.VEnCurso && !this.VCompletado) {
            this.VEnCurso = true;
            new Thread(this).start();
        }
    }
    
    //POSICION DEL BOTON Y LA ETIQUETA DEL CARRO
    public void paint(Graphics grafica) {
        super.paint(grafica);
        grafica.drawImage(imgTransporte, x, 30, this);
        lbcombustible1.setBounds(x, y, 250, 30);
        lbcombustible1.setText("Combustible restante: " + comActual);
        
        if(comActual < Gastocom) {
            btnrecarga1.setVisible(true);
            btnrecarga1.setBounds(x, y, 160, 25);
            lbcombustible1.setVisible(false);
        } else {
            btnrecarga1.setVisible(false);
        lbcombustible1.setVisible(true);
        }
    }
    
    //ACTUALIZAR LA DISTANCIA
    @Override
    public void run() {
        while (this.VEnCurso) {
            actualizarDis();
            
            x += dx;
            System.out.println("Posicion: " + x);
            
            if(x < 0 || x > getWidth() - 150) {
                dx = -dx;
            }
            
            try {
                Thread.sleep(1);
            } catch(InterruptedException e) {
                
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getComConsumido() {
        return comConsumido;
    }
    
    public void setComConsumido(double ComConsumido) {
        this.comConsumido = ComConsumido;
    }
    
    public String getFHFinal() {
        return FHFinal;
    }
    
    public void setFHFinal(String FHFinal) {
        this.FHFinal = FHFinal;
    }
}
