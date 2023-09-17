package pe.edu.upc.aaw.vasquezrodriguez.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.vasquezrodriguez.entities.Proyecto;


import java.util.List;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto, Integer> {
    //buscar por nombre
    List<Proyecto> findProyectoByVrname(String vrname);

    //cantidad de proyectos de tipo tecnológico.
    @Query(value = "SELECT vr_type, COUNT(vr_id)\n" +
            "FROM proyecto\n" +
            "WHERE vr_type = 'tecnológico'\n" +
            "GROUP BY vr_type",nativeQuery = true)
    public List<String[]> quantityVrTypebyProyecto();
}
