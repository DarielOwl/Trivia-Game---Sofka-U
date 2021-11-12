package dtrivia.logica.controlador.controladorFAQ;

import dtrivia.logica.entidades.Pregunta;
import dtrivia.logica.entidades.Respuesta;

/**
 *
 * @author Dariel de Sosa
 */
public interface FAQInterfaz {

    //Creamos la pregunta
    void altaPregunta(Pregunta preg);

    //Buscamos el idPregunta
    Pregunta getIdPregunta(String pregunta);

    //Creamos la respuesta
    void altaRespuesta(Respuesta resp);
}
