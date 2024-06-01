package com.dev.project.bibliotheque.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.bibliotheque.model.Emprunter;

public interface EmprunteRepository extends JpaRepository<Emprunter, Long> {

}
