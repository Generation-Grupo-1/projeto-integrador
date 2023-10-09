package br.org.apostilas_educa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import br.org.apostilas_educa.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long>{
	public List <Produtos> finAllByNomeContainingIgnoreCase(@Param("nome")String nome);

}
