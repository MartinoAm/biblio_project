package com.dev.project.bibliotheque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.project.bibliotheque.model.Users;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<Users, Long> {

}
