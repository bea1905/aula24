package dao;

import java.util.List;

import domain.Produto;

public class DaoProduto {

	public void salvar(Produto produto) {
			System.out.println("Salvando produto");
	}
	
	public void excluir(int id) {
		System.out.println("Excluindo produto");
	}
	
	public List<Produto> listar(String nome) {
		System.out.println("Listando produto");
		return null;
	}
	
}
