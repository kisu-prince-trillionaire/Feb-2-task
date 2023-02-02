package com.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("/")
	public String display() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/authorization")
	public String display(HttpServletRequest req, Model m) {
		String name = req.getParameter("name");
		System.out.println(name);
		String pass = req.getParameter("pass");
		System.out.println(pass);
		
		if (pass.equals("admin")) {
			String msg = "Hello " + name;
			m.addAttribute("message", msg);
			return "sucess";
		} else {
			String msg = "Sorry " + name + ". You entered an incorrect password";
			m.addAttribute("message", msg);
			return "error";
		}
	}
}
