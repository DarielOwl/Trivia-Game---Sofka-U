package dtrivia.logica;

/**
 *
 * @author Dariel de Sosa
 */
import dtrivia.logica.controlador.controladorCategoria.CategoriaControlador;
import dtrivia.logica.controlador.controladorCategoria.CategoriaInterfaz;
import dtrivia.logica.controlador.controladorFAQ.FAQControlador;
import dtrivia.logica.controlador.controladorFAQ.FAQInterfaz;
import dtrivia.logica.controlador.controladorJugador.JugadorControlador;
import dtrivia.logica.controlador.controladorJugador.JugadorInterfaz;
import dtrivia.logica.servicio.categoriaServicio.CategoriaServicio;
import dtrivia.logica.servicio.categoriaServicio.CategoriaServicioImpl;
import dtrivia.logica.servicio.faqServicio.FAQServicio;
import dtrivia.logica.servicio.faqServicio.FAQServicioImpl;
import dtrivia.logica.servicio.jugadorServicio.JugadorServicio;
import dtrivia.logica.servicio.jugadorServicio.JugadorServicioImpl;

public class Fabrica {

    private static Fabrica instancia; //Establecer instancia de singlenton

    public static Fabrica getInstance() { //Obtener la instancia de fabrica
        if (instancia == null) {
            instancia = new Fabrica();
        }
        return instancia;
    }

    //---------------------Jugador Operaciones------------------------//
    public JugadorInterfaz getJugadorControlador() { //Obtener instancia de Controlador Jugador
        JugadorInterfaz inst = new JugadorControlador();
        return inst;
    }

    public JugadorServicio getJuagdorServicioImpl() { //Obtener instancia del Servicio Jugador
        JugadorServicio inst = new JugadorServicioImpl();
        return inst;
    }
    //---------------------Jugador Operaciones------------------------//

    //---------------------Categoria Operaciones------------------------//
    public CategoriaInterfaz getCategoriaControlador() { //Obtener instancia de Controlador Servicio
        CategoriaInterfaz inst = new CategoriaControlador();
        return inst;
    }

    public CategoriaServicio getCategoriaServicioImpl() { //Obtener instancia del Servicio Jugador
        CategoriaServicio inst = new CategoriaServicioImpl();
        return inst;
    }
    //---------------------Categoria Operaciones------------------------//

    //-----------------------FAQ Operaciones------------------------//
    public FAQInterfaz getFAQControlador() { //Obtener instancia de Controlador Servicio
        FAQInterfaz inst = new FAQControlador();
        return inst;
    }

    public FAQServicio getFAQServicioImpl() { //Obtener instancia del Servicio Jugador
        FAQServicio inst = new FAQServicioImpl();
        return inst;
    }
    //-----------------------FAQ Operaciones------------------------//
}
