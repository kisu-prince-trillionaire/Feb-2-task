package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	public String display(@RequestParam("name") String name,@RequestParam("pass") String pass, Model m) {
	
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
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "Vishal Kumar");
		
		mav.setViewName("help");
		return mav;
	}
}
