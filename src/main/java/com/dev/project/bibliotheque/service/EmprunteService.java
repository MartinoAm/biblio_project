package com.dev.project.bibliotheque.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.project.bibliotheque.model.Emprunter;
import com.dev.project.bibliotheque.repository.EmprunteRepository;

import jakarta.transaction.Transactional;

@Service
public class EmprunteService {
    @Autowired
    private EmprunteRepository emprunteRepository;

    @Transactional
    public Emprunter emprunteSave(Emprunter emprunter) {
        return emprunteRepository.save(emprunter);
    }

    public void returnBook(long id) {
        emprunteRepository.deleteById(id);
    }

    public List<Emprunter> historiqueEmprunte() {
        List<Emprunter> emprunters = new ArrayList<>();
        emprunteRepository.findAll().forEach(emprunte -> {
            emprunters.add(emprunte);
        });

        return emprunters;
    }

    public Emprunter getEmprunterById(Long id) {
        return emprunteRepository.findById(id).orElse(null);
    }
}
