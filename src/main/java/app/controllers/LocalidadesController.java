package app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.pojos.Cidades;
import app.services.InpeServices;

@RestController
@RequestMapping("localidades")
public class LocalidadesController {

	@Autowired
	InpeServices inpeServices;
	
	@GetMapping("localidades")
	public Cidades localidades(@RequestParam("localidade") String localidade) {
		return inpeServices.getLocalidade(localidade);
	}

}
