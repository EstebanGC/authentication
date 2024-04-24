package com.authentication.authentication.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;


@EnableAuthorizationServer
@Configuration
public class AuthorizationServerConfiguration implements AuthorizationServerConfigurer{
}
