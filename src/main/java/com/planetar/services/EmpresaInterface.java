package com.planetar.services;

import java.util.List;
import java.util.Set;

import com.planetar.model.Doador;
import com.planetar.model.Empresa;

public interface EmpresaInterface {

	List<Empresa> getAllEmpresa();
    Empresa getEmpresaById(Long id);
    Empresa updateEmpresa(Long id, Empresa empresa);
    void deleteEmpresa(Long id);
	Empresa saveEmpresa(Empresa empresa);
	
}
