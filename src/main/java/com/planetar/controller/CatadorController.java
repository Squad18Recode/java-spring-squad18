package com.planetar.controller;


import com.google.gson.Gson;
import com.planetar.model.Catador;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.planetar.services.CatadorInterface;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;


@Controller
@RequestMapping("/catador")
public class CatadorController {

	@Autowired
	private CatadorInterface catadorService;

	
	private final Gson gson;

	   
    public CatadorController(Gson gson) {
        this.gson = gson;
    }
	// Listar
	@GetMapping
	public String listarCatador(Model model) {
		List<Catador> doador = catadorService.getAlLDoador();
		model.addAttribute("doador", doador);
		return "ListarCatador";
	}

	// Formulário de criação
	@GetMapping("/novo")
	public String showFormForAdd(Model model) {
		Catador doador = new Catador();
		model.addAttribute("catador", doador);
		return "CatadorForm";
	}

	// Persistencia da criação
	@PostMapping("/save")
	 public String saveCatador(@RequestBody Catador catador, Model model) {
        try {
        	System.out.println("Recebendo dados do doador: " + catador);
            Catador savedCatador = catadorService.saveCatador(catador);
            System.out.println("Doador salvo com sucesso: " + savedCatador);
            model.addAttribute("savedDoador", savedCatador);
            return "redirect:/doador/successPage";
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/doador";
        }
    }

	// Formulário de edição
	@GetMapping("/editar/{id}")
	public String showFormForUpdate(@PathVariable Long id, Model model) {
		Catador catador = catadorService.getCatadorById(id);
		model.addAttribute("catador", catador);
		return "editarCatador";
	}

	// Persistencia da edição
	@PostMapping("/editar/{id}")
	public String updateCatador(@PathVariable Long id, @ModelAttribute("doador") 
	Catador doador) {
		catadorService.updateCatador(id, doador);
		return "redirect:/catador";
	}
	
	// Excluir categoria
	@GetMapping("/deletar/{id}")
	public String deleteCatador(@PathVariable Long id) { 
		catadorService.deleteCatador(id);
		return "redirect:/catador";
	}
}
