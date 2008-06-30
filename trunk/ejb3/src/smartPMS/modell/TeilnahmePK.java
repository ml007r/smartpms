package smartPMS.modell;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 06.06.2008
 * Time: 11:35:43
 * To change this template use File | Settings | File Templates.
 */
@Embeddable
public class TeilnahmePK implements Serializable {

    private long studentId;

    private long klausurId;

    public TeilnahmePK() {
    }

    @Column(name = "STUDENT")
    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    @Column(name = "KLAUSUR")
    public long getKlausurId() {
        return klausurId;
    }

    public void setKlausurId(long klausurId) {
        this.klausurId = klausurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeilnahmePK)) return false;

        TeilnahmePK that = (TeilnahmePK) o;

        if (klausurId != that.klausurId) return false;
        if (studentId != that.studentId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        result = (int) (studentId ^ (studentId >>> 32));
        result = 31 * result + (int) (klausurId ^ (klausurId >>> 32));
        return result;
    }
}

