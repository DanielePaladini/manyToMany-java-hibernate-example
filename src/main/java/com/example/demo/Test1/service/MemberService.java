package com.example.demo.Test1.service;

import com.example.demo.Test1.model.Group;
import com.example.demo.Test1.model.GroupMember;
import com.example.demo.Test1.model.Member;
import com.example.demo.Test1.repository.GroupMemberRepository;
import com.example.demo.Test1.repository.GroupRepository;
import com.example.demo.Test1.repository.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class MemberService {

    private GroupRepository groupRepository;
    private GroupMemberRepository groupMemberRepository;
    private MemberRepository memberRepository;

    @Transactional
    public void addMember(Group group, Member member, String role){

        GroupMember groupMember = new GroupMember(group, member, role);


        memberRepository.save(member);

        groupMemberRepository.save(groupMember);
    }
}
