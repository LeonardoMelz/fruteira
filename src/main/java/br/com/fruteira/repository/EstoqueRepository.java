package br.com.fruteira.repository;

	import java.util.Optional;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.jpa.repository.Query;
	import org.springframework.data.repository.query.Param;
	import org.springframework.stereotype.Repository;

	import br.com.fruteira.domain.Estoque;

	@Repository
	public interface EstoqueRepository extends JpaRepository<Estoque, Integer> {

		@Query("SELECT e FROM estoque e WHERE e.quantiadeDeProdutos = :quantiadeDeProdutos")
		Optional<Estoque> findByCpf(@Param("quantiadeDeProdutos") String quantiadeDeProdutos);
		
	}