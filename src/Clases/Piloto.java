package Clases;

import java.io.Serializable;

public class Piloto implements Serializable{
    private Viaje vAsignado;
    private String nombre;
    
    public Piloto(String nombre) {
        this.nombre = nombre;
    }
    
    public void asignarViaje(Viaje viaje) {
        this.vAsignado = viaje;
    }
    
    public boolean Disponibilidad() {
        return this.vAsignado == null;
    }
    
    public void liberarPiloto() {
        this.vAsignado = null;
    }
    
    public Viaje getvAsignado() {
        return vAsignado;
    }

    public void setvAsignado(Viaje vAsignado) {
        this.vAsignado = vAsignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}