
package br.com.fruteira.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fruteira.dto.EstoqueDTO;
import br.com.fruteira.service.EstoqueService;

@RestController
@RequestMapping(value="fruteira")
public class EstoqueController {

	private EstoqueService estoqueService;
	
	@Autowired
	public EstoqueController(EstoqueService estoqueService) {
		this.estoqueService = estoqueService;
	}
	
	@GetMapping(value="/estoque")
	public ResponseEntity<List<EstoqueDTO>> obterEstoque() {
		List<EstoqueDTO> estoque = estoqueService.findAll();
		return new ResponseEntity<List<EstoqueDTO>>(estoque, HttpStatus.OK) ;
	}
	
	
	@PostMapping(value="/estoque")
	public ResponseEntity<?> salvar(@RequestBody @Valid EstoqueDTO estoqueDTO) {
		this.estoqueService.save(estoqueDTO);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	@DeleteMapping(value="/estoque/{id}")
	public ResponseEntity<?> deletar(@PathVariable("id") Integer id) {
		this.estoqueService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
}