package Clases;
//import clases.ListaU;

public class Ruta {
    private int id;
    private String Inicio;
    private String Final;
    private String Distancia;
    
    public Ruta() {
        this.id = 0;
        this.Inicio = "";
        this.Final = "";
        this.Distancia = "";
    }
    
    public Ruta (String i, String f, String d){
        this.Inicio = i;
        this.Final = f;
        this.Distancia = d;
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

    public String getDistancia() {
        return Distancia;
    }

    public void setDistancia(String Distancia) {
        this.Distancia = Distancia;
    }
}
