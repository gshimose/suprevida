package com.suprevida.viacep.model;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
import lombok.Data;
 
@Entity(name = "tbCep")
@Data
public class CepModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "cep")
	private String cep;
	
	@Column(name = "logradouro")
	private String logradouro;
	
	@Column(name = "complemento")
	private String complemento;
 	
	@Column(name = "bairro")
	private String bairro;
	
	@Column(name = "localidade")
	private String localidade;
 	
	@Column(name = "uf")
	private String uf;
	
	@Column(name = "ibge")
	private String ibge;
 	
	@Column(name = "gia")
	private String gia;
	
	@Column(name = "ddd")
	private String ddd;
 	
	@Column(name = "siafi")
	private String siafi;
	
}
