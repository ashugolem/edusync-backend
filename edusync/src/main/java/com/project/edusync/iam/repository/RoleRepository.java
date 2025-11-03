package com.project.edusync.iam.repository;

import com.project.edusync.iam.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
