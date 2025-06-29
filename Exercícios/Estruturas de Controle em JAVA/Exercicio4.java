
/*Escreva um código onde o usuário informa um número inicial, posteriormente 
 * irá informar outros N números, a execução do código irá continuar até que 
 * o número informado dividido pelo primeiro número tenha resto diferente de 
 * 0 na divisão, números menores que o primeiro número devem ser ignorados
 */

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num=0, div=0;
		
		System.out.println("Informe um numero: ");
		num = scnr.nextInt();
		scnr.nextLine();
		
		while(true) {
			System.out.println("Informe outro numero para ser dividido pelo numero inicial: ");
			div = scnr.nextInt();
			scnr.nextLine();
			
			if(num>div) {
				System.out.println("Ignorado!");
				continue;
			}
			
			if(div%num!=0) {
				System.out.println("Resto diferente de zero. Saindo!");
				break;
			}
			
		}
		scnr.close();
		
	}

}
