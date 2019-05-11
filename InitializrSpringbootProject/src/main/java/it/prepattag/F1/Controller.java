package it.prepattag.F1;

import java.io.File;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller implements ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(PATH)
    public String error() {
        return "Errore di tipo Controller: stai attento, ghesboro.";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}
