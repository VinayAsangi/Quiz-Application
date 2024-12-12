package com.org.QuizApp.QuizApp.repository;

import com.org.QuizApp.QuizApp.modules.QuizSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizSessionRepo extends JpaRepository<QuizSession, Long> { }