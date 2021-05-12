package com.nsb.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsb.shop.dao.BoardDAO;
import com.nsb.shop.logic.Board;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO boardDAO;

	public List<Board> getBoardList() {
		return boardDAO.getBoardList();
	}

}