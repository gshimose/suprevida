package com.suprevida.viacep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suprevida.viacep.consumer.ConsumerViaCep;
import com.suprevida.viacep.model.CepModel;
import com.suprevida.viacep.repository.CepRepository;

@Service
public class CepService {
	
	@Autowired
	private CepRepository cepRepository;
	
	@Autowired
	private ConsumerViaCep consumerViaCep;

	public CepModel consultCep(String cep) {

		CepModel entity= cepRepository.findByCep(cep);
		
		if (entity == null   ) {
			entity = consumerViaCep.consulta(cep);
			if (!(entity.getLocalidade() == null)){
			cepRepository.save(entity);
			}
		}

		return entity;
	}
	
	
}
