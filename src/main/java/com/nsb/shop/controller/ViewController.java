package com.nsb.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nsb.shop.logic.Board;
import com.nsb.shop.service.BoardService;

@Controller
@RequestMapping("view/*")
public class ViewController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("view/dashboard") 
	public ModelAndView dashboard() { 
	List result = boardService.getBoardList();  
	ModelAndView mav = new ModelAndView(); 

	mav.addObject("result",result); 

	return mav; 
	}
	
}