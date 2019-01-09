package br.com.fruteira.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.fruteira.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

	@Query("SELECT p FROM Produto p WHERE p.produto = :produto ")
	public Optional<Produto> findbyname(@Param("produto") String produto);	
}
