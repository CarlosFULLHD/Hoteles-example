package hoteles.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NotFound;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hotel")
public class EntityHotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_hotel;

    @NotBlank(message = "Tiene que ingresar un nombre")
    private String nombre;
    @NotBlank(message = "Tiene que ingresar una descripcion")
    private String descripcion;
    @NotBlank(message = "Tiene que ingresar una categoria")
    private String categoria;
    @NotNull(message = "Tiene que ingresar Verdadero o Falso")
    private Boolean piscina; //tiene o no tiene piscina
    @NotBlank(message = "Tiene que ingresar una localidad")
    private String localidad;

    // Un hotel puede tener varias habitaciones
    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EntityHabitacion> habitaciones;


}


