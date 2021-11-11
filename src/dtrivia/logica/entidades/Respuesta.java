package dtrivia.logica.entidades;

public class Respuesta {

    private String respuesta;
    private String verificar;

    public Respuesta() {
    }

    public Respuesta(String respuesta, String verificar) {
        this.respuesta = respuesta;
        this.verificar = verificar;
    }

    //-------------------Getters-------------------//
    public String getRespuesta() {
        return respuesta;
    }

    public String getVerificar() {
        return verificar;
    }

    //-------------------Setters-------------------//
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public void setVerificar(String verificar) {
        this.verificar = verificar;
    }

}
