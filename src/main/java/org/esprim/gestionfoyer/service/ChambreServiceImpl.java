package org.esprim.gestionfoyer.service;

import lombok.AllArgsConstructor;
import org.esprim.gestionfoyer.entities.Chambre;
import org.esprim.gestionfoyer.repositories.ChambreRepsoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// @AllArgsConstructor  here or @Autowired
public class ChambreServiceImpl implements IChambreService {

    @Autowired
    ChambreRepsoitory ChambreRepsoitory;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return ChambreRepsoitory.findAll();
    }
    @Override
    public Chambre retrieveChambre(Long chambreId) {
        return ChambreRepsoitory.findById(chambreId).get();
    }
    @Override
    public Chambre addChambre(Chambre c) {
        return ChambreRepsoitory.save(c);
    }
    @Override
    public void removeChambre(Long chambreId) {
        ChambreRepsoitory.deleteById(chambreId);
    }
    @Override
    public Chambre modifyChambre(Chambre chambre) {
        return ChambreRepsoitory.save(chambre);
    }
}
