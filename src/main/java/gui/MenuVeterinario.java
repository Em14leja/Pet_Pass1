package gui;

import java.util.Scanner;

public class MenuVeterinario {

    public static void mostrarMenu(Scanner entrada) {

        int opcion;

        do {
            System.out.println("\n================================");
            System.out.println("    MENÚ VETERINARIO AUTORIZADO");
            System.out.println("================================");
            System.out.println("1. Consultar citas veterinarias");
            System.out.println("2. Gestionar historial médico");
            System.out.println("3. Gestionar información de veterinaria");
            System.out.println("4. Cerrar sesión");
            System.out.println("================================");
            System.out.print("Seleccione una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1:
                    MenuCitaVeterinaria.consultarCitas();
                    break;

                case 2:
                    MenuHistorialMedico.mostrarMenu(entrada);
                    break;

                case 3:
                    MenuVeterinaria.mostrarMenu(entrada);
                    break;

                case 4:
                    System.out.println("Sesión cerrada correctamente.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);
    }
}
