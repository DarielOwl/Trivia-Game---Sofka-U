package dtrivia.logica.controlador.controladorFAQ;

import dtrivia.excepciones.BaseDeDatosException;
import dtrivia.excepciones.InnovaModelException;
import dtrivia.logica.entidades.Pregunta;
import dtrivia.logica.entidades.Respuesta;
import dtrivia.logica.servicio.faqServicio.FAQServicio;
import dtrivia.logica.servicio.faqServicio.FAQServicioImpl;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class FAQControlador implements FAQInterfaz {

    //Obtener instancia de servicio faq
    private final FAQServicio faqServicio = new FAQServicioImpl().getInstance();

    //------------------------ALTA PREGUNTA----------------------//
    @Override
    public void altaPregunta(Pregunta preg) {
        try {
            //Aqui debemos llamar a servicios de la BD
            faqServicio.altaPregunta(preg);
        } catch (BaseDeDatosException ex) { //Cualquier error muestra
            throw new InnovaModelException(String.format("Error en base de datos [%s]", ex.getMessage()));
        }
    }

    //------------------------ALTA PREGUNTA----------------------//
    @Override
    public Pregunta getIdPregunta(String pregunta) {
        try {
            //Aqui debemos llamar a servicios de la BD
            return faqServicio.getIdPregunta(pregunta);
        } catch (BaseDeDatosException ex) { //Cualquier error muestra
            throw new InnovaModelException(String.format("Error en base de datos [%s]", ex.getMessage()));
        }
    }

    @Override
    public void altaRespuesta(Respuesta resp) {
        try {
            //Aqui debemos llamar a servicios de la BD
            faqServicio.altaRespuesta(resp);
        } catch (BaseDeDatosException ex) { //Cualquier error muestra
            throw new InnovaModelException(String.format("Error BD Respuesta [%s]", ex.getMessage()));
        }
    }

    //-----------------BUSCAR PREGUNTA------------------------//
    @Override
    public Pregunta buscarPregunta(String dificultad) {
        try {
            //Aqui debemos llamar a servicios de la BD
            return faqServicio.buscarPregunta(dificultad);
        } catch (BaseDeDatosException ex) { //Cualquier error muestra
            throw new InnovaModelException(String.format("Error en base de datos [%s]", ex.getMessage()));
        }
    }

    //-----------------BUSCAR RESPUESTA------------------------//
    @Override
    public Respuesta buscarRespuesta(Long IDpregunta) {
        try {
            //Aqui debemos llamar a servicios de la BD
            return faqServicio.buscarRespuesta(IDpregunta);
        } catch (BaseDeDatosException ex) { //Cualquier error muestra
            throw new InnovaModelException(String.format("Error en base de datos [%s]", ex.getMessage()));
        }
    }

}
