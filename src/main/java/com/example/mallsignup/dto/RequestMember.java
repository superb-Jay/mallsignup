package com.example.mallsignup.dto;

import com.example.mallsignup.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestMember {

    private String userId;
    private String password;
    private String name;
    private String age;
    private String address;
    private String phone;

    public Member toEntity() {
        return Member.builder()
                .id(userId)
                .password(password)
                .name(name)
                .age(Integer.parseInt(age))
                .address(address)
                .phone(phone)
                .build();
    }


}
