package DataAccess;

import DataAccess.DTO.PrestamoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PrestamoDAO extends DataHelper implements IDAO<PrestamoDTO> {

    @Override
    public boolean create(PrestamoDTO entity) throws Exception {
        String query = "INSERT INTO Prestamo (IDUsuario, IDLibro) VALUES (?,?)";
        try {
            Connection conn         = openConnection();
           PreparedStatement pstmt = conn.prepareStatement(query);
           pstmt.setInt(1, entity.getIdUsuario());
           pstmt.setInt(2, entity.getIdLibro());
           pstmt.executeUpdate();
           return true;
        } catch (SQLException e) {
            throw e;
        } 
    }

    @Override
    public List<PrestamoDTO> readAll() throws Exception {
        List <PrestamoDTO> lst = new ArrayList<>();
        String query = "SELECT IDPrestamo      "
                     + " , IDUsuario           "
                     + " , IDLibro             "
                     + " , FechaPrestamo       "
                     + " , FechaDevolucion     "
                     + " , Estado              "
                     + " FROM Prestamo         "
                     + "WHERE Estado = 'A'     ";

        try {
            Connection conn = openConnection();         
            Statement stmt  = conn.createStatement();   
            ResultSet  rs   = stmt.executeQuery(query);

            while(rs.next()){
                PrestamoDTO p =new PrestamoDTO(rs.getInt(1)
                                              ,rs.getInt(2)
                                              ,rs.getInt(3)
                                              ,rs.getString(4)
                                              ,rs.getString(5)
                                              ,rs.getString(6));
                lst.add(p);
            }

        } catch (SQLException e) {
            throw e;
        }
        return lst;
    }

    @Override
    public boolean update(PrestamoDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 
       LocalDateTime now = LocalDateTime.now();
       String query = "UPDATE Pretamo SET IDUsuario = ? , IDLibro = ? , FechaDevolucion = ? WHERE IDPrestamo";

       try {
            Connection conn         = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, entity.getIdUsuario());
            pstmt.setInt(2, entity.getIdLibro());
            pstmt.setString(3, dtf.format(now).toString());
            pstmt.setInt(4, entity.getIdPrestamo());
            pstmt.executeUpdate();
            return true;
       } catch (Exception e) {
            throw e;
       }
    }

    @Override
    public boolean delete(int id) throws Exception {
        String query = "UPDATE Prestamo SET Estado = ? WHERE IDPrestamo = ?";
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
    public PrestamoDTO readBy(Integer id) throws Exception {
        PrestamoDTO oP = new PrestamoDTO(id, id, id, null, null, null);
        String query = "SELECT IDPrestamo      "
                     + " , IDUsuario           "
                     + " , IDLibro             "
                     + " , FechaPrestamo       "
                     + " , FechaDevolucion     "
                     + " , Estado              "
                     + " FROM Prestamo         "
                     + "WHERE Estado = 'A' AND IDUsuario = " + id.toString();
        
        try {
            Connection conn = openConnection();         
            Statement stmt  = conn.createStatement();   
            ResultSet  rs   = stmt.executeQuery(query);

            while(rs.next()){
                oP =new PrestamoDTO(rs.getInt(1)
                                              ,rs.getInt(2)
                                              ,rs.getInt(3)
                                              ,rs.getString(4)
                                              ,rs.getString(5)
                                              ,rs.getString(6));
            }

        } catch (SQLException e) {
            throw e;
        }
        return oP;
    }

}
