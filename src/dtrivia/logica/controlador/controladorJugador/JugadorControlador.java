package dtrivia.logica.controlador.controladorJugador;


import dtrivia.excepciones.BaseDeDatosException;
import dtrivia.excepciones.InnovaModelException;
import dtrivia.logica.entidades.Jugador;
import dtrivia.logica.servicio.jugadorServicio.JugadorServicio;
import dtrivia.logica.servicio.jugadorServicio.JugadorServicioImpl;
import java.util.List;

/**
 *
 * @author Dariel de Sosa
 */
public class JugadorControlador implements JugadorInterfaz {

    //Obtener instancia de servicio jugador
    private final JugadorServicio jugadorServicio = new JugadorServicioImpl().getInstance();
    
    
    @Override
    public List<Jugador> getTodosLosJugadores() {
        try {
            //Aqui debemos llamar a servicios de la BD
            return jugadorServicio.getTodosLosJugadores();
        } catch (BaseDeDatosException ex) { //Cualquier error muestra
            throw new InnovaModelException(String.format("Error en base de datos [%s]", ex.getMessage()));
        }
    }

    @Override
    public void altaJugador(Jugador player) {
        try {
            //Aqui debemos llamar a servicios de la BD
            jugadorServicio.altaJugador(player);
        } catch (BaseDeDatosException ex) { //Cualquier error muestra
            throw new InnovaModelException(String.format("Error en base de datos [%s]", ex.getMessage()));
        }
    }
    
    
    
}
