
//Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String nome1, nome2;
		int idade1, idade2, diferenca;
		
		System.out.println("Primeiro nome: ");
		nome1 = scnr.nextLine();
		System.out.println("Idade 1: ");
		idade1 = scnr.nextInt();
		scnr.nextLine();
		
		System.out.println("\nSegundo nome: ");
		nome2 = scnr.nextLine();
		System.out.println("Idade 2: ");
		idade2 = scnr.nextInt();
		scnr.nextLine();
		
		if(idade1>=idade2) {
			diferenca = idade1-idade2;
		}else {
			diferenca = idade2-idade1;
		}
		
		System.out.println("\nA diferenca de idade entre "+nome1+" e "+nome2+" eh: "+diferenca);
		
		scnr.close();

	}

}
