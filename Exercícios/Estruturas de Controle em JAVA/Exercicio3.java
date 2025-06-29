
/*Escreva um código que o usuário entre com um primeiro número, 
 * um segundo número maior que o primeiro e escolhe entre a opção 
 * par e impar, com isso o código deve informar todos os números 
 * pares ou ímpares (de acordo com a seleção inicial) no intervalo 
 * de números informados, incluindo os números informados e em 
 * ordem decrescente;
 */

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num1=0, num2=0, op=0;
		
		System.out.println("Informe o primeiro numero: ");
		num1 = scnr.nextInt();
		scnr.nextLine();
		
		System.out.println("Informe o segundo numero, que seja maior que o primeiro: ");
		num2 = scnr.nextInt();
		scnr.nextLine();

		if(num1 >= num2) {
			System.out.println("O segundo numero deve ser maior que o primeiro!");
		}else {
			System.out.println("Deseja numeros pares ou ímpares? \n1 - Pares \n2 - Ímpares");
			op = scnr.nextInt();
			scnr.nextLine();
			
			switch(op) {
			case 1:
				for(int i=num2; i>=num1; i--) {
					if(i%2==0) {
						System.out.print(i+", ");
					}
				}
			break;
			
			case 2:
				for(int i=num2; i>=num1; i--) {
					if(i%2!=0) {
						System.out.print(i+", ");
					}
				}
			break;	
			}
		}
		
		scnr.close();
	}

}
