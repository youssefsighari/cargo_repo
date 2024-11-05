package com.codego;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.codego.entities"}) // Le package des entités
@EnableJpaRepositories(basePackages = {"com.codego.repository"}) // Le package des repositories
public class BackendCovoiturageApplication {
    public static void main(String[] args) {
        SpringApplication.run(BackendCovoiturageApplication.class, args);
    }
}
 