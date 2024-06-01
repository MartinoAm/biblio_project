package com.dev.project.bibliotheque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.project.bibliotheque.model.Emprunter;
import com.dev.project.bibliotheque.model.Livres;
import com.dev.project.bibliotheque.model.Membres;
import com.dev.project.bibliotheque.service.EmprunteService;
import com.dev.project.bibliotheque.service.LivreService;
import com.dev.project.bibliotheque.service.MembreService;

@RestController
public class EmprunteController {
    @Autowired
    private EmprunteService EmprunteService;

    @Autowired
    private MembreService membreService;

    @Autowired
    private LivreService livreService;

    @PostMapping("/register")
    public Emprunter registre(@RequestBody Emprunter emprunte) {
        Membres membres = membreService.getMembreById(emprunte.getMembres().getId_membre());
        Livres livres = livreService.getLivresById(emprunte.getLivres().getId_livre());

        if (emprunte.getMembres() == null || emprunte.getLivres() == null) {
            throw new IllegalArgumentException("Livre ou membre introuvalble");
        }
        emprunte.setMembres(membres);
        emprunte.setLivres(livres);
        return EmprunteService.emprunteSave(emprunte);
    }

    @RequestMapping("/historique")
    public List<Emprunter> historique() {
        return EmprunteService.historiqueEmprunte();
    }

    @RequestMapping("/deleteEmprunte/{id}")
    public void returnBook(@PathVariable long id) {
        EmprunteService.returnBook(id);
    }
}
