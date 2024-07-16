package Undrive;
import Clases.Historial;
import Clases.Lista;
import Clases.Motocicleta;
import Clases.Piloto;
import Clases.Ruta;
import Clases.Transporte;
import Clases.VehiculoEstandar;
import Clases.VehiculoPremium;
import Clases.Viaje;
import Serializacion.CargarRuta;
import Ventanas.Menu;
import Ventanas.VTransporte;
import java.io.File;
import java.util.ArrayList;

public class Inicio {
    public static Lista listas = new Lista();
    public static ArrayList<Ruta> listarutas = new ArrayList<>();
    public static ArrayList<Transporte> listatransporte = new ArrayList<>();
    public static ArrayList<Piloto> listapiloto = new ArrayList<>();
    public static ArrayList<Viaje> listaviajes = new ArrayList<>();
    public static ArrayList<Historial> listahistorial = new ArrayList<>();
    public static ArrayList<VTransporte> listaviajesGenerados = new ArrayList<>();
    
    public static ArrayList<Ruta> getListaRutas() {
        return listarutas;
    }
    
    public static ArrayList<Transporte> getListaTransporte() {
        return listatransporte;
    }
    
    public static ArrayList<Piloto> getListaPiloto() {
        return listapiloto;
    }
    
    public static ArrayList<Viaje> getListaViaje() {
        return listaviajes;
    }
    
    public static ArrayList<Historial> getListaHistorial() {
        return listahistorial;
    }
    public static ArrayList<VTransporte> getListaViajeGenerado() {
        return listaviajesGenerados;
    }
    
    public static void main(String[] args) {
        
        Menu menu = new Menu();
        menu.setVisible(true);
        
        CargarRuta cargarRuta = new CargarRuta();
        cargarRuta.setVisible(false);           
        //LISTA DE RUTAS
        cargarRuta.CargarArchivo(new File("C:\\Users\\Manager\\OneDrive\\Escritorio\\INGENIERIA\\TERCER SEMESTRE\\IPC 1\\IPC1_Practica2_20230007\\src\\Serializacion\\rutas.csv")); // Debes proporcionar la ruta correcta del archivo csv
        //cargarRuta.CargarArchivo(new File("C:\\Users\\Manager\\OneDrive\\Escritorio\\INGENIERIA\\TERCER SEMESTRE\\IPC 1\\IPC1_Practica2_20230007\\src\\Serializacion\\archivo_entrada_practica2.csv"));
        
        listarutas = cargarRuta.getRutas();
        
        listapiloto.add(new Piloto("Piloto 1"));
        listapiloto.add(new Piloto("Piloto 2"));
        listapiloto.add(new Piloto("Piloto 3"));        

        listatransporte.add(new Motocicleta("Motocicleta 1"));
        listatransporte.add(new Motocicleta("Motocicleta 2"));
        listatransporte.add(new Motocicleta("Motocicleta 3"));
        listatransporte.add(new VehiculoEstandar("Vehiculo Estandar 1"));
        listatransporte.add(new VehiculoEstandar("Vehiculo Estandar 2"));
        listatransporte.add(new VehiculoEstandar("Vehiculo Estandar 3"));
        listatransporte.add(new VehiculoPremium("Vehiculo Premium 1"));
        listatransporte.add(new VehiculoPremium("Vehiculo Premium 2"));
        listatransporte.add(new VehiculoPremium("Vehiculo Premium 3"));
    }  
}