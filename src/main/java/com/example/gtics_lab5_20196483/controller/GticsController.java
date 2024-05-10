package com.example.gtics_lab5_20196483.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GticsController {
    @GetMapping(value="/gtics")
    public String gtics(){
        return "GTICS_F";
    }
    @GetMapping(value="/estadisticas")
    public String estadisticas(){
        return "Estadisticas/estadisticas";
    }
}



