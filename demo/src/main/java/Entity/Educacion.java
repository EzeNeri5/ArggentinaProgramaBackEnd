
package Entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Educacion {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String tipo;
    private String institucion;
    private String titulo;
    private String carrera;
    private String inicio;
    private String fin;
    private boolean enCurso ;
    
    @OneToOne
    private TipoEducacion tipoEducacion;
    
    @ManyToMany
    private List<Persona> persona;
    
}
