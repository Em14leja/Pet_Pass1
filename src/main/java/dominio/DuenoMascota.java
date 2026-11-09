package dominio;

public class DuenoMascota extends Usuario{
    public DuenoMascota(){
        super();
    }
    public DuenoMascota(int idUsuario, String nombres, String apellidos, String correo,
                        String telefono, String direccion, String contrasena){
    super (idUsuario, nombres, apellidos, correo, telefono, direccion, contrasena);
    }
}
