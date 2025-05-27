package hoteles.demo.controller;

import hoteles.demo.dto.ResumenHabitacionesDTO;
import hoteles.demo.repository.HabitacionRepository;
import hoteles.demo.servImplements.HabitacionImpl;
import hoteles.demo.servImplements.HotelImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habitaciones")
public class HabitacionController {

    private HabitacionImpl habitacionImpl;

    // Endpoint para obtener todas las habitaciones ocupadas y no ocupadas
    @GetMapping("/resumen")
    public ResponseEntity<ResumenHabitacionesDTO> obtenerResumenHabitaciones(){
        ResumenHabitacionesDTO resumenDTO = habitacionImpl.obtenerResumenHabitaciones();
        return ResponseEntity.ok(resumenDTO);
    }


//    2. Registrar una nueva habitación en un hotel. Tener en cuenta que debemos comprobar si el
//    hotel existe, antes de insertar la nueva habitación.

//    3. Eliminar una habitación determinada de un hotel.
//    4. Modificar una habitación para indicar que está ocupada.

//    Métodos específicos:

//    7. Listar todas las habitaciones de un hotel determinado.
//    8. Listar todas las habitaciones libres de un hotel determinado.
}
