package com.example.demo.Test1.repository;

import com.example.demo.Test1.model.Group;
import com.example.demo.Test1.model.GroupMember;
import com.example.demo.Test1.model.GroupMemberKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GroupMemberRepository extends JpaRepository<GroupMember, GroupMemberKey> {

    @Query
    public List<GroupMember> findAllByGroup(Group group);
}
