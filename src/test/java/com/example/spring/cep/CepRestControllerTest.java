package com.example.spring.cep;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest
@AutoConfigureMockMvc
public class CepRestControllerTest {
	
	
	@Autowired
	MockMvc mvc;
	
	@Test
	public void TestCep() throws Exception {
		mvc.perform(get("/cep/94960847"))
			.andExpect(status().isOk())
			.andExpect(content().json("{\"cep\":\"94960-847\",\"logradouro\":\"Rua Juan Albino Nunez Ayala\",\"complemento\":\"\",\"bairro\":\"Morada do Bosque\",\"localidade\":\"Cachoeirinha\",\"uf\":\"RS\"}"));
	}

}
