package com.nsb.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

		mav.addObject("result", result);

		return mav;
	}

	@RequestMapping(value = "view/boardwrite", method = RequestMethod.GET)
	public ModelAndView boardwrite() {
		ModelAndView mav = new ModelAndView();
		return mav;
	}
	
	@RequestMapping(value="view/boardDetail",method = RequestMethod.GET)
	public ModelAndView boardDetail(int id) {
		boardService.viewsUpdate(id);
		Board result = boardService.getBoardDetail(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("result",result);
		return mav;
	}

}