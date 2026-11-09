package dominio;

public class PublicacionAdopcion {
    private int idPublicacion;
    private String edadAproximada;
    private String tamano;
    private String caracteristicas;
    private String requisitos;
    private String estadoDisponibilidad;

    public PublicacionAdopcion() {
    }

    public PublicacionAdopcion(int idPublicacion, String edadAproximada,
                               String tamano, String caracteristicas,
                               String requisitos, String estadoDisponibilidad) {

        this.idPublicacion = idPublicacion;
        this.edadAproximada = edadAproximada;
        this.tamano = tamano;
        this.caracteristicas = caracteristicas;
        this.requisitos = requisitos;
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    public int getIdPublicacion() {
        return idPublicacion;
    }
    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getEdadAproximada() {
        return edadAproximada;
    }
    public void setEdadAproximada(String edadAproximada) {
        this.edadAproximada = edadAproximada;
    }

    public String getTamano() {
        return tamano;
    }
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getRequisitos() {
        return requisitos;
    }
    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getEstadoDisponibilidad() {
        return estadoDisponibilidad;
    }
    public void setEstadoDisponibilidad(String estadoDisponibilidad) {
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    @Override
    public String toString() {
        return "PublicacionAdopcion{" +
                "idPublicacion=" + idPublicacion +
                ", edadAproximada='" + edadAproximada + '\'' +
                ", tamano='" + tamano + '\'' +
                ", caracteristicas='" + caracteristicas + '\'' +
                ", requisitos='" + requisitos + '\'' +
                ", estadoDisponibilidad='" + estadoDisponibilidad + '\'' +
                '}';
    }
}
