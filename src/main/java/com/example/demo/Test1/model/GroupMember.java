package com.example.demo.Test1.model;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
public class GroupMember {

    @EmbeddedId
    private GroupMemberKey groupMemberKey;

    @ManyToOne
    @MapsId("group_id")
    @JoinColumn(name = "group_id")
    Group group;

    @ManyToOne
    @MapsId("member_id")
    @JoinColumn(name = "member_id")
    Member member;

    private String role;

    public GroupMember(Group group, Member member, String role) {
        this.groupMemberKey = new GroupMemberKey(group.getGroupId(), member.getMemberId());
        this.role = role;
    }
}
