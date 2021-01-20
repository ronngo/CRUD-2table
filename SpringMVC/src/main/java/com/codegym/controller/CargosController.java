package com.codegym.controller;



import com.codegym.model.Cargos;
import com.codegym.model.ClassStudent;
import com.codegym.model.Student;
import com.codegym.model.Transitcar;
import com.codegym.repository.CargosRepository;
import com.codegym.repository.TransitcarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ship")
public class CargosController {


    @Autowired
    private CargosRepository cargosRepository;

    @Autowired
    private TransitcarRepository transitcarRepository;




    @GetMapping("create")
    public String getViewCreate(Model model){
        model.addAttribute("cargos" ,new Cargos());
        Iterable<Transitcar> listTrasitcar = transitcarRepository.findAll();
        model.addAttribute("listTrasitcar",listTrasitcar);
        return "ship/create";
    }
    @PostMapping("create")
    public String Create(Cargos Cargos){
        Transitcar transitcar = transitcarRepository.findById(Cargos.getTransitcarId()).orElse(null);
        Cargos.setTransitcar(transitcar);
        cargosRepository.save(Cargos);
        return "ship/create";
    }

    @GetMapping("list")
    public String getViewList(Model model){
        Iterable<Cargos> cargos = cargosRepository.findAll();
        model.addAttribute("listCargos",cargosRepository.findAll());
        return "ship/list";
    }

    @GetMapping("edit/{id}")
    public String Getviewedit(Model model, @PathVariable("id")Long id){

        model.addAttribute("cargos" , cargosRepository.findById(id).orElse(null));
        model.addAttribute("transitcar",transitcarRepository.findAll());
        return "ship/edit";
    }


    @PostMapping("edit")
    public String edit(Model model, Cargos Cargos){
        Transitcar transitcar = transitcarRepository.findById(Cargos.getTransitcarId()).orElse(null);
        Cargos.setTransitcar(transitcar);
        cargosRepository.save(Cargos);
        return "redirect:/ship/list";
    }


    @GetMapping("delete/{id}")
    public String delte(Model model, @PathVariable("id")Long id){
        cargosRepository.deleteById(id);
        return "redirect:/ship/list";
    }
}
