package com.example.chatprojekt.Repository;

import com.example.chatprojekt.Model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.Optional;

@org.springframework.stereotype.Repository
public class DBController {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DBController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    public Client createUpdateUser (Client client){
        try {
            if(client.getClientname()==null){
                String sql="INSERT INTO client(clientname,password) VALUES(?,?)";
                jdbcTemplate.update(sql, client.getClientname(), client.getPassword());
            }else{
                String sql = "UPDATE user SET clientname=?,password=? where clientname="+client.getClientname();
                jdbcTemplate.update(sql, client.getClientname(), client.getPassword());
            }return client;
        } catch(DataAccessException e){
            throw new RuntimeException("Error creating user", e);
        }
    }

    public Optional<Client> findClientByClientname(String clientname) {
        try {
            String sql = "SELECT * FROM user WHERE clientname = ?";
            Client client = jdbcTemplate.queryForObject(sql, new Object[]{clientname}, clientRowMapper());
            return Optional.ofNullable(client);
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty(); // Returner tomt Optional hvis ingen bruger er fundet
        }
    }

    private RowMapper<Client> clientRowMapper() {
        return (rs, rowNum) -> {
            Client client = new Client();

            client.setClientname(rs.getString("fname"));
            client.setPassword(rs.getString("sname"));

            return client;
        };
    }


}
