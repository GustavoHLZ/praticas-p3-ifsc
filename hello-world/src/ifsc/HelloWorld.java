package ifsc;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
	
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Insira algo:");
		
		String nome = leitura.nextLine();
		
		System.out.println("Idade:");
		
		String idadeStr = leitura.nextLine();
		double Idade = Double.valueOf(idadeStr);
		
		System.out.println(nome + " tem " + Idade);
		
	}

}
