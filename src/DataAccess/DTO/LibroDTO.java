package DataAccess.DTO;

public class LibroDTO {
    private Integer idLibro;
    private String codigo;
    private String titulo;
    private String fechaPublicacion;
    private String autor;
    private String edicion;
    private String idioma;
    private Integer paginas;
    private String descripcion;
    private Integer stock;
    private Integer disponible;
    private String estado;
    private String fechaRegistro;

    public LibroDTO(Integer idLibro, String codigo, String titulo, String fechaPublicacion,  String autor, String edicion,  String idioma, Integer paginas,  String descripcion, Integer stock, Integer disponible, String estado, String fechaRegistro) {
        this.autor = autor;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.disponible = disponible;
        this.edicion = edicion;
        this.estado = estado;
        this.fechaPublicacion = fechaPublicacion;
        this.fechaRegistro = fechaRegistro;
        this.idLibro = idLibro;
        this.idioma = idioma;
        this.paginas = paginas;
        this.stock = stock;
        this.titulo = titulo;
    }


    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getDisponible() {
        return disponible;
    }

    public void setDisponible(Integer disponible) {
        this.disponible = disponible;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString(){
        return  getClass().getName()
                + "\n idLibro           "+ getIdLibro()
                + "\n Codigo            "+ getCodigo()
                + "\n Titulo            "+ getTitulo()
                + "\n fechaPublicacion  "+ getFechaPublicacion()
                + "\n autor             "+ getAutor()
                + "\n edicion           "+ getEdicion()
                + "\n idioma            "+ getIdioma()
                + "\n paginas           "+ getPaginas()
                + "\n descripcion       "+ getDescripcion()
                + "\n stock             "+ getStock()
                + "\n disponible        "+ getDisponible()
                + "\n estado            "+ getEstado()
                + "\n fechaRegistro     "+ getFechaRegistro();
    }

}
