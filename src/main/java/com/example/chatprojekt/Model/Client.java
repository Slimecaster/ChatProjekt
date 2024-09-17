package com.example.chatprojekt.Model;

public class Client {
    private String clientname;
    private String password;

    public Client() {
    }

    public Client(String clientname, String password) {
        this.clientname = clientname;
        this.password = password;
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
