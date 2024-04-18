//package com.onlineattendance.system.securityConfig;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//import java.util.Collections;
//
//@Configuration
//@EnableWebSecurity
//public class EmployeeSecurity {
//    @Bean
//    public UserDetailsService userDetailsService() {
//        org.springframework.security.core.userdetails.User user1 = new org.springframework.security.core.userdetails.User("username", passwordEncoder()
//                .encode("admin123"), Collections.emptyList());
//        org.springframework.security.core.userdetails.User user2 = new org.springframework.security.core.userdetails.User("username1", passwordEncoder().encode("admin1234"), Collections.emptyList());
//        org.springframework.security.core.userdetails.User user3 = new User("username2", passwordEncoder().encode("admin12345"), Collections.emptyList());
//        return new InMemoryUserDetailsManager(user1, user2, user3);
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity
//                .csrf(AbstractHttpConfigurer::disable)
//                .authorizeHttpRequests(auth ->
//                        auth.requestMatchers("swagger-ui/**").permitAll().anyRequest().authenticated()
//
//                );
//
//        return httpSecurity.build();
//    }
//
//}
