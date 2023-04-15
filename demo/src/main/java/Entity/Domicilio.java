package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Domicilio {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String  calle;
    private String numero;
    private String piso;
    private String departamento;
    private String ciudad;
    private String provincia;
    
    @ManyToOne
    private Persona persona;
}
