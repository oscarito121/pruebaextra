package com.ufv.restservice.restservice;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
    public ArrayList<ClaseAlmacenarDatosJson> InfoZonasbasicas = new ArrayList<>();
    @GetMapping("/Datos1")
    public ArrayList<ClaseAlmacenarDatosJson> getInfoZonasbasicas() throws Exception {
        InfoZonasbasicas = new LectorJSON().leerJSON();
        return InfoZonasbasicas;
    }
}
