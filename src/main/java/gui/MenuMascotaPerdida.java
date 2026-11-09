package gui;

import dominio.ReporteMascotaPerdida;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MenuMascotaPerdida {
    public static ArrayList<ReporteMascotaPerdida> reportes = new ArrayList<>();

    public static void mostrarMenu(Scanner entrada) {

        int opcion;

        do {
            System.out.println("\n================================");
            System.out.println("       MASCOTAS PERDIDAS");
            System.out.println("================================");
            System.out.println("1. Publicar reporte");
            System.out.println("2. Consultar reportes");
            System.out.println("3. Actualizar reporte");
            System.out.println("4. Cerrar reporte");
            System.out.println("5. Regresar");
            System.out.println("================================");
            System.out.print("Seleccione una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1:
                    publicarReporte(entrada);
                    break;

                case 2:
                    consultarReportes();
                    break;

                case 3:
                    actualizarReporte(entrada);
                    break;

                case 4:
                    cerrarReporte(entrada);
                    break;

                case 5:
                    System.out.println("Regresando al menú del dueño.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);
    }

    public static void publicarReporte(Scanner entrada) {

        System.out.println("\n===== PUBLICAR REPORTE =====");

        System.out.print("Ingrese el ID del reporte: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Ingrese la fotografía: ");
        String fotografia = entrada.nextLine();

        System.out.print("Ingrese las características de la mascota: ");
        String caracteristicas = entrada.nextLine();

        System.out.print("Ingrese la fecha de desaparición (dd/MM/yyyy): ");
        String fechaTexto = entrada.nextLine();

        Date fechaDesaparicion;

        try {
            java.text.SimpleDateFormat formato =
                    new java.text.SimpleDateFormat("dd/MM/yyyy");

            formato.setLenient(false);
            fechaDesaparicion = formato.parse(fechaTexto);

        } catch (java.text.ParseException e) {
            System.out.println("Fecha no válida.");
            return;
        }

        System.out.print("Ingrese el lugar de desaparición: ");
        String lugar = entrada.nextLine();

        System.out.print("Ingrese el medio de contacto: ");
        String contacto = entrada.nextLine();

        String estado = "Perdida";
        Date fechaCierre = null;

        ReporteMascotaPerdida reporte = new ReporteMascotaPerdida(
                id, fotografia, caracteristicas,
                fechaDesaparicion, lugar, contacto,
                estado, fechaCierre
        );

        reportes.add(reporte);

        System.out.println("\n¡Reporte publicado correctamente!");
        System.out.println(reporte);
    }

    public static void consultarReportes() {

        System.out.println("\n===== CONSULTAR REPORTES =====");

        if (reportes.isEmpty()) {
            System.out.println("No existen reportes registrados.");
            return;
        }

        for (ReporteMascotaPerdida reporte : reportes) {
            System.out.println(reporte);
        }
    }

    public static void actualizarReporte(Scanner entrada) {

        if (reportes.isEmpty()) {
            System.out.println("No existen reportes registrados.");
            return;
        }

        System.out.print("Ingrese el ID del reporte: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        for (ReporteMascotaPerdida reporte : reportes) {

            if (reporte.getIdReporte() == id) {

                System.out.print("Nueva fotografía: ");
                reporte.setFotografia(entrada.nextLine());

                System.out.print("Nuevas características: ");
                reporte.setCaracteristicas(entrada.nextLine());

                System.out.print("Nuevo lugar de desaparición: ");
                reporte.setLugarDesaparicion(entrada.nextLine());

                System.out.print("Nuevo medio de contacto: ");
                reporte.setMedioContacto(entrada.nextLine());

                System.out.println("¡Reporte actualizado correctamente!");
                return;
            }
        }

        System.out.println("No se encontró el reporte.");
    }

    public static void cerrarReporte(Scanner entrada) {

        if (reportes.isEmpty()) {
            System.out.println("No existen reportes registrados.");
            return;
        }

        System.out.print("Ingrese el ID del reporte: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        for (ReporteMascotaPerdida reporte : reportes) {

            if (reporte.getIdReporte() == id) {

                reporte.setEstado("Encontrada");
                reporte.setFechaCierre(new Date());

                System.out.println("¡Reporte cerrado! La mascota fue encontrada.");
                return;
            }
        }

        System.out.println("No se encontró el reporte.");
    }
}
