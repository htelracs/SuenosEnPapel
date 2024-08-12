
package Conector;

import static Conector.DAO.con;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class DAO {
    public static Connection con;
    private static final String driver="com.mysql.cj.jdbc.Driver";
    private static final String user="root";
    private static final String pass="";
    private static final String  url="jdbc:mysql://localhost:3307/biblioteca";
    public void conectar() throws ClassNotFoundException{
        con=null;
        try {
            con=(Connection) DriverManager.getConnection(url, user, pass);
            Class.forName(driver);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void Cerrar() throws SQLException{
        if(con!=null){
            if(!con.isClosed()){
                con.close();
            }
        }
    }
}
           