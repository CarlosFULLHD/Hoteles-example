package hoteles.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Entity
@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "habitacion")
public class EntityHabitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_habitacion;

    @Size(min = 1, max = 4, message = "La habitacion debe estar entre el tamaño de 1 a 4 personas")
    @NotNull
    @NotBlank
    @NotEmpty
    private Integer tamano; //cantidad de personas

    @Positive
    @NotNull
    @NotBlank
    @NotEmpty
    private BigDecimal precio;

    @NotNull
    @NotBlank
    @NotEmpty
    private Boolean desayuno;

    @NotNull
    @NotBlank
    @NotEmpty
    private Boolean ocupada;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_hotel", nullable = false)
    private EntityHotel hotel;


}
