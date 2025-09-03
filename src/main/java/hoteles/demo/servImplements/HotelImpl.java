package hoteles.demo.servImplements;


import hoteles.demo.dto.HotelDTO;
import hoteles.demo.entity.EntityHotel;
import hoteles.demo.repository.HotelRepository;
import hoteles.demo.servInterfaces.InterfaceHotel;
import jakarta.validation.constraints.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HotelImpl implements InterfaceHotel {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public HotelDTO registrarHotel(HotelDTO hotelDTO) {
        EntityHotel entityHotel = new EntityHotel();
        entityHotel.setNombre(hotelDTO.getNombre());
        entityHotel.setDescripcion(hotelDTO.getDescripcion());
        entityHotel.setCategoria(hotelDTO.getCategoria());
        entityHotel.setPiscina(hotelDTO.getPiscina());
        entityHotel.setLocalidad(hotelDTO.getLocalidad());

        EntityHotel hotelguardado = hotelRepository.save(entityHotel);

        HotelDTO hotelDTOResponse = new HotelDTO();
        hotelDTOResponse.setNombre(hotelguardado.getNombre());
        hotelDTOResponse.setDescripcion(hotelguardado.getDescripcion());
        hotelDTOResponse.setCategoria(hotelguardado.getCategoria());
        hotelDTOResponse.setPiscina(hotelguardado.getPiscina());
        hotelDTOResponse.setLocalidad(hotelguardado.getLocalidad());

       return hotelDTOResponse;
    }



    // List<HotelDTO> es la plantilla o clase por la cual a partir de esta creamos una lsita vacia hotelDTOLists
    // hacemos hoteles.stream, porque estamos usando la lista de hoteles de la base de datos List<EntityHotel>
    // para mapear 1 a 1 con cada plantilla o clase HotelDTO y guardarlo al final como una List<HotelDTO>

    @Override
    public List<HotelDTO> listarTodosLosHoteles() {
        List<EntityHotel> hoteles = hotelRepository.findAll();
        //[ EntityHotel,EntityHotel,EntityHotel,EntityHotel ] --> [ HotelDTO,HotelDTO,HotelDTO,HotelDTO ]

        List<HotelDTO> hotelDTOLists = hoteles.stream() // el stream nos deja usar metodos .map, filter, etc
                .map(i -> new HotelDTO( // lambda (i actua como auxiliar, parecido a un for)
                        // HotelDTO seria nuestra entidad objetivo a convertir con el .map
                        i.getNombre(),
                        i.getDescripcion(),
                        i.getCategoria(),
                        i.getPiscina(),
                        i.getLocalidad()
                )).collect(Collectors.toList());
            Collections.reverse(hotelDTOLists);
        //return List<HotelDTO>
        return hotelDTOLists;
    }

    //        List<HotelDTO> resultados = new ArrayList<>();
//        List<EntityHotel> listaDtoLocalidadYCategoria = hotelRepository.findAll();
//        for (EntityHotel i : listaDtoLocalidadYCategoria) {
//
//
//        }

    @Override
    public List<HotelDTO> BusquedaPorLocalidadCategoria(String localidad, String categoria) {
        List<EntityHotel> listaHoteles;
        if(localidad !=null && categoria != null) {
            listaHoteles = hotelRepository.findByLocalidadAndCategoria(localidad, categoria);
            // List<EntityHotel>
        } else if (localidad != null) {
            listaHoteles = hotelRepository.findByLocalidad(localidad);
        } else if (categoria != null) {
            listaHoteles = hotelRepository.findByCategoria(categoria);
        } else {
            return List.of();// Lista vacia
        }
        List<HotelDTO> hotelDTOLists = listaHoteles.stream()
                .map(i -> new HotelDTO(
                        i.getNombre(),
                        i.getDescripcion(),
                        i.getCategoria(),
                        i.getPiscina(),
                        i.getLocalidad()
                )).collect(Collectors.toList());
            Collections.reverse(hotelDTOLists);
        return hotelDTOLists;
    }
}
