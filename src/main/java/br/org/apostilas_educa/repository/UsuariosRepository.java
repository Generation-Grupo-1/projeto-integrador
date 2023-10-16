package br.org.apostilas_educa.repository;

import br.org.apostilas_educa.model.Usuarios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
	public Optional<Usuarios> findByUsuario(String usuario);
}