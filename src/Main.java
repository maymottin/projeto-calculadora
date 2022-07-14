import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("*CALCULADORA*");

        Calculadora calculadora = new Calculadora();
        int opcaoEscolhida = escolhaOperacao();

        while (opcaoEscolhida != 0){
            if (opcaoEscolhida == 1) {
                Adicao somar = new Adicao(1,2);
                calculando(somar);
                opcaoEscolhida = escolhaOperacao();
            } else if (opcaoEscolhida == 2) {
                Substracao subtrair = new Substracao(3,4);
                calculando(subtrair);
                opcaoEscolhida = escolhaOperacao();
            } else if (opcaoEscolhida == 3) {
                Multiplicacao multiplicar = new Multiplicacao(5,6);
                calculando(multiplicar);
                opcaoEscolhida = escolhaOperacao();
            } else if (opcaoEscolhida == 4) {
                Divisao dividir = new Divisao(7,8);
                calculando(dividir);
                opcaoEscolhida = escolhaOperacao();
            }
        }

        System.out.println("Encerrando calculadora.");
    }

    public static int escolhaOperacao(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual operação você deseja fazer? " +
                "Digite: " +
                "\n1 para soma; " +
                "\n2 para subtração; " +
                "\n3 para multiplicação; " +
                "\n4 para divisão; " +
                "\n0 para encerrar a calculadora.");
        return scanner.nextInt();
    }

    public static void calculando(Calculos calculos) {
        calculos.mostrarCalculo();
        calculos.mostrarResultado();
    }




}
