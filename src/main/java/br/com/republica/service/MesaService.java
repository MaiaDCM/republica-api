package br.com.republica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.republica.model.Mesa;
import br.com.republica.repository.MesaRepository;

@Service
public class MesaService {
	
	@Autowired
	MesaRepository mesaRepository;
	
	public List<Mesa> getAllMesa() {		
		return mesaRepository.findAll();
	}

}
