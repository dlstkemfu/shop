package com.nsb.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainviewController {
@RequestMapping("/")
public String mainview(Model model) {
model.addAttribute("title", "알뜰시장");

return "mainview";
}
}
