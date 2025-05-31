package com.comicverse.repository.mongo;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.comicverse.model.Comic;

@Repository
@Profile("mongo")
public interface ComicRepositoryMongo extends MongoRepository<Comic, Long> {
}
