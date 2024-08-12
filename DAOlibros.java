
package interfacesDAO;

import java.util.List;
import models.DAO.LIlibros;

public interface DAOlibros {
    public void registrar(LIlibros libro) throws Exception;
    public void modificar(LIlibros libro) throws Exception;
    public void eliminar(LIlibros libro) throws Exception;
    public List<LIlibros> listar() throws Exception;
}
