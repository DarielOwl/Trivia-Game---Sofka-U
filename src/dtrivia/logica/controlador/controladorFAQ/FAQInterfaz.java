package dtrivia.logica.controlador.controladorFAQ;

import dtrivia.logica.entidades.Pregunta;
import dtrivia.logica.entidades.Respuesta;
import java.util.List;

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

    //buscar pregunta por dificultad
    Pregunta buscarPregunta(String dificultad);

    //buscar respuesta por idPregunta
    Respuesta buscarRespuesta(Long IDpregunta);
}
