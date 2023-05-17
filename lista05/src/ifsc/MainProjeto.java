package ifsc;

import java.util.ArrayList;

public class MainProjeto {
	public static void main(String[] args) {

		ArrayList<Produto> produtos = new ArrayList<>();

		Produto getx = new Produto();

		getx.setNome("Vergalhão CA50");
		getx.setPreco(39.14);
		getx.setFornecedor("Balaroti");
		getx.setCodbarras(57098313l);
		produtos.add(getx);
		
		Produto gety = new Produto();

		gety.setNome("Vergalhão Fibra de Vidro ");
		gety.setPreco(25.93);
		gety.setFornecedor("Loja do Mecânico");
		gety.setCodbarras(72714449l);
		produtos.add(gety);

		Produto getz = new Produto();

		getz.setNome("Vergalhão CA60 Nervurado");
		getz.setPreco(11.17);
		getz.setFornecedor("Loja Arcelor");
		getz.setCodbarras(515151683l);
		produtos.add(getz);

		for (int i = 0; i < produtos.size(); i++) {
			System.out.println(produtos.get(i).getNome());
			System.out.println(produtos.get(i).getPreco());
			System.out.println(produtos.get(i).getFornecedor());
			System.out.println(produtos.get(i).getCodbarras());
			System.out.println("");
		}
	}

}
