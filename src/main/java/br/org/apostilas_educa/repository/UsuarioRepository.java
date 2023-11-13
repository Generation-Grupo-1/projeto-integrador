package br.org.apostilas_educa.repository;

import br.org.apostilas_educa.model.Usuario;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario);
}
