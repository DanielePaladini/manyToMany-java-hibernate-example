package com.example.demo.Test1.service;

import com.example.demo.Test1.model.Group;
import com.example.demo.Test1.repository.GroupMemberRepository;
import com.example.demo.Test1.repository.GroupRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GroupService {

    private GroupRepository groupRepository;
    private GroupMemberRepository groupMemberRepository;

    public void addGroup(Group group){
        groupRepository.save(group);
    }

    public Group findById(String groupId){
        return groupRepository.findById(groupId).get();
    }

    public void aaa(String groupId){

    }
}
