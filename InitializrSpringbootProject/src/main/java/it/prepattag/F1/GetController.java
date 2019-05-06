package it.prepattag.F1;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class GetController {
	@RequestMapping(value = "driver", params = "id", method = RequestMethod.GET)
	public Map driver(@RequestParam("id") int id) {
		HashMap<String, Object> m = new HashMap(10);
		if (id == 10) {
			m.put("id", 10);
			m.put("ref", "boh");
			m.put("number", 17);
			m.put("code", "codice");
		} else {
			m.put("error", "Id inesistente");
		}
		return m;
	}
}
