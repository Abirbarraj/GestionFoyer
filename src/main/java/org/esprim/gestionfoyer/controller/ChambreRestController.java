package org.esprim.gestionfoyer.controller;

import lombok.AllArgsConstructor;
import org.esprim.gestionfoyer.entities.Chambre;
import org.esprim.gestionfoyer.service.IChambreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Chambre")
public class ChambreRestController {

    IChambreService ChambreService;

    //http://localhost:8083/tpGestiondeschambre/retrieve-all-chambres
    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> retrieveAllChambres() {
        List<Chambre> chambreList = ChambreService.retrieveAllChambres();
        return chambreList;
    }

    //http://localhost:8083/tpGestiondeschambre/retrieve-chambres/8
    @GetMapping("/retrive-chambre/{chambre-id")
    public Chambre retrieveChambre(@PathVariable ("chambreid") Long chId /*,@PathVariable another variable*/){
     Chambre chambre= ChambreService.retrieveChambre(chId);
        return chambre;
    }

    //http://localhost:8083/tpGestiondeschambre/chambre/add-chambre
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = ChambreService.addChambre(c);
        return chambre;
    }

    //http://localhost:8083/tpGestiondeschambre/remove-chambres/8
    @DeleteMapping("/remove-chambre/{chambre-id")
    public void RemoveChambre(@PathVariable ("chambreid") Long chId /*,@PathVariable another variable*/){
        ChambreService.removeChambre(chId);
    }

    //http://localhost:8083/tpGestiondeschambre/retrieve-all-chambres
    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        Chambre chambre = ChambreService.modifyChambre(c);
        return chambre;
    }

}
