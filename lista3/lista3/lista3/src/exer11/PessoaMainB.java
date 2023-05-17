	package exer11;

import java.util.Scanner;

public class PessoaMainB {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		
		Pessoa [] atr = new Pessoa [3];
		
		int i;
		
		for(i=0; i < 3; i++) {
		Pessoa atr1 = new Pessoa();
		atr1.nome = leitura.nextLine();
		atr1.cpf = leitura.nextLine();
		atr1.ddd = leitura.nextLine();
		atr[i] = atr1;
		}
		
		for (i=0;i <3;i++) {
		System.err.println("Nome: " + atr[i].nome + " Cpf:  " + atr[i].cpf + " Nascimento: " + atr[i].ddd );
		}
	}

}
