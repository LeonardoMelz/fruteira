package br.com.fruteira.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import br.com.fruteira.domain.Estoque;
import br.com.fruteira.domain.Produto;
import br.com.fruteira.dto.EstoqueDTO;
import br.com.fruteira.repository.EstoqueRepository;

@Service
public class EstoqueService {

	private EstoqueRepository estoqueRepository;

	@Autowired
	public EstoqueService(EstoqueRepository estoqueRepository) {
		this.estoqueRepository = estoqueRepository;
	}

	public void save(EstoqueDTO estoqueDTO) {
		int QuantidadeDeProdutos = estoqueDTO.getQuantidadeDeProdutos();
		Produto produto = estoqueDTO.getProduto();

		Estoque estoque = new Estoque(QuantidadeDeProdutos, produto);
		this.estoqueRepository.saveAndFlush(estoque);
	}

	public Estoque findById(Integer id) {
		Optional<Estoque> cliente = estoqueRepository.findById(id);
		if (cliente.isPresent()) {
			return cliente.get();
		}
		throw new ServiceException("Cliente não encontrado");
	}

	public List<EstoqueDTO> findAll() {
		List<EstoqueDTO> estoqueParaRetorno = new ArrayList<EstoqueDTO>();
		List<Estoque> estoque = estoqueRepository.findAll();

		for (Estoque estoque1 : estoque) {
			EstoqueDTO estoqueDTO = criarEstoqueDTO(estoque1);
			estoqueParaRetorno.add(estoqueDTO);
		}

		return estoqueParaRetorno;
	}

	private EstoqueDTO criarEstoqueDTO(Estoque estoque1) {
		EstoqueDTO estoqueDTO = new EstoqueDTO();
		estoqueDTO.setId(estoque1.getId());
		estoqueDTO.setQuantidadeDeProdutos(estoque1.getQuantidadeDeProdutos());
		return estoqueDTO;
	}

	public void delete(Integer id) {
		this.estoqueRepository.deleteById(id);
	}

}
