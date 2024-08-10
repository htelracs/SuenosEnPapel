package DataAccess.DTO;

public class PrestamoDTO {
    private Integer idPrestamo;
    private Integer idUsuario;
    private Integer idLibro;
    private String FechaPrestamo;
    private String FechaDevolucion;
    private String estado;

    public PrestamoDTO(Integer idPrestamo, Integer idUsuario, Integer idLibro, String FechaPrestamo,String FechaDevolucion, String estado) {
        this.FechaDevolucion = FechaDevolucion;
        this.FechaPrestamo = FechaPrestamo;
        this.estado = estado;
        this.idLibro = idLibro;
        this.idPrestamo = idPrestamo;
        this.idUsuario = idUsuario;
    }

    public Integer getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public String getFechaPrestamo() {
        return FechaPrestamo;
    }

    public void setFechaPrestamo(String FechaPrestamo) {
        this.FechaPrestamo = FechaPrestamo;
    }

    public String getFechaDevolucion() {
        return FechaDevolucion;
    }

    public void setFechaDevolucion(String FechaDevolucion) {
        this.FechaDevolucion = FechaDevolucion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString(){
        return  getClass().getName()
                + "\n idPrestamo        "+ getIdPrestamo()
                + "\n idUsuario         "+ getIdUsuario()
                + "\n idLibro           "+ getIdLibro()
                + "\n fechaPrestamo     "+ getFechaPrestamo()
                + "\n fechaDevolucion   "+ getFechaDevolucion()
                + "\n estado            "+ getEstado();
    } 
}
