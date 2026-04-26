package alg07;

import java.util.Scanner;

public class alg07 {
	static Scanner scanner = new Scanner(System.in);
	
	public static void Operacoes(){
		double num1 = 0;
		double num2 = 0;
		double resultado = 0;
		int escolha = 0;

		System.out.print("N1: ");
		num1 = scanner.nextDouble();
		System.out.print("N2: ");
		num2 = scanner.nextDouble();

		System.out.println();
		System.out.print("1 - ADIÇÃO \n2 - SUBTRAÇÃO \n3 - MULTIPLICAÇÃO \n4 - DIVISÃO \n");
		System.out.print("Escolha: ");
		escolha = scanner.nextInt();

		switch(escolha){
			case 1: 
				resultado = num1 + num2;
				break;

			case 2:
				resultado = num1 - num2;
				break;

			case 3: 
				resultado = num1 * num2;
				break;
			
			case 4:
				if(num2 == 0){
					resultado = 0;
				}
				else {
					resultado = num1 / num2;
				}
				break;

			default: 
				System.out.println("Operação inválida.");
				break;
		}
		if(escolha >= 1 || escolha <= 4){
			System.out.println("\nResultado: " + resultado);
		}	
	}

   	public static void main(String[] args){
		Operacoes();
   	}
}