package dominio;

public class Veterinaria {
    private int idVeterinaria;
    private String nombre;
    private String especialidades;
    private String servicios;
    private String direccion;
    private String telefono;
    private String correo;
    private String horario;
    private String estado;

    public Veterinaria() {
    }

    public Veterinaria(int idVeterinaria, String nombre,
                       String especialidades, String servicios,
                       String direccion, String telefono, String correo,
                       String horario, String estado) {

        this.idVeterinaria = idVeterinaria;
        this.nombre = nombre;
        this.especialidades = especialidades;
        this.servicios = servicios;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.horario = horario;
        this.estado = estado;
    }

    public int getIdVeterinaria() {
        return idVeterinaria;
    }
    public void setIdVeterinaria(int idVeterinaria) {
        this.idVeterinaria = idVeterinaria;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidades() {
        return especialidades;
    }
    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    public String getServicios() {
        return servicios;
    }
    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Veterinaria{" +
                "idVeterinaria=" + idVeterinaria +
                ", nombre='" + nombre + '\'' +
                ", especialidades='" + especialidades + '\'' +
                ", servicios='" + servicios + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", horario='" + horario + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
