package com.planetar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.planetar.model.Doador;
import com.planetar.model.Empresa;
import com.planetar.services.EmpresaInterface;

@Controller
@RequestMapping("/empresa")
public class EmpresaController {
	  @Autowired
	    private EmpresaInterface empresaService;

	    
	    private final Gson gson;

	   
	    public EmpresaController(Gson gson) {
	        this.gson = gson;
	    }

	    @GetMapping
	    public String listDoador(Model model) {
	        List<Empresa> empresaList = empresaService.getAllEmpresa();
	        model.addAttribute("empresaList", empresaList);
	        return "listarEmpresa";
	    }

	    @GetMapping("/novo")
	    public String showFormForAdd(Model model) {
	        Empresa empresa = new Empresa();
	        model.addAttribute("empresa",empresa);
	        return "empresaForm";
	    }

	    
	    @PostMapping("/save")
	    public String saveDoador(@RequestBody Empresa empresa, Model model) {
	        try {
	        	System.out.println("Recebendo dados do doador: " + empresa);
	            Empresa saveEmpresa = empresaService.saveEmpresa(empresa);
	            System.out.println("Doador salvo com sucesso: " + saveEmpresa);
	            model.addAttribute("savedDoador", saveEmpresa);
	            return "redirect:/doador/successPage";
	        } catch (Exception e) {
	            e.printStackTrace();
	            return "redirect:/empresa";
	        }
	    }
	    
	    @PostMapping("/editar/{id}")
	    public String updateDoador(@PathVariable Long id,@RequestBody Empresa empresa, Model model) {
	        try {
	            System.out.println("Recebendo dados do doador: " + empresa);
	            Empresa updateEmpresa = empresaService.updateEmpresa(id, empresa);
	            System.out.println("Doador salvo com sucesso: " + updateEmpresa);

	           
	            List<Empresa> empresaList = empresaService.getAllEmpresa();

	            model.addAttribute("empresa", empresaList);
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
