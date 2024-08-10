import DataAccess.DTO.UsuarioDTO;
import DataAccess.UsuarioDAO;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        try {
            UsuarioDAO uDao = new UsuarioDAO();
            for(UsuarioDTO u : uDao.readAll())
                System.out.println(u.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
