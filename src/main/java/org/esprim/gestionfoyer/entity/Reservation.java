package org.esprim.gestionfoyer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Reservation {
    @Id
    private String idReservation;
    private Date anneUniversitaire;
    private boolean estValide ;
}
