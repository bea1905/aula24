package service;

import java.util.List;

import dao.DaoProduto;
import domain.Produto;

public class ServiceProduto {
	
	
	public void salvar(Produto produto) {
		DaoProduto daoProduto = new DaoProduto();
		daoProduto.salvar(produto);
}

	public void excluir(int id) {
		DaoProduto daoProduto = new DaoProduto();
		daoProduto.excluir(id);
}

	public List<Produto> listar(String nome) {
		DaoProduto daoProduto = new DaoProduto();
		return daoProduto.listar(nome);
}
	
	
	
}
