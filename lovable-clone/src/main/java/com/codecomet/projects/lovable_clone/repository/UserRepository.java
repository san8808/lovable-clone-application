package com.codecomet.projects.lovable_clone.repository;

import com.codecomet.projects.lovable_clone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
