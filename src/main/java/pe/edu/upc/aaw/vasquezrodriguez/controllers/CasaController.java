package pe.edu.upc.aaw.vasquezrodriguez.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.vasquezrodriguez.dtos.CasaDTO;
import pe.edu.upc.aaw.vasquezrodriguez.dtos.Vrnumber_roomsCasaDTO;
import pe.edu.upc.aaw.vasquezrodriguez.entities.Casa;
import pe.edu.upc.aaw.vasquezrodriguez.servicesinterfaces.ICasaService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/vasquezC")
public class CasaController {
    @Autowired
    private ICasaService vrcS;
    //Registrar
    @PostMapping
    public void registrar(@RequestBody CasaDTO vrdto) {
        ModelMapper vrm = new ModelMapper();
        Casa vrp = vrm.map(vrdto, Casa.class);
        vrcS.insert(vrp);
    }
    //listar
    @GetMapping
    public List<CasaDTO> listar() {
        return vrcS.vrlist().stream().map(x->{
            ModelMapper vrm=new ModelMapper();
            return vrm.map(x,CasaDTO.class);
        }).collect(Collectors.toList());
    }
    //buscar por direccion de la casa
    @PostMapping("/buscar")
    public List<CasaDTO> buscar(@RequestBody String vraddress) {
        return vrcS.findCasaByVradress(vraddress).stream().map(x->{
            ModelMapper vrm=new ModelMapper();
            return vrm.map(x,CasaDTO.class);
        }).collect(Collectors.toList());
    }
    //cantidad total de casas cuya cantidad de cuartos es 3
    @GetMapping("/cantidadcuartosporcasa")
    public List<Vrnumber_roomsCasaDTO> cantidadCuartosporCasa(){
        List<String[]> vrlista = vrcS.quantityVrnumber_roomsbyCasa();
        List<Vrnumber_roomsCasaDTO> vrlistaDTO = new ArrayList<>();
        for (String[] data:vrlista){
            Vrnumber_roomsCasaDTO vrdto = new Vrnumber_roomsCasaDTO();
            vrdto.setVrnumber_rooms(Integer.parseInt(data[0]));
            vrdto.setVrquantityCasas(Integer.parseInt(data[1]));
            vrlistaDTO.add(vrdto);
        }
        return vrlistaDTO;
    }
}
