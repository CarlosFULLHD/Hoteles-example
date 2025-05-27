package hoteles.demo.controller;

import hoteles.demo.dto.HotelDTO;
import hoteles.demo.entity.EntityHotel;
import hoteles.demo.servImplements.HotelImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    //POST localhost:8080/hoteles
    @PostMapping
    public ResponseEntity<HotelDTO> registrarHotel(HotelDTO hotelDTO) {
        HotelDTO hotelController = hotelimpl.registrarHotel(hotelDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelController);
    }

    //GET localhost:8080/hoteles
    //    5. Listar todos los hoteles.
    @GetMapping
    public ResponseEntity<List<HotelDTO>> listarHoteles() {
        List<HotelDTO> listaHotelesController = hotelimpl.listarTodosLosHoteles();
        if (listaHotelesController == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(listaHotelesController);
    }

    //    6. Búsqueda de hotel por localidad, categoría o por ambos parámetros. (required = false)


    //GET localhost:8080/hoteles/busqueda
                                        //?localidad=Madrid
                                        //?categoria=5_estrellas
                                        //?localidad=Madrid&categoria=5_estrellas
    @GetMapping("/busqueda")
    public ResponseEntity<List<HotelDTO>> listarHotelesBusqueda(
        // Al pasarle los parametros el required = false, hace que sea opcional pasar un parametro o los 2 juntos
        @RequestParam(value = "localidad", required = false) String localidad,
        @RequestParam(value = "categoria", required = false) String categoria) {
        List<HotelDTO> listaHotelesControllerBusqueda = hotelimpl.BusquedaPorLocalidadCategoria(localidad, categoria);
        if (listaHotelesControllerBusqueda == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(listaHotelesControllerBusqueda);
    }

}
