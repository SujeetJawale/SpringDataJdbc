package com.sujeet.springdatajdbc;

import com.sujeet.springdatajdbc.dao.SpringJdbc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJdbcApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext container = SpringApplication.run(SpringDataJdbcApplication.class, args);
        SpringJdbc jdbc = container.getBean(SpringJdbc.class);
        jdbc.insert();
    }

}
