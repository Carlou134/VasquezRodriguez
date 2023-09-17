package pe.edu.upc.aaw.vasquezrodriguez.servicesinterfaces;

import pe.edu.upc.aaw.vasquezrodriguez.entities.Proyecto;

import java.util.List;

public interface IProyectoService {
    //registrar
    public void insert(Proyecto vrproyecto);
    //listar
    public List<Proyecto> vrlist();
    //buscar por nombre
    List<Proyecto> findProyectoByVrname(String vrname);
    //visualizar la cantidad de proyectos de tipo tecnológico.
    public List<String[]> quantityVrTypebyProyecto();
}
