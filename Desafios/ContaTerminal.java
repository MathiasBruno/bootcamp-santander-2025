import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int numero;
		String agencia, nomeCliente;
		double saldo;
		
		System.out.print("Informe a Agência: \n");
		agencia = scnr.nextLine();
		
		System.out.print("Informe o Número da conta: \n");
		numero = scnr.nextInt();
		scnr.nextLine();
		
		System.out.print("Informe o Nome do Cliente: \n");
		nomeCliente = scnr.nextLine();
		
		System.out.print("Informe o Saldo: \n"); //utilizar ',' ao invés de '.'
		saldo = scnr.nextDouble();
		scnr.nextLine();
		
		scnr.close();
		
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque!");

	}

}
