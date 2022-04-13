package com.casasadsltda.projeto.recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casasadsltda.projeto.entidades.Usuarios;

@RestController
@RequestMapping(value = "/usuarios")
public class RecursosDeUsuario {

	 
	@GetMapping
	public ResponseEntity<Usuarios>findAll(){
		Usuarios u = new Usuarios(1L,"Maria","maria@gmail","119999","123456");
		return ResponseEntity.ok().body(u);
	}
}
