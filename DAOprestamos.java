
package interfacesDAO;

import java.util.List;
import models.DAO.PRprestamos;

public interface DAOprestamos {
    public void registrar(PRprestamos prestamo) throws Exception;
    public void modificar(PRprestamos prestamo) throws Exception;
    // public void eliminar(PRprestamos prestamo) throws Exception;
    public List<PRprestamos> listar() throws Exception;
}
