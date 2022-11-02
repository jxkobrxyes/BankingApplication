package com.example.BankingApplication;

import com.example.BankingApplication.user.Role;
import com.example.BankingApplication.user.User;
import com.example.BankingApplication.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class BankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null, "John Doe", "john123", "password", 10000F, new ArrayList<>()));
			userService.saveUser(new User(null, "Margarid Mane", "Marid45", "password", 20000F, new ArrayList<>()));
			userService.saveUser(new User(null, "Seth Rogen", "Rogen69", "password", 100000F, new ArrayList<>()));
			userService.saveUser(new User(null, "Jakob Reyes", "JR115", "password", 0F, new ArrayList<>()));

			userService.addRoleToUser("JR115", "ROLE_SUPER_ADMIN");
			userService.addRoleToUser("john123", "ROLE_ADMIN");
			userService.addRoleToUser("Rogen69", "ROLE_USER");
			userService.addRoleToUser("Marid45", "ROLE_USER");
		};
	}
}
