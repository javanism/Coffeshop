package com.shop.cafe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.cafe.dto.Login;
import com.shop.cafe.service.OAuthService;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class OAuthController {

	@Autowired
	OAuthService oAuthService;

	@GetMapping("kakaoLogin")
	public String kakaoLogin() {
		String API_KEY = "b343b2cbddccf84d5888002b32d5597f";
		return "redirect:https://kauth.kakao.com/oauth/authorize?client_id=" + API_KEY
				+ "&redirect_uri=http://localhost:8080/kakaoLoginCallback&response_type=code";
	}

	@GetMapping("kakaoLoginCallback")
	public String kakaoCallback(@RequestParam String code, HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("사용자 동의 코드:" + code);
		String access_Token = oAuthService.getKaKaoAccessToken(code);
		String email = oAuthService.createKakaoUser(access_Token);
		if (email != null) {
			// db에 저장
			oAuthService.insertLoginInfo(email, access_Token);
			
			Cookie c1 = new Cookie("nickname", email);
			Cookie c2 = new Cookie("Authorization", access_Token);
			
			response.addCookie(c1);
			response.addCookie(c2);
			
//			//HttpSession을 사용하는 경우
//			HttpSession session = request.getSession();
//			session.setAttribute("email", email);
//			Cookie c = new Cookie("id", email);
//			//c.setHttpOnly(true); 이것을 하면 javascript에서 사용 불가
//			response.addCookie(c);
		}

		return "redirect:http://localhost:5500/";
	}

}