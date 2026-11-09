package gui;

import dominio.DuenoMascota;
import dominio.Usuario;
import dominio.VeterinarioAutorizado;
import util.Validaciones;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuRegistro {

    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static ArrayList<Usuario> usuariosRegistrados = new ArrayList<>();

    public static void registrarUsuario(Scanner entrada) {

        int opcion;

        System.out.println("\n===== REGISTRO DE USUARIO =====");
        System.out.println("1. Dueño de mascota");
        System.out.println("2. Veterinario autorizado");
        System.out.print("Seleccione el tipo de usuario: ");

        opcion = entrada.nextInt();
        entrada.nextLine();

        if (opcion != 1 && opcion != 2) {
            System.out.println("Opción no válida.");
            return;
        }

        System.out.print("Ingrese el ID: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        // Validar que el ID no esté repetido
        for (Usuario usuario : usuariosRegistrados) {
            if (usuario.getIdUsuario() == id) {
                System.out.println("Ya existe un usuario con ese ID.");
                return;
            }
        }

        System.out.print("Ingrese sus nombres: ");
        String nombres = entrada.nextLine();

        System.out.print("Ingrese sus apellidos: ");
        String apellidos = entrada.nextLine();

        // Validación del correo
        String correo;

        do {
            System.out.print("Ingrese el correo: ");
            correo = entrada.nextLine();

            if (!Validaciones.validarCorreo(correo)) {
                System.out.println("Correo inválido. Intente nuevamente.");
                continue;
            }

            boolean correoRepetido = false;

            for (Usuario usuario : usuariosRegistrados) {
                if (usuario.getCorreo().equalsIgnoreCase(correo)) {
                    correoRepetido = true;
                    break;
                }
            }

            if (correoRepetido) {
                System.out.println("Este correo ya está registrado.");
                correo = "";
            }

        } while (!Validaciones.validarCorreo(correo));

        // Validación del teléfono
        String telefono;

        do {
            System.out.print("Ingrese el teléfono: ");
            telefono = entrada.nextLine();

            if (!Validaciones.validarTelefono(telefono)) {
                System.out.println("Teléfono inválido. Ingrese solo números.");
            }

        } while (!Validaciones.validarTelefono(telefono));

        System.out.print("Ingrese su dirección: ");
        String direccion = entrada.nextLine();

        // Validación de la contraseña
        String contrasena;

        do {
            System.out.print("Ingrese su contraseña: ");
            contrasena = entrada.nextLine();

            if (!Validaciones.validarContrasena(contrasena)) {
                System.out.println("La contraseña debe tener al menos 8 caracteres.");
            }

        } while (!Validaciones.validarContrasena(contrasena));

        if (opcion == 1) {

            DuenoMascota dueno = new DuenoMascota(
                    id, nombres, apellidos, correo,
                    telefono, direccion, contrasena
            );

            usuariosRegistrados.add(dueno);

            System.out.println("\n¡Dueño registrado correctamente!");
            System.out.println(dueno);

        } else {

            VeterinarioAutorizado veterinario = new VeterinarioAutorizado(
                    id, nombres, apellidos, correo,
                    telefono, direccion, contrasena
            );

            usuariosRegistrados.add(veterinario);

            System.out.println("\n¡Veterinario registrado correctamente!");
            System.out.println(veterinario);
        }
    }
}