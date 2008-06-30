package smartPMS.transfer;

import java.io.Serializable;


public class TeilnahmeVO implements Serializable {

    // Assoziationen (Primary Key)

    private long studentId;

    private long klausurId;

    //
    private double note;

    private int versuch;

    /**
     *
     */
    public TeilnahmeVO() {
    }

    public TeilnahmeVO(long studentId, long klausurId, double note, int versuch) {
        this.studentId = studentId;
        this.klausurId = klausurId;
        this.note = note;
        this.versuch = versuch;
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
