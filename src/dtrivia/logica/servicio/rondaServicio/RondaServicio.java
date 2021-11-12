package dtrivia.logica.servicio.rondaServicio;

import dtrivia.logica.entidades.Ronda;
import java.util.List;

/**
 *
 * @author Dariel de Sosa
 */
public interface RondaServicio {
    
    //Datos de todas las Rondas
    List<Ronda> getTodasLasRondas();
}
