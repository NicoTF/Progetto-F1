package it.prepattag.F1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/get")
public class GetController {
    @RequestMapping(value = "driver", params = "id", method = RequestMethod.GET)
    public Map driver(@RequestParam("id") int id) {
        HashMap<String, Object> m = new HashMap(10);
        if (id == 10) {
            long dob = Date.valueOf("2000-07-15").getTime();
            long diff = Date.valueOf(LocalDate.now()).getTime() - dob;
            int age = (int) Math.floor(diff / 3.15576e+10);
            m.put("age", age);
            m.put("id", 10);
            m.put("forename", "Andrea");
            m.put("surname", "Crocco");
            m.put("nationality", "IT");
        } else {
            m.put("error", "Id inesistente");
        }
        return m;
    }

    @RequestMapping(value = "drivers", method = RequestMethod.GET, produces = "application/json")
    public HashMap[] drivers() {
        HashMap<String, Object>[] arr = new HashMap[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new HashMap<>();
            arr[i].put("age", 18);
            arr[i].put("id", 10);
            arr[i].put("forename", "Andrea");
            arr[i].put("surname", "Crocco");
            arr[i].put("nationality", "Cuea");
        }
        return arr;
    }
}
