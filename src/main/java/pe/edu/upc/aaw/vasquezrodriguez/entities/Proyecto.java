package pe.edu.upc.aaw.vasquezrodriguez.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Proyecto")
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vrId;
    @Column(name = "vrname", length = 50, nullable = false)
    private String vrname;
    @Column(name = "vrType", length = 50, nullable = false)
    private String vrType;
    @Column(name = "vrdateStart", nullable = false)
    private LocalDate vrdateStart;
    @Column(name = "vrdateEnd", nullable = false)
    private LocalDate vrdateEnd;
    @Column(name = "vrStatus", length = 50, nullable = false)
    private String vrStatus;

    public Proyecto() {
    }

    public Proyecto(int vrId, String vrname, String vrType, LocalDate vrdateStart, LocalDate vrdateEnd, String vrStatus) {
        this.vrId = vrId;
        this.vrname = vrname;
        this.vrType = vrType;
        this.vrdateStart = vrdateStart;
        this.vrdateEnd = vrdateEnd;
        this.vrStatus = vrStatus;
    }

    public int getVrId() {
        return vrId;
    }

    public void setVrId(int vrId) {
        this.vrId = vrId;
    }

    public String getVrname() {
        return vrname;
    }

    public void setVrname(String vrname) {
        this.vrname = vrname;
    }

    public String getVrType() {
        return vrType;
    }

    public void setVrType(String vrType) {
        this.vrType = vrType;
    }

    public LocalDate getVrdateStart() {
        return vrdateStart;
    }

    public void setVrdateStart(LocalDate vrdateStart) {
        this.vrdateStart = vrdateStart;
    }

    public LocalDate getVrdateEnd() {
        return vrdateEnd;
    }

    public void setVrdateEnd(LocalDate vrdateEnd) {
        this.vrdateEnd = vrdateEnd;
    }

    public String getVrStatus() {
        return vrStatus;
    }

    public void setVrStatus(String vrStatus) {
        this.vrStatus = vrStatus;
    }
}
