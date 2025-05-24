package hoteles.demo.repository;

import hoteles.demo.entity.EntityHotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelRepository extends JpaRepository<EntityHotel, Long> {

    List<EntityHotel> findByLocalidadAndCategoria(String localidad, String categoria);
    List<EntityHotel> findByCategoria(String categoria);
    List<EntityHotel> findByLocalidad(String localidad);
    //@Query
}

