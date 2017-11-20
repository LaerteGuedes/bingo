package br.com.bingo.web.config;

import br.com.bingo.core.config.JpaConfig;
import br.com.bingo.core.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@SpringBootApplication
@Import({JpaConfig.class, SecurityConfig.class})
@ComponentScan(basePackages = {"br.com.bingo.web.controllers", "br.com.bingo.core.services"})
@EnableWebMvc
public class BingoApplication extends WebMvcAutoConfiguration{

    public static void main(String[] args) {
        SpringApplication.run(BingoApplication.class, args);
    }

}
