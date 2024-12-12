package com.org.QuizApp.QuizApp.repository;

import com.org.QuizApp.QuizApp.modules.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepo extends JpaRepository<Questions, Long> { }
