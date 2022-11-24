package com.suprevida.viacep.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import com.suprevida.viacep.config.Properties;
import com.suprevida.viacep.model.CepModel;

@Configuration
public class ConsumerViaCep {
	
	@Autowired Properties properties;
	
	
	public CepModel consulta(String cep) {

	  CepModel cepModel = new CepModel(); 
	  try { cepModel = WebClient.create().get().uri( "https://viacep.com.br/ws/"+cep+"/json")		
					                      .header("Content-Type", "application/json")
					                       .accept(MediaType.APPLICATION_JSON)
				                           .retrieve()
				                           .bodyToMono(CepModel.class)
				                           .block();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cepModel;
	}
	
	

}
