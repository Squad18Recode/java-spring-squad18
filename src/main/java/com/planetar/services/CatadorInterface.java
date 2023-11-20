package com.planetar.services;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.planetar.model.Catador;
import com.planetar.model.Doador;
@Service
public interface CatadorInterface {
List<CatadorInterface> getAllDoador();
	
	Catador getCatadorById(Long id);
	
	Catador saveCatadador(CatadorInterface catador, Set<Long> catadorIds);
	
	Doador updateCatador(Long id, Doador doador);
	
	void deleteCatador(Long id);

	List<Catador> getAlLCatador();

	Catador getDoadorById(Long id);

	void deleteDoador(Long id);

	Catador saveCatador(Catador catador);

	Catador saveCatador1(Catador catador);

	Catador updateCatador(Long id, Catador catadorAtualizado);

	
}
