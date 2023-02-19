package com.proyecto.convertic.rest;

import com.proyecto.convertic.servicios.TipoDocumentoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipodocumento")

public class TipoDocumentoREST {

    @Autowired
    private TipoDocumentoServicio tipoDocumentoServicio;


}
