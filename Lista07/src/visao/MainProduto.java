package visao;

import controle.ProdutoDAO;
import modelo.Produto;

public class MainProduto {

	public static void main(String[] args) {
		
		Produto px = new Produto ();		
		px.setNome("Amora");
		px.setCodBarras((long)1214567);
		
		ProdutoDAO a=new ProdutoDAO();
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.inserir(px);
		System.out.println(px.getNome());
		dao.Alterar(px);
		System.out.println(px.getNome());
		dao.Excluir(px);
		System.out.println(a.lista().size());
		
		
	}
}
