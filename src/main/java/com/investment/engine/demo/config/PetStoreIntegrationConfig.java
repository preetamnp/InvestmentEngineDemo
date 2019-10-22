package com.investment.engine.demo.config;

import io.swagger.client.ApiClient;
import io.swagger.client.api.PetApi;
import io.swagger.client.auth.OAuth;
import org.springframework.context.annotation.Bean;

public class PetStoreIntegrationConfig {

    @Bean
    public PetApi petApi() {
        return new PetApi(apiClient());
    }

    @Bean
    public ApiClient apiClient() {
        ApiClient apiClient = new ApiClient();
        OAuth petStoreAuth = (OAuth) apiClient.getAuthentication("petstore_auth");
        petStoreAuth.setAccessToken("special-key");
        return apiClient;
    }

}
