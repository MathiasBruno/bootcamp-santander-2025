
/*Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo 
 * do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:

	Se for menor ou igual a 18,5 "Abaixo do peso";
	se for entre 18,6 e 24,9 "Peso ideal";
	Se for entre 25,0 e 29,9 "Levemente acima do peso";
	Se for entre 30,0 e 34,9 "Obesidade Grau I";
	Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
	Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
 */

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double peso=0.0, altura=0.0, imc=0.0;
		
		System.out.println("Informe o peso em Kg: ");
		peso = scnr.nextDouble();
		scnr.nextLine();
		
		System.out.println("Informe a altura em Metros: ");
		altura = scnr.nextDouble();
		scnr.nextLine();
		
		imc = peso/(altura*altura);
		System.out.println("\nIMC: "+imc);
		
		if(imc <= 18.5) {
			System.out.println("Abaixo do peso!");
		}else if(imc > 18.5 && imc <= 24.9) {
			System.out.println("Peso ideal!");
		}else if(imc > 24.9 && imc <= 29.9) {
			System.out.println("Levemente acima do peso!");
		}else if(imc > 29.9 && imc <= 34.9) {
			System.out.println("Obesidade grau I!");
		}else if(imc > 34.9 && imc <= 39.9) {
			System.out.println("Obesidade grau II (Severa)!");
		}else if(imc > 39.9) {
			System.out.println("Obesidade grau III (Mórbida)!");
		}
		
		scnr.close();

	}

}
