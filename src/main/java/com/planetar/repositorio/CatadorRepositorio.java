package com.planetar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.planetar.model.Catador;

@Repository
public interface CatadorRepositorio extends JpaRepository<Catador,Long>{

}
