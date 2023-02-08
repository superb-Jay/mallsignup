package com.example.mallsignup.service.impl;

import com.example.mallsignup.dto.RequestMember;
import com.example.mallsignup.dto.ResponseMember;
import com.example.mallsignup.repository.MemberRepository;
import com.example.mallsignup.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public ResponseMember insertMember(RequestMember requestMember) {
        try {
            memberRepository.save(requestMember.toEntity());

        }catch (Exception e) {
            e.printStackTrace();
            ResponseMember.builder()
                    .code("error")
                    .content(e.getMessage())
                    .build();
        }
        return  ResponseMember.builder()
                .code("success")
                .build();
    }
}
