package dtrivia.logica.entidades;


public class Jugador {
    
    private String nombre;
    private Integer premio, ronda;

    //Constructor por Defecto
    public Jugador(){}
    
    //Constructor por referencia
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
    
}
