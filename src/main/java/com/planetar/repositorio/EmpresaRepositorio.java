package com.planetar.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.planetar.model.Empresa;

@Repository
public interface EmpresaRepositorio  extends JpaRepository<Empresa,Long> {

}
