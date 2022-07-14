package com.ankhang.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.ankhang.service.impl.UserDetailsServiceImpl;

@Configuration
public class SecurityConfigBean {
	
	@Bean
	public PasswordEncoder  passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
