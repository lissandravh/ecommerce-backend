package com.ecommerce_monorepo.backend.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class ProductClient {
    @Bean
    public RestClient restClient(RestClient.Builder restClientBuilder){
        return restClientBuilder
                .baseUrl("https://fakestoreapi.com")
                .build();
    }
}
