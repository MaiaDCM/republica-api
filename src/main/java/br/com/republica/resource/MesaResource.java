package br.com.republica.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.republica.model.Mesa;
import br.com.republica.service.MesaService;

@RestController
@RequestMapping("/mesas")
public class MesaResource {

	@Autowired
	MesaService mesaService;
	

	@GetMapping
	public ResponseEntity<List<Mesa>> getAllMessas() {	
		List<Mesa> mesasSalvas = mesaService.getAllMesa();
		return mesasSalvas != null ? ResponseEntity.ok(mesasSalvas) : ResponseEntity.notFound().build();

	}
}
