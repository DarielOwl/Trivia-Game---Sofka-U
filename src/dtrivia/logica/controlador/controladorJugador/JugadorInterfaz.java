package dtrivia.logica.controlador.controladorJugador;

import dtrivia.logica.entidades.Jugador;
import java.util.List;

/**
 *
 * @author Dariel de Sosa
 */
public interface JugadorInterfaz {

    //ranking de los jugadores (ordenados de mayor a menor)
    List<Jugador> getTodosLosJugadores();

}
