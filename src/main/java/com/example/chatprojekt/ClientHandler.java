package com.example.chatprojekt;

import java.io.*;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        Thread thread = new Thread();
        thread.start();
    }

    public void writeToUser(String message) {
        try (InputStream input = socket.getInputStream()) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);


            while ((message = reader.readLine()) != null) {
                System.out.println("recieved text: " + message);
                writer.println(message);


            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
