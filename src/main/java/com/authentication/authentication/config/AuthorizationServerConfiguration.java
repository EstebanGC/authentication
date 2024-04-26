package com.authentication.authentication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.oauth2.server.authorization.InMemoryOAuth2AuthorizationConsentService;
import org.springframework.security.oauth2.server.authorization.OAuth2AuthorizationConsentService;
import org.springframework.security.oauth2.server.authorization.config.annotation.web.configuration.OAuth2AuthorizationServerConfiguration;

import javax.sql.DataSource;


@Configuration
@Import(OAuth2AuthorizationServerConfiguration.class)
public class AuthorizationServerConfiguration  {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // Configure your application security here (optional)
    }

    @Bean
    public OAuth2AuthorizationConsentService authorizationConsentService() {
        return new InMemoryOAuth2AuthorizationConsentService(); // Consider persistence for production
    }

    @Bean
    public ProviderSettings providerSettings() {
        // Configure provider settings as needed (e.g., issuer URI)
        return ProviderSettings.builder().build();
    }
}
