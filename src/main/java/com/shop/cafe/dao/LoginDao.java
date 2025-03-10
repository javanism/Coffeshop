package com.shop.cafe.dao;

import org.apache.ibatis.annotations.Mapper;
import com.shop.cafe.dto.Login;

@Mapper
public interface LoginDao {		
	
	public  void insertToken(Login l) throws Exception;

	public void deleteToken(String authorization) throws Exception;
	

}
