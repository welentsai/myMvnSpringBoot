package com.example.demo.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody
    public String home() {
        return "Greetings from Spring Boot!";
    }
    
//    @RequestMapping("/index")
//	public String index() {
//		return "Hello World! You are at index !!";
//	}
	
	@RequestMapping(value = "/foos", method = RequestMethod.GET)
	@ResponseBody
	public String getFoosBySimplePath() {
	    return "Get some Foos";
	}
	
	@RequestMapping("/MyFirstPage")
	public String greeting(HttpServletRequest request, HttpServletResponse rs, Model model,
			@RequestParam(value = "title", required = false, defaultValue = "Hello Welen") String title,
			@RequestParam(value = "id", required = false, defaultValue = "5566") String id) {
		model.addAttribute("name", title);
		model.addAttribute("ID", id);
		return "index";
	}
    
    @GetMapping("/index")
	public String index(Map<String, Object> model) {
	 	model.put("ID", "welen");
		return "index";
	}
}
