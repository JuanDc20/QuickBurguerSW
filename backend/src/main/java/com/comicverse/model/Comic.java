package com.comicverse.model;

import jakarta.persistence.Entity; // ¡Importante!
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "comics")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // DEBE ser Long o Integer

    private String titulo;
    private String autor;
    private double precio;
}