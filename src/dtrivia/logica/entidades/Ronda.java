package dtrivia.logica.entidades;

public class Ronda {

    private Long numeroRonda, puntos;
    private String dificultad;

    public Ronda() {
    }

    public Ronda(Long numeroRonda, Long puntos, String dificultad) {
        this.numeroRonda = numeroRonda;
        this.puntos = puntos;
        this.dificultad = dificultad;
    }

    //-------------------Getters-------------------//
    public Long getNumeroRonda() {
        return numeroRonda;
    }

    public Long getPuntos() {
        return puntos;
    }

    public String getDificultad() {
        return dificultad;
    }

    //-------------------Setters-------------------//
    public void setNumeroRonda(Long numeroRonda) {
        this.numeroRonda = numeroRonda;
    }

    public void setPuntos(Long puntos) {
        this.puntos = puntos;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

}
