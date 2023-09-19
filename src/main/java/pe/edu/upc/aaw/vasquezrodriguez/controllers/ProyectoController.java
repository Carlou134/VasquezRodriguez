package pe.edu.upc.aaw.vasquezrodriguez.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.vasquezrodriguez.dtos.ProyectoDTO;
import pe.edu.upc.aaw.vasquezrodriguez.dtos.VrTypeProyectoDTO;
import pe.edu.upc.aaw.vasquezrodriguez.entities.Proyecto;
import pe.edu.upc.aaw.vasquezrodriguez.servicesinterfaces.IProyectoService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/vasquez")
public class ProyectoController {
    @Autowired
    private IProyectoService vrPs;
    //Registrar
    @PostMapping("/registrar")
    public void registrar(@RequestBody ProyectoDTO vrdto) {
        ModelMapper vrm = new ModelMapper();
        Proyecto vrp = vrm.map(vrdto, Proyecto.class);
        vrPs.insert(vrp);
    }
    //listar
    @GetMapping("/listar")
    public List<ProyectoDTO> listar() {
        return vrPs.vrlist().stream().map(x->{
            ModelMapper vrm=new ModelMapper();
            return vrm.map(x,ProyectoDTO.class);
        }).collect(Collectors.toList());
    }
    //Buscar por nombre del proyecto
    @PostMapping("/buscar")
    public List<ProyectoDTO> buscar(@RequestBody String vrname) {
        return vrPs.findProyectoByVrname(vrname).stream().map(x->{
            ModelMapper vrm=new ModelMapper();
            return vrm.map(x,ProyectoDTO.class);
        }).collect(Collectors.toList());
    }

    //visualizar la cantidad de proyectos de tipo tecnológico.
    @GetMapping("/cantidadtipostecnologicoporproyecto")
    public List<VrTypeProyectoDTO> cantidadTiposTecnologicoporProyecto(){
        List<String[]> vrlista = vrPs.quantityVrTypebyProyecto();
        List<VrTypeProyectoDTO> vrlistaDTO = new ArrayList<>();
        for (String[] data:vrlista){
            VrTypeProyectoDTO vrdto = new VrTypeProyectoDTO();
            vrdto.setVrtype(data[0]);
            vrdto.setVrquantityProyecto(Integer.parseInt(data[1]));
            vrlistaDTO.add(vrdto);
        }
        return vrlistaDTO;
    }
}
