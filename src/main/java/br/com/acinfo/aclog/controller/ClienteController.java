package br.com.acinfo.aclog.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.acinfo.aclog.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João");
		cliente1.setTelefone("34 99999-1111");
		cliente1.setEmail("joaodascouves@acinfo.com.br");
		
		var cliente2 = new Cliente();
		cliente2.setId(1L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("11 97777-1111");
		cliente2.setEmail("mariadascouves@acinfo.com.br");
		
		return Arrays.asList(cliente1,cliente2);
	}

}
