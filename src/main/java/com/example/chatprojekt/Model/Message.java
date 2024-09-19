package com.example.chatprojekt.Model;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONException;
import org.json.JSONObject;
import org.thymeleaf.messageresolver.IMessageResolver;

import java.io.*;

public class Message {
    private String content;
    private MessageType messageType;
    private int UserId;
    private String text;


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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void Recive_Message(MessageType messageType, int UserId, String text){
        this.messageType = messageType;
        this.UserId = UserId;
        this.text = text;
    }

    public void Recive_Message(Object json){
        JSONObject obj = (JSONObject)json;
        try{
            messageType = MessageType.toMessageType(obj.getInt("MessageType"));
            UserId = obj.getInt("UserId");
            text = obj.getString("text");
        } catch (JSONException e) {
            System.err.println(e);
        }
    }






    }
