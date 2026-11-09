package dominio;

import java.util.Date;

public class ReporteMascotaPerdida {

    private int idReporte;
    private String fotografia;
    private String caracteristicas;
    private Date fechaDesaparicion;
    private String lugarDesaparicion;
    private String medioContacto;
    private String estado;
    private Date fechaCierre;

    public ReporteMascotaPerdida() {
    }

    public ReporteMascotaPerdida(int idReporte, String fotografia,
                                 String caracteristicas, Date fechaDesaparicion,
                                 String lugarDesaparicion, String medioContacto,
                                 String estado, Date fechaCierre) {

        this.idReporte = idReporte;
        this.fotografia = fotografia;
        this.caracteristicas = caracteristicas;
        this.fechaDesaparicion = fechaDesaparicion;
        this.lugarDesaparicion = lugarDesaparicion;
        this.medioContacto = medioContacto;
        this.estado = estado;
        this.fechaCierre = fechaCierre;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Date getFechaDesaparicion() {
        return fechaDesaparicion;
    }

    public void setFechaDesaparicion(Date fechaDesaparicion) {
        this.fechaDesaparicion = fechaDesaparicion;
    }

    public String getLugarDesaparicion() {
        return lugarDesaparicion;
    }

    public void setLugarDesaparicion(String lugarDesaparicion) {
        this.lugarDesaparicion = lugarDesaparicion;
    }

    public String getMedioContacto() {
        return medioContacto;
    }

    public void setMedioContacto(String medioContacto) {
        this.medioContacto = medioContacto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    @Override
    public String toString() {
        return "ReporteMascotaPerdida{" +
                "idReporte=" + idReporte +
                ", fotografia='" + fotografia + '\'' +
                ", caracteristicas='" + caracteristicas + '\'' +
                ", fechaDesaparicion=" + fechaDesaparicion +
                ", lugarDesaparicion='" + lugarDesaparicion + '\'' +
                ", medioContacto='" + medioContacto + '\'' +
                ", estado='" + estado + '\'' +
                ", fechaCierre=" + fechaCierre +
                '}';
    }
}
