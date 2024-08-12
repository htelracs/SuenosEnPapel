
package interfacesDAO;

import java.util.List;
import models.DAO.USsuarios;

public interface DAOusers {
   public void registrar(USsuarios user) throws Exception;
    public void modificar(USsuarios user) throws Exception;
    public void eliminar(USsuarios user) throws Exception;
    public List<USsuarios> listar() throws Exception;
}
