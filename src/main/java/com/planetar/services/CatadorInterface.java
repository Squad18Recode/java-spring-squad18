package com.planetar.services;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.planetar.model.Catador;
@Service
public interface CatadorInterface {
List<CatadorInterface> getAllDoador();
	
	Catador getCatadorById(Long id);
	
	Catador saveCatadador(CatadorInterface catador, Set<Long> catadorIds);
	
	Catador updateCatador(Long id, Catador doadorAtualizado);
	
	void deleteCatador(Long id);

	List<Catador> getAlLDoador();

	Catador getDoadorById(Long id);

	void deleteDoador(Long id);

	Catador saveCatador(Catador catador);
}
