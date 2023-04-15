
package Service;

import java.util.List;

import Entity.Persona;
import Repository.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServicio implements  IPersonaServicio{
    
    @Autowired
    private PersonaRepositorio personaRepositorio;

    @Override
    public List<Persona> getPersonas() {
       List<Persona> listaPersonas = personaRepositorio.findAll();
       return listaPersonas;
    }

    @Override
    public void savePersona(Persona perso) {
        personaRepositorio.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
    personaRepositorio.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = personaRepositorio.findById(id).orElse(null) ;
        return perso;
    }
}