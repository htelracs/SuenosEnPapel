package DataAccess;

import DataAccess.DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO extends DataHelper implements IDAO<UsuarioDTO> {

    @Override
    public boolean create(UsuarioDTO entity) throws Exception {
        String query = "INSERT INTO Usuario (Nombre, ApellidoPaterno, ApellidoMaterno, Domicilio, Telefono) VALUES (?,?,?,?,?)";
        try {
           Connection conn         = openConnection();
           PreparedStatement pstmt = conn.prepareStatement(query);
           pstmt.setString(1,entity.getNombre());
           pstmt.setString(2,entity.getApellidoPaterno());
           pstmt.setString(3,entity.getApellidoMaterno());
           pstmt.setString(4,entity.getDomicilio());
           pstmt.setString(5,entity.getTelefono());
           pstmt.executeUpdate();
           return true;
        } catch (SQLException e) {
            throw e; //PatException(e.getMessage(), getClass().getName(), "create()");
        }
    }

    @Override
    public List<UsuarioDTO> readAll() throws Exception {
        List <UsuarioDTO> lst = new ArrayList<>();
        String query = "SELECT IDUsuario    "
                     + " , Nombre           "  
                     + " , ApellidoPaterno  "
                     + " , ApellidoMaterno  "
                     + " , Domicilio        "
                     + " , Telefono         "
                     + " , FechaRegistro    "
                     + " , Estado           "
                     + "FROM Usuario        "
                     + "WHERE Estado = 'A'  ";

        try {
            Connection conn = openConnection();         
            Statement stmt  = conn.createStatement();   
            ResultSet  rs   = stmt.executeQuery(query);

            while (rs.next()){
                UsuarioDTO u = new UsuarioDTO(rs.getInt(1)
                                             , rs.getString(2)
                                             , rs.getString(3)
                                             , rs.getString(4)
                                             , rs.getString(5)
                                             , rs.getString(6)
                                             , rs.getString(7)
                                             , rs.getString(8));
                lst.add(u);
            }
        } catch (SQLException e) {
            throw e;
        }
        return lst;
    }

    @Override
    public boolean update(UsuarioDTO entity) throws Exception {
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 
       LocalDateTime now = LocalDateTime.now();
       String query = "UPDATE Usuario SET Nombre = ? , ApellidoPaterno = ? , ApellidoMaterno = ? , Domicilio = ?, Telefono = ?  WHERE IDUsuario = ?";
        
       try {
        Connection conn         = openConnection();
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1,entity.getNombre());
        pstmt.setString(2,entity.getApellidoPaterno());
        pstmt.setString(3,entity.getApellidoMaterno());
        pstmt.setString(4,entity.getDomicilio());
        pstmt.setString(5,entity.getTelefono());
        pstmt.setInt(6, entity.getIdUsuario());
        pstmt.executeUpdate();
        return true;
     } catch (SQLException e) {
         throw e; //PatException(e.getMessage(), getClass().getName(), "create()");
     }
    }

    @Override
    public boolean delete(int id) throws Exception {
        String query = "UPDATE Usuario SET Estado = ? WHERE IDUsuario = ?";
        try {
            Connection  conn        = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "x");
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            return  true;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public UsuarioDTO readBy(Integer id) throws Exception {
        UsuarioDTO oU = new UsuarioDTO(id, null, null, null, null, null, null, null);
        String query = "SELECT IDUsuario    "
                     + " , Nombre           "  
                     + " , ApellidoPaterno  "
                     + " , ApellidoMaterno  "
                     + " , Domicilio        "
                     + " , Telefono         "
                     + " , FechaRegistro    "
                     + " , Estado           "
                     + "FROM Usuario        "
                     + "WHERE Estado = 'A' AND IDUsuario =" + id.toString();
        try {
            Connection conn = openConnection();         
            Statement stmt  = conn.createStatement();   
            ResultSet  rs   = stmt.executeQuery(query);

            while (rs.next()){
                oU = new UsuarioDTO (rs.getInt(1)
                                     , rs.getString(2)
                                     , rs.getString(3)                                         , rs.getString(4)
                                     , rs.getString(5)
                                     , rs.getString(6)
                                     , rs.getString(7)
                                     , rs.getString(8));
            }
        } catch (SQLException e) {
            throw e;
        }
        return oU;
    }

    public Integer getRowCount()  throws Exception  {
        String query =" SELECT COUNT(*) TotalReg "
                     +" FROM    Usuario          "
                     +" WHERE   Estado ='A'      ";
        try {
            Connection conn = openConnection();         
            Statement  stmt = conn.createStatement();   
            ResultSet rs   = stmt.executeQuery(query);  
            while (rs.next()) {
                return rs.getInt(1);                   
            }
        } 
        catch (SQLException e) {
            throw e; //new PatException(e.getMessage(), getClass().getName(), "getRowCount()");
        }
        return 0;
    }

}
