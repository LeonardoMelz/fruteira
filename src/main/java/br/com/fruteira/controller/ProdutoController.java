package br.com.fruteira.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fruteira.dto.ProdutoDTO;
import br.com.fruteira.service.ProdutoServices;

@RestController
@RequestMapping(value="fruteira")
public class ProdutoController {

	private ProdutoServices produtoServices;

	@Autowired
	public ProdutoController(ProdutoServices produtoServices) {
		this.produtoServices = produtoServices;
	}

	
	@PostMapping(value="/produto")
	public ResponseEntity<?> salvar(@RequestBody @Valid ProdutoDTO produtoDTO) {
		this.produtoServices.save(produtoDTO);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	@DeleteMapping(value="/produto/{id}")
	public ResponseEntity<?> deletar(@PathVariable("id") Integer id) {
		this.produtoServices.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}




}
