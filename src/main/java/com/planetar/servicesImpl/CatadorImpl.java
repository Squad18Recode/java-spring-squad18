package com.planetar.servicesImpl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planetar.model.Catador;
import com.planetar.model.Doador;
import com.planetar.repositorio.CatadorRepositorio;
import com.planetar.services.CatadorInterface;
import jakarta.transaction.Transactional;



@Service
public class CatadorImpl implements CatadorInterface {
	@Autowired
	private CatadorRepositorio catadorRepositorio;

	public List<Catador> getAlLDoador() {
		return catadorRepositorio.findAll();
		}

	@Transactional
	public Catador getDoadorById(Long id) {
		return catadorRepositorio.findById(id).orElse(null);
	}

	@Transactional
	public Catador saveCatador(Catador catador) {
		return catadorRepositorio.save(catador);
	}

	@Override
	public Catador updateCatador(Long id, Catador catadorAtualizado) {
		Catador catadorExistente = catadorRepositorio.findById(id).orElse(null);
		if (catadorExistente != null) { 
			
			catadorExistente.setNome(catadorAtualizado.getNome());
			catadorExistente.setEstado(catadorAtualizado.getEstado());
			catadorExistente.setCidade(catadorAtualizado.getCidade());
			catadorExistente.setBairro(catadorAtualizado.getBairro());
			
			catadorExistente.setTelefone(catadorAtualizado.getTelefone());
			catadorExistente.setCep(catadorAtualizado.getCep());
			catadorExistente.setDisponibilidade(catadorAtualizado.getDisponibilidade());
			
			
			
			return catadorRepositorio.save(catadorExistente);
		} else { 
			throw new RuntimeException("Doador com o ID" + id + "não encontrada.");
		}
	}
	@Override
	public void deleteDoador(Long id) {
		catadorRepositorio.deleteById(id);
	}

	@Override
	public List<CatadorInterface> getAllDoador() {
		
		return null;
	}

	@Override
	public Catador getCatadorById(Long id) {
		
		return null;
	}

	@Override
	public Catador saveCatadador(CatadorInterface catador, Set<Long> catadorIds) {
		
		return null;
	}

	@Override
	public void deleteCatador(Long id) {
		
		
	}

	@Override
	public Catador saveCatador1(Catador catador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Catador> getAlLCatador() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doador updateCatador(Long id, Doador doador) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
