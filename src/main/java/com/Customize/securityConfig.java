package com.Customize;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class securityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
	http
	    .authorizeHttpRequests((request)->request.requestMatchers("/home","/about").permitAll().anyRequest()
	    		.authenticated())
	    		.formLogin();
		return http.build();
	}
}
