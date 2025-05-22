package hoteles.demo.servImplements;


import hoteles.demo.dto.HotelDTO;
import hoteles.demo.entity.EntityHotel;
import hoteles.demo.repository.HotelRepository;
import hoteles.demo.servInterfaces.InterfaceHotel;
import jakarta.validation.constraints.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelImpl implements InterfaceHotel {

    @Autowired
    private final HotelRepository hotelRepository;
    @Autowired

    public HotelImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void registrarHotel(HotelDTO hotel) {
        EntityHotel entityHotel = new EntityHotel();
        entityHotel.setNombre(hotel.getNombre());
        entityHotel.setDescripcion(hotel.getDescripcion());
        entityHotel.setCategoria(hotel.getCategoria());
        entityHotel.setPiscina(hotel.getPiscina());
        entityHotel.setLocalidad(hotel.getLocalidad());
        hotelRepository.save(entityHotel);
    }



    @Override
    public List<HotelDTO> listarTodosLosHoteles() {
        return List.of();
    }

    @Override
    public List<HotelDTO> BusquedaPorLocalidadCategoria(String localidad, String categoria) {
        return List.of();
    }
}
