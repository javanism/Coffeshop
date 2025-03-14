package com.shop.cafe.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.shop.cafe.dto.Login;
import com.shop.cafe.dto.Member;
import com.shop.cafe.service.MemberService;

@RestController
@CrossOrigin("http://127.0.0.1:5500/")
@RequestMapping("/api/members") // 기본 URI를 설정
public class RestMemberController {
    
    @Autowired
    MemberService memberService;    
    
    
    @DeleteMapping("/{id}") // 회원 삭제
    public String deleteMember(@PathVariable Long id) {
        System.out.println("Deleting member with ID: " + id);
        try {
            //memberService.deleteMemberById(id);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "회원 삭제 실패";
        }
    }
}
