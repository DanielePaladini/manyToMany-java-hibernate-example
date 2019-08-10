package com.example.demo.Test1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "groups1")
@NoArgsConstructor
@Getter
@Setter
public class Group {

    @Id
    private String groupId;

    @OneToMany(mappedBy = "group")
    private Set<GroupMember> groupMembers = new HashSet<>();

    public Group(String groupId) {
        this.groupId = groupId;
    }
}
