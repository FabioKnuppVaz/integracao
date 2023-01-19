package app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.pojos.Cidade;
import app.services.InpeServices;

@RestController
@RequestMapping("previsoes")
public class PrevisaoController {

	@Autowired
	InpeServices inpeServices;

	@GetMapping("4Dias")
	public Cidade previsao4Dias(@RequestParam("id") String id) {
		return inpeServices.getPrevisao4Dias(id);
	}
	
	@GetMapping("7Dias")
	public Cidade previsao7Dias(@RequestParam("id") String id) {
		return inpeServices.getPrevisao7Dias(id);
	}
	
	@GetMapping("estendida")
	public Cidade previsaoEstendida(@RequestParam("id") String id) {
		return inpeServices.getPrevisaoExtendida(id);
	}

}
