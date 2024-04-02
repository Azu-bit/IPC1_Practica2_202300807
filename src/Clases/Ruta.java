package Clases;

import java.io.Serializable;

public class Ruta implements Serializable{
    private int id;
    private String Inicio;
    private String Final;
    private double Distancia;
    
    public Ruta() {
        this.id = 0;
        this.Inicio = "";
        this.Final = "";
        this.Distancia = 0.0;
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

    public String getFinal() {
        return Final;
    }

    public void setFinal(String Final) {
        this.Final = Final;
    }

    public double getDistancia() {
        return Distancia;
    }

    public void setDistancia(double Distancia) {
        this.Distancia = Distancia;
    }
}
