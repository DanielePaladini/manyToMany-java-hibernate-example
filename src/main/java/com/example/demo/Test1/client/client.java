package com.example.demo.Test1.client;

import com.example.demo.Test1.model.Group;
import com.example.demo.Test1.model.GroupMember;
import com.example.demo.Test1.model.Member;
import com.example.demo.Test1.repository.GroupMemberRepository;
import com.example.demo.Test1.repository.MemberRepository;
import com.example.demo.Test1.service.GroupService;
import com.example.demo.Test1.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class client implements CommandLineRunner{

    private MemberService memberService;
    private GroupService groupService;
    private GroupMemberRepository groupMemberRepository;
    private MemberRepository memberRepository;

    @Override
    public void run(String... args) throws Exception {

        Group group1 = new Group("0001");
        Group group2 = new Group("0002");
        Group group3 = new Group("0003");
        groupService.addGroup(group1);
        groupService.addGroup(group2);
        groupService.addGroup(group3);

        Member member1 = new Member("9999");
        Member member2 = new Member("8888");
        Member member3 = new Member("7777");

        memberService.addMember(group1, member1, "admin");
        memberService.addMember(group1, member2, "admin");
        memberService.addMember(group3, member3, "member");

        System.out.println(groupService.findById(group1.getGroupId()).getGroupId());

        List<GroupMember> groupMemberList =groupMemberRepository.findAllByGroup(group1);
        List<String> memberIds = new ArrayList<>();
        for (GroupMember groupMember: groupMemberList) {
            memberIds.add(groupMember.getGroupMemberKey().getMemberId());
        }
        groupMemberList.forEach(groupMember -> System.out.println(groupMember.getGroupMemberKey().getMemberId()));

        List<Member> memberList = memberRepository.findAllById(memberIds);
        memberList.forEach(member -> System.out.println(member.getMemberId()));
    }
}
