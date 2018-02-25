package dhbw.javaee.Entity;

import java.util.Date;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class NachrichtEntity implements Serializable {

   
    @Id
    @GeneratedValue
    private long id = 0;
    private String betreff = "";
    private String text ="";
    private Date datum;
    private String zeit ="";
    //FK artikel id, Sender, Empfänger

    public long getId() {
        return id;
    }

    public String getBetreff() {
        return betreff;
    }

    public String getText() {
        return text;
    }

    public Date getDatum() {
        return datum;
    }

    public String getZeit() {
        return zeit;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBetreff(String betreff) {
        this.betreff = betreff;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public void setZeit(String zeit) {
        this.zeit = zeit;
    }

 
    @ManyToOne //mehrere Nachrichten beziehen sich auf einen Artikel
    BenutzerEntity benutzer = new BenutzerEntity();

    @ManyToOne //mehrere Nachrichten senden/empfangen Benutzer
    BenutzerEntity benutzer2 = new BenutzerEntity();

    
    //Konstruktoren
    
    
}
