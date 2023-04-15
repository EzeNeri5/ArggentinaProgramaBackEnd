package Controller;

import Entity.Persona;
import Service.IPersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaServicio interPersona;

    @GetMapping ("/personas/traer")
    public List<Persona> getPersonas(){
        return  interPersona.getPersonas();
    }

    @PostMapping ("/personas/crear")
    public String createStudent(@RequestBody Persona perso){

        interPersona.savePersona(perso);
        return  "La persona fue encontrada";
    }

    @DeleteMapping ("/personas/borrar/{id}")
    public String deletePersona (@PathVariable long id){
        interPersona.deletePersona(id);
        return "La persona fue eliminada";
    }


    @PutMapping("personas/editar/{id}")
    public Persona editPersona (@PathVariable Long id,
                                @RequestParam ("nombre") String nuevoNombre,
                                @RequestParam ("apellido") String nuevoApellido,
                                @RequestParam ("edad") int nuevaEdad){
        Persona perso = interPersona.findPersona(id);

        perso.setApellido(nuevoApellido);
        perso.setNombre(nuevoNombre);
        perso.setEdad(nuevaEdad);

        interPersona.savePersona(perso);

        return perso;
    }
}
