package com.nsb.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nsb.shop.domain.usersVO;
import com.nsb.shop.service.UsersService;

@Controller
public class MainviewController {
@RequestMapping("/")
public String mainview(Model model) {
model.addAttribute("title", "알뜰시장");
model.addAttribute("id","아이디:");
model.addAttribute("pw","패스워드:");
return "mainview";
}

@Autowired
UsersService usersService;
@RequestMapping("/login")
public ModelAndView dashboard() {
	List<usersVO> result = usersService.getusersList();
	System.out.println(result);
	ModelAndView mav = new ModelAndView();

return mav;
}
@RequestMapping("/signup")
public String signup(Model model) {


return "signup";
}
}
