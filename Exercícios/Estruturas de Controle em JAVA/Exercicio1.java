
//Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int numero=0, result=0;
		
		System.out.println("Informe um numero inteiro: ");
		numero = scnr.nextInt();
		scnr.nextLine();
		
		System.out.println("===============================");
		
		for(int i=1; i<=10; i++) {
			result = numero * i;
			System.out.println(numero+" x "+i+" = "+result);
		}
		
		scnr.close();

	}

}
