package com.dev.project.bibliotheque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;

import com.dev.project.bibliotheque.model.Livres;

public interface LivreRepository extends JpaRepository<Livres, Long> {
    public Livres findByTitre(@PathVariable String titre);
}