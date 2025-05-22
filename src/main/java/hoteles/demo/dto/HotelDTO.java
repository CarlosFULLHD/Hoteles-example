package hoteles.demo.dto;

import hoteles.demo.entity.EntityHabitacion;
import hoteles.demo.entity.EntityHotel;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HotelDTO implements Serializable {

    private String nombre;
    private String descripcion;
    private String categoria;
    private Boolean piscina; //tiene o no tiene piscina
    private String localidad;

}
