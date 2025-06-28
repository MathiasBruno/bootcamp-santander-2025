/*Escreva um código que receba o nome e o ano de nascimento de alguém e
 * imprima na tela a seguinte mensagem: "Olá [Fulano] você tem [A] anos."
 */
import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String nome;
		int idade, ano, nascimento;
		
		ano = OffsetDateTime.now().getYear();
		
		System.out.println("Informe o nome: ");
		nome = scnr.nextLine();
		System.out.println("\nInforme o ano do nascimento: ");
		nascimento = scnr.nextInt();
		scnr.nextLine();
		
		idade = ano - nascimento;
		
		System.out.println("Olá "+nome+", você tem "+idade+" anos.");
		
		scnr.close();

	}

}
