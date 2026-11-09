package gui;

import dominio.RelatoExperiencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MenuRelatoExperiencia {

    public static ArrayList<RelatoExperiencia> relatos = new ArrayList<>();

    public static void mostrarMenu(Scanner entrada) {

        int opcion;

        do {
            System.out.println("\n================================");
            System.out.println("    RELATOS DE EXPERIENCIAS");
            System.out.println("================================");
            System.out.println("1. Publicar relato");
            System.out.println("2. Consultar relatos");
            System.out.println("3. Regresar");
            System.out.print("Seleccione una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1:
                    publicarRelato(entrada);
                    break;

                case 2:
                    consultarRelatos();
                    break;

                case 3:
                    System.out.println("Regresando al menú del dueño.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 3);
    }

    public static void publicarRelato(Scanner entrada) {

        System.out.println("\n===== PUBLICAR RELATO =====");

        System.out.print("Ingrese el ID del relato: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Ingrese el título: ");
        String titulo = entrada.nextLine();

        System.out.print("Ingrese el contenido del relato: ");
        String contenido = entrada.nextLine();

        RelatoExperiencia relato = new RelatoExperiencia(
                id, titulo, contenido, new Date()
        );

        relatos.add(relato);

        System.out.println("\n¡Relato publicado correctamente!");
        System.out.println(relato);
    }

    public static void consultarRelatos() {

        System.out.println("\n===== RELATOS PUBLICADOS =====");

        if (relatos.isEmpty()) {
            System.out.println("No existen relatos publicados.");
            return;
        }

        for (RelatoExperiencia relato : relatos) {
            System.out.println(relato);
        }
    }
}