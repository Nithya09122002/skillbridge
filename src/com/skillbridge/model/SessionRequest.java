// Dummy content for com/skillbridge/model/SessionRequest.java
package com.skillbridge.model;

public class SessionRequest {
    private int id;
    private int userId;
    private int skillId;
    private String requestStatus;

    // Constructor
    public SessionRequest(int id, int userId, int skillId, String requestStatus) {
        this.id = id;
        this.userId = userId;
        this.skillId = skillId;
        this.requestStatus = requestStatus;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }
}
