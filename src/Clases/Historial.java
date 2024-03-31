package Clases;

import java.io.Serializable;

public class Historial implements Serializable{
    private static int nextId = 0;
    private Transporte transporte;
    private int id;
    private String nombre;
    private String FHInicio;
    private String FHFinal;
    private double distancia;
    private double ComConsumido;
    
    public Historial(Viaje viaje, Transporte transporte) {
        this.id = nextId++;
        this.FHInicio = viaje.getFHInicio();
        this.distancia = viaje.getDistancia();
        this.nombre = transporte.getNombre();
        this.transporte = transporte;
    }
    
    public Historial(int id, String FHInicio, double distancia, String nombre, Transporte transporte) {
        this.id = nextId++;
        this.FHInicio = FHInicio;
        this.distancia = distancia;
        this.nombre = nombre;
        this.transporte = transporte;
    }
    
    public Historial() {
        this.id = 0;
        this.FHInicio = "";
        this.FHFinal = "";
        this.distancia = 0.0;
        this.nombre = "";
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getFHInicio() {
        return this.FHInicio;
    }
    
    public void setFHInicio(String FHInicio) {
        this.FHInicio = FHInicio;
    }
    
    public String getFHFinal() {
        return this.FHFinal;
    }
    
    public void setFHFinal(String FHFinal) {
        this.transporte.setFHFinal(FHFinal);
    }
    
    public double getDistancia() {
        return this.distancia;
    }
    
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getComConsumido() {
        return this.ComConsumido;
    }
    
    public void setComConsumido(double ComConsumido) {
        this.transporte.setComConsumido(ComConsumido);
    }
    
    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }
}
