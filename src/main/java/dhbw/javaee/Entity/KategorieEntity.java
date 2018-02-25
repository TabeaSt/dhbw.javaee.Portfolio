package dhbw.javaee.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class KategorieEntity implements Serializable {

    @Id
    @GeneratedValue
    private long id=0;
    
    private String name="";
    
    //Getter und Setter Methoden

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
       
    //Beziehungen zu anderen Objekten
    @OneToMany (mappedBy="kategorie")
    List<ArtikelEntity> artikel = new ArrayList<>();
    
 
}
