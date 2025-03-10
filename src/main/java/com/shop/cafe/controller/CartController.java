package com.shop.cafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.shop.cafe.dto.Cart;
import com.shop.cafe.service.CartService;

@RestController
@CrossOrigin("http://127.0.0.1:5500/")
public class CartController {
	
	@Autowired
	CartService cartService;
	
	@PostMapping("addCart")
	public void addCart(@RequestHeader String nickname,@RequestHeader String token, @RequestBody Cart cart) {
		
		cartService.addCart(nickname, token, cart);
	}

}
