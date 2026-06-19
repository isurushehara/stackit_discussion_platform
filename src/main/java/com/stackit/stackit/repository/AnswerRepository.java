package com.stackit.stackit.repository;

import com.stackit.stackit.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<User, Long> {
}