package pe.edu.upc.aaw.vasquezrodriguez.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Vehiculos")
public class Vehiculos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vrId;
    @Column(name = "vrlicenseplate", length = 50, nullable = false)
    private String vrlicenseplate;
    @Column(name = "vrType", length = 50, nullable = false)
    private String vrType;
    @Column(name = "vrFabricationDate", nullable = false)
    private LocalDate vrFabricationDate;
    @Column(name = "vrDateOfPurchase", nullable = false)
    private LocalDate vrDateOfPurchase;
    @Column(name = "vrModel", length = 50, nullable = false)
    private String vrModel;

    public Vehiculos() {
    }

    public Vehiculos(int vrId, String vrlicenseplate, String vrType, LocalDate vrFabricationDate, LocalDate vrDateOfPurchase, String vrModel) {
        this.vrId = vrId;
        this.vrlicenseplate = vrlicenseplate;
        this.vrType = vrType;
        this.vrFabricationDate = vrFabricationDate;
        this.vrDateOfPurchase = vrDateOfPurchase;
        this.vrModel = vrModel;
    }

    public int getVrId() {
        return vrId;
    }

    public void setVrId(int vrId) {
        this.vrId = vrId;
    }

    public String getVrlicenseplate() {
        return vrlicenseplate;
    }

    public void setVrlicenseplate(String vrlicenseplate) {
        this.vrlicenseplate = vrlicenseplate;
    }

    public String getVrType() {
        return vrType;
    }

    public void setVrType(String vrType) {
        this.vrType = vrType;
    }

    public LocalDate getVrFabricationDate() {
        return vrFabricationDate;
    }

    public void setVrFabricationDate(LocalDate vrFabricationDate) {
        this.vrFabricationDate = vrFabricationDate;
    }

    public LocalDate getVrDateOfPurchase() {
        return vrDateOfPurchase;
    }

    public void setVrDateOfPurchase(LocalDate vrDateOfPurchase) {
        this.vrDateOfPurchase = vrDateOfPurchase;
    }

    public String getVrModel() {
        return vrModel;
    }

    public void setVrModel(String vrModel) {
        this.vrModel = vrModel;
    }
}
