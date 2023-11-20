package com.planetar.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.planetar.model.Doador;
import com.planetar.repositorio.DoadorRepositorio;
import com.planetar.services.DoadorInterface;

import java.util.List;

@Service
@Transactional
public class DoadorImpl implements DoadorInterface {

    @Autowired
    private DoadorRepositorio doadorRepository;

    @Override
    public List<Doador> getAllDoador() {
        return doadorRepository.findAll();
    }

    @Override
    public Doador getDoadorById(Long id) {
        return doadorRepository.findById(id).orElse(null);
    }

    
    public Doador updateDoador(Long id, Doador doadorAtualizado) {
        Doador doadorExistente = doadorRepository.findById(id).orElse(null);
        if (doadorExistente != null) {
            
            doadorExistente.setNome(doadorAtualizado.getNome());
            doadorExistente.setEstado(doadorAtualizado.getEstado());
            doadorExistente.setCidade(doadorAtualizado.getCidade());
            doadorExistente.setBairro(doadorAtualizado.getBairro());
            doadorExistente.setRua(doadorAtualizado.getRua());
            doadorExistente.setTelefone(doadorAtualizado.getTelefone());
            doadorExistente.setCep(doadorAtualizado.getCep());
            doadorExistente.setDisponibilidade(doadorAtualizado.getDisponibilidade());

            return doadorRepository.save(doadorExistente);
        } else {
            throw new RuntimeException("Doador com o ID " + id + " não encontrada.");
        }
    }
    @Override
    public void deleteDoador(Long id) {
        doadorRepository.deleteById(id);
    }

    @Override
    public Doador saveDoador(Doador doador) {
        return doadorRepository.save(doador);
    }

	@Override
	public Doador updateDoador1(Long id, Doador doadorAtualizado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doador updateDoador(Doador doador) {
		// TODO Auto-generated method stub
		return null;
	}
}
