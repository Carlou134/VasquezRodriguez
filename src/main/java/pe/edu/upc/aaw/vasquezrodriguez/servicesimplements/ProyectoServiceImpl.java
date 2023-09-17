package pe.edu.upc.aaw.vasquezrodriguez.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.vasquezrodriguez.entities.Proyecto;
import pe.edu.upc.aaw.vasquezrodriguez.repositories.IProyectoRepository;
import pe.edu.upc.aaw.vasquezrodriguez.servicesinterfaces.IProyectoService;

import java.util.List;

@Service
public class ProyectoServiceImpl implements IProyectoService {
    @Autowired
    private IProyectoRepository vrPr;

    @Override
    public void insert(Proyecto vrproyecto) {
        vrPr.save(vrproyecto);
    }

    @Override
    public List<Proyecto> vrlist() {
        return vrPr.findAll();
    }

    @Override
    public List<Proyecto> findProyectoByVrname(String vrname) {
        return vrPr.findProyectoByVrname(vrname);
    }

    @Override
    public List<String[]> quantityVrTypebyProyecto() {
        return vrPr.quantityVrTypebyProyecto();
    }
}
