package util;

import java.util.Date;

public class Validaciones {
    public static boolean validarTexto(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    public static boolean validarCorreo(String correo) {
        return correo != null &&
                correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }

    public static boolean validarTelefono(String telefono) {
        return telefono != null &&
                telefono.matches("[0-9]{7,15}");
    }

    public static boolean validarEdad(int edad) {
        return edad >= 0;
    }

    public static boolean validarNumeroPositivo(double numero) {
        return numero > 0;
    }

    public static boolean validarFecha(Date fecha) {
        return fecha != null;
    }

    public static boolean validarFechaCita(Date fecha) {
        return fecha != null && !fecha.before(new Date());
    }

    public static boolean validarContrasena(String contrasena) {
        return contrasena != null && contrasena.length() >= 8;
    }
}
