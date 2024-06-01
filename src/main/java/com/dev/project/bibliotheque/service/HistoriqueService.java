package com.dev.project.bibliotheque.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.project.bibliotheque.model.Historique;
import com.dev.project.bibliotheque.repository.historiqueRepository;

@Service
public class HistoriqueService {

    @Autowired
    private historiqueRepository historyRepository;

    public Historique historiqueEmprunte(Historique historique) {
        return historyRepository.save(historique);
    }

    public List<Historique> getHistoriques() {
        List<Historique> historiques = new ArrayList<>();
        historyRepository.findAll().forEach(history -> {
            historiques.add(history);
        });
        return historiques;
    }
}
