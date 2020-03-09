package br.com.regisProjects.exemploSpringSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ExemploSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploSpringSecurityApplication.class, args);
                System.out.print(new BCryptPasswordEncoder().encode("123"));
	}

}
