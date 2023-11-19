package com.planetar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.planetar.model.Doador;

@Repository
public interface DoadorRepositorio  extends JpaRepository<Doador,Long> {

}
