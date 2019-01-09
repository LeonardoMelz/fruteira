package br.com.fruteira.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "/produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produto")
	private Integer id;
	
	@NotNull(message = "O nome do produto nao pode ser nulo")
	@NotEmpty(message = "O nome do produto nao pode ser vazio")
	private String produto;
	
	@NotNull(message = "O produto não pode ter a validade Nula")
	@NotEmpty(message = "O produto não pode ter a validade Vazia")
	private String validade;
	
	@NotNull(message = "O produto tem que ter uma marca")
	@NotEmpty(message = "O produto tem que ter uma marca")
	private String marca;


	private Produto() {
		// constructor for hibernate
	}
	
	public Produto(String produto, String validade,String marca) {
		this.produto = produto;
		this.validade = validade;
		this.marca = marca;
		
	}


	public Produto(Integer id, String Produto, String Validade,String Marca) {
		this(Produto, Validade,Marca);
		this.id = id;
	}
	
	public String getProduto() {
		return produto;
	}


	public String getValidade() {
		return validade;
	}


	public String getMarca() {
		return marca;
	}


	public Integer getId() {
		return id;
	}

	 public void setId(Integer id) {
		this.id = id;
	}
	
}
