package co.edu.cue.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.net.PasswordAuthentication;

@SpringBootApplication
public class LoginApplication {

	public static void main(String[] args) {SpringApplication.run(LoginApplication.class, args);
	}

	@Bean
	public PasswordEncoder passwordEncoder(){
		return NoOpPasswordEncoder.getInstance();
	}

}
