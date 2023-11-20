package com.planetar.services;
import java.util.List;
import com.planetar.model.Doador;

public interface DoadorInterface {
    List<Doador> getAllDoador();
    Doador getDoadorById(Long id);
    //Doador updateDoador(Long id, Doador doadorAtualizado);
    Doador deleteDoador(Long id, Doador doador);
    Doador saveDoador(Doador doador);
	Doador updateDoador1(Long id, Doador doadorAtualizado);
	//Doador updateDoador(Doador doador);
	Doador updateDoador(Long id, Doador doador);
	Doador updateDoador(Doador doador);
	void deleteDoador(Long id);
}
