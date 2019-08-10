package com.example.demo.Test1.repository;

import com.example.demo.Test1.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, String> {
}
