package com.example.mallsignup.controller;


import com.example.mallsignup.dto.RequestMember;
import com.example.mallsignup.dto.ResponseMember;
import com.example.mallsignup.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    private final MemberService memberService;
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/signup")
    public ResponseMember insertMember(RequestMember requestMember) {
        return memberService.insertMember(requestMember);
    }
}
