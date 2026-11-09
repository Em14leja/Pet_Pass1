package gui;

import dominio.Usuario;
import java.util.Scanner;
import dominio.DuenoMascota;
import dominio.VeterinarioAutorizado;

public class MenuLogin {

    public static void iniciarSesion(Scanner entrada) {

        System.out.println("\n===== INICIAR SESIÓN =====");

        if (MenuRegistro.usuariosRegistrados.isEmpty()) {
            System.out.println("No existen usuarios registrados.");
            return;
        }

        System.out.print("Ingrese su correo: ");
        String correo = entrada.nextLine().trim();

        System.out.print("Ingrese su contraseña: ");
        String contrasena = entrada.nextLine();

        boolean encontrado = false;

        for (Usuario usuario : MenuRegistro.usuariosRegistrados) {

            if (usuario.getCorreo().equalsIgnoreCase(correo)
                    && usuario.getContrasena().equals(contrasena)) {

                System.out.println("\n¡Inicio de sesión exitoso!");
                System.out.println("Bienvenido/a " + usuario.getNombres());

                encontrado = true;

                if (usuario instanceof DuenoMascota) {
                    MenuDueno.mostrarMenu(entrada);

                } else if (usuario instanceof VeterinarioAutorizado) {
                    MenuVeterinario.mostrarMenu(entrada);
                }

                break;
            }
        }

        if (!encontrado) {
            System.out.println("Correo o contraseña incorrectos.");
        }
    }
}