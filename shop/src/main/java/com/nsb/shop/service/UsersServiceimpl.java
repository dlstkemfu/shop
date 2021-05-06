package com.nsb.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsb.shop.dao.UsersDAO;
import com.nsb.shop.domain.usersVO;

@Service
public class UsersServiceimpl implements UsersService {
	
	@Autowired
	UsersDAO usersDAO;

	public List<usersVO> getusersList() {
		return usersDAO.getusersList();
	
}
}
