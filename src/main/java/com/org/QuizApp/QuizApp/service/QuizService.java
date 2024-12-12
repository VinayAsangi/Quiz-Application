package com.org.QuizApp.QuizApp.service;

import com.org.QuizApp.QuizApp.modules.Questions;
import com.org.QuizApp.QuizApp.modules.QuizSession;
import com.org.QuizApp.QuizApp.repository.QuizRepo;
import com.org.QuizApp.QuizApp.repository.QuizSessionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class QuizService {

    @Autowired
    private QuizRepo questionRepository;

    @Autowired
    private QuizSessionRepo quizSessionRepository;

    private final Random random = new Random();

    public QuizSession startNewSession() {
        QuizSession session = new QuizSession();
        session.setTotalQuestions(0);
        session.setCorrectAnswers(0);
        session.setIncorrectAnswers(0);
        return quizSessionRepository.save(session);
    }

    public Questions getRandomQuestion() {
        List<Questions> questions = questionRepository.findAll();
        if (questions.isEmpty()) {
            throw new RuntimeException("No questions available!");
        }
        return questions.get(random.nextInt(questions.size()));
    }

    public QuizSession submitAnswer(Long sessionId, Long questionId, String answer) {
        Optional<QuizSession> sessionOpt = quizSessionRepository.findById(sessionId);
        Optional<Questions> questionOpt = questionRepository.findById(questionId);

        if (sessionOpt.isEmpty() || questionOpt.isEmpty()) {
            throw new RuntimeException("Invalid session or question!");
        }

        QuizSession session = sessionOpt.get();
        Questions question = questionOpt.get();

        session.setTotalQuestions(session.getTotalQuestions() + 1);

        if (question.getCorrectAnswer().equalsIgnoreCase(answer)) {
            session.setCorrectAnswers(session.getCorrectAnswers() + 1);
        } else {
            session.setIncorrectAnswers(session.getIncorrectAnswers() + 1);
        }

        return quizSessionRepository.save(session);
    }

    public QuizSession getSessionStats(Long sessionId) {
        return quizSessionRepository.findById(sessionId)
                .orElseThrow(() -> new RuntimeException("Session not found!"));
    }
}