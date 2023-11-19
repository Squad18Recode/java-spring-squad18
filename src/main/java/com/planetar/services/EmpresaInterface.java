package com.planetar.services;

import java.util.List;
import java.util.Set;

import com.planetar.model.Doador;
import com.planetar.model.Empresa;

public interface EmpresaInterface {
	List<Empresa> getAllEmpresa();
    Empresa getEmpresaById(Long id);
    
    void deleteEmpresa(Long id);
    Empresa saveEmpresa(Empresa empresa);
	//Doador updateEmpresa(Long id, Doador doadorAtualizado);
	//Doador updateEmpresa1(Long id, Doador doadorAtualizado);
	Doador updateEmpresa1(Long id, Empresa empresaAtualizada);
	
}
