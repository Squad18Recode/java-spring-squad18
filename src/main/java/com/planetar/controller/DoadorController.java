package com.planetar.controller;




import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.planetar.model.Doador;
import com.planetar.services.DoadorInterface;

import java.util.List;

@Controller
@RequestMapping("/doador")
public class DoadorController {

    @Autowired
    private DoadorInterface doadorService;

    
    private final Gson gson;

   
    public DoadorController(Gson gson) {
        this.gson = gson;
    }

    @GetMapping
    public String listDoador(Model model) {
        List<Doador> doadorList = doadorService.getAllDoador();
        model.addAttribute("doadorList", doadorList);
        return "listarDoador";
    }

    @GetMapping("/novo")
    public String showFormForAdd(Model model) {
        Doador doador = new Doador();
        model.addAttribute("doador", doador);
        return "doadorForm";
    }

    
    @PostMapping("/save")
    public String saveDoador(@RequestBody Doador doador, Model model) {
        try {
        	System.out.println("Recebendo dados do doador: " + doador);
            Doador savedDoador = doadorService.saveDoador(doador);
            System.out.println("Doador salvo com sucesso: " + savedDoador);
            model.addAttribute("savedDoador", savedDoador);
            return "redirect:/doador/successPage";
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/doador";
        }
    }


    @GetMapping("/successPage")
    public String successPage() {
        return "successPage";
    }
}

