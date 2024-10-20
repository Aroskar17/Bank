package com.bank.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AccountsApplication {
@GetMapping("/hello")
private String hello(){
	return "<h1>Hello</h1>";
}
	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
