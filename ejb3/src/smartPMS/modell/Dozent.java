package smartPMS.modell;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 26.05.2008
 * Time: 11:58:49
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "dozent")
@DiscriminatorValue("D")
public class Dozent extends Person {

    private String titel;

    private String buero;

    private Collection<Lehrangebot> lehrangebot;

    @Column(name = "titel", length = 20)
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    @Column(name = "buero", length = 20)
    public String getBuero() {
        return buero;
    }

    public void setBuero(String buero) {
        this.buero = buero;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dozent")
    public Collection<Lehrangebot> getLehrangebot() {
        return lehrangebot;
    }

    public void setLehrangebot(Collection<Lehrangebot> lehrangebot) {
        this.lehrangebot = lehrangebot;
    }
}
