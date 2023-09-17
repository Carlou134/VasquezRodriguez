package pe.edu.upc.aaw.vasquezrodriguez.servicesinterfaces;

import pe.edu.upc.aaw.vasquezrodriguez.entities.Casa;
import pe.edu.upc.aaw.vasquezrodriguez.entities.Proyecto;

import java.util.List;

public interface ICasaService {
    //registrar
    public void insert(Casa vrcasa);
    //listar
    public List<Casa> vrlist();
    //buscar por direccion
    List<Casa> findCasaByVradress(String vradress);
    //cantidad total de casas cuya cantidad de cuartos es 3
    public List<String[]> quantityVrnumber_roomsbyCasa();
}
