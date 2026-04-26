package alg06;
import java.util.Scanner;

public class alg06 {
    static Scanner scanner = new Scanner(System.in);

    public static void indicePoluicao(){
        float indicePoluicao = 0f;

        System.out.print("índice de poluição: ");
        indicePoluicao = scanner.nextFloat();

        if(indicePoluicao >= 0.3f){
            System.out.println("Suspender as atividades o(s) grupo(s): ");
            System.out.println("Grupo 1");

            if(indicePoluicao >= 0.4f){
                System.out.println("Grupo 2");
            }
            if(indicePoluicao >= 0.5f){
                System.out.println("Grupo 3");
            }
        }
        else {
            System.out.println("Nenhum grupo a suspender as atividades.");
        }
    }

    public static void categoriaNadador(){
        int idade = 0;
        String categoria = "";
        boolean idadeInvalida = false;

        System.out.print("Idade: ");
        idade = scanner.nextInt();

        if(idade >= 5 && idade <= 7){
            categoria = "Infantil A";
        } 
        else if(idade >= 8 && idade <= 11){
            categoria = "Infantil B";
        }
        else if(idade >= 12 && idade <= 13){
            categoria = "Juvenil A";
        }
        else if(idade >= 14 && idade <= 17){
            categoria = "Juvenil B";
        }
        else if(idade >= 18){
            categoria = "adulto";
        }
        else {
            idadeInvalida = true;
        }

        if(idadeInvalida){
            System.out.println("Idade inválida.");
        } 
        else {
            System.out.println("Categoria: " + categoria);
        }
    }

    public static void bonusSalario(){
        double porcentagemBonus = 0;
        double bonus = 0;
        double salario = 0;
        int tempoDeServicoMeses = 0;

        System.out.print("Salário: ");
        salario = scanner.nextDouble();
        System.out.print("Tempo de serviço em meses: ");
        tempoDeServicoMeses = scanner.nextInt();

        porcentagemBonus = tempoDeServicoMeses >= 60 ? 20 : 10;  
        bonus = salario + (salario * (porcentagemBonus / 100));

        System.out.println("Salário com bônus: " + bonus);
    }

    public static void multas(){
        double velocidadeMaxima = 100;
        double velocidadeMotorista = 0;
        double multa = 0;

        System.out.print("Velocidade do motorista: ");
        velocidadeMotorista = scanner.nextDouble();

        if(velocidadeMotorista >= velocidadeMaxima){
            if(velocidadeMotorista <= (velocidadeMaxima + 10)){
                multa = 50;
            }
            else if(velocidadeMotorista >= (velocidadeMaxima + 10) && velocidadeMotorista <= (velocidadeMaxima + 30)){
                multa = 100;
            }
            else {
                multa = 200;
            }
        }
        else {
            System.out.println("Sem multa.");
        }
        System.out.println("Multa: " + multa);
    }

    public static void main(String[] args){
        multas();
    }
}