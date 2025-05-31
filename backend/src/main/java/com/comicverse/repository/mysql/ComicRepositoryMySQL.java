package com.comicverse.repository.mysql;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comicverse.model.Comic;

@Repository
@Profile("mysql")
public interface ComicRepositoryMySQL extends JpaRepository<Comic, Long> {
}
