create database quiz_app;
USE quiz_app;
CREATE TABLE questions (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    question VARCHAR(300) NOT NULL,
    option_a VARCHAR(200) NOT NULL,
    option_b VARCHAR(200) NOT NULL,
    option_c VARCHAR(200) NOT NULL,
    option_d VARCHAR(200) NOT NULL,
    correct_answer VARCHAR(15) NOT NULL
);
INSERT INTO questions (question, option_a, option_b, option_c, option_d, correct_answer)
VALUES
('What is the capital of Karnataka?', 'Bangalore', 'Mysore', 'Hubli', 'Belgaum', 'Bangalore'),
('What is the capital of Maharashtra?', 'Mumbai', 'Pune', 'Nagpur', 'Thane', 'Mumbai'),
('What is the capital of Tamil Nadu?', 'Chennai', 'Madurai', 'Coimbatore', 'Salem', 'Chennai');
SELECT * FROM questions;

CREATE TABLE quiz_sessions (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    total_questions INT DEFAULT 0,
    correct_answers INT DEFAULT 0,
    incorrect_answers INT DEFAULT 0
);



