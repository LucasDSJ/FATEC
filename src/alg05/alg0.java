package alg05;

import java.util.Scanner;

public class alg0 {
    static Scanner scanner = new Scanner(System.in);

    public static void avaliadorNotas(){
        double notaP1 = 0, notaP2 = 0, notaP3 = 0;
        int numFaltas = 0;

        System.out.print("Nota p1: ");
        notaP1 = scanner.nextDouble();
        System.out.print("Nota p2: ");
        notaP2 = scanner.nextDouble();
        System.out.print("Faltas: ");
        numFaltas = scanner.nextInt();

        double media = (notaP1 + notaP2) / 2;
        double percentualFaltas = (numFaltas / 2) * 10;
        System.out.printf("Percentual de faltas: %.2f%%%n", percentualFaltas);

        if(percentualFaltas > 30){
            System.out.println("Reprovado por faltas.");
        } 
        else {
            if(media >= 6){
                System.out.println("Aprovado.");
            }
            else {
                System.out.print("Nota p3: ");
                notaP3 = scanner.nextDouble();

                media = (notaP1 + notaP2 + notaP3) / 3;

                if(media >= 6){
                    System.out.println("Aprovado no exame.");
                }
                else {
                    System.out.println("Reprovado por nota.");
                }
            }
        }
    }

    public static void calculadora(){
        float num1 = 0f, num2 = 0f;
        float resultado = 0f;
        int operation = 0;

        System.out.print("Número real 1: ");
        num1 = scanner.nextFloat();
        System.out.print("Número real 2: ");
        num2 = scanner.nextFloat();

        System.out.println("\nOperações: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        
        System.out.print("Escolha a operação: ");
        operation = scanner.nextInt();
        
        if(operation == 1){
            resultado = num1 + num2;
        }
        else if(operation == 2){
            resultado = num1 - num2;
        }
        else if(operation == 3){
            resultado = num1 * num2;
        }
        else if(operation == 4){
            resultado = num1 / num2;
        }
        else {
            System.out.println("Essa operação não existe.");
        }

        if(operation >= 1 || operation <= 4){
            System.out.println("\nResultado: " + resultado);
        }

    }

    public static void main(String[] args){
        calculadora();
    }
}