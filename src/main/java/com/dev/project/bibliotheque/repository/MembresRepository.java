package com.dev.project.bibliotheque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.PathVariable;

import com.dev.project.bibliotheque.model.Membres;

@RepositoryRestResource
public interface MembresRepository extends JpaRepository<Membres, Long> {

    public Membres findByPrenom(@PathVariable String prenom);
}
