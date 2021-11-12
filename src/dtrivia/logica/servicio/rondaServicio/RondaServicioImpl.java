package dtrivia.logica.servicio.rondaServicio;

import dtrivia.excepciones.BaseDeDatosException;
import dtrivia.logica.entidades.Ronda;
import dtrivia.persistencia.conexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dariel de Sosa
 */
public class RondaServicioImpl implements RondaServicio {

    private static RondaServicioImpl servicioRonda; //INSTANCIA DE LA CLASE
    private conexionBD conexion = new conexionBD(); //Obtener la conexion de la BD

    public RondaServicioImpl() {
    } //Constructor por defecto

    //========== OBTENER LA INSTANCIA DE LA CLASE MEDIANTE UN GETTER =========//
    public RondaServicioImpl getInstance() {
        if (null == servicioRonda) {
            servicioRonda = new RondaServicioImpl();
        }
        return servicioRonda;
    }

    //====================== CONSULTAS PARA LA BASE DE DATOS =================//
    private final String getTodasLasRondas = "SELECT * FROM `ronda`;";
    //====================== CONSULTAS PARA LA BASE DE DATOS =================//

    //---------------------Lista Rondas-----------------------------//
    @Override
    public List<Ronda> getTodasLasRondas() {
        List<Ronda> rondas = new ArrayList<>();
        try {
            PreparedStatement sentencia = conexion.getConexion().prepareStatement(getTodasLasRondas);
            ResultSet rs = sentencia.executeQuery();
            while (rs.next()) {
                rondas.add(rondasMapper(rs));
            }
        } catch (SQLException e) {
            throw new BaseDeDatosException(e.getMessage(), e.getCause());
        }

        return rondas;
    }
    //---------------------Lista Rondas-----------------------------//

    //---------------------Mapper Rondas-----------------------------//
    private Ronda rondasMapper(ResultSet rs) throws SQLException {
       return new Ronda(rs.getLong("numero"),rs.getLong("puntos"),rs.getString("dificultad"));
    }
    //---------------------Mapper Rondas-----------------------------//
}
