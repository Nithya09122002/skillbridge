// Dummy content for com/skillbridge/model/Message.java
package com.skillbridge.model;

public class Message {
    private int id;
    private int senderId;
    private int receiverId;
    private String messageContent;
    private String timestamp;

    // Constructor
    public Message(int id, int senderId, int receiverId, String messageContent, String timestamp) {
        this.id = id;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.messageContent = messageContent;
        this.timestamp = timestamp;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
