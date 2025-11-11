package ni.edu.uam.registro_uam.modelo;

import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name= "ciudades")
@Getter
@Setter


public class Ciudad {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    private String oid;

    @Column(name="nombre_cuidad", length = 60, nullable = false)
    @Required(message = "El nombre de la ciudad no puede quedar vacio")
    @Size(min = 3, max = 60)
    private String nombre;

    @Column(name = "poblacion_ciudad", nullable = false)
    private int poblacion;

}
