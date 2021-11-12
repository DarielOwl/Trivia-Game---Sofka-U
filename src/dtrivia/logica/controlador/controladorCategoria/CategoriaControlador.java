package dtrivia.logica.controlador.controladorCategoria;

import dtrivia.excepciones.BaseDeDatosException;
import dtrivia.excepciones.InnovaModelException;
import dtrivia.logica.entidades.Categoria;
import dtrivia.logica.servicio.categoriaServicio.CategoriaServicio;
import dtrivia.logica.servicio.categoriaServicio.CategoriaServicioImpl;
import java.util.List;

/**
 *
 * @author Dariel de Sosa
 */
public class CategoriaControlador implements CategoriaInterfaz {

    //Obtener instancia de servicio jugador
    private final CategoriaServicio categoriaServicio = new CategoriaServicioImpl().getInstance();

    @Override
    public List<Categoria> getTodosLasCategorias() {
        try {
            //Aqui debemos llamar a servicios de la BD
            return categoriaServicio.getTodosLasCategorias();
        } catch (BaseDeDatosException ex) { //Cualquier error muestra
            throw new InnovaModelException(String.format("Error en base de datos [%s]", ex.getMessage()));
        }
    }

}
