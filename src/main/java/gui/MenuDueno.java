package gui;

import java.util.Scanner;

public class MenuDueno {

    public static void mostrarMenu(Scanner entrada) {

        int opcion;

        do {
            System.out.println("\n================================");
            System.out.println("       MENÚ DUEÑO DE MASCOTA");
            System.out.println("================================");
            System.out.println("1. Gestionar perfil de mascota");
            System.out.println("2. Gestionar historial médico");
            System.out.println("3. Generar cita veterinaria");
            System.out.println("4. Gestionar mascota perdida");
            System.out.println("5. Gestionar adopciones");
            System.out.println("6. Consultar relatos de experiencias");
            System.out.println("7. Cerrar sesión");
            System.out.println("================================");
            System.out.print("Seleccione una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1:
                    MenuMascota.mostrarMenu(entrada);
                    break;

                case 2:
                    MenuHistorialMedico.mostrarMenu(entrada);
                    break;

                case 3:
                    MenuCitaVeterinaria.mostrarMenu(entrada);
                    break;

                case 4:
                    MenuMascotaPerdida.mostrarMenu(entrada);
                    break;

                case 5:
                    MenuAdopcion.mostrarMenu(entrada);
                    break;

                case 6:
                    MenuRelatoExperiencia.mostrarMenu(entrada);
                    break;

                case 7:
                    System.out.println("Sesión cerrada correctamente.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 7);
    }
}
