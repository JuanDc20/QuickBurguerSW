package com.comicverse.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@Profile("mongo")
@EnableMongoRepositories(basePackages = "com.comicverse.repository.mongo")
public class MongoConfig {
}