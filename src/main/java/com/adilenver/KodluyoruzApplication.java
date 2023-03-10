package com.adilenver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//Security Inactive
@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class}
)
//Auditing
@EnableJpaAuditing(auditorAwareRef = "auditorAware")

public class KodluyoruzApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodluyoruzApplication.class, args);
    }

}
