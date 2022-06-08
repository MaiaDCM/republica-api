package br.com.republica.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.republica.model.SituacaoMesa;

@RestController
@RequestMapping("/enums")
public class EnumResource {
	
	@GetMapping("/situacaomesa")
	private SituacaoMesa[] getAllSituacaoMesa() {		
		return SituacaoMesa.values();
	}

}
