package br.com.danilowrm.wsjpahirakipoolsb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.danilowrm.wsjpahirakipoolsb.entity.Teste;
import br.com.danilowrm.wsjpahirakipoolsb.repository.TesteRepository;

@RestController
public class TesteController {

	@Autowired
	private TesteRepository testeRepository;
	
	@GetMapping("index")
	public List<Teste> index() {
		return testeRepository.findAll();
	}
}
