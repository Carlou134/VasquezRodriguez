package pe.edu.upc.aaw.vasquezrodriguez.dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class VehiculosDTO {
    private int vrId;
    private String vrlicenseplate;
    private String vrType;
    private LocalDate vrFabricationDate;
    private LocalDate vrDateOfPurchase;
    private String vrModel;

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
