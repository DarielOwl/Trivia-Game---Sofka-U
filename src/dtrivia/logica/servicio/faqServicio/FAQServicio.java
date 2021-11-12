package dtrivia.logica.servicio.faqServicio;

import dtrivia.logica.entidades.Pregunta;
import dtrivia.logica.entidades.Respuesta;

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
}
