package com.dev.project.bibliotheque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.project.bibliotheque.model.Livres;
import com.dev.project.bibliotheque.service.LivreService;

@RestController
public class livreController {
    @Autowired
    private LivreService livreService;

    @RequestMapping("/listLivre")
    public List<Livres> getLivres() {
        return livreService.getLivres();
    }

    @RequestMapping("/livre/{id_livre}")
    public Livres getLivres(@PathVariable long id_livre) {
        return livreService.getLivresById(id_livre);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/livre/{id_livre}")
    public void delete(@PathVariable long id_livre) {
        livreService.deleteLivre(id_livre);
    }

    @RequestMapping("/addLivre")
    public void addLivres(@RequestBody Livres livres) {
        livreService.addLivre(livres);
    }

    @RequestMapping("/update/{id_livre}")
    public void updateLivre(@RequestBody Livres livres, @PathVariable long id_livre) {
        livreService.updateLivre(livres, id_livre);
    }

    @RequestMapping("/searchLivre/{titre}")
    public Livres search(@PathVariable String titre) {
        return livreService.searchLivre(titre);
    }
}
