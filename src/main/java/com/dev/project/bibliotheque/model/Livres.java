package com.dev.project.bibliotheque.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "livres")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Livres implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_livre;
    private String titre;
    private String type;
    private String auteur;
    private String description;
    private String exemplaire;
    private LocalDate date_edition;
    private boolean disponible;
}