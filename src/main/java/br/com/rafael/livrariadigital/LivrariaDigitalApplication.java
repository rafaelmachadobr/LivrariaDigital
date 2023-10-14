package br.com.rafael.livrariadigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LivrariaDigitalApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivrariaDigitalApplication.class, args);
    }

}
