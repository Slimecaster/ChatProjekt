package com.example.chatprojekt.Model;

import org.json.JSONException;
import org.json.JSONObject;

public class SendMessage {
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

    public SendMessage(String text, int userId, int chatId, MessageType messageType) {
        this.text = text;
        UserId = userId;
        ChatId = chatId;
        this.messageType = messageType;
    }

    public JSONObject toJsonObject() {
        try {
            JSONObject json = new JSONObject();
            json.put("messageType",messageType.getValue());
            json.put("chatId",ChatId);
            json.put("userId", UserId);
            json.put("text",text);
            return json;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }


}
