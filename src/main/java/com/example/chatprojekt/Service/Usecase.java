package com.example.chatprojekt.Service;

import com.example.chatprojekt.Model.Client;
import com.example.chatprojekt.Repository.DBController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Usecase {
    @Autowired
    private DBController dbController=new DBController(new JdbcTemplate());
    private Client client=new Client();


    public Client createUpdateClient(Client client){
        return dbController.createUpdateUser(client);
    }

    public Optional<Client> findClientByClientname(String clientname){
        return dbController.findClientByClientname(clientname);
    }



}
