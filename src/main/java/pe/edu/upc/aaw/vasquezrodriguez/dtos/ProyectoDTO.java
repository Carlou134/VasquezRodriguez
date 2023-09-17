package pe.edu.upc.aaw.vasquezrodriguez.dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class ProyectoDTO {
    private int vrId;
    private String vrname;
    private String vrType;
    private LocalDate vrdateStart;
    private LocalDate vrdateEnd;
    private String vrStatus;

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
