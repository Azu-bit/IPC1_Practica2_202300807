package Clases;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Viaje implements Serializable{
    public static int idultimo = 0;
    private int id;
    private String Inicio;
    private String FIn;
    private double distancia;
    private Transporte transporte;
    private Piloto piloto;
    private LocalDateTime FHInicio;
    
    public Viaje() {
        this.id = 0;
        this.FHInicio = LocalDateTime.now();
        this.distancia = 0.0;
    }
    
    public Viaje (String i, String f, double d, Transporte transporte) {
        this.Inicio = i;
        this.FIn = f;
        this.distancia = d;
        this.transporte = transporte;
        this.FHInicio = LocalDateTime.now();
    }
    
    public Viaje(LocalDateTime Fh, double distancia) {
        this.id = ++idultimo;
        this.FHInicio = Fh;
        this.distancia = distancia;
    }
    
    public void AsignarPViaje(Piloto piloto) {
        if(piloto.Disponibilidad()) {
            this.piloto = piloto;
            this.piloto.asignarViaje(this);
        } else {
            System.out.println("El piloto " + piloto.getNombre() + " no esta disponible...");
        }
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getInicio() {
        return Inicio;
    }

    public void setInicio(String Inicio) {
        this.Inicio = Inicio;
    }

    public String getFIn() {
        return FIn;
    }

    public void setFIn(String FIn) {
        this.FIn = FIn;
    }

    public double getComConsumido() {
        return this.transporte.getComConsumido();
    }
    
    public String getFHFinal() {
        return this.transporte.getFHFinal();
    }
    
    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
    
    public String getFHInicio() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
        return this.FHInicio.format(formato);
    }
}
