package com.cts.smartshop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.cts.smartshop.security.AppUserDetailsService;
import com.cts.smartshop.security.JwtAuthorizationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	AppUserDetailsService appUserDetailsService;
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(appUserDetailsService).passwordEncoder(passwordEncoder());
    }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        //Logger.info("Start");
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
    	httpSecurity.csrf().disable().httpBasic().and()
        .authorizeRequests()
        .antMatchers("/products").permitAll().antMatchers(HttpMethod.OPTIONS, "/**")
        .permitAll()
        .antMatchers("/products/typelist").permitAll().antMatchers(HttpMethod.GET, "/**")
        .permitAll()
        .antMatchers("/products/code").permitAll().antMatchers(HttpMethod.GET, "/**")
        .permitAll()
        .antMatchers("/products/bill").permitAll().antMatchers(HttpMethod.OPTIONS, "/**")
        .permitAll()
        .antMatchers("/users").permitAll().antMatchers(HttpMethod.POST, "/**")
        .permitAll()
        .antMatchers("/authenticate").permitAll().antMatchers(HttpMethod.OPTIONS, "/**")
                                .permitAll()
        .anyRequest().authenticated()
        .and()
        .addFilter(new JwtAuthorizationFilter(authenticationManager()));
    }
}

