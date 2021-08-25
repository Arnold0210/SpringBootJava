

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import com.example.model.*;
import org.springframework.data.repository.CrudRepository;
import com.example.interfacesService.IPersonaService;
import com.example.interfaces.IPersona;
import org.springframework.stereotype.Service;/**
 *
 * @author julih
 */
@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private IPersona data;

    @Override
    public List<Persona> listarPersonas() {
        return (List<Persona>)data.findAll();
    }

    @Override
    public Optional<Persona> personaporId(int id) {
        return null;
    }

    @Override
    public void añadirPersona(Persona p) {
    }

    @Override
    public void eliminarPersona(int id) {
    }
}
