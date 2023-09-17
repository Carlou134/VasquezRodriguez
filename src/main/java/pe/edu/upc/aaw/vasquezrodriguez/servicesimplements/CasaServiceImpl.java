package pe.edu.upc.aaw.vasquezrodriguez.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.vasquezrodriguez.entities.Casa;
import pe.edu.upc.aaw.vasquezrodriguez.entities.Proyecto;
import pe.edu.upc.aaw.vasquezrodriguez.repositories.ICasaRepository;
import pe.edu.upc.aaw.vasquezrodriguez.servicesinterfaces.ICasaService;

import java.util.List;

@Service
public class CasaServiceImpl implements ICasaService {
    @Autowired
    private ICasaRepository vrcR;


    @Override
    public void insert(Casa vrcasa) {
        vrcR.save(vrcasa);
    }

    @Override
    public List<Casa> vrlist() {
        return vrcR.findAll();
    }

    @Override
    public List<Casa> findCasaByVradress(String vradress) {
        return vrcR.findCasaByVradress(vradress);
    }

    @Override
    public List<String[]> quantityVrnumber_roomsbyCasa() {
        return vrcR.quantityVrnumber_roomsbyCasa();
    }
}
