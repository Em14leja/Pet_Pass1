package gui;

import dominio.Veterinaria;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuVeterinaria {
    public static ArrayList<Veterinaria> veterinarias = new ArrayList<>();

    public static void mostrarMenu(Scanner entrada) {

        int opcion;

        do {
            System.out.println("\n================================");
            System.out.println("    GESTIÓN DE VETERINARIAS");
            System.out.println("================================");
            System.out.println("1. Registrar veterinaria");
            System.out.println("2. Consultar veterinarias");
            System.out.println("3. Actualizar información");
            System.out.println("4. Desactivar veterinaria");
            System.out.println("5. Regresar");
            System.out.println("================================");
            System.out.print("Seleccione una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1:
                    registrarVeterinaria(entrada);
                    break;

                case 2:
                    consultarVeterinarias();
                    break;

                case 3:
                    actualizarVeterinaria(entrada);
                    break;

                case 4:
                    desactivarVeterinaria(entrada);
                    break;

                case 5:
                    System.out.println("Regresando al menú del veterinario.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);
    }

    public static void registrarVeterinaria(Scanner entrada) {

        System.out.println("\n===== REGISTRAR VETERINARIA =====");

        System.out.print("Ingrese el ID: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese las especialidades: ");
        String especialidades = entrada.nextLine();

        System.out.print("Ingrese los servicios: ");
        String servicios = entrada.nextLine();

        System.out.print("Ingrese la dirección: ");
        String direccion = entrada.nextLine();

        System.out.print("Ingrese el teléfono: ");
        String telefono = entrada.nextLine();

        System.out.print("Ingrese el correo: ");
        String correo = entrada.nextLine();

        System.out.print("Ingrese el horario: ");
        String horario = entrada.nextLine();

        String estado = "Activa";

        Veterinaria veterinaria = new Veterinaria(
                id, nombre, especialidades, servicios,
                direccion, telefono, correo, horario, estado
        );

        veterinarias.add(veterinaria);

        System.out.println("\n¡Veterinaria registrada correctamente!");
        System.out.println(veterinaria);
    }

    public static void consultarVeterinarias() {

        System.out.println("\n===== CONSULTAR VETERINARIAS =====");

        if (veterinarias.isEmpty()) {
            System.out.println("No existen veterinarias registradas.");
            return;
        }

        for (Veterinaria veterinaria : veterinarias) {
            System.out.println(veterinaria);
        }
    }

    public static void actualizarVeterinaria(Scanner entrada) {

        if (veterinarias.isEmpty()) {
            System.out.println("No existen veterinarias registradas.");
            return;
        }

        System.out.print("Ingrese el ID de la veterinaria: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        for (Veterinaria veterinaria : veterinarias) {

            if (veterinaria.getIdVeterinaria() == id) {

                System.out.print("Nuevo nombre: ");
                veterinaria.setNombre(entrada.nextLine());

                System.out.print("Nuevas especialidades: ");
                veterinaria.setEspecialidades(entrada.nextLine());

                System.out.print("Nuevos servicios: ");
                veterinaria.setServicios(entrada.nextLine());

                System.out.print("Nueva dirección: ");
                veterinaria.setDireccion(entrada.nextLine());

                System.out.print("Nuevo teléfono: ");
                veterinaria.setTelefono(entrada.nextLine());

                System.out.print("Nuevo correo: ");
                veterinaria.setCorreo(entrada.nextLine());

                System.out.print("Nuevo horario: ");
                veterinaria.setHorario(entrada.nextLine());

                System.out.println("¡Información actualizada correctamente!");
                return;
            }
        }

        System.out.println("No se encontró la veterinaria.");
    }

    public static void desactivarVeterinaria(Scanner entrada) {

        if (veterinarias.isEmpty()) {
            System.out.println("No existen veterinarias registradas.");
            return;
        }

        System.out.print("Ingrese el ID de la veterinaria: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        for (Veterinaria veterinaria : veterinarias) {

            if (veterinaria.getIdVeterinaria() == id) {

                veterinaria.setEstado("Inactiva");

                System.out.println("¡Veterinaria desactivada correctamente!");
                return;
            }
        }

        System.out.println("No se encontró la veterinaria.");
    }
}
