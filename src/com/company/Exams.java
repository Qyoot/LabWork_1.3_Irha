package com.company;

public class Exams {

    public int getHistory() {
        return History;
    }

    public void setHistory(int history) {
        History = history;
    }

    public int getMathematics() {
        return Mathematics;
    }

    public void setMathematics(int mathematics) {
        Mathematics = mathematics;
    }

    public int getProfessional_Lang() {
        return Professional_Lang;
    }

    public void setProfessional_Lang(int professional_Lang) {
        Professional_Lang = professional_Lang;
    }

    public int getUkrainian() {
        return Ukrainian;
    }

    public void setUkrainian(int ukrainian) {
        Ukrainian = ukrainian;
    }

    private int Mathematics;
    private int History;
    private int Professional_Lang;
    private int Ukrainian;

    public Exams() {
        Mathematics = 0;
        History = 0;
        Professional_Lang = 0;
        Ukrainian = 0;
    }
}
