package br.com.fruteira.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "estoque")
public class Estoque {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estoque")
	private Integer id;

	@NotNull
	@NotEmpty
	private int quantidadeDeProdutos;

	@ManyToOne
	@JoinColumn(name = "id_produto")
	private Produto produto;

	public Estoque(int quantidadeDeProdutos, Produto produto) {
		this.quantidadeDeProdutos = quantidadeDeProdutos;
		this.produto=produto;
		
	}
	

	public Estoque(Integer id, int quantidadeDeProdutos, Produto produto) {
		this(quantidadeDeProdutos, produto);
		this.id = id;
	}
	
	@SuppressWarnings("unused")
	private Estoque() {

	}

	public Integer getId() {
		return id;
	}


	public int getQuantidadeDeProdutos() {
		return quantidadeDeProdutos;
	}


	public Produto getProduto() {
		return produto;
	}
	
}
