package br.com.fruteira.domain;

import org.junit.Assert;
import org.junit.Test;

import br.com.fruteira.domain.Produto;


public class ProdutoTest {
	
	
	@Test
	public void deveCriarUmProdutoValido() {
		Produto produto = new Produto("Banana", "20/02/2019","Frutitos");
		
		Assert.assertEquals("Banana", produto.getProduto());
		Assert.assertEquals("20/02/2019", produto.getValidade());
		Assert.assertEquals("Frutitos", produto.getMarca());
	}}
	

