package dtrivia.logica.entidades;

public class Categoria {
   
    private String nombreCategoria;
    private Integer dificultad;

    //Constructor por defecto
    public Categoria(){}
    
    //Constructor por referencia
    public Categoria(String nombreCategoria, Integer dificultad) {
        this.nombreCategoria = nombreCategoria;
        this.dificultad = dificultad;
    }
    
    //-------------------Getters-------------------//
    public String getNombreCategoria() {
        return nombreCategoria;
    }
    
    public Integer getDificultad() {
        return dificultad;
    }
    
    
    //-------------------Setters-------------------//
    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public void setDificultad(Integer dificultad) {
        this.dificultad = dificultad;
    }

}
