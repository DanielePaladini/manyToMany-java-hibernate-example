package com.example.demo.Test1.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@NoArgsConstructor
@Getter
public class GroupMemberKey implements Serializable {

    @Column(name = "group_id")
    private String groupId;

    @Column(name = "member_id")
    private String memberId;

    public GroupMemberKey(String groupId, String memberId) {
        this.groupId = groupId;
        this.memberId = memberId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupMemberKey that = (GroupMemberKey) o;
        return Objects.equals(groupId, that.groupId) &&
                Objects.equals(memberId, that.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, memberId);
    }
}
