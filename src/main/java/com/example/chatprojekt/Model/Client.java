package com.example.chatprojekt.Model;

public class Client {
    private long clientID;
    private String clientname,password;

    public Client() {
    }

    public Client(long clientID, String clientname, String password) {
        this.clientID = clientID;
        this.clientname = clientname;
        this.password = password;
    }

    public long getClientID() {
        return clientID;
    }

    public void setClientID(long clientID) {
        this.clientID = clientID;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
