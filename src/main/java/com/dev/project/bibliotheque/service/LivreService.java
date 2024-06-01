package com.dev.project.bibliotheque.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.project.bibliotheque.model.Livres;
import com.dev.project.bibliotheque.repository.LivreRepository;

@Service
public class LivreService {
    @Autowired
    private LivreRepository livreRepository;

    public List<Livres> getLivres() {
        List<Livres> livres = new ArrayList<>();
        livreRepository.findAll().forEach(livre -> {
            livres.add(livre);
        });
        return livres;
    }

    public Livres getLivresById(long id_livre) {
        return livreRepository.findById(id_livre).orElse(null);
    }

    public void deleteLivre(long id_livre) {
        livreRepository.deleteById(id_livre);
    }

    public void addLivre(Livres livre) {
        livreRepository.save(livre);
    }

    public void updateLivre(Livres livres, long id_livre) {
        livreRepository.save(livres);
    }

    public Livres searchLivre(String titre) {
        return livreRepository.findByTitre(titre);
    }
}
