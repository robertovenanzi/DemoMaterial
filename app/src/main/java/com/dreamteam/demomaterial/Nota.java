package com.dreamteam.demomaterial;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Roberto on 06/01/2016.
 */
public class Nota {

    UUID notaID;
    String titolo;
    String dettaglio;
    Date dataCreazione;

    public Nota() {
        notaID = UUID.randomUUID();
        dataCreazione = new Date();
    }

    public Nota(String titolo, String dettaglio) {
        notaID = UUID.randomUUID();
        dataCreazione = new Date();
        this.titolo = titolo;
        this.dettaglio = dettaglio;
    }

    public UUID getNotaID() {
        return notaID;
    }

    public void setNotaID(UUID notaID) {
        this.notaID = notaID;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDettaglio() {
        return dettaglio;
    }

    public void setDettaglio(String dettaglio) {
        this.dettaglio = dettaglio;
    }

    public Date getDataCreazione() {
        return dataCreazione;
    }

    public void setDataCreazione(Date dataCreazione) {
        this.dataCreazione = dataCreazione;
    }
}
