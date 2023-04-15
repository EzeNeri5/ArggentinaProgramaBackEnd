package Service;

import Entity.Persona;

import java.util.List;

public interface IPersonaServicio {

    public List<Persona> getPersonas();

    public void savePersona (Persona perso);

    public void deletePersona (Long id);

    public Persona findPersona (Long id);
}
