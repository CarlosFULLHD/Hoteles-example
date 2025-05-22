package hoteles.demo.controller;

import hoteles.demo.dto.HotelDTO;
import hoteles.demo.servImplements.HotelImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hoteles")
public class HotelController {

    //localhost:8080/hoteles
    @Autowired
    private final HotelImpl hotelimpl;
    @Autowired
    public HotelController(HotelImpl hotelimpl) {
        this.hotelimpl = hotelimpl;
    }

    //    1. Registrar un nuevo hotel.

    @PostMapping
    public ResponseEntity<?> registrarHotel(HotelDTO hotel) {
        hotelimpl.registrarHotel(hotel);
        return ResponseEntity.ok("Hotel agregado exitosamente");
    }

    //    5. Listar todos los hoteles.


    //    6. Búsqueda de hotel por localidad, categoría o por ambos parámetros.




}
