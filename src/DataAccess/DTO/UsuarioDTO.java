package DataAccess.DTO;

public class UsuarioDTO {
    private Integer idUsuario;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String domicilio;
    private String telefono;
    private String fechaRegistro;
    private String estado;

    

    public UsuarioDTO(Integer idUsuario, String nombre, String apellidoPaterno, String apellidoMaterno,
            String domicilio, String telefono, String fechaRegistro, String estado) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
        this.estado = estado;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public  String toString(){
        return " \n" + getClass().getName()
               + "\n idUsuario      "+ getIdUsuario()
               + "\n nombre         "+ getNombre()
               + "\n apellidoPaterno"+ getApellidoPaterno()
               + "\n apellidoMaterno"+ getApellidoMaterno()
               + "\n domicilio      "+ getDomicilio()
               + "\n telefono       "+ getTelefono()
               + "\n fechaRegistro  "+ getFechaRegistro()
               + "\n estado         "+ getEstado(); 
    }

}
