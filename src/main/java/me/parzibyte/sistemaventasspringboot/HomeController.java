
package me.parzibyte.sistemaventasspringboot;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {
	
	 
	 @GetMapping("/")
	public String mostrarIndex(Model model) {
		return"productos/ver_productos";
	}
	 
