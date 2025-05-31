package com.comicverse.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@Profile("mysql")
@EnableJpaRepositories(basePackages = "com.comicverse.repository.mysql")
public class JpaConfig {
}