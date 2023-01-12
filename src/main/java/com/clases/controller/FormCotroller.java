package com.clases.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormCotroller {
	@RequestMapping("/")
	public String bienvenido() {
		return "index";
	}
}
