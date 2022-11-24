package com.suprevida.viacep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suprevida.viacep.model.CepModel;
import com.suprevida.viacep.service.CepService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/consultacep/{cep}")
public class CepController {
	
	
	@Autowired
	private CepService cepService;
	
	@GetMapping()
	@ApiOperation(value = "Consulta Cep", notes = "Pesquisa de logradouro no viacep")
	public CepModel consultaCep(@PathVariable("cep") String cep ){
		
		CepModel consulta = cepService.consultCep(cep);
		
		return consulta;
	}

}
