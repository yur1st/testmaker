package com.testmaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TestmakerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestmakerApplication.class, args);
    }

}
