package com.hmall.cart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author xi
 * @create 2023/10/21- 21:01
 */
@Configuration
public class RemoteCallConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
