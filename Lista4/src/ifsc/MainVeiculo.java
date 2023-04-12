package ifsc;

public class MainVeiculo {
	
	public static void main(String[] args) {
	
		
	Veiculo veiculox = new Veiculo();
	
	veiculox.setNome("Voyage");
	veiculox.setCor("Branco");
	veiculox.setAno(2015);
	
	
	
	System.out.println("o veiculo é " + veiculox.getNome());
	System.out.println("Cor: " + veiculox.getCor());
	System.out.println("Ano é " + veiculox.getAno());
	
}
}	