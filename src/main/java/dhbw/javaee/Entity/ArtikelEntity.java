package dhbw.javaee.Entity;

import java.util.Date;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class ArtikelEntity implements Serializable {

    
    @Id
    @GeneratedValue
    private long id=0;
    
    private String beschreibung;
    private String titel;
    private double preis;
    private Date datum;
    private String artDesPreis;
    private int anzahlBesucher;
   // private String ort; private String verkaeufer; private String kategorie;?

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public void setArtDesPreis(String artDesPreis) {
        this.artDesPreis = artDesPreis;
    }

    public void setAnzahlBesucher(int anzahlBesucher) {
        this.anzahlBesucher = anzahlBesucher;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public String getTitel() {
        return titel;
    }

    public double getPreis() {
        return preis;
    }

    public String getArtDesPreis() {
        return artDesPreis;
    }

    public int getAnzahlBesucher() {
        return anzahlBesucher;
    }
          
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Date getDatum() {
        return datum;
    }

    
    //Beziehung zu anderen Objekten
    @ManyToOne //mehrere Artikel haben eine Kategorie
    KategorieEntity kategorie = new KategorieEntity();
    
    @ManyToOne //mehrere Artikel kann ein Benutzer verkaufen
    BenutzerEntity benutzer = new BenutzerEntity();
    
    @ManyToOne //mehre Artikel befinden sich an einem Ort
    OrtEntity ort = new OrtEntity();
    
    @ManyToMany //mehrere Benutzer merken sich mehrere Artikel
    List<BenutzerEntity> benutzerList = new ArrayList<>();
    
    @OneToMany // ein Artikel hat mehrere Bilder
    List<BildEntity> bildList= new ArrayList<>();
        
    @OneToMany //mehrere Nachrichten beziehen sich auf einen Artikel
    List<NachrichtEntity> nachrichtList = new ArrayList<>();
    
    
    
    
    
    
    
    
    

    
}
