package dominio;

import java.util.Date;

public class SolicitudAdopcion {
    private int idSolicitud;
    private Date fechaSolicitud;
    private String datosSolicitante;
    private String estado;
    private String respuesta;

    public SolicitudAdopcion() {
    }

    public SolicitudAdopcion(int idSolicitud, Date fechaSolicitud,
                             String datosSolicitante, String estado,
                             String respuesta) {
        this.idSolicitud = idSolicitud;
        this.fechaSolicitud = fechaSolicitud;
        this.datosSolicitante = datosSolicitante;
        this.estado = estado;
        this.respuesta = respuesta;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }
    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }
    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getDatosSolicitante() {
        return datosSolicitante;
    }
    public void setDatosSolicitante(String datosSolicitante) {
        this.datosSolicitante = datosSolicitante;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRespuesta() {
        return respuesta;
    }
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "SolicitudAdopcion{" +
                "idSolicitud=" + idSolicitud +
                ", fechaSolicitud=" + fechaSolicitud +
                ", datosSolicitante='" + datosSolicitante + '\'' +
                ", estado='" + estado + '\'' +
                ", respuesta='" + respuesta + '\'' +
                '}';
    }
}
