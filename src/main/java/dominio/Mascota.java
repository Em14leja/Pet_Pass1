package dominio;

public class Mascota {
    private int idMascota;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private String sexo;
    private String color;
    private String fotografia;
    private String estadoPerfil;

    public Mascota(){
    }

    public Mascota(int idMascota, String nombre, String especie, String raza,int edad,
                   String sexo, String color, String fotografia, String estadoPerfil){
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.color = color;
        this.fotografia = fotografia;
        this.estadoPerfil = estadoPerfil;
    }

    public int getIdMascota() {
        return idMascota;
    }
    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getFotografia() {
        return fotografia;
    }
    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public String getEstadoPerfil() {
        return estadoPerfil;
    }
    public void setEstadoPerfil(String estadoPerfil) {
        this.estadoPerfil = estadoPerfil;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "idMascota=" + idMascota +
                ", nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", color='" + color + '\'' +
                ", fotografia='" + fotografia + '\'' +
                ", estadoPerfil='" + estadoPerfil + '\'' +
                '}';
    }
}
