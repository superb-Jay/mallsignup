package com.example.mallsignup.service;

import com.example.mallsignup.dto.RequestMember;
import com.example.mallsignup.dto.ResponseMember;

public interface MemberService {

    public ResponseMember insertMember(RequestMember requestMember);
}
