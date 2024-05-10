package com.example.gtics_lab5_20196483.controller;

import com.example.gtics_lab5_20196483.entity.Technician;
import com.example.gtics_lab5_20196483.repository.TechnicianRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tecnicos")
public class TecnicosController {
    final TechnicianRepository technicianRepository;

    public TecnicosController(TechnicianRepository technicianRepository) {
        this.technicianRepository = technicianRepository;
    }


    @GetMapping(value={"", "/"})
    public String listarTecnicos(Model model){
        List<Technician> listaTecnicos = technicianRepository.findAll();
        model.addAttribute("listaTecnicos",listaTecnicos);
        return "Tecnicos/listTecnicos";
    }

}
