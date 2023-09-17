package pe.edu.upc.aaw.vasquezrodriguez.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.vasquezrodriguez.dtos.VehiculosDTO;
import pe.edu.upc.aaw.vasquezrodriguez.dtos.VrTypeVehiculoDTO;
import pe.edu.upc.aaw.vasquezrodriguez.entities.Vehiculos;
import pe.edu.upc.aaw.vasquezrodriguez.servicesinterfaces.IVehiculosService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/vasquezB")
public class VehiculosController {
    @Autowired
    private IVehiculosService vrVs;
    //Registrar
    @PostMapping
    public void registrar(@RequestBody VehiculosDTO vrdto) {
        ModelMapper vrm = new ModelMapper();
        Vehiculos vrp = vrm.map(vrdto, Vehiculos.class);
        vrVs.insert(vrp);
    }
    //listar
    @GetMapping
    public List<VehiculosDTO> listar() {
        return vrVs.vrlist().stream().map(x->{
            ModelMapper vrm=new ModelMapper();
            return vrm.map(x,VehiculosDTO.class);
        }).collect(Collectors.toList());
    }
    //buscar el vehículo por su modelo
    @PostMapping("/buscar")
    public List<VehiculosDTO> buscar(@RequestBody String vrModel) {
        return vrVs.findProyectoByVrModel(vrModel).stream().map(x->{
            ModelMapper vrm=new ModelMapper();
            return vrm.map(x,VehiculosDTO.class);
        }).collect(Collectors.toList());
    }
    //cantidad de vehículos de tipo deportivo
    @GetMapping("/cantidadtiposdeportivoporvehiculo")
    public List<VrTypeVehiculoDTO> cantidadTiposDeportivoporVehiculo(){
        List<String[]> vrlista = vrVs.quantityVrTypebyVehiculo();
        List<VrTypeVehiculoDTO> vrlistaDTO = new ArrayList<>();
        for (String[] data:vrlista){
            VrTypeVehiculoDTO vrdto = new VrTypeVehiculoDTO();
            vrdto.setVr_type(data[0]);
            vrdto.setVrquantityVehiculos(Integer.parseInt(data[1]));
            vrlistaDTO.add(vrdto);
        }
        return vrlistaDTO;
    }
}
