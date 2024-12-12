package com.org.QuizApp.QuizApp.controller;

import com.org.QuizApp.QuizApp.modules.Questions;
import com.org.QuizApp.QuizApp.modules.QuizSession;
import com.org.QuizApp.QuizApp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/quiz")
public class ControllerClass {

    @Autowired
    private QuizService quizService;

    @PostMapping("/start")
    public QuizSession startQuiz() {

        return quizService.startNewSession();
    }

    @GetMapping("/question")
    public Questions getRandomQuestion() {
        return quizService.getRandomQuestion();
    }

    @PostMapping("/submit")
    public QuizSession submitAnswer(
            @RequestParam Long sessionId,
            @RequestParam Long questionId,
            @RequestParam String answer
    ) {
        return quizService.submitAnswer(sessionId, questionId, answer);
    }

    @GetMapping("/stats")
    public QuizSession getStats(@RequestParam Long sessionId) {

        return quizService.getSessionStats(sessionId);
    }
}
