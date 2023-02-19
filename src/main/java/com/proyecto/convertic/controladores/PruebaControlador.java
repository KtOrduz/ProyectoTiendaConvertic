package com.proyecto.convertic.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/probador")
public class PruebaControlador {
    @GetMapping("/saludar")
    public String prueboControl(){
        return "hola";
    }
}
