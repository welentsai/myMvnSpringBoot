package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	@GetMapping("/addMemberPage")
	public String addMemberPage(){
		return "addMemberPage";
	}
}
