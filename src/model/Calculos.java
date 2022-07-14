package model;

import java.util.Map;

public abstract class Calculos {
    private double num1;
    private double num2;

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public Calculos(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public abstract double calcular();

    public abstract void mostrarCalculo();

    public abstract void mostrarResultado();

}
