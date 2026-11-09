package dominio;

import java.util.Date;

public class HistorialMedico {

    private int idHistorial;
    private Date fechaCreacion;
    private String estado;

    public HistorialMedico() {
    }

    public HistorialMedico(int idHistorial, Date fechaCreacion,
                           String estado) {
        this.idHistorial = idHistorial;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
    }

    public int getIdHistorial() {
        return idHistorial;
    }
    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "HistorialMedico{" +
                "idHistorial=" + idHistorial +
                ", fechaCreacion=" + fechaCreacion +
                ", estado='" + estado + '\'' +
                '}';
    }
}
