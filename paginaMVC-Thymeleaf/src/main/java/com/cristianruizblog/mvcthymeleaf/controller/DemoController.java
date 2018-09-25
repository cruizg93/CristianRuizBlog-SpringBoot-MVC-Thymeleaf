package com.cristianruizblog.mvcthymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cristianruizblog.mvcthymeleaf.model.Usuario;

@Controller
public class DemoController {

	@GetMapping
	public String index(Model modelo) {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario(1L,"Usuario1","Cristian Ruiz Gonzalez"));
		usuarios.add(new Usuario(2L,"Usuario2","Pepito Perez"));
		usuarios.add(new Usuario(3L,"Usuario3","Franco Escamilla"));
		usuarios.add(new Usuario(4L,"Usuario4","Tavo Morales"));
		
		modelo.addAttribute("tamano",usuarios.size());
		modelo.addAttribute("usuarios",usuarios);
		return "index";
	}
}
