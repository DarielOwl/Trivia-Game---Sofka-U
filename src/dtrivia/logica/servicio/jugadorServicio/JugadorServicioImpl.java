package dtrivia.logica.servicio.jugadorServicio;

import dtrivia.excepciones.BaseDeDatosException;
import dtrivia.excepciones.InnovaModelException;
import dtrivia.logica.entidades.Jugador;
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
public class JugadorServicioImpl implements JugadorServicio {

    private static JugadorServicioImpl servicioJugador; //INSTANCIA DE LA CLASE
    private conexionBD conexion = new conexionBD(); //Obtener la conexion de la BD

    public JugadorServicioImpl() {
    } //Constructor por defecto

    //========== OBTENER LA INSTANCIA DE LA CLASE MEDIANTE UN GETTER =========//
    public JugadorServicioImpl getInstance() {
        if (null == servicioJugador) {
            servicioJugador = new JugadorServicioImpl();
        }
        return servicioJugador;
    }

    //====================== CONSULTAS PARA LA BASE DE DATOS =================//
    private final String getTodosLosJugadores = "SELECT * FROM `jugador` ORDER BY premio DESC";
    //====================== CONSULTAS PARA LA BASE DE DATOS =================//

    //------------------------LISTA DE JUGADORES-------------------------//
    @Override
    public List<Jugador> getTodosLosJugadores() {
        List<Jugador> jugadores = new ArrayList<>();
        try {
            PreparedStatement sentencia = conexion.getConexion().prepareStatement(getTodosLosJugadores);
            ResultSet rs = sentencia.executeQuery();
            while (rs.next()) {
                jugadores.add(jugadoresMapper(rs));
            }
        } catch (SQLException e) {
            throw new BaseDeDatosException(e.getMessage(), e.getCause());
        }

        return jugadores;
    }
    //------------------------LISTA DE JUGADORES-------------------------//

    //------------------------MAPPER DE JUGADORES-------------------------//
    private Jugador jugadoresMapper(ResultSet rs) throws SQLException {
        //Genera el obj con la informacion de la BD
        return new Jugador(rs.getString("nombreJugador"), rs.getInt("idJugador"), rs.getInt("premio"), rs.getInt("ronda"));
    }
    //------------------------MAPPER DE JUGADORES-------------------------//
    
}
