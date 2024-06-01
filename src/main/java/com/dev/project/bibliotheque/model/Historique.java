package com.dev.project.bibliotheque.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
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
@Table(name = "historique")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Historique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "idMembre")
    private Membres membres;

    @ManyToOne
    @JoinColumn(name = "IdLivres")
    private Livres livres;

    @Column(name = "debutEmprunte")
    private LocalDate debut;

    @Column(name = "retourEmprunte")
    private LocalDate retour;
}
