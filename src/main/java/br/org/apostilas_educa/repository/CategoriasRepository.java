package br.org.apostilas_educa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import br.org.apostilas_educa.model.Categorias;

public interface CategoriasRepository extends JpaRepository<Categorias, Long>{
	public List<Categorias> findAllByTipoContainingIgnoreCase(@Param("tipo")String tipo);
}
