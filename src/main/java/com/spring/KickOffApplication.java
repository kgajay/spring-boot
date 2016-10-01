package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ajay.kg created on 01/10/16.
 */
@SpringBootApplication
public class KickOffApplication {

	public static void main(String[] args) {
//		objectMapper.setPropertyNamingStrategy(new PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy());
		SpringApplication.run(KickOffApplication.class, args);
	}
}
