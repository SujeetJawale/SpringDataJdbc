package com.sujeet.springdatajdbc.dao;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class SpringJdbc {
    private static final String SQL_QUERY = "INSERT INTO STUDENT(id, name, age) VALUES (1, 'Sujeet',24)";
    @Autowired
    private JdbcTemplate jdbc;

    public void insert(){
        System.out.println("Inside insert");
        jdbc.update(SQL_QUERY);
    }
}
