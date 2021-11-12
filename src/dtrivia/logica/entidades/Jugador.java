package dtrivia.logica.entidades;


public class Jugador {
    
    private String nombre;
    private Integer id, premio, ronda;
    
    //Constructor por Defecto
    public Jugador(){}
    
    //Constructor por referencia
    public Jugador(String nombre, Integer id, Integer premio, Integer ronda) {
        this.nombre = nombre;
        this.id = id;
        this.premio = premio;
        this.ronda = ronda;
    }

    public Jugador(String nombre, Integer premio, Integer ronda) {
        this.nombre = nombre;
        this.premio = premio;
        this.ronda = ronda;
    }
    
    //-------------------Getters-------------------//
    public String getNombre() {
        return nombre;
    }

    public Integer getPremio() {
        return premio;
    }

    public Integer getRonda() {
        return ronda;
    }

    public Integer getId() {
        return id;
    }

    //-------------------Setters-------------------//
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPremio(Integer premio) {
        this.premio = premio;
    }

    public void setRonda(Integer ronda) {
        this.ronda = ronda;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
}
