package br.org.apostilas_educa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.apostilas_educa.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long>{

}
