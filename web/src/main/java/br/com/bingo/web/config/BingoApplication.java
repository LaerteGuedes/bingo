package br.com.bingo.web.config;

import br.com.bingo.core.config.JpaConfig;
import br.com.bingo.core.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import({JpaConfig.class, SecurityConfig.class})
@ComponentScan(basePackages = {"br.com.bingo.web.controllers", "br.com.bingo.core.services"})
public class BingoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BingoApplication.class, args);
    }
}
