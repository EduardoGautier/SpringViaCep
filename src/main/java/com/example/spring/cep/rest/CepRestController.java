package com.example.spring.cep.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.spring.cep.model.Endereco;

@RestController
@RequestMapping("/cep")
public class CepRestController {
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/{cep}")
	public Endereco getCep(@PathVariable String cep) {
		Endereco newCep = restTemplate.getForObject("https://viacep.com.br/ws/" + cep + "/json/", Endereco.class);
		return newCep;
	}

}