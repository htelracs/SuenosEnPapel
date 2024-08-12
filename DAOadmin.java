
package interfacesDAO;

import java.util.List;
import models.DAO.ADadministrador;

public interface DAOadmin {
    public void registrar(ADadministrador admin) throws Exception;
    public void modificar(ADadministrador admin) throws Exception;
    public void eliminar(ADadministrador admin) throws Exception;
    public List<ADadministrador> listar() throws Exception;
}
