/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbw.javaee.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author ta_st
 */
@Entity
public class BenutzerEntity implements Serializable {


    @Id
    @GeneratedValue
    private String benutzername;
    
    private String email;
    private String passwort;
    private String strasse;
    private String hausnummer;
   // FK  private String ort; 
    private String vorname;
    private String nachname;
    private long telefonnummer;

    public String getBenutzername() {
        return benutzername;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswort() {
        return passwort;
    }

    public String getStrasse() {
        return strasse;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public long getTelefonnummer() {
        return telefonnummer;
    }

    public List<ArtikelEntity> getArtikelList() {
        return artikelList;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setTelefonnummer(long telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public void setArtikelList(List<ArtikelEntity> artikelList) {
        this.artikelList = artikelList;
    }

    
    
    @ManyToMany(mappedBy="benutzerList") // mehrere Bentuzer merken sich mehrere Artikel
    List<ArtikelEntity> artikelList = new ArrayList<>();
    
    @OneToMany (mappedBy = "benutzer")//ein Benutzer verkauft mehrere Artikel
    List<ArtikelEntity> artikelList2 = new ArrayList<>();
    
    @ManyToOne //mehrere Benutzer verkaufen an einem Ort
    OrtEntity ort = new OrtEntity();
    
    @OneToMany(mappedBy ="benutzer")//ein Benutzer sendet/empfängt mehrere Nachrichten
    List<NachrichtEntity> nachrichtList = new ArrayList<>();
    

   
}
