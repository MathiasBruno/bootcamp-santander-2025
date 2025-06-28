//Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela.
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double lado=0.0, area=0.0;
		
		System.out.println("Informe a medida do lado do quadrado: ");
		lado = scnr.nextDouble();
		scnr.nextLine();
		
		area = Math.pow(lado, 2);
		
		System.out.println("Area do quadrado de lado "+lado+" eh: "+area);
		scnr.close();

	}

}
