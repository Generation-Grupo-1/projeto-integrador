package br.org.apostilas_educa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import br.org.apostilas_educa.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List <Produto> findAllByNomeContainingIgnoreCase(@Param("nome")String nome);

}
