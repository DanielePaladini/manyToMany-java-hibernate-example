package com.example.demo.Test1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "member1")
@NoArgsConstructor
@Setter
@Getter
public class Member {

    @Id
    private String memberId;

    @OneToMany(mappedBy = "member")
    private Set<GroupMember> groupMembers = new HashSet<>();

    public Member(String memberId) {
        this.memberId = memberId;
    }
}
