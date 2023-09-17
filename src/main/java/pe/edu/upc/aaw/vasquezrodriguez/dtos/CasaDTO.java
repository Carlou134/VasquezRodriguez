package pe.edu.upc.aaw.vasquezrodriguez.dtos;

import java.time.LocalDate;

public class CasaDTO {
    private int vrId;
    private String vradress;
    private int vrsquaremeter;
    private int vrnumberRooms;
    private LocalDate vrRegisterDate;
    private float vrprice;

    public int getVrId() {
        return vrId;
    }

    public void setVrId(int vrId) {
        this.vrId = vrId;
    }

    public String getVradress() {
        return vradress;
    }

    public void setVradress(String vradress) {
        this.vradress = vradress;
    }

    public int getVrsquaremeter() {
        return vrsquaremeter;
    }

    public void setVrsquaremeter(int vrsquaremeter) {
        this.vrsquaremeter = vrsquaremeter;
    }

    public int getVrnumberRooms() {
        return vrnumberRooms;
    }

    public void setVrnumberRooms(int vrnumberRooms) {
        this.vrnumberRooms = vrnumberRooms;
    }

    public LocalDate getVrRegisterDate() {
        return vrRegisterDate;
    }

    public void setVrRegisterDate(LocalDate vrRegisterDate) {
        this.vrRegisterDate = vrRegisterDate;
    }

    public float getVrprice() {
        return vrprice;
    }

    public void setVrprice(float vrprice) {
        this.vrprice = vrprice;
    }
}
