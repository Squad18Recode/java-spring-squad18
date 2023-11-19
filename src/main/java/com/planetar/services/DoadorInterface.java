package com.planetar.services;
import java.util.List;
import com.planetar.model.Doador;

public interface DoadorInterface {
    List<Doador> getAllDoador();
    Doador getDoadorById(Long id);
    Doador updateDoador(Long id, Doador doadorAtualizado);
    void deleteDoador(Long id);
    Doador saveDoador(Doador doador);
	Doador updateDoador1(Long id, Doador doadorAtualizado);
}
