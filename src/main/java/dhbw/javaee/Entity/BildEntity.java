package dhbw.javaee.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class BildEntity implements Serializable {

   
    @Id
    @GeneratedValue
    private long id = 0;
    private String bezeichnung = "";
    private String bilddaten= "";

    public long getId() {
        return id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public String getBilddaten() {
        return bilddaten;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void setBilddaten(String bilddaten) {
        this.bilddaten = bilddaten;
    }
    
    
    @ManyToOne //mehrere Bilder gehören zu einem Artikel
    ArtikelEntity artikel = new ArtikelEntity();
    
    
}
