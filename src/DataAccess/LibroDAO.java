package DataAccess;

import DataAccess.DTO.LibroDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LibroDAO extends DataHelper implements  IDAO<LibroDTO> {

    @Override
    public boolean create(LibroDTO entity) throws Exception {
        String query = "INSERT INTO Libro (Estado, Titulo, FechaPublicacion, Autor, Edicion, Idioma, Paginas, Descripcion, Stock, Disponibles) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            Connection conn         = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, entity.getCodigo());
            pstmt.setString(2, entity.getTitulo());
            pstmt.setString(3, entity.getFechaPublicacion());
            pstmt.setString(4, entity.getAutor());
            pstmt.setString(5, entity.getEdicion());
            pstmt.setString(6, entity.getIdioma());
            pstmt.setInt(7, entity.getPaginas());
            pstmt.setString(8, entity.getDescripcion());
            pstmt.setInt(9, entity.getStock());
            pstmt.setInt(10, entity.getDisponible());
            pstmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public List<LibroDTO> readAll() throws Exception {
        List <LibroDTO> lst = new ArrayList<>();
        String query = "SELECT IDLibro      "
                     + " , Codigo           "
                     + " , Titulo           "
                     + " , FechaPublicacion "
                     + " , Autor            "
                     + " , Edicion          "
                     + " , Idioma           "
                     + " , Paginas          "
                     + " , Descripcion      "
                     + " , Stock            "
                     + " , Disponibles      "
                     + " , Estado           "
                     + " , FechaRegistro    "
                     + " FROM Libro         "
                     + " WHERE Estado = 'A' ";

         try {
            Connection conn = openConnection();         
            Statement stmt  = conn.createStatement();   
            ResultSet  rs   = stmt.executeQuery(query);

            while (rs.next()){
                LibroDTO l = new LibroDTO(rs.getInt(1)
                                        , rs.getString(2)
                                        , rs.getString(3)
                                        , rs.getString(4)
                                        , rs.getString(5)
                                        , rs.getString(6)
                                        , rs.getString(7)
                                        , rs.getInt(8)
                                        , rs.getString(8)
                                        , rs.getInt(10)
                                        , rs.getInt(11)
                                        , rs.getString(12)
                                        , rs.getString(13));

                lst.add(l);
            }
        } catch (SQLException e) {
            throw e;
        }
        return lst;
        
    }

    @Override
    public boolean update(LibroDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); 
        LocalDateTime now = LocalDateTime.now();
        String query = "UPDATE Libro SET Codigo = ? , Titulo = ? , FechaPublicacion = ? , Autor = ? , Edicion = ? , Idioma = ? , Paginas = ? , Descripcion = ? , Stock = ? , Disponibles = ? WHWERE IDLibro = ? ";
        try {
            Connection conn         = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, entity.getCodigo());
            pstmt.setString(2, entity.getTitulo());
            pstmt.setString(3, entity.getFechaPublicacion());
            pstmt.setString(4, entity.getAutor());
            pstmt.setString(5, entity.getEdicion());
            pstmt.setString(6, entity.getIdioma());
            pstmt.setInt(7, entity.getPaginas());
            pstmt.setString(8, entity.getDescripcion());
            pstmt.setInt(9, entity.getStock());
            pstmt.setInt(10, entity.getDisponible());
            pstmt.setInt(11, entity.getIdLibro());
            pstmt.executeUpdate();
            return true; 
        } catch (SQLException e) {
            throw e;
        }
    }

    @Override
    public boolean delete(int id) throws Exception {
        String query = "UPDATE Libro SET Estado = ? WHERE IDLibro = ?";
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
    public LibroDTO readBy(Integer id) throws Exception {
        LibroDTO oL = new LibroDTO(id, null, null, null, null, null, null, id, null, id, id, null, null);
        String query =  "SELECT IDLibro      "
                      + " , Codigo           "
                      + " , Titulo           "
                      + " , FechaPublicacion "
                      + " , Autor            "
                      + " , Edicion          "
                      + " , Idioma           "
                      + " , Paginas          "
                      + " , Descripcion      "
                      + " , Stock            "
                      + " , Disponibles      "
                      + " , Estado           "
                      + " , FechaRegistro    "
                      + " FROM Libro         "
                      + "WHERE Estado = 'A' AND IDLibro =" + id.toString();

        try {
            Connection conn = openConnection();         
            Statement stmt  = conn.createStatement();   
            ResultSet  rs   = stmt.executeQuery(query);
            while (rs.next()){
                oL = new LibroDTO(rs.getInt(1)
                                , rs.getString(2)
                                , rs.getString(3)
                                , rs.getString(4)
                                , rs.getString(5)
                                , rs.getString(6)
                                , rs.getString(7)
                                , rs.getInt(8)
                                , rs.getString(9)
                                , rs.getInt(10)
                                , rs.getInt(11)
                                , rs.getString(12)
                                , rs.getString(13));
            }
            
        } catch (SQLException e) {
            throw e;
        }
        return oL;
    }

}
