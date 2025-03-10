package com.shop.cafe.dao;

import org.apache.ibatis.annotations.Mapper;
import com.shop.cafe.dto.LoginSalt;

@Mapper
public interface LoginSaltDao {		
	
	public  void insertSalt(LoginSalt ls) throws Exception;
	

}
