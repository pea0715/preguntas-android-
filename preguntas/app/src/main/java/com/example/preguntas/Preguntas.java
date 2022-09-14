package com.example.preguntas;

public class Preguntas {
    private String Pregunta;
    private String Opcion1;
    private String Opcion2;
    private String Opcion3;
    private String Correcta;
    private int Puntuacion;

    public Preguntas(String pregunta, String opcion1, String opcion2, String opcion3, String correcta, int puntuacion) {
        Pregunta = pregunta;
        Opcion1 = opcion1;
        Opcion2 = opcion2;
        Opcion3 = opcion3;
        Correcta = correcta;
        Puntuacion = puntuacion;
    }

    public String getPregunta() {
        return Pregunta;
    }

    public void setPregunta(String pregunta) {
        Pregunta = pregunta;
    }

    public String getOpcion1() {
        return Opcion1;
    }

    public void setOpcion1(String opcion1) {
        Opcion1 = opcion1;
    }

    public String getOpcion2() {
        return Opcion2;
    }

    public void setOpcion2(String opcion2) {
        Opcion2 = opcion2;
    }

    public String getOpcion3() {
        return Opcion3;
    }

    public void setOpcion3(String opcion3) {
        Opcion3 = opcion3;
    }

    public String getCorrecta() {
        return Correcta;
    }

    public void setCorrecta(String correcta) {
        Correcta = correcta;
    }

    public int getPuntuacion() {
        return Puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        Puntuacion = puntuacion;
    }
}
