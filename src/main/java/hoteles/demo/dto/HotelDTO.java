package hoteles.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HotelDTO implements Serializable {
    // no tiene id
    private String nombre;
    private String descripcion;
    private String categoria;
    private Boolean piscina; //tiene o no tiene piscina
    private String localidad;
    // no tiene lista de habitaciones
}
