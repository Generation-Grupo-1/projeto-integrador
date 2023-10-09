package br.org.apostilas_educa.repository;

import br.org.apostilas_educa.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
    public Usuarios findByEmailContainingIgnoreCase(@Param("email") String email);
}
