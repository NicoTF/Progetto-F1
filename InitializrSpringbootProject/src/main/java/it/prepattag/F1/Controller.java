package it.prepattag.F1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/")
	public String[] index() {
		return new String[]{"questa", "è", "una", "prova"};
	}
}
