package com.dev.project.bibliotheque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.project.bibliotheque.model.Historique;
import com.dev.project.bibliotheque.model.Livres;
import com.dev.project.bibliotheque.model.Membres;
import com.dev.project.bibliotheque.service.HistoriqueService;
import com.dev.project.bibliotheque.service.LivreService;
import com.dev.project.bibliotheque.service.MembreService;

@RestController
public class HistoriqueController {

    @Autowired
    private HistoriqueService historiqueService;
    @Autowired
    private MembreService membreService;

    @Autowired
    private LivreService livreService;

    @RequestMapping("/historiqueSave")
    public Historique savHistorique(@RequestBody Historique historique) {
        Membres membres = membreService.getMembreById(historique.getMembres().getId_membre());
        Livres livres = livreService.getLivresById(historique.getLivres().getId_livre());

        if (historique.getMembres() == null || historique.getLivres() == null) {
            throw new IllegalArgumentException("Livre ou membre introuvalble");
        }
        historique.setMembres(membres);
        historique.setLivres(livres);

        return historiqueService.historiqueEmprunte(historique);
    }

    @RequestMapping("/historiqueListe")
    public List<Historique> getHistorique() {
        return historiqueService.getHistoriques();
    }
}
