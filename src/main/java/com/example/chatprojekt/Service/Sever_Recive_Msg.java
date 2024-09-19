package com.example.chatprojekt.Service;

import com.example.chatprojekt.Model.MessageType;

public class Sever_Recive_Msg {
    private MessageType messageType;
    private int UserId;
    private String text;


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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Sever_Recive_Msg(MessageType messageType, int UserId, String text) {
        this.messageType = messageType;
        this.UserId = UserId;
        this.text = text;
    }
}
