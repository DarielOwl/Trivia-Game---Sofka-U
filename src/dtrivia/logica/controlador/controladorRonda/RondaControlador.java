package dtrivia.logica.controlador.controladorRonda;

import dtrivia.excepciones.BaseDeDatosException;
import dtrivia.excepciones.InnovaModelException;
import dtrivia.logica.entidades.Ronda;
import dtrivia.logica.servicio.rondaServicio.RondaServicio;
import dtrivia.logica.servicio.rondaServicio.RondaServicioImpl;
import java.util.List;

/**
 *
 * @author Dariel de Sosa
 */
public class RondaControlador implements RondaInterfaz{
    
    //Obtener instancia de servicio jugador
    private final RondaServicio rondaServicio = new RondaServicioImpl().getInstance();
    
    @Override
    public List<Ronda> getTodasLasRondas() {
       try {
            //Aqui debemos llamar a servicios de la BD
            return rondaServicio.getTodasLasRondas();
        } catch (BaseDeDatosException ex) { //Cualquier error muestra
            throw new InnovaModelException(String.format("Error en base de datos [%s]", ex.getMessage()));
        }
    }
    
}
