package br.com.fruteira.service;


import java.util.Optional;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fruteira.domain.Produto;
import br.com.fruteira.dto.ProdutoDTO;
import br.com.fruteira.repository.ProdutoRepository;



@Service
public class ProdutoServices {

		private ProdutoRepository produtoRepository;

		@Autowired
		public ProdutoServices(ProdutoRepository produtoRepository) {
			this.produtoRepository = produtoRepository;
		}

		public void save(ProdutoDTO produtoDTO) {
			Integer id= produtoDTO.getId();
			String produto = produtoDTO.getProduto();
			String validade = produtoDTO.getValidade();
			String marca = produtoDTO.getMarca();
			Produto produtoSalvo = new Produto(id,produto, validade, marca);
			this.produtoRepository.saveAndFlush(produtoSalvo);

		}

		public Produto findById(Integer id) {
			Optional<Produto> produtoEncontrado = this.produtoRepository.findById(id);
			if (produtoEncontrado.isPresent()) {
				return produtoEncontrado.get();
			}
			throw new ServiceException("Estado não encontrado.");
		}

			
			public void delete(Integer id) {
				this.produtoRepository.deleteById(id);
			}
		}
	

