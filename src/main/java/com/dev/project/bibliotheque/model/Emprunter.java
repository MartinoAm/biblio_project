package com.dev.project.bibliotheque.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "emprunter")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emprunter implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_membre")
    private Membres membres;

    @ManyToOne
    @JoinColumn(name = "id_livre")
    private Livres livres;

    private LocalDate debut;
    private LocalDate retour;
}
