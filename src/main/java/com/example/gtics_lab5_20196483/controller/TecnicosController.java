package com.example.gtics_lab5_20196483.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TecnicosController {
    @GetMapping(value="/tecnicos")
    public String gtics(){
        return "Tecnicos/listTecnicos";
    }

}
