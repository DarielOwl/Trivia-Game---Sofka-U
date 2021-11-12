package dtrivia.logica.entidades;

public class Pregunta {
    
    private String pregunta, dificultad;
    private Long idCategoria, id;
    
    public Pregunta(){}

    public Pregunta(Long id) {
        this.id = id;
    }
    
    public Pregunta(String pregunta, String dificultad, Long idCategoria) {
        this.pregunta = pregunta;
        this.dificultad = dificultad;
        this.idCategoria = idCategoria;
    }


    //-------------------Getters-------------------//
    public String getPregunta() {
        return pregunta;
    }

    public String getDificultad() {
        return dificultad;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public Long getId() {
        return id;
    }
    
    //-------------------Setters-------------------//
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    
    
}
