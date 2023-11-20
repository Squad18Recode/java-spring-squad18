package com.planetar.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.planetar.model.Doador;
import com.planetar.model.Empresa;
import com.planetar.repositorio.EmpresaRepositorio;
import com.planetar.services.EmpresaInterface;

import java.util.List;

@Service
@Transactional
public class EmpresaImpl implements EmpresaInterface {

    @Autowired
    private EmpresaRepositorio empresaRepositorio;

    @Override
    public List<Empresa> getAllEmpresa() {
        return empresaRepositorio.findAll();
    }

    @Override
    public Empresa getEmpresaById(Long id) {
        return empresaRepositorio.findById(id).orElse(null);
    }

    
    public Empresa updateEmpresa(Long id, Empresa empresaAtualizado) {
        Empresa empresaExistente = empresaRepositorio.findById(id).orElse(null);
        if (empresaExistente != null) {
            

			empresaExistente.setNome(empresaAtualizado.getNome());
			empresaExistente.setCaracteristica_empresa(empresaAtualizado.getCaracteristica_empresa());
			empresaExistente.setCnpj(empresaAtualizado.getCnpj());

            return empresaRepositorio.save(empresaExistente);
        } else {
            throw new RuntimeException("Doador com o ID " + id + " não encontrada.");
        }
    }
    @Override
    public void deleteEmpresa(Long id) {
        empresaRepositorio.deleteById(id);
    }

    @Override
    public Empresa saveEmpresa(Empresa empresa) {
        return empresaRepositorio.save(empresa);
    }

	
	
}
