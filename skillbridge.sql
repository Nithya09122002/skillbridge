CREATE DATABASE skillbridge;

USE skillbridge;

-- Users table
CREATE TABLE Users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100),
    user_type ENUM('Learner', 'Trainer') NOT NULL
);

-- Skills table
CREATE TABLE Skills (
    skill_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    skill_name VARCHAR(100) NOT NULL,
    skill_description TEXT,
    FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

-- Sessions table
CREATE TABLE Sessions (
    session_id INT AUTO_INCREMENT PRIMARY KEY,
    skill_id INT,
    learner_id INT,
    trainer_id INT,
    session_date DATETIME,
    session_status ENUM('Scheduled', 'Completed', 'Cancelled') DEFAULT 'Scheduled',
    FOREIGN KEY (skill_id) REFERENCES Skills(skill_id),
    FOREIGN KEY (learner_id) REFERENCES Users(user_id),
    FOREIGN KEY (trainer_id) REFERENCES Users(user_id)
);

-- Feedback table
CREATE TABLE Feedback (
    feedback_id INT AUTO_INCREMENT PRIMARY KEY,
    session_id INT,
    rating INT,
    comments TEXT,
    FOREIGN KEY (session_id) REFERENCES Sessions(session_id)
);

-- Messages table
CREATE TABLE Messages (
    message_id INT AUTO_INCREMENT PRIMARY KEY,
    sender_id INT,
    receiver_id INT,
    message TEXT,
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (sender_id) REFERENCES Users(user_id),
    FOREIGN KEY (receiver_id) REFERENCES Users(user_id)
);

