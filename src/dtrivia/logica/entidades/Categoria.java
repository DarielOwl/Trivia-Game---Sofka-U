package dtrivia.logica.entidades;

public class Categoria {

    private String nombreCategoria;
    private Long id;

    //Constructor por defecto
    public Categoria() {
    }

    //Constructor por referencia
    public Categoria(String nombreCategoria, Long id) {
        this.nombreCategoria = nombreCategoria;
        this.id = id;
    }

    //-------------------Getters-------------------//
    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public Long getId() {
        return id;
    }

    //-------------------Setters-------------------//
    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
     @Override
    public String toString() {
        return String.format("%s", nombreCategoria);
    }

}
