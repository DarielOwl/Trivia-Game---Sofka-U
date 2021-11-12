package dtrivia.logica.servicio.categoriaServicio;

import dtrivia.excepciones.BaseDeDatosException;
import dtrivia.logica.entidades.Categoria;
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
public class CategoriaServicioImpl implements CategoriaServicio {

    private static CategoriaServicioImpl servicioCategoria; //INSTANCIA DE LA CLASE
    private conexionBD conexion = new conexionBD(); //Obtener la conexion de la BD

    //Constructor por defecto
    public CategoriaServicioImpl() {
    }

    //-----------OBTENER LA INSTANCIA DE LA CLASE MEDIANTE UN GETTER----------//
    public CategoriaServicioImpl getInstance() {
        if (null == servicioCategoria) {
            servicioCategoria = new CategoriaServicioImpl();
        }
        return servicioCategoria;
    }

    //------------------CONSULTAS PARA LA BASE DE DATOS-----------------------//
    private final String getTodosLasCategorias = "Select * from categoria;";
    //------------------CONSULTAS PARA LA BASE DE DATOS-----------------------//
    
    
    //------------------------LISTA DE CATEGORIAS-------------------------//
    @Override
    public List<Categoria> getTodosLasCategorias() {
        List<Categoria> categorias = new ArrayList<>();
        try {
            PreparedStatement sentencia = conexion.getConexion().prepareStatement(getTodosLasCategorias);
            ResultSet rs = sentencia.executeQuery();
            while (rs.next()) {
                categorias.add(categoriasMapper(rs));
            }
        } catch (SQLException e) {
            throw new BaseDeDatosException(e.getMessage(), e.getCause());
        }

        return categorias;
    }
    //------------------------LISTA DE CATEGORIAS-------------------------//

    //------------------------MAPPER DE CATEGORIAS-------------------------//
    private Categoria categoriasMapper(ResultSet rs) throws SQLException {
       //Genera el obj con la informacion de la BD
        return new Categoria(rs.getString("nombreCategoria"),rs.getLong("idCategoria"));
    }
    //------------------------MAPPER DE CATEGORIAS-------------------------//
    
}
