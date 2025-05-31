package com.comicverse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comicverse.model.Comic;
import com.comicverse.service.ComicService;

@RestController
@RequestMapping("/api/comics")
public class ComicController {

    @Autowired
    private ComicService comicService;

    // ✅ Este método es el que necesitas para GET
    @GetMapping
    public List<Comic> listar() {
        return comicService.listar();
    }

    @PostMapping("/uno")
    public Comic guardar(@RequestBody Comic comic) {
        return comicService.guardar(comic);
    }

    @PostMapping("/varios")
    public ResponseEntity<?> guardarComics(@RequestBody List<Comic> comics) {
    comicService.guardarTodos(comics);
    return ResponseEntity.ok("Comics guardados correctamente");
}
}
