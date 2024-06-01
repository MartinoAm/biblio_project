package com.dev.project.bibliotheque.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.project.bibliotheque.model.Membres;
import com.dev.project.bibliotheque.repository.MembresRepository;

@Service
public class MembreService {
    @Autowired
    private MembresRepository membresRepository;

    public List<Membres> getMembres() {
        List<Membres> membres = new ArrayList<>();
        membresRepository.findAll().forEach(membre -> {
            membres.add(membre);
        });

        return membres;
    }

    public void addMembre(Membres membres) {
        membresRepository.save(membres);
    }

    public void updateLivre(Membres membres, long id_membre) {
        membresRepository.save(membres);
    }

    public Membres getMembreById(long id_membre) {
        return membresRepository.findById(id_membre).orElse(null);
    }

    public void deleteMembre(long id_membre) {
        membresRepository.deleteById(id_membre);
    }

    public Membres searchByPrenom(String prenom) {
        return membresRepository.findByPrenom(prenom);
    }

    // public void countMembre() {
    // membresRepository.();
    // }
}
