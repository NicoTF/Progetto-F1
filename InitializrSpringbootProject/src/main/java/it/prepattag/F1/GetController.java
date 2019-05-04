package it.prepattag.F1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class GetController {
	@RequestMapping("/nome")
	public String nome() {
		return Variables.nome;
	}

	@RequestMapping("/cognome")
	public String cognome() {
		return Variables.cognome;
	}
}
