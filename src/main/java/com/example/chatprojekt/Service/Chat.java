package com.example.chatprojekt.Service;

public class Chat {
    private int chatId;
    private String chatName;
    private Sever_Recive_Msg sever_Recive_Msg;
    private Sever_msg_send sever_msg_send;

    public int getChatId() {
        return chatId;
    }

    public void setChatId(int chatId) {
        this.chatId = chatId;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public Sever_Recive_Msg getSever_Recive_Msg() {
        return sever_Recive_Msg;
    }

    public void setSever_Recive_Msg(Sever_Recive_Msg sever_Recive_Msg) {
        this.sever_Recive_Msg = sever_Recive_Msg;
    }

    public Sever_msg_send getSever_msg_send() {
        return sever_msg_send;
    }

    public void setSever_msg_send(Sever_msg_send sever_msg_send) {
        this.sever_msg_send = sever_msg_send;
    }

    public Chat(int chatId, String chatName, Sever_Recive_Msg sever_Recive_Msg, Sever_msg_send sever_msg_send) {
        this.chatId = chatId;
        this.chatName = chatName;
        this.sever_Recive_Msg = sever_Recive_Msg;
        this.sever_msg_send = sever_msg_send;
    }


}
