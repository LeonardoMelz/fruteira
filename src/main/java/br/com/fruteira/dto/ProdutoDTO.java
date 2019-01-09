package br.com.fruteira.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ProdutoDTO {


	@NotNull
	@NotEmpty
	private Integer id;

	@NotNull
	@NotEmpty
	private String produto;

	@NotNull
	@NotEmpty
	private String validade;

	@NotNull
	@NotEmpty
	private String marca;

	public Integer getId() {
		return id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
