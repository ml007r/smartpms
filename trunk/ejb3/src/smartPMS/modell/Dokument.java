package smartPMS.modell;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Marcel
 * Date: 26.05.2008
 * Time: 12:01:16
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "DOKUMENT")
public class Dokument implements Serializable {

    private long id;

    private String name;

    private String typ;

    private Date datum;

    private int version;

    private byte[] daten;

    private Lehrangebot lehrangebot;

    protected Dokument() {
    }

    public Dokument(String name, String typ, byte[] daten, Lehrangebot lehrangebot) {
        this.name = name;
        this.typ = typ;
        this.daten = daten;
        this.lehrangebot = lehrangebot;
        this.datum = new Date();
        this.version = 1;
    }

    public Dokument(String name, String typ, Date datum, int version, byte[] daten, Lehrangebot lehrangebot) {
        this.name = name;
        this.typ = typ;
        this.datum = datum;
        this.version = version;
        this.daten = daten;
        this.lehrangebot = lehrangebot;
    }

    public Dokument(long id, String name, String typ, Date datum, int version, byte[] daten, Lehrangebot lehrangebot) {
        this.id = id;
        this.name = name;
        this.typ = typ;
        this.datum = datum;
        this.version = version;
        this.daten = daten;
        this.lehrangebot = lehrangebot;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dokumentId")
    @SequenceGenerator(name = "dokumentId", sequenceName = "SEQ_DOKUMENT_ID", allocationSize = 1)
    @Column(name = "ID", precision = 10, scale = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "NAME", length = 150, nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "TYP", length = 150, nullable = false)
    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DATUM")
    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Column(name = "VERSION", precision = 10, scale = 0)
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Lob
    @Column(name = "DATEN")
    public byte[] getDaten() {
        return daten;
    }

    public void setDaten(byte[] daten) {
        this.daten = daten;
    }

    @ManyToOne
    public Lehrangebot getLehrangebot() {
        return lehrangebot;
    }

    public void setLehrangebot(Lehrangebot lehrangebot) {
        this.lehrangebot = lehrangebot;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dokument)) return false;

        Dokument dokument = (Dokument) o;

        if (id != dokument.id) return false;
        if (version != dokument.version) return false;
        if (!Arrays.equals(daten, dokument.daten)) return false;
        if (datum != null ? !datum.equals(dokument.datum) : dokument.datum != null) return false;
        if (lehrangebot != null ? !lehrangebot.equals(dokument.lehrangebot) : dokument.lehrangebot != null)
            return false;
        if (name != null ? !name.equals(dokument.name) : dokument.name != null) return false;
        if (typ != null ? !typ.equals(dokument.typ) : dokument.typ != null) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (typ != null ? typ.hashCode() : 0);
        result = 31 * result + (datum != null ? datum.hashCode() : 0);
        result = 31 * result + version;
        result = 31 * result + (daten != null ? Arrays.hashCode(daten) : 0);
        result = 31 * result + (lehrangebot != null ? lehrangebot.hashCode() : 0);
        return result;
    }
}
