package dominio;

import java.util.Date;

public class CitaVeterinaria {

    private int idCita;
    private Date fecha;
    private String hora;
    private String motivo;
    private String servicio;
    private String estado;

    public CitaVeterinaria(){
    }

    public CitaVeterinaria(int idCita, Date fecha, String hora,
                           String motivo, String servicio, String estado) {

        this.idCita = idCita;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.servicio = servicio;
        this.estado = estado;
    }

    public int getIdCita() {
        return idCita;
    }
    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getServicio() {
        return servicio;
    }
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CitaVeterinaria{" +
                "idCita=" + idCita +
                ", fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", motivo='" + motivo + '\'' +
                ", servicio='" + servicio + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
