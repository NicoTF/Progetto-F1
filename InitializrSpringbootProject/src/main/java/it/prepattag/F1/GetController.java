package it.prepattag.F1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("get")
/**
 * Classe che gestisce le richieste get (/get/<attributo>) della API
 */
public class GetController {

    /**
     * Mapping per la richiesta delle informazioni di un pilota
     *
     * @param id l'id del pilota
     * @return Le informazioni del pilota richiesto in formato JSON
     */
    @RequestMapping(value = "driver", params = "id")
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

    /**
     * Mapping per la richiesta di tutti i piloti
     *
     * @return Un array di piloti in formato JSON
     */
    @RequestMapping("drivers")
    public HashMap[] drivers() {
        HashMap<String, Object>[] arr = new HashMap[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new HashMap<>();
            arr[i].put("age", 18);
            arr[i].put("id", 10);
            arr[i].put("forename", "Andrea");
            arr[i].put("surname", "Crocco");
            arr[i].put("nationality", "IT");
        }
        return arr;
    }

    /**
     * Mapping per la richiesta della classifica dei piloti
     *
     * @return Un array con n piloti in ordine di punteggio
     */
    //Posizione nome cognome scuderia urlprofilo punteggio
    @RequestMapping("classifica")
    public HashMap[] classifica() {
        HashMap<String, Object>[] m = new HashMap[10];
        for (int i = 0; i < m.length; i++) {
            m[i] = new HashMap<>();
            m[i].put("nome", "Andrea");
            m[i].put("cognome", "Crocco");
            m[i].put("posizione", "3");
            m[i].put("scuderia", "Ferrari");
            m[i].put("punteggio", "121");
            m[i].put("urlprofilo", "http:\\localhost\\url");
        }
        return m;
    }
}
