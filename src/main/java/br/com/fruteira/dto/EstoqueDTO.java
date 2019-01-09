
package br.com.fruteira.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.fruteira.domain.Produto;

public class EstoqueDTO {

	private Integer id;

	@NotNull
	@NotEmpty
	private int quantidadeDeProdutos;

	@NotEmpty
	@NotNull
	private Produto produto;

	@SuppressWarnings("unused")
	private Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getQuantidadeDeProdutos() {
		return quantidadeDeProdutos;
	}

	public void setQuantidadeDeProdutos(int quantidadeDeProdutos) {
		this.quantidadeDeProdutos = quantidadeDeProdutos;
	}

	public Produto getProduto() {
		return produto;
	}

	@SuppressWarnings("unused")
	private void setProduto(Produto produto) {
		this.produto = produto;
	}

}
