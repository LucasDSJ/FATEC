// AULA DIA 14/03/26
// Alunos: Franklin Sousa e Lucas da Silva

package alg04;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
        
    public static void NumeroPar(){
        
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("Par.");
        }
        else {
            System.out.println("Ímpar.");
        }
        scanner.close();
    }

    public static void calculoCombustivel(){
        float valorGasolina, valorAlcool, porcentagem;
        
        System.out.println("Informe o valor do álcool:");
        valorAlcool = scanner.nextFloat();

        System.out.println("Informe o valor da gasolina:");
        valorGasolina = scanner.nextFloat();

        porcentagem = valorGasolina * 0.7f;
        if (porcentagem > valorAlcool){
            System.out.println("Não compensa usar álcool.");
        }else{
            System.out.println("Compensa usar álcool.");
        }
        scanner.close();
    }

    public static void calcularProva(){
        
        
        double p1, p2, p3;
        double pesoP1 = 1;
        double pesoP2 = 1;
        double pesoP3 = 2;
        double somaPesos = pesoP1 + pesoP2 + pesoP3;
        double mediaPonderada = 0.0;

        System.out.print("Nota p1 = ");
        p1 = scanner.nextDouble();
        System.out.print("Nota p2 = ");
        p2 = scanner.nextDouble();
        System.out.print("Nota p3 = ");
        p3 = scanner.nextDouble();

        mediaPonderada = ((p1 * pesoP1) + (p2 * pesoP2) + (p3 * pesoP3)) / somaPesos;

        if(mediaPonderada >= 60){
            System.out.println("Aluno aprovado.");
        }
        else {
            System.out.println("Aluno reprovado.");
        }
        scanner.close();
    }
    public static void emprestimo(){
        
        float salario, parcela;

        System.out.println("Informe o salário:");
        salario = scanner.nextFloat();

        System.out.println("Informe o valor da parcela do empréstimo:");
        parcela = scanner.nextFloat();

        if ((salario * 0.2) < parcela){
            System.out.println("Empréstimo não concedido.");
        }else{
            System.out.println("Empréstimo aprovado.");
        }
        scanner.close();
    }

    public static void main(String[] args) throws Exception {
        // NumeroPar();
        // calculoCombustivel();
        // calcularProva();
        emprestimo();
    }
}
