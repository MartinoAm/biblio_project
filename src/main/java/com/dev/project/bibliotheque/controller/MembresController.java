package com.dev.project.bibliotheque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.project.bibliotheque.model.Membres;
import com.dev.project.bibliotheque.service.MembreService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MembresController {

    @Autowired
    private MembreService membreService;

    @RequestMapping("/listeMembre")
    public List<Membres> getMembres() {
        return membreService.getMembres();
    }

    @RequestMapping("/addMembre")
    public void newMembres(@RequestBody Membres membres) {
        membreService.addMembre(membres);
    }

    @RequestMapping("/update_membres/{id_membre}")
    public void update(@RequestBody Membres membres, @PathVariable long id_membre) {
        membreService.updateLivre(membres, id_membre);
    }

    @RequestMapping("/deleteMembre/{id_membre}")
    public void delete(@PathVariable long id_membre) {
        membreService.deleteMembre(id_membre);
    }

    @RequestMapping("/membreById/{id_membre}")
    public Membres searc(@PathVariable long id_membre) {
        return membreService.getMembreById(id_membre);
    }

    @RequestMapping("/searchByPrenom/{prenom}")
    public Membres search(@PathVariable String prenom) {
        return membreService.searchByPrenom(prenom);
    }

    // @RequestMapping("/countMembres")
    // public void membres() {
    // membreService.countMembre();
    // }
}
