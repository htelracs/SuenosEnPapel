
package models.DAO;
public class USsuarios {
    private int id;
    private String nombre;
    private String usuario;
    private String correo;
    private String contrasena;
    private int codigo;
    private int telefono;
    private Facultad facultad;
    private boolean sancion;
    private int cedula;
    private double dineroSancion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public boolean isSancion() {
        return sancion;
    }

    public void setSancion(boolean sancion) {
        this.sancion = sancion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public double getDineroSancion() {
        return dineroSancion;
    }

    public void setDineroSancion(double dineroSancion) {
        this.dineroSancion = dineroSancion;
    }
    
    public enum Facultad {
        Mecánica,
        Administración_de_empresas,
        Ciencias_de_datos_e_inteligencia_artificial,
        Economía,
        Física,
        Matemática,
        Química,
        Computación,
        Electricidad,
        Geología,
        Mecatrónica,
        Sistemas_de_información,
        Telecomunicaciones,
        Ambiental,
        Civil,
        Petróleos,
        Electrónica_y_automatización,
        Software,
        Electromecánica,
        Redes_y_telecomunicaciones,
        Aguas_y_saneamiento_ambiental
    }  
}
