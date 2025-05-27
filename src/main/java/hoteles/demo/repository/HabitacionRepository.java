package hoteles.demo.repository;

import hoteles.demo.entity.EntityHabitacion;
import hoteles.demo.entity.EntityHotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitacionRepository extends JpaRepository<EntityHabitacion, Long> {
}
