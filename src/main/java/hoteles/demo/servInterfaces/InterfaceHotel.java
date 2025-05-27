package hoteles.demo.servInterfaces;

import hoteles.demo.dto.HotelDTO;
import hoteles.demo.entity.EntityHotel;

import java.util.List;

public interface InterfaceHotel {

    //    1. Registrar un nuevo hotel.
    HotelDTO registrarHotel(HotelDTO hotelDTO);

    //    5. Listar todos los hoteles.
    List<HotelDTO> listarTodosLosHoteles();

    //    6. Búsqueda de hotel por localidad, categoría o por ambos parámetros.
    List<HotelDTO> BusquedaPorLocalidadCategoria(String localidad, String categoria);


}
