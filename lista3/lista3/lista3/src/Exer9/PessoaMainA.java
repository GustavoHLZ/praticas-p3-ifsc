package Exer9;

import java.util.Scanner;

public class PessoaMainA {
	
	public static void main(String[] args) {
		 
		
		Pessoa p = new Pessoa();
		p.nome = "Gustavo";
		p.cpf = (long) 15512227469l;
		p.ddd = "21/10/2005";
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Bernardo";
		p1.cpf = (long) 1551222746l;
		p1.ddd = "26/01/2006";
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Gabriel";
		p2.cpf = (long) 1551222746l;
		p2.ddd = "24/11/2005";
		
		System.out.println("O nome da pessoa é " + p.nome + " seu cpf é " + p.cpf + " Seu nascimento é " + p.ddd);
		System.out.println("O nome da pessoa é " + p1.nome + " seu cpf é " + p1.cpf + " Seu nascimento é " + p1.ddd);
		System.out.println("O nome da pessoa é " + p2.nome + " seu cpf é " + p2.cpf + " Seu nascimento é " + p2.ddd);
	}
		
		
		
		
	}

