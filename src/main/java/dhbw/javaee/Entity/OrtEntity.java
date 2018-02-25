package dhbw.javaee.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class OrtEntity implements Serializable {

    
    @Id
    @GeneratedValue
    private long id = 0;
    private int plz;
    private String name;
    private String land;
    private double aktiv;

    public long getId() {
        return id;
    }

    public int getPlz() {
        return plz;
    }

    public String getName() {
        return name;
    }

    public String getLand() {
        return land;
    }

    public double getAktiv() {
        return aktiv;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public void setAktiv(double aktiv) {
        this.aktiv = aktiv;
    }
    
    
    @OneToMany(mappedBy = "ort") //ein Ort hat mehrere Benutzer
    List<OrtEntity> ortList = new ArrayList<>();
    
    @OneToMany (mappedBy ="artikel") // an einem Ort werden mehrere Artikel angeboten
    List<OrtEntity> ortList2 = new ArrayList<>();

    
    
}
