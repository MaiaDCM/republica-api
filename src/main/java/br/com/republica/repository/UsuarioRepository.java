package br.com.republica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.republica.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


}
