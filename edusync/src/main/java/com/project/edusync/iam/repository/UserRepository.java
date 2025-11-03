package com.project.edusync.iam.repository;

import com.project.edusync.iam.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
