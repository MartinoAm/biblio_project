package com.dev.project.bibliotheque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.bibliotheque.model.Historique;

public interface historiqueRepository extends JpaRepository<Historique, Long> {

}
