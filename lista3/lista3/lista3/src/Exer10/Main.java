package Exer10;

public class Main {

	public static void main(String[] args) {

		Animal animal = new Animal();

		animal.nomeCientifico = "Ramphastos toco";
		animal.familia = "Ramphastidae";
		animal.reino = "Animal";

		String[] vetorNomesPop = new String[5];
		vetorNomesPop[0] = "Tucano-toco";
		vetorNomesPop[1] = "tucanuçu";
		vetorNomesPop[2] = "Tucano de oculos";

		// atribuicao de valor pra variavel
		animal.nomesPopulares = vetorNomesPop;
		
		System.out.println("Seu nome cientifico é " + animal.nomeCientifico);
		System.out.println("Sua familia " + animal.familia);
		System.out.println("Seu reino " + animal.reino);

		
		for(int i =0; i< 3;i++) {
			
			System.out.println("Nomes populares: " + animal.nomesPopulares[i]);
		}
	}

}
