package hoteles.demo.servInterfaces;

import hoteles.demo.dto.HabitacionDTO;
import hoteles.demo.dto.ResumenHabitacionesDTO;

public interface InterfaceHabitacion {

    /*
    2. Registrar una nueva habitación en un hotel. Tener en cuenta que debemos comprobar si el
    hotel existe, antes de insertar la nueva habitación.
    3. Eliminar una habitación determinada de un hotel.
    4. Modificar una habitación para indicar que está ocupada.
    Métodos específicos:
    7. Listar todas las habitaciones de un hotel determinado.
    8. Listar todas las habitaciones libres de un hotel determinado.
*/
    HabitacionDTO crearHabitacion(HabitacionDTO habitacionDTO);

    void eliminarHabitacion(Long id_habitacion);

    // Endpoint para obtener todas las habitaciones ocupadas y no ocupadas
    ResumenHabitacionesDTO obtenerResumenHabitaciones();

}
