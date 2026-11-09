package dominio;

public class VeterinarioAutorizado extends Usuario{

    public VeterinarioAutorizado(){
        super();
    }
    public VeterinarioAutorizado(int idUsuario, String nombres, String apellidos, String correo, String telefono,
                                 String direccion, String contrasena){
        super( idUsuario, nombres, apellidos, correo, telefono, direccion, contrasena);
    }
}
