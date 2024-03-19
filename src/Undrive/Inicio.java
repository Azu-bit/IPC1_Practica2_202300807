package Undrive;
import Clases.Lista;
import Clases.Ruta;
import javax.swing.SwingUtilities;
import Serializacion.CargarRuta;
import java.util.LinkedList;

public class Inicio {

    public static void main(String[] args) {
        
        //SwingUtilities.invokeLater(() -> {
           CargarRuta a = new CargarRuta();
           a.setVisible(true); 
        //});
        
        //LISTA DE RUTAS
        LinkedList<Ruta> rutas = a.getRutas();
        //GUARDAR RUTAS
        Lista lista = new Lista();
        for (Ruta ruta: rutas) {
            lista.guardarRutas(ruta.getInicio(), ruta.getFinal(), ruta.getDistancia());
        }
    }  
}