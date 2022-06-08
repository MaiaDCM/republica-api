package br.com.republica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.republica.model.Usuario;
import br.com.republica.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	/*public Usuario getUsuarioAndPassWord(String usuario, String senha) {
		
		return usuarioRepository.findByUserNameAndPassword(usuario, senha);
	}*/

}
