package com.ProyectoAlquiler.demo.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptarPassword {

	public static void main(String[] args) {
		 
		var password = "12345";
		System.out.println("Password sin Encriptar "+ password);
		System.out.println("Password Encriptada "+ encriptarPassword(password));
	}

	
	public static String encriptarPassword(String password) {
		BCryptPasswordEncoder encoder = new  BCryptPasswordEncoder();
		return encoder.encode(password);
	}
	
}

