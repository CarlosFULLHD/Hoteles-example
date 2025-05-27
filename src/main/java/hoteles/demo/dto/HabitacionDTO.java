package hoteles.demo.dto;

import hoteles.demo.entity.EntityHotel;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HabitacionDTO implements Serializable{


    // cantidad personas
    private Long id_habitacion;
    private Integer tamano;
    private BigDecimal precio;
    private Boolean desayuno;
    private Boolean ocupada;

    private EntityHotel hotel;

}
