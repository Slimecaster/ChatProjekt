package com.example.chatprojekt.Model;

public class Message {
    private String content;
    private MessageType messageType;
    private int UserId;
    private String sender;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void Recive_Message(MessageType messageType, int UserId, String sender) {
        this.messageType = messageType;
        this.UserId = UserId;
        this.sender =sender;
    }

}