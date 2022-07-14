package model;

public class Multiplicacao extends Calculos{
    public Multiplicacao (double num1, double num2){
        super(num1, num2);
    }

    @Override
    public double calcular(){
        return getNum1() * getNum2();
    }

    @Override
    public void mostrarCalculo(){
        System.out.println("Operação: " +
                getNum1() +
                " * " +
                getNum2());
    }

    @Override
    public void mostrarResultado(){
        System.out.println("Resultado: " + calcular());
    }

}
