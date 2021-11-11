package dtrivia.logica.entidades;

public class Ronda {

    private Integer numeroRonda, puntos;
    
    public Ronda(){}
    
    public Ronda(Integer numeroRonda, Integer puntos) {
        this.numeroRonda = numeroRonda;
        this.puntos = puntos;
    }

    //-------------------Getters-------------------//
    public Integer getNumeroRonda() {
        return numeroRonda;
    }

    public Integer getPuntos() {
        return puntos;
    }

    //-------------------Setters-------------------//
    public void setNumeroRonda(Integer numeroRonda) {
        this.numeroRonda = numeroRonda;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

}
