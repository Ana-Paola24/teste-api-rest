package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class HelloWordController {
	
	@GetMapping
	public String olamundo() {
		return "Olá Mundo! Bom dia!";
	}

	@GetMapping("bsm")
	public String bsmgeneration() {
		return "Persistência, \nMentalidade de Crescimento,"
				+ "\nResponsabilidade Pessoal, \nOrientação ao Futuro"
				+ "\nOrientação ao Detalhe, \nTrabalho em Equipe,"
				+ "\nComunicação, \nProatividade";
	}
	
	@GetMapping("objetivos")
	public String objetivosdasemana() {
		return "Rever conteúdos anteriores,"
				+ "\nCompletar as atividades de mysql,"
				+ "\nAjeitar o linkedin.";
	}
}
