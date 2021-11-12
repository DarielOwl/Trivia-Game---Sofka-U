package dtrivia.excepciones;

/**
 *
 * @author Dariel de Sosa
 */
public class BaseDeDatosException extends RuntimeException {

    public BaseDeDatosException(String message) {
        super(message);
    }

    public BaseDeDatosException(String message, Throwable cause) {
        super(message, cause);
    }
     
}
