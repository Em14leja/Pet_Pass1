package gui;

import dominio.Mascota;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import util.Validaciones;

public class MenuMascota {

    public static ArrayList<Mascota> mascotasRegistradas = new ArrayList<>();

    public static void mostrarMenu(Scanner entrada) {

        int opcion;

        do {
            System.out.println("\n================================");
            System.out.println("    GESTIÓN DE PERFIL MASCOTA");
            System.out.println("================================");
            System.out.println("1. Registrar mascota");
            System.out.println("2. Consultar mascotas");
            System.out.println("3. Modificar perfil");
            System.out.println("4. Eliminar perfil");
            System.out.println("5. Regresar");
            System.out.println("================================");
            System.out.print("Seleccione una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1:
                    registrarMascota(entrada);
                    break;

                case 2:
                    consultarMascotas();
                    break;

                case 3:
                    modificarMascota(entrada);
                    break;

                case 4:
                    eliminarMascota(entrada);
                    break;

                case 5:
                    System.out.println("Regresando al menú del dueño.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);
    }

    public static void registrarMascota(Scanner entrada) {

        System.out.println("\n===== REGISTRAR MASCOTA =====");

        System.out.print("Ingrese el ID de la mascota: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        for (Mascota mascota : mascotasRegistradas) {
            if (mascota.getIdMascota() == id) {
                System.out.println("Ya existe una mascota con ese ID.");
                return;
            }
        }

        System.out.print("Ingrese el nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese la especie: ");
        String especie = entrada.nextLine();

        System.out.print("Ingrese la raza: ");
        String raza = entrada.nextLine();

        int edad;

        do {
            System.out.print("Ingrese la edad: ");
            edad = entrada.nextInt();
            entrada.nextLine();

            if (!Validaciones.validarEdad(edad)) {
                System.out.println("La edad no puede ser negativa. Intente nuevamente.");
            }

        } while (!Validaciones.validarEdad(edad));

        System.out.print("Ingrese el sexo: ");
        String sexo = entrada.nextLine();

        System.out.print("Ingrese el color: ");
        String color = entrada.nextLine();

        System.out.print("Ingrese la fotografía (nombre o ruta): ");
        String fotografia = entrada.nextLine();

        System.out.print("Ingrese el estado del perfil: ");
        String estadoPerfil = entrada.nextLine();

        Mascota mascota = new Mascota(
                id, nombre, especie, raza, edad,
                sexo, color, fotografia, estadoPerfil
        );

        mascotasRegistradas.add(mascota);

        System.out.println("\n¡Mascota registrada correctamente!");
        System.out.println(mascota);
    }

    public static void consultarMascotas() {

        System.out.println("\n===== MASCOTAS REGISTRADAS =====");

        if (mascotasRegistradas.isEmpty()) {
            System.out.println("No existen mascotas registradas.");
            return;
        }

        for (Mascota mascota : mascotasRegistradas) {
            System.out.println(mascota);
        }
    }

    public static void modificarMascota(Scanner entrada) {

        System.out.println("\n===== MODIFICAR MASCOTA =====");

        if (mascotasRegistradas.isEmpty()) {
            System.out.println("No existen mascotas registradas.");
            return;
        }

        System.out.print("Ingrese el ID de la mascota: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        for (Mascota mascota : mascotasRegistradas) {

            if (mascota.getIdMascota() == id) {

                System.out.print("Nuevo nombre: ");
                mascota.setNombre(entrada.nextLine());

                System.out.print("Nueva especie: ");
                mascota.setEspecie(entrada.nextLine());

                System.out.print("Nueva raza: ");
                mascota.setRaza(entrada.nextLine());

                int edad;

                do {
                    System.out.print("Nueva edad: ");
                    edad = entrada.nextInt();
                    entrada.nextLine();

                    if (!Validaciones.validarEdad(edad)) {
                        System.out.println("La edad no puede ser negativa. Intente nuevamente.");
                    }

                } while (!Validaciones.validarEdad(edad));

                mascota.setEdad(edad);

                System.out.print("Nuevo sexo: ");
                mascota.setSexo(entrada.nextLine());

                System.out.print("Nuevo color: ");
                mascota.setColor(entrada.nextLine());

                System.out.print("Nueva fotografía: ");
                mascota.setFotografia(entrada.nextLine());

                System.out.print("Nuevo estado del perfil: ");
                mascota.setEstadoPerfil(entrada.nextLine());

                System.out.println("\n¡Perfil actualizado correctamente!");
                System.out.println(mascota);
                return;
            }
        }

        System.out.println("No se encontró una mascota con ese ID.");
    }

    public static void eliminarMascota(Scanner entrada) {

        System.out.println("\n===== ELIMINAR MASCOTA =====");

        if (mascotasRegistradas.isEmpty()) {
            System.out.println("No existen mascotas registradas.");
            return;
        }

        System.out.print("Ingrese el ID de la mascota: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        Iterator<Mascota> iterador = mascotasRegistradas.iterator();

        while (iterador.hasNext()) {

            Mascota mascota = iterador.next();

            if (mascota.getIdMascota() == id) {

                iterador.remove();

                System.out.println("¡Perfil eliminado correctamente!");
                return;
            }
        }

        System.out.println("No se encontró una mascota con ese ID.");
    }
}