package br.org.apostilas_educa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_usuarios")
public class Usuarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo usuário é obrigatório")
	@Size(min = 5, max = 255, message = "O atributo usuário deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String usuario;		//username(login)

	@NotBlank(message = "O atributo nome é obrigatório")
	@Size(min = 5, max = 255, message = "O atributo nome deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String nome;

	@NotBlank(message = "O atributo senha é obrigatório")
	@Size(min = 5, max = 255, message = "O atributo senha deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String senha;
	
	@NotBlank(message = "O atributo email é obrigatório")
	@Size(min = 5, max = 255, message = "O atributo email deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String email;

	@NotBlank(message = "O atributo tipo é obrigatório")
	@Size(min = 5,max = 255, message = "O atributo tipo deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String tipo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
