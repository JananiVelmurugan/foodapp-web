package com.janani.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.revature.dao.MenuDAO;
import com.revature.model.Menu;

@Controller
@RequestMapping("/menu")
public class MenuController {

	MenuDAO dao = new MenuDAO();

	@GetMapping("/add")
	public String create() {
		return "../menudetails/add.jsp";
	}

	@GetMapping("/insert")
	public String save(@RequestParam("id") int id, @RequestParam("name") String name) {
		Menu menu = new Menu();
		menu.setId(id);
		menu.setName(name);
		dao.save(menu);
		return "redirect:/menu/list";
	}

	@GetMapping("/list")
	public String list(ModelMap modelMap) {
		List<Menu> menuList = dao.list();
		System.out.println(menuList.size());
		modelMap.addAttribute("menuList", menuList);
		return "/menudetails/list.jsp";
	}

}
