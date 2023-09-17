package pe.edu.upc.aaw.vasquezrodriguez.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.vasquezrodriguez.entities.Vehiculos;

import java.util.List;

@Repository
public interface IVehiculosRepository extends JpaRepository<Vehiculos, Integer> {
    //buscar el vehículo por su modelo
    List<Vehiculos> findProyectoByVrModel(String vrModel);
    //cantidad de vehículos de tipo deportivo
    @Query(value = "SELECT vr_type, COUNT(vr_id)\n" +
            "FROM vehiculos\n" +
            "WHERE vr_type = 'deportivo'\n" +
            "GROUP BY vr_type",nativeQuery = true)
    public List<String[]> quantityVrTypebyVehiculo();
}
