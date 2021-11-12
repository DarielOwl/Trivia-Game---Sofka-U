package dtrivia.logica.entidades;

public class Respuesta {

    private String respuestaBien, respuestaMal1,respuestaMal2,respuestaMal3 ;
    private Long idPregunta;

    public Respuesta() {
    }

    public Respuesta(String respuestaBien, String respuestaMal1, String respuestaMal2, String respuestaMal3, Long idPregunta) {
        this.respuestaBien = respuestaBien;
        this.respuestaMal1 = respuestaMal1;
        this.respuestaMal2 = respuestaMal2;
        this.respuestaMal3 = respuestaMal3;
        this.idPregunta = idPregunta;
    }

    //-------------------Getters-------------------//
    public String getRespuestaBien() {
        return respuestaBien;
    }

    public String getRespuestaMal1() {
        return respuestaMal1;
    }

    public String getRespuestaMal2() {
        return respuestaMal2;
    }

    public String getRespuestaMal3() {
        return respuestaMal3;
    }

    public Long getIdPregunta() {
        return idPregunta;
    }

    //-------------------Setters-------------------//
    public void setRespuestaBien(String respuestaBien) {
        this.respuestaBien = respuestaBien;
    }

    public void setRespuestaMal1(String respuestaMal1) {
        this.respuestaMal1 = respuestaMal1;
    }

    public void setRespuestaMal2(String respuestaMal2) {
        this.respuestaMal2 = respuestaMal2;
    }

    public void setRespuestaMal3(String respuestaMal3) {
        this.respuestaMal3 = respuestaMal3;
    }

    public void setIdPregunta(Long idPregunta) {
        this.idPregunta = idPregunta;
    }

}
