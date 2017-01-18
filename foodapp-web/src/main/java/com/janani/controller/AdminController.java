package com.janani.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/food")
public class AdminController {

	@PostMapping("/login")
	public String login(@RequestParam("userName") String userName, HttpSession session) {
		session.setAttribute("LOGGED_IN_USER", userName);
		return "redirect:../home.jsp";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:../index.jsp";
	}
}
