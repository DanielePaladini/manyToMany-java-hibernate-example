package com.example.demo.Test1.repository;

import com.example.demo.Test1.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, String> {

}
