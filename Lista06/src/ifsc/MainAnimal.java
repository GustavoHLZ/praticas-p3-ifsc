package ifsc;

public class MainAnimal {
	
	public static void main(String[] args) {
		
		Cachorro puxa = new Cachorro();
		
		puxa.setNome("Rex");
		puxa.setRaca("Poodle");
		puxa.setComprimento((float)0.60 );
		puxa.setNumerodepatas(4);
		puxa.setCor("Preto");
		puxa.setEcossistema("Casa");
		
		Gato px = new Gato();
		
		px.setNome("Pepe");
		px.setRaca("Maine coon");
		px.setComprimento((float).100 );
		px.setNumerodepatas(4);
		px.setCor("Branco");
		px.setEcossistema("Casa");
		
		
		System.out.println(puxa.getNome());
		System.out.println(puxa.getRaca());
		System.out.println(puxa.getComprimento());
		System.out.println(puxa.getNumerodepatas());
		System.out.println(puxa.getCor());
		System.out.println(puxa.getEcossistema());
		
		puxa.late();
		
	
		System.out.println(px.getNome());
		System.out.println(px.getRaca());
		System.out.println(px.getComprimento());
		System.out.println(px.getNumerodepatas());
		System.out.println(px.getCor());
		System.out.println(px.getEcossistema());
		px.mia();
		
		
	}

}
