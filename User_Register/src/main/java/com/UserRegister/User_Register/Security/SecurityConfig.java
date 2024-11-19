package com.UserRegister.User_Register.Security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;


import com.UserRegister.User_Register.Model.MyAppUserService;
import com.mysql.cj.protocol.AuthenticationProvider;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class SecurityConfig {
	
	private final MyAppUserService appUserService = new MyAppUserService();
	
	@Bean
	public UserDetailsService userDetailsService(){
		return appUserService;
	}
	@Bean
	public org.springframework.security.authentication.AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider provider= new DaoAuthenticationProvider();
		provider.setUserDetailsService(appUserService);
		return provider;
	}
	
	

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
        		.csrf(AbstractHttpConfigurer::disable)
                .formLogin(httpForm -> httpForm
                        .loginPage("/login").permitAll()
                )
                .authorizeHttpRequests(registry -> {
                    registry
                            .requestMatchers("/req/signup", "/css/**","/jsp/**").permitAll()  // Public access to signup endpoint
                            .anyRequest().authenticated();              // All other requests require authentication
                })
                .build();
    }
}