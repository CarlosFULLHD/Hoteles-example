package hoteles.demo.repository;

import hoteles.demo.entity.EntityHotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<EntityHotel, Long> {
}
