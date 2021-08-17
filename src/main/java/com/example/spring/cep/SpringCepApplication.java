package com.example.spring.cep;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.spring.cep.model.Endereco;

@SpringBootApplication
public class SpringCepApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringCepApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringCepApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	/*@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Endereco endereco = restTemplate.getForObject(
					"https://viacep.com.br/ws/01001000/json/unicode", Endereco.class);
			log.info(endereco.toString());
		};
	}
*/
}
