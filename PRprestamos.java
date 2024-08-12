
package models.DAO;

import java.util.Date;

public class PRprestamos {
    private int id;
    private int usuario_id;
    private int libro_id;
    private Date fecha_salida;
    private Date fecha_regreso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getLibro_id() {
        return libro_id;
    }

    public void setLibro_id(int libro_id) {
        this.libro_id = libro_id;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Date getFecha_regreso() {
        return fecha_regreso;
    }

    public void setFecha_regreso(Date fecha_regreso) {
        this.fecha_regreso = fecha_regreso;
    }
}
