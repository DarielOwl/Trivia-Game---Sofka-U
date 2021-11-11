package dtrivia.logica.entidades;

public class Pregunta {
    
    private String pregunta;
    
    public Pregunta(){}

    public Pregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    //-------------------Getters-------------------//
    public String getPregunta() {
        return pregunta;
    }

    //-------------------Setters-------------------//
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    
}
