package com.comicverse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.comicverse.model.Comic;
import com.comicverse.repository.mongo.ComicRepositoryMongo;
import com.comicverse.repository.mysql.ComicRepositoryMySQL;

@Service
@Profile("mysql")
class ComicServiceMySQL implements ComicService {
    @Autowired private ComicRepositoryMySQL repo;
    public List<Comic> listar() { return repo.findAll(); }
    public Comic guardar(Comic c) { return repo.save(c); }
    public void guardarTodos(List<Comic> comics) { repo.saveAll(comics);}
}

@Service
@Profile("mongo")
class ComicServiceMongo implements ComicService {
    @Autowired private ComicRepositoryMongo repo;
    public List<Comic> listar() { return repo.findAll(); }
    public Comic guardar(Comic c) { return repo.save(c); }
    public void guardarTodos(List<Comic> comics) {repo.saveAll(comics);}
}

public interface ComicService {
    List<Comic> listar();
    Comic guardar(Comic comic);
    void guardarTodos(List<Comic> comics);
}
