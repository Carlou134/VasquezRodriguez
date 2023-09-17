package pe.edu.upc.aaw.vasquezrodriguez.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Casa")
public class Casa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vrId;
    @Column(name = "vradress", length = 100, nullable = false)
    private String vradress;
    @Column(name = "vrsquaremeter", nullable = false)
    private int vrsquaremeter;
    @Column(name = "vrnumberRooms", nullable = false)
    private int vrnumberRooms;
    @Column(name = "vrRegisterDate", nullable = false)
    private LocalDate vrRegisterDate;
    @Column(name = "vrprice", nullable = false)
    private float vrprice;

    public Casa() {
    }

    public Casa(int vrId, String vradress, int vrsquaremeter, int vrnumberRooms, LocalDate vrRegisterDate, float vrprice) {
        this.vrId = vrId;
        this.vradress = vradress;
        this.vrsquaremeter = vrsquaremeter;
        this.vrnumberRooms = vrnumberRooms;
        this.vrRegisterDate = vrRegisterDate;
        this.vrprice = vrprice;
    }

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
