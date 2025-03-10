package com.shop.cafe.service;

import org.springframework.stereotype.Service;

import com.shop.cafe.dto.Cart;

@Service
public class CartService {

	public void addCart(String nickname, String token, Cart cart) {
		// 1. member table에서 nickname에 해당하는 email을 찾아온다
		
		// 2.login_salt table에서 email에 해당하는 salt를 찾아 온다
		
		// 3. 이 email과 salt를 hashing하여 입력된 token과 같은지 확인한다
		
		
		
	}
	
	

}
