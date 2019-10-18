package com.etoiledespoir.onlinekvshop.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Okvs_Security{}/** extends WebSecurityConfigurerAdapter {
    private static final String USER_ROLE = "USER";
    private static final String ADMIN_ROLE = "ADMIN";

    @Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("user")
                .password(encoder().encode("password"))
                .roles(USER_ROLE,ADMIN_ROLE)
                .and()
                .withUser("admin")
                .password(encoder().encode("admin"))
                .roles(ADMIN_ROLE);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/OKVS//creat").hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.GET, "/OKVS//reads").hasRole(USER_ROLE)
                .and()
                .csrf().disable()
                .formLogin().disable();
    }

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }
}
*/