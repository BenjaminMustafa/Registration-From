package com.example.app;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "nam2020";
		String encodedPaddword = encoder.encode(rawPassword);
		
		System.out.println(encodedPaddword);
	}

}
