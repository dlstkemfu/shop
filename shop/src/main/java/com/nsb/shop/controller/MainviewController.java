package com.nsb.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainviewController {
@RequestMapping("/")
public String mainview(Model model) {
model.addAttribute("title", "알뜰시장");
model.addAttribute("id","아이디:");
model.addAttribute("pw","패스워드:");
return "mainview";
}
@RequestMapping("/login")
public String login(Model model) {


return "login";
}
@RequestMapping("/signup")
public String signup(Model model) {


return "signup";
}
}
