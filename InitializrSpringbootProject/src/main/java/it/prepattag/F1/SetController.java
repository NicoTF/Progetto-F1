/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.prepattag.F1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/set")

public class SetController {
    @RequestMapping(value = "nome", params = "value", method = RequestMethod.GET)
    public boolean nome(@RequestParam("value") String value) {
        Variables.nome = value;
        return true;
    }

    @RequestMapping(value = "cognome", params = "value", method = RequestMethod.GET)
    public boolean gognome(@RequestParam("value") String value) {
        Variables.cognome = value;
        return true;
    }
}
