package com.nsb.shop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nsb.shop.domain.usersVO;

@Repository
public class UsersDAO {
	
	@Autowired
	public SqlSession sqlSession;
	
	public List<usersVO> getusersList(){
		
		return sqlSession.selectList("getusersList");
	}
}
