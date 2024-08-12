
package implementacionesDAO;

import Conector.DAO;
import java.sql.ResultSet;
import interfacesDAO.DAOusers;
import java.util.List;
import models.DAO.USsuarios;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import views.GUI.RegistroUsua;

public class usuarioImpl extends DAO implements DAOusers{

    @Override
    public void registrar(USsuarios user) throws Exception {
        try {
            this.conectar();
            PreparedStatement at=this.con.prepareStatement("INSERT INTO usuario(Nombre, Usuario,Correo, cedula, contraseña, codigo, telefono, facultad, sancion, dinerosancion) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            at.setString(1, user.getNombre());
            at.setString(2, user.getUsuario());
            at.setString(3, user.getCorreo());
            at.setInt(4, user.getCedula());
            at.setString(5, user.getContrasena());
            at.setInt(6, user.getCodigo());
            at.setInt(7, user.getTelefono());
            at.setString(8, user.getFacultad().name());
            at.setBoolean(9, user.isSancion());
            at.setDouble(10, user.getDineroSancion());
            at.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }finally{
            this.Cerrar();
        }
    }

    @Override
    public void modificar(USsuarios user) throws Exception {
        
    }

    @Override
    public void eliminar(USsuarios user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
    public List<USsuarios> listar() throws Exception {
        List<USsuarios> listas=null;
        try {
            this.conectar();
            PreparedStatement at=this.con.prepareStatement("SELECT * FROM usuario;");
            listas =new ArrayList();
            ResultSet result=at.executeQuery();
            while(result.next()) {
                USsuarios usu = new USsuarios();
                usu.setId(result.getInt("id"));
                usu.setNombre(result.getString("Nombre"));
                usu.setUsuario(result.getString("Usuario"));
                usu.setCorreo(result.getString("Correo"));
                usu.setCedula(result.getInt("cedula"));
                usu.setContrasena(result.getString("contraseña"));
                usu.setCodigo(result.getInt("codigo"));
                usu.setTelefono(result.getInt("telefono"));
                String facultadNombre = result.getString("facultad");
                usu.setFacultad(USsuarios.Facultad.valueOf(result.getString("facultad")));
                usu.setSancion(result.getBoolean("sancion"));
                usu.setDineroSancion(result.getDouble("dinerosancion"));
                listas.add(usu);
            }
            result.close();
            at.close();         
        } catch (Exception e) {
            throw e;
        }finally{
            this.Cerrar();
        }
        return listas;   
    }
}
   

