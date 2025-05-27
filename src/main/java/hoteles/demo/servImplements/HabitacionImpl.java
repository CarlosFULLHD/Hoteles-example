package hoteles.demo.servImplements;

import hoteles.demo.dto.HabitacionDTO;
import hoteles.demo.dto.ResumenHabitacionesDTO;
import hoteles.demo.entity.EntityHabitacion;
import hoteles.demo.repository.HabitacionRepository;
import hoteles.demo.servInterfaces.InterfaceHabitacion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitacionImpl implements InterfaceHabitacion {

    private HabitacionRepository habitacionRepository;


    @Override
    public HabitacionDTO crearHabitacion(HabitacionDTO habitacionDTO) {
        return null;
    }

    @Override
    public void eliminarHabitacion(Long id_habitacion) {

    }

    @Override
    public ResumenHabitacionesDTO obtenerResumenHabitaciones() {
        List<EntityHabitacion> habitaciones = habitacionRepository.findAll();
        long ocupadas = habitaciones.stream().filter(EntityHabitacion::getOcupada).count();
        long libres = habitaciones.size() - ocupadas;

        ResumenHabitacionesDTO response = new ResumenHabitacionesDTO(ocupadas, libres);
        return response;
    }


//        2. Registrar una nueva habitación en un hotel. Tener en cuenta que debemos comprobar si el
//    hotel existe, antes de insertar la nueva habitación.

}
