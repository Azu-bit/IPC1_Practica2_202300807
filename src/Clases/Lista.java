package Clases;

import java.util.ArrayList;

public class Lista {
    ArrayList<Ruta> listaRutas;
    ArrayList<Viaje> listaViajes;
    ArrayList<Transporte> listaTransporte;
    ArrayList<Piloto> listaPiloto;
    
    public Lista () {
        this.listaRutas = new ArrayList<>();
        this.listaViajes = new ArrayList<>();
        this.listaTransporte = new ArrayList<>();
        this.listaPiloto = new ArrayList<>();
    }
    
    public void guardarRutas(String i, String f, String d) {
        Ruta ruta = new Ruta(i, f, d);
        this.listaRutas.add(ruta);
    }
    
    public void guardarViajes(Viaje viaje) {
        this.listaViajes.add(viaje);
    }
    
    public void guardarTransporte(Transporte transporte) {
        this.listaTransporte.add(transporte);
    }
    
    public void guardarPiloto(Piloto piloto) {
        this.listaPiloto.add(piloto);
    }
    
    //SABER DONDE SE ENCUENTRA EN UN INICIO
    public String[] obtenerPInicial() {
        ArrayList<String> listaRutaIn = new ArrayList<>();
        
        for(Ruta ruta: this.listaRutas) {
            listaRutaIn.add(ruta.getInicio());
        }
        String []arregloInicio = new String[listaRutaIn.size()];
        return listaRutaIn.toArray(arregloInicio);
    }
    
    
    
    
}
