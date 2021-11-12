package dtrivia.logica.servicio.faqServicio;

import dtrivia.excepciones.BaseDeDatosException;
import dtrivia.logica.entidades.Pregunta;
import dtrivia.logica.entidades.Respuesta;
import dtrivia.persistencia.conexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.NoSuchElementException;

/**
 *
 * @author Dariel de Sosa
 */
public class FAQServicioImpl implements FAQServicio {

    private static FAQServicioImpl servicioFAQ; //INSTANCIA DE LA CLASE
    private conexionBD conexion = new conexionBD(); //Obtener la conexion de la BD

    //Constructor por defecto
    public FAQServicioImpl() {
    }

    //-----------OBTENER LA INSTANCIA DE LA CLASE MEDIANTE UN GETTER----------//
    public FAQServicioImpl getInstance() {
        if (null == servicioFAQ) {
            servicioFAQ = new FAQServicioImpl();
        }
        return servicioFAQ;
    }

    //------------------CONSULTAS PARA LA BASE DE DATOS-----------------------//
    private final String insertarPregunta = "INSERT INTO pregunta (idCategoria, pregunta, dificultad) VALUES (?, ?, ?)";
    private final String buscarIdPregunta = "SELECT id FROM pregunta WHERE pregunta = ?";
    private final String insertarRespuesta = "INSERT INTO respuesta (idPregunta, respuestaBien, respuestaMal1, respuestaMal2, respuestaMal3) VALUES (?, ?, ?, ?, ?)";
    //------------------CONSULTAS PARA LA BASE DE DATOS-----------------------//

    //------------------------ALTA PREGUNTA----------------------------//
    @Override
    public void altaPregunta(Pregunta preg) {
        PreparedStatement sentencia;
        try {
            sentencia = conexion.getConexion().prepareStatement(insertarPregunta);
            sentencia.setLong(1, preg.getIdCategoria());
            sentencia.setString(2, preg.getPregunta());
            sentencia.setString(3, preg.getDificultad());
            sentencia.executeUpdate();
        } catch (SQLException ex) {
            throw new BaseDeDatosException(String.format("Error SQL [%s]", ex.getMessage()), ex.getCause());
        }
    }
    //------------------------ALTA PREGUNTA----------------------------//

    //------------------------BUSCAR IDPREGUNTA----------------------------//
    @Override
    public Pregunta getIdPregunta(String pregunta) {
        try {
            PreparedStatement sentencia = conexion.getConexion().prepareStatement(buscarIdPregunta);
            sentencia.setString(1, pregunta);
            ResultSet rs = sentencia.executeQuery();
            while (rs.next()) {
                return preguntaMapper(rs);
            }
            throw new NoSuchElementException(String.format("Pregunta %s no encontrado", pregunta));
        } catch (SQLException ex) {
            throw new BaseDeDatosException(ex.getMessage(), ex.getCause());
        }
    }
    //------------------------BUSCAR IDPREGUNTA----------------------------//

    //------------------------MAPPER PREGUNTA----------------------------//
    private Pregunta preguntaMapper(ResultSet rs) throws SQLException {
        return new Pregunta(rs.getLong("id"));
    }
    //------------------------MAPPER PREGUNTA----------------------------//

    //------------------------ALTA RESPUESTA----------------------------//
    @Override
    public void altaRespuesta(Respuesta resp) {
        PreparedStatement sentencia;
        try {
            sentencia = conexion.getConexion().prepareStatement(insertarRespuesta);
            sentencia.setLong(1, resp.getIdPregunta());
            sentencia.setString(2, resp.getRespuestaBien());
            sentencia.setString(3, resp.getRespuestaMal1());
            sentencia.setString(4, resp.getRespuestaMal2());
            sentencia.setString(5, resp.getRespuestaMal3());
            sentencia.executeUpdate();
        } catch (SQLException ex) {
            throw new BaseDeDatosException(String.format("Error SQL [%s]", ex.getMessage()), ex.getCause());
        }
    }
    //------------------------ALTA RESPUESTA----------------------------//
}
