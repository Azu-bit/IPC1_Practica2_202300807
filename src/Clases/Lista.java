package Clases;

import Clases.Ruta;
import java.io.Serializable;

public class Lista implements Serializable{

    public double obtenerDis(String inicio, String fin) {       
        for(Ruta rutas: Undrive.Inicio.getListaRutas()) {
            if(rutas.getInicio().equals(inicio) && rutas.getFinal().equals(fin)) {
                return rutas.getDistancia();
            }
        }
        return 0;
    } 
}
