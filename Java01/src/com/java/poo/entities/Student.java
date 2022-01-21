package com.java.poo.entities;

public class Student {
    public String name;
    public double note1;
    public double note2;
    public double note3;

    public double somaNota() {
        return note1 + note2 + note3;
    }

    public String avaliacaoFinal() {
        if (somaNota() > 60.0) {
            return "PASS";

        } else {
            double notaFinal = 60 - somaNota();
            return "FAILED\n" + "MISSING " + String.format("%.2f",notaFinal) + " POINTS";

        }
    }

    @Override
    public String toString() {
        return "Name: "
                + name
                +"\nFINAL GRADE = "
                + String.format("%.2f \n", somaNota())
                + avaliacaoFinal();
    }
}
