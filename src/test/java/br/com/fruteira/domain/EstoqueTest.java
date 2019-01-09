package br.com.fruteira.domain;

import org.junit.Assert;
import org.junit.Test;

import br.com.fruteira.domain.Estoque;
import br.com.fruteira.domain.Produto;

public class EstoqueTest {
	public Produto produto;

	@Test
	public void deveCriarUmEstoqueValido() {

		Estoque estoque = new Estoque(10, produto);

		Assert.assertEquals(produto, estoque.getProduto());
		Assert.assertEquals(10, estoque.getQuantidadeDeProdutos());
	}

}
