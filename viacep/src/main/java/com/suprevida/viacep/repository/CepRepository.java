package com.suprevida.viacep.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suprevida.viacep.model.CepModel;

public interface CepRepository extends JpaRepository<CepModel, Long> {
	
	CepModel findByCep(String cep);

}
