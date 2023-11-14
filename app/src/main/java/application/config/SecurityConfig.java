package application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    public SecurityFilterChain SecurityFilterChain(HttpSecurity http) throws Exception {
        htpp
            .csrf().disable()
            .authozeHttpRequests()
            .anyRequest().authenticated();
        http
            .formLogin();
        return http.build();
    }
    @SuppressWarnings(“deprecation”)
    @Bean
    public NoOpPasswordEncoder passwordEncoder(){
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstace();
    }
}
