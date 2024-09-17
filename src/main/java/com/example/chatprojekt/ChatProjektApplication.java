package com.example.chatprojekt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

@SpringBootApplication
public class ChatProjektApplication {
    private static final int threadPoolSize = 10;

    public static void main(String[] args) {
        ExecutorService threadpool = Executors.newFixedThreadPool(threadPoolSize);
        SpringApplication.run(ChatProjektApplication.class, args);

        try(ServerSocket serverSocket = new ServerSocket(5000)){
            while(true){
                Socket socket = serverSocket.accept();
                threadpool.submit(new ClientHandler(socket));

                ChatProjektApplication server=new ChatProjektApplication();

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
