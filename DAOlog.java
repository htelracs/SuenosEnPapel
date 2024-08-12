
package interfacesDAO;

import java.util.List;
import models.DAO.LOlogin;

public interface DAOlog {
    public void registrar(LOlogin logg) throws Exception;
    public void modificar(LOlogin logg) throws Exception;
    public void eliminar(LOlogin logg) throws Exception;
    public List<LOlogin> listar() throws Exception;
}
