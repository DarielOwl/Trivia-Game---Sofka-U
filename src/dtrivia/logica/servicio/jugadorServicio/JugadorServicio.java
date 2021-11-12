package dtrivia.logica.servicio.jugadorServicio;

import dtrivia.logica.entidades.Jugador;
import java.util.List;

/**
 *
 * @author Dariel de Sosa
 */
public interface JugadorServicio {

    //ranking de los jugadores (ordenados de mayor a menor)
    List<Jugador> getTodosLosJugadores();

    //Ingresar usuario
    void altaJugador(Jugador player);
}
