package alg08;

import java.util.Scanner;

public class alg08 {
	static Scanner scanner = new Scanner(System.in);

		public static void maiorMenorMedia(){
			/*
				A – Faça um algoritmo que implemente um laço que leia X números inteiros e identifique qual o 
				menor o maior e a media, quando o número informado for zero, interrompa o laço e exiba os valores.
			*/
			int num = 1;
			int maior = -999999999;
			int menor = 999999999;
			int media = 0;
			int contador = 0;

			while(num != 0){
				System.out.print("Digite um número: ");
				num = scanner.nextInt();

				if(num != 0){
					if(num > maior){
						maior = num;
					}
					if(num < menor){
						menor = num;
					}
					media += num;
					contador++;					
				}
			}
			if(contador != 0){
				media = media / contador;
			}
			System.out.println("Maior: " + maior);
			System.out.println("Menor: " + menor);
			System.out.println("Média: " + media);
		}

		public static void numImpares(){
			// B – Elabore um algoritmo que gere e escreva os números ímpares dos números entre 100 e 200.
			for(int i = 100; i <= 200; i++){
				if(i % 2 != 0){
					System.out.println(i);
				}
			}
		}
		public static void tabuada(){
			// C- Faça um algoritmo que dado valor inteiro informado, calcule e exiba a tabuada do numero de 1 a 10
			int num = 0;
			System.out.print("Informe um número: ");
			num = scanner.nextInt();

			for(int i = 1; i <= 10; i++){
				System.out.println(num + "x" + i + " = " + (num*i));
			}

		}
   
   	public static void main(String[] args) {
		// maiorMenorMedia();
		// numImpares();
		tabuada();
   	}
}