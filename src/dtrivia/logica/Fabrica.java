package dtrivia.logica;

/**
 *
 * @author Dariel de Sosa
 */

import dtrivia.logica.controlador.controladorJugador.JugadorControlador;
import dtrivia.logica.controlador.controladorJugador.JugadorInterfaz;
import dtrivia.logica.servicio.jugadorServicio.JugadorServicio;
import dtrivia.logica.servicio.jugadorServicio.JugadorServicioImpl;


public class Fabrica {

    private static Fabrica instancia; //Establecer instancia de singlenton
    
    public static Fabrica getInstance() { //Obtener la instancia de fabrica
        if (instancia == null) {
            instancia = new Fabrica();
        }
        return instancia;
    }
    
    
    //---------------------Jugador Operaciones------------------------//
    public JugadorInterfaz getJugadorControlador(){ //Obtener instancia de Controlador Servicio
        JugadorInterfaz inst = new JugadorControlador();
        return inst;
    }
    
    public JugadorServicio getJuagdorServicioImpl(){ //Obtener instancia del Servicio Jugador
        JugadorServicio inst = new JugadorServicioImpl();
        return inst;
    }
    //---------------------Jugador Operaciones------------------------//
    
    
    
}
