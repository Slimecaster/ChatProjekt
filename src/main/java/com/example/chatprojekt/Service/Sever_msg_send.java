package com.example.chatprojekt.Service;

import com.example.chatprojekt.Model.MessageType;

public class Sever_msg_send {
    private String text;
    private int UserId;
    private int ChatId;
    private MessageType messageType;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getChatId() {
        return ChatId;
    }

    public void setChatId(int chatId) {
        ChatId = chatId;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public Sever_msg_send(String text, int userId, int chatId, MessageType messageType) {
        this.text = text;
        UserId = userId;
        ChatId = chatId;
        this.messageType = messageType;
    }
    public Sever_msg_send() {}
}
