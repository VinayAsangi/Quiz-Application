# 📘 Spring Boot Quiz App API

Welcome to the Spring Boot Quiz App API! This project is a simple quiz application built using Spring Boot and Java. It provides multiple-choice quiz questions based on Indian states and their capitals and allows users to track their progress during a quiz session.

## 🚀 Getting Started
This project provides REST APIs for the following features:

1. Start a New Quiz Session
   - Initiates a quiz session and tracks the user’s performance.

2. Get a Random Question
   - Fetches a random multiple-choice question from a database of Indian states and their capitals.

3. Submit an Answer
   - Allows users to answer a quiz question and records whether the submission was correct or incorrect.

4. Get Quiz Stats
   - Provides a summary of the total number of questions answered, along with counts of correct and incorrect answers.

# 📂 Project Structure

As per standard design principles has four layers controller, Service, Repository and modules layers.

# 🌐 Technologies Used
      - Java
      - Spring Boot
      - REST API
      - MySQL Database

# 🛠️ Setup and Installation
  1. Configure Database:
      - Ensure MySQL is installed and running.(I have used MySQL workbench setup)
      - For your referrance added script file in database folder.
    
  2. Access the APIs:(Use Postman for verifying no need of installation just use their official site for online version to send API requests.)
      - Base URL: http://localhost:8080
    
# 📖 API Endpoints

  1. To start a New Quiz Session
     - Method to be used --> POST
     - url: <Base URL>/api/quiz/start
  2. Get a Random Question
      - Method to be used --> GET
      - url: <Base URL>/api/quiz/question
  3. Submit an Answer(In postman select body option and switch to raw data section and select JSON format before submitting and submit answer.)
     - Method to be used --> POST
     - url: <Base URL>/api/quiz/submit
  4. Get Quiz Stats
     - Method to be used --> GET
     - url: <Base URL>/api/quiz/stats?sessionId=1
       
# 🤝 Contributing
  Contributions are welcome! Feel free to submit issues or create pull requests to enhance the project.

## Happy Coding! 🎉
