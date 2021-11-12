package dtrivia.logica.servicio.faqServicio;

import dtrivia.logica.entidades.Pregunta;
import dtrivia.logica.entidades.Respuesta;
import java.util.List;

/**
 *
 * @author Dariel de Sosa
 */
public interface FAQServicio {

    //Creamos la pregunta
    void altaPregunta(Pregunta preg);

    //Buscamos el idPregunta
    Pregunta getIdPregunta(String pregunta);

    //Creamos la respuesta
    void altaRespuesta(Respuesta resp);

    //Buscamos la pregunta de forma aleatoria
    Pregunta buscarPregunta(String dificultad);

    //buscar respuesta por idPregunta
    Respuesta buscarRespuesta(Long IDpregunta);
}
