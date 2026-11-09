package dominio;

import java.util.Date;

public class RegistroMedico {

    private int idRegistro;
    private Date fechaConsulta;
    private Date fechaProximoControl;
    private String motivoConsulta;
    private String diagnostico;
    private String tratamiento;
    private String observaciones;
    private String estado;

    public RegistroMedico() {
    }

    public RegistroMedico(int idRegistro, Date fechaConsulta, Date fechaProximoControl,
                          String motivoConsulta, String diagnostico, String tratamiento,
                          String observaciones, String estado) {

        this.idRegistro = idRegistro;
        this.fechaConsulta = fechaConsulta;
        this.fechaProximoControl = fechaProximoControl;
        this.motivoConsulta = motivoConsulta;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.observaciones = observaciones;
        this.estado = estado;
    }

    public int getIdRegistro() {
        return idRegistro;
    }
    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Date getFechaConsulta() {
        return fechaConsulta;
    }
    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public Date getFechaProximoControl() {
        return fechaProximoControl;
    }
    public void setFechaProximoControl(Date fechaProximoControl) {
        this.fechaProximoControl = fechaProximoControl;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }
    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }
    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "RegistroMedico{" +
                "idRegistro=" + idRegistro +
                ", fechaConsulta=" + fechaConsulta +
                ", fechaProximoControl=" + fechaProximoControl +
                ", motivoConsulta='" + motivoConsulta + '\'' +
                ", diagnostico='" + diagnostico + '\'' +
                ", tratamiento='" + tratamiento + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
