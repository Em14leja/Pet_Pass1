package dominio;

import java.util.Date;

public class RelatoExperiencia {

    private int idRelato;
    private String titulo;
    private String contenido;
    private Date fechaPublicacion;

    public RelatoExperiencia() {
    }

    public RelatoExperiencia(int idRelato, String titulo,
                             String contenido, Date fechaPublicacion) {

        this.idRelato = idRelato;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getIdRelato() {
        return idRelato;
    }

    public void setIdRelato(int idRelato) {
        this.idRelato = idRelato;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return "RelatoExperiencia{" +
                "idRelato=" + idRelato +
                ", titulo='" + titulo + '\'' +
                ", contenido='" + contenido + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                '}';
    }
}
