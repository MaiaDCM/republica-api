package br.com.republica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.republica.model.Mesa;
import br.com.republica.repository.mesa.MesaRepositoryQuery;


public interface MesaRepository extends JpaRepository<Mesa, Long>, MesaRepositoryQuery {
	
	public List<Mesa> findAll();

}
