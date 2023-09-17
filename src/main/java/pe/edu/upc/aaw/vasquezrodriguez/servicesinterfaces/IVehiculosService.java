package pe.edu.upc.aaw.vasquezrodriguez.servicesinterfaces;

import pe.edu.upc.aaw.vasquezrodriguez.entities.Vehiculos;

import java.util.List;

public interface IVehiculosService {
    //registrar
    public void insert(Vehiculos vrvehicle);
    //listar
    public List<Vehiculos> vrlist();
    //buscar el vehículo por su modelo
    List<Vehiculos> findProyectoByVrModel(String vrModel);
    //cantidad de vehículos de tipo deportivo
    public List<String[]> quantityVrTypebyVehiculo();
}
