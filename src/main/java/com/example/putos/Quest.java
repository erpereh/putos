package com.example.putos;

public class Quest {
private final int numPreguntas=7;
private int contPreguntas;
private int numErrores;
private String[] preguntas;
private String[] respuestas;
private String[] rAzar;

    public int getNumPreguntas() {
        return numPreguntas;
    }

    public Quest(int i) {
        contPreguntas = 0;
        numErrores = 0;
        if (i==1){
            preguntas = new String[]{"1", "2", "3", "4", "5", "6", "7", "8"};
            respuestas = new String[]{"aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh"};
            rAzar = new String[]{"aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh"};
        }
        else if (i==2) {
            preguntas = new String[]{"1a", "2a", "3a", "4a", "5a", "6a", "7a", "8a"};
            respuestas = new String[]{"aaa1", "bbb1", "ccc1", "ddd1", "eee1", "fff1", "ggg1", "hhh1"};
            rAzar = new String[]{"aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh"};
        }
    }
    public int getContPreguntas() {
        return contPreguntas;
    }

    public void setContPreguntas(int contPreguntas) {
        this.contPreguntas = contPreguntas;
    }

    public int getNumErrores() {
        return numErrores;
    }

    public void setNumErrores(int numErrores) {
        this.numErrores = numErrores;
    }

    public String[] getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(String[] preguntas) {
        this.preguntas = preguntas;
    }

    public String[] getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }

    public String[] getrAzar() {
        return rAzar;
    }

    public void setrAzar(String[] rAzar) {
        this.rAzar = rAzar;
    }
    public String DevolverPregunta(){
        return preguntas[contPreguntas];
    }
    public String[] DevolverRespuestas(){
        String[] array=new String[4];
        array[0]=respuestas[contPreguntas];
        int cont=1;
        for (int i = contPreguntas*3; i < (contPreguntas*3)+3; i++) {
            array[cont]=rAzar[i];
            cont++;
        }
        return array;
    }
    public boolean ComprobarAcierto(String respuesta){
        if(respuestas[contPreguntas].equals(respuesta)){
            contPreguntas++;
            return true;
        }else {
            numErrores++;
            contPreguntas++;
            return false;
        }
    }
}
