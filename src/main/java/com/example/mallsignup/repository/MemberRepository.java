package com.example.mallsignup.repository;

import com.example.mallsignup.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
}
