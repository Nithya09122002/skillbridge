CREATE SCHEMA IF NOT EXISTS skillbridge;
USE skillbridge;

CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255),
    password VARCHAR(255),
    email VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS skills (
    id INT AUTO_INCREMENT PRIMARY KEY,
    skill_name VARCHAR(255),
    description TEXT
);

CREATE TABLE IF NOT EXISTS session_requests (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    skill_id INT,
    session_date DATE
);

CREATE TABLE IF NOT EXISTS messages (
    id INT AUTO_INCREMENT PRIMARY KEY,
    sender_id INT,
    receiver_id INT,
    message TEXT,
    sent_at TIMESTAMP
);


