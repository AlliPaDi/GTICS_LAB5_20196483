package com.example.gtics_lab5_20196483.controller;

import com.example.gtics_lab5_20196483.entity.Technician;
import com.example.gtics_lab5_20196483.repository.TechnicianRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

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
    @GetMapping(value="/nuevo")
    public String crearTecnico(@ModelAttribute("tecnico") Technician technician, Model model){
        return "Tecnicos/formTecnicos";
    }

    @GetMapping("/editar")
    public String editarTecnico(@ModelAttribute("tecnico") Technician technician,
                                Model model,@RequestParam("id") int id) {

        Optional<Technician> optTechnician = technicianRepository.findById(id);

        if (optTechnician.isPresent()) {
            technician = optTechnician.get();
            model.addAttribute("tecnico", technician);
            return "Tecnicos/formTecnicos";
        } else {
            return "redirect:/Tecnicos/listTecnicos";
        }
    }

    @PostMapping("/guardar")
    public String guardarTecnico(@ModelAttribute("tecnico") Technician technician,
                                 RedirectAttributes attr) {
        if(technician.getTechnicianID() == 0){
            attr.addFlashAttribute("msg", "Tecnico creado exitósamente");
        }else{
            attr.addFlashAttribute("msg", "Tecnico actualizado exitosamente");
        }
        technicianRepository.save(technician);
        return "redirect:/Tecnicos/listTecnicos";
    }
}
