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
import org.springframework.web.bind.annotation.RequestParam;

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
	    public String listEmpresa(Model model) {
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
	        	System.out.println("Recebendo dados da empresa: " + empresa);
	            Empresa saveEmpresa = empresaService.saveEmpresa(empresa);
	            System.out.println("Empresa salvo com sucesso: " + saveEmpresa);
	            model.addAttribute("savedEmpresa", saveEmpresa);
	            return "redirect:/doador/successPage";
	        } catch (Exception e) {
	            e.printStackTrace();
	            return "redirect:/empresa";
	        }
	    }
	    
	    ///@GetMapping("/editar/{id}")
		//public String showEditForm(@PathVariable Long id, Model model) {
			//Empresa empresa = empresaService.getEmpresaById(id);
			//model.addAttribute("doador", empresa);
			///return "updateEmpresa";
	//}
	    
	    
	    //@PostMapping("/editar/{id}")
	    //public String updateDoador(
	            //@PathVariable Long id,
	            ///@RequestParam("nome") String nome,
	            //@RequestParam("caracteristica_empresa") String caracteristica_empresa,
	            //@RequestParam("cnpj") String cnpj,
	            //Model model) {

	        //try {
	            
	            ///Empresa empresa = new Empresa(id, nome,caracteristica_empresa, id);

	            //System.out.println("Recebendo dados do doador: " + empresa);
	            //Empresa updatedEmpresa = empresaService.updateEmpresa(id, empresa);
	            //System.out.println("Doador atualizado com sucesso: " + updatedEmpresa);

	            //List<Empresa> doadorList = empresaService.getAllEmpresa();
	            //model.addAttribute("doadorList", doadorList);

	            //return "redirect:/doador/successPage";
	       // } catch (Exception e) {
	            //e.printStackTrace();
	            //return "redirect:/doador";
	       //}
	   // }
	    
	    
	    
	    
	    
	    
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
	            return "redirect:/empresa";
	        }
	    }

	    @GetMapping("/deletar/{id}")
		public String deleteEmpresa(@PathVariable Long id) { 
			empresaService.deleteEmpresa(id);
			return "redirect:/empresa";
		}
	    
	    @GetMapping("/successPage")
	    public String successPage() {
	        return "successPage";
	    }
}
