package smartPMS.transfer;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: tbs
 * Date: 31.05.2008
 * Time: 10:32:19
 * To change this template use File | Settings | File Templates.
 */
public class TeilnahmeVO implements Serializable {

    private long id;

    private double note;

    private int versuch;

    // Assoziationen

    private long studentId;

    private long klausurId;

    /**
     *
     */
    public TeilnahmeVO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public int getVersuch() {
        return versuch;
    }

    public void setVersuch(int versuch) {
        this.versuch = versuch;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getKlausurId() {
        return klausurId;
    }

    public void setKlausurId(long klausurId) {
        this.klausurId = klausurId;
    }
}
