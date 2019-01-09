package br.com.fruteira.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.fruteira.domain.Produto;




@RunWith(SpringRunner.class)
@SpringBootTest
public class ProdutoServiceTest {

	@Autowired
	private ProdutoServiceTest produtoService;

	@Test
	public void deveSalvarUmproduto() {
		Produto produto = new Produto("banana", "31/12/2018", "BananaDaSerra");
		produtoService.save(produto);

		Produto produtoSalvo = produtoService.findById(produto.getId());
		Assert.assertEquals(produto.getProduto(), produtoSalvo.getProduto());
		Assert.assertEquals(produto.getValidade(), produtoSalvo.getValidade());
		
	}

	private Produto findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	} 

	private void save(Produto produto) { 
		// TODO Auto-generated method stub
		
	}
}

