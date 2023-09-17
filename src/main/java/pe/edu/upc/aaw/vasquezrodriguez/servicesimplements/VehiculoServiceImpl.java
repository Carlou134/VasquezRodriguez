package pe.edu.upc.aaw.vasquezrodriguez.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.vasquezrodriguez.entities.Vehiculos;
import pe.edu.upc.aaw.vasquezrodriguez.repositories.IVehiculosRepository;
import pe.edu.upc.aaw.vasquezrodriguez.servicesinterfaces.IVehiculosService;

import java.util.List;

@Service
public class VehiculoServiceImpl implements IVehiculosService {
    @Autowired
    private IVehiculosRepository vrVr;
    @Override
    public void insert(Vehiculos vrvehicle) {
        vrVr.save(vrvehicle);
    }

    @Override
    public List<Vehiculos> vrlist() {
        return vrVr.findAll();
    }

    @Override
    public List<Vehiculos> findProyectoByVrModel(String vrModel) {
        return vrVr.findProyectoByVrModel(vrModel);
    }

    @Override
    public List<String[]> quantityVrTypebyVehiculo() {
        return vrVr.quantityVrTypebyVehiculo();
    }
}
