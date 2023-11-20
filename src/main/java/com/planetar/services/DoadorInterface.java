package com.planetar.services;

import com.planetar.model.Doador;

import java.util.List;

public interface DoadorInterface {
    List<Doador> getAllDoador();
    Doador getDoadorById(Long id);
    Doador updateDoador(Long id, Doador doadorAtualizado);
    void deleteDoador(Long id);
    Doador saveDoador(Doador doador);
}
