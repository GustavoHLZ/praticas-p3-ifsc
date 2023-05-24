package controle;

import modelo.Produto;

import java.util.ArrayList;

public class ProdutoDAO {

	private ArrayList<Produto> Produtos;
	
	public ProdutoDAO() {
		Produtos = new ArrayList<>();
	}
	
	public Boolean inserir(Produto p) {
		
		Produtos.add(p);
		
		return true;
	}
	
	public Boolean Alterar (Produto p) {
		for(Produto produto : Produtos) {
			if(produto.getCodBarras() == p.getCodBarras()) {
				produto.setNome("Cimento");
				return true;
			}
		}
		return false;
	}
	public Boolean Excluir (Produto p) {
		for(Produto produto : Produtos) {
			if(produto.getCodBarras() == p.getCodBarras()) {
				Produtos.remove(produto);
				return true;
			}
		}
		return false;
	}
	public ArrayList<Produto> lista () {
		return this.Produtos;
	}
}
