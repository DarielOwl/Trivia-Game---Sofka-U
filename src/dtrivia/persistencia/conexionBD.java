package dtrivia.persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;

/**
 *
 * @author Dariel de Sosa
 */
public class conexionBD {

    private static Connection con;
    private static Properties prop = new Properties();

    //-------------------------Definimos la Conexion--------------------------//
    public conexionBD() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //Cargamos el archivo con los parametros de la BD
            String path = System.getProperty("user.dir");
            InputStream stream = new FileInputStream(path + File.separator + "parametrosBD.txt");
            prop.load(stream);

            //Establecemos Conexion con la BD
            con = DriverManager.getConnection(prop.getProperty("DB_URL"), prop.getProperty("USER"), prop.getProperty("PASS"));
            System.out.println("Conexion exitosa a la BD!");

        } catch (Exception e) { //Cualquier error, mostrar
            System.err.println("Error en la BD: " + e);
        }
    }

    //------------------Retornamos la Conexion de la BD------------------//
    public Connection getConexion() {
        return con;
    }

    //-----------------------Prueba de Conexion-----------------------//
    public static void main(String[] args) {
        try {
            //Verificar que la conexion no este cerrada o nula
            if (con == null || con.isClosed()) {
                
                //Cargamos el archivo con los parametros de la BD
                String path = System.getProperty("user.dir");
                InputStream stream = new FileInputStream(path + File.separator + "parametrosBD.txt");
                prop.load(stream);

                //Establecemos Conexion con la BD
                con = DriverManager.getConnection(prop.getProperty("DB_URL"), prop.getProperty("USER"), prop.getProperty("PASS"));
            }
            
            //Ejecutamos la Query que queremos
            ResultSet rs = con.createStatement().executeQuery("Select * from Jugador");

            //Mostramos los usuarios de esa tabla
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("nombreJugador"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
