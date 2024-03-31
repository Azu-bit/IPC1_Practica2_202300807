package Clases;

import Clases.Ruta;
import java.io.Serializable;
import java.util.ArrayList;

public class Lista implements Serializable{
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
    
    public ArrayList<Ruta> getRutas() {
        return listaRutas;
    }
    
    public void guardarRutas(String i, String f, double d) {
        Ruta ruta = new Ruta(i, f, d);
        this.listaRutas.add(ruta);
    }
    
    public ArrayList<Piloto> getPilotos() {
        return listaPiloto;
    }

    public ArrayList<Transporte> getTransportes() {
        return listaTransporte;
    }
    
    public void agregarRuta(Ruta ruta) {
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
    
    public String[] obtenerPFinal() {
        ArrayList<String> listaRutaFin = new ArrayList<>();
        
        for(Ruta ruta: this.listaRutas) {
            listaRutaFin.add(ruta.getFinal());
        }
        String []arregloFinal = new String[listaRutaFin.size()];
        return listaRutaFin.toArray(arregloFinal);
    }
    
    public String[] obtenerTransportel() {
        ArrayList<String> listaTransporte = new ArrayList<>();
        
        for(Transporte trans: this.listaTransporte) {
            //listaTransporte.add(trans);
        }
        String []arregloInicio = new String[listaTransporte.size()];
        return listaTransporte.toArray(arregloInicio);
    }
    
    public Transporte obtenerObjTrans(String nombre) {
        for(Transporte trans: this.listaTransporte) {
            if(trans.getNombre().equals(nombre)) {
                return trans;
            }
        }
        return null;
    }
    
    public double obtenerDis(String inicio, String fin) {       
        for(Ruta rutas: Undrive.Inicio.getListaRutas()) {
            if(rutas.getInicio().equals(inicio) && rutas.getFinal().equals(fin)) {
                return rutas.getDistancia();
            }
        }
        return 0;
    } 
}
