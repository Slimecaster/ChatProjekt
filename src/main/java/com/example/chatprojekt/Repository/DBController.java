package com.example.chatprojekt.Repository;

import com.example.chatprojekt.Model.Client;
import org.springframework.beans.factory.annotation.Autowired;
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

    public Optional<Client> findClientByClientname(String clientname) {
        try {
            String sql = "SELECT * FROM user WHERE email = ?";
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
