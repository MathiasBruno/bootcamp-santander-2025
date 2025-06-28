
//Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double base=0.0, altura=0.0, area=0.0;
		
		System.out.println("Informe a medida da base do triangulo: ");
		base = scnr.nextDouble();
		scnr.nextLine();
		
		System.out.println("Informe a medida da altura do triangulo: ");
		altura = scnr.nextDouble();
		scnr.nextLine();
		
		area = base*altura;
		
		System.out.println("A area do triangulo de base "+base+" e altura "+altura+" eh: "+area);
		
		scnr.close();

	}

}
