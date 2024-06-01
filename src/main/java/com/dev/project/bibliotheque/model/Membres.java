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
@Table(name = "membres")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Membres implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_membre;
	private String nom;
	private String prenom;
	private LocalDate date_naissance;
	private String email;
	private String telephone;
	private String adresse;
	private String sexe;
}
