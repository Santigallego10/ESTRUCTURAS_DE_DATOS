package com.tutorial.crud;

import com.tutorial.crud.security.entity.MainUser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.Authentication;

import java.util.Date;

@SpringBootTest
class CrudApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	String test2(Authentication authentication)
	{

		MainUser mainUser = (MainUser) authentication.getPrincipal();

		String secret = "secret";

		int expiration = 3600;

		System.out.println(secret);
		return Jwts.builder().setSubject(mainUser.getUsername())
				.setIssuedAt(new Date())
				.setExpiration(new Date(new Date().getTime() + expiration * 1000))
				.signWith(SignatureAlgorithm.HS512, secret)
				.compact();

	}
}
