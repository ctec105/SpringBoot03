package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Persona;

@Controller
@RequestMapping("/") // path a nivel de clase
public class MetodosController {

	// método 1
	@GetMapping("/metodo1")
	public String metodo1(Model model) {
		model.addAttribute("nombre", "Aprendec");
		return "vista1";
	}

	// método2
	@GetMapping("/metodo2")
	public ModelAndView metodo2() {
		ModelAndView mav = new ModelAndView("vista2"); // la vista
		mav.addObject("nombre", "José");
		return mav;
	}

	// Con un objeto

	// método3
	@GetMapping("/metodo3")
	public String metodo3(Model model) {
		model.addAttribute("persona", new Persona("José", "3245866"));
		return "vista3";
	}

	// método4
	@GetMapping("/metodo4")
	public ModelAndView metodo4() {
		ModelAndView mav = new ModelAndView("vista4"); // la vista
		mav.addObject("persona", new Persona("Gabriela", "3258966"));
		return mav;
	}

}
