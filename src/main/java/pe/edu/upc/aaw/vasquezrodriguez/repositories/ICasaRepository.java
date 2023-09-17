package pe.edu.upc.aaw.vasquezrodriguez.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.vasquezrodriguez.entities.Casa;

import java.util.List;

@Repository
public interface ICasaRepository extends JpaRepository<Casa, Integer> {
    //buscar por direccion
    List<Casa> findCasaByVradress(String vradress);
    //cantidad total de casas cuya cantidad de cuartos es 3
    @Query(value = "SELECT vrnumber_rooms, COUNT(vr_id)\n" +
            "FROM casa\n" +
            "WHERE vrnumber_rooms = 3\n" +
            "GROUP BY vrnumber_rooms",nativeQuery = true)
    public List<String[]> quantityVrnumber_roomsbyCasa();
}
