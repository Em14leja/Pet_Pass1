package gui;

import dominio.PublicacionAdopcion;
import dominio.SolicitudAdopcion;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MenuAdopcion {

    public static ArrayList<PublicacionAdopcion> publicaciones = new ArrayList<>();
    public static ArrayList<SolicitudAdopcion> solicitudes = new ArrayList<>();

    public static void mostrarMenu(Scanner entrada) {

        int opcion;

        do {
            System.out.println("\n================================");
            System.out.println("       GESTIÓN DE ADOPCIONES");
            System.out.println("================================");
            System.out.println("1. Publicar mascota en adopción");
            System.out.println("2. Consultar publicaciones");
            System.out.println("3. Enviar solicitud de adopción");
            System.out.println("4. Consultar solicitudes");
            System.out.println("5. Aceptar o rechazar solicitud");
            System.out.println("6. Regresar");
            System.out.println("================================");
            System.out.print("Seleccione una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1:
                    publicarMascota(entrada);
                    break;

                case 2:
                    consultarPublicaciones();
                    break;

                case 3:
                    enviarSolicitud(entrada);
                    break;

                case 4:
                    consultarSolicitudes();
                    break;

                case 5:
                    responderSolicitud(entrada);
                    break;

                case 6:
                    System.out.println("Regresando al menú del dueño.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 6);
    }

    public static void publicarMascota(Scanner entrada) {

        System.out.println("\n===== PUBLICAR MASCOTA EN ADOPCIÓN =====");

        System.out.print("Ingrese el ID de la publicación: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Ingrese la edad aproximada: ");
        String edad = entrada.nextLine();

        System.out.print("Ingrese el tamaño: ");
        String tamano = entrada.nextLine();

        System.out.print("Ingrese las características: ");
        String caracteristicas = entrada.nextLine();

        System.out.print("Ingrese los requisitos para adoptar: ");
        String requisitos = entrada.nextLine();

        String estado = "Disponible";

        PublicacionAdopcion publicacion = new PublicacionAdopcion(
                id, edad, tamano, caracteristicas, requisitos, estado
        );

        publicaciones.add(publicacion);

        System.out.println("\n¡Publicación creada correctamente!");
        System.out.println(publicacion);
    }

    public static void consultarPublicaciones() {

        System.out.println("\n===== PUBLICACIONES DE ADOPCIÓN =====");

        if (publicaciones.isEmpty()) {
            System.out.println("No existen publicaciones registradas.");
            return;
        }

        for (PublicacionAdopcion publicacion : publicaciones) {
            System.out.println(publicacion);
        }
    }

    public static void enviarSolicitud(Scanner entrada) {

        if (publicaciones.isEmpty()) {
            System.out.println("No existen mascotas disponibles para adopción.");
            return;
        }

        System.out.println("\n===== ENVIAR SOLICITUD =====");

        consultarPublicaciones();

        System.out.print("Ingrese el ID de la publicación: ");
        int idPublicacion = entrada.nextInt();
        entrada.nextLine();

        boolean existe = false;

        for (PublicacionAdopcion publicacion : publicaciones) {

            if (publicacion.getIdPublicacion() == idPublicacion
                    && publicacion.getEstadoDisponibilidad().equalsIgnoreCase("Disponible")) {
                existe = true;
                break;
            }
        }

        if (!existe) {
            System.out.println("La publicación no existe o no está disponible.");
            return;
        }

        System.out.print("Ingrese el ID de la solicitud: ");
        int idSolicitud = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Ingrese sus nombres y apellidos: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese sus datos de contacto: ");
        String contacto = entrada.nextLine();

        String datosSolicitante = "Publicación: " + idPublicacion
                + " | Solicitante: " + nombre
                + " | Contacto: " + contacto;

        SolicitudAdopcion solicitud = new SolicitudAdopcion(
                idSolicitud, new Date(), datosSolicitante,
                "Pendiente", "Sin respuesta"
        );

        solicitudes.add(solicitud);

        System.out.println("\n¡Solicitud enviada correctamente!");
        System.out.println(solicitud);
    }

    public static void consultarSolicitudes() {

        System.out.println("\n===== SOLICITUDES DE ADOPCIÓN =====");

        if (solicitudes.isEmpty()) {
            System.out.println("No existen solicitudes registradas.");
            return;
        }

        for (SolicitudAdopcion solicitud : solicitudes) {
            System.out.println(solicitud);
        }
    }

    public static void responderSolicitud(Scanner entrada) {

        if (solicitudes.isEmpty()) {
            System.out.println("No existen solicitudes registradas.");
            return;
        }

        consultarSolicitudes();

        System.out.print("Ingrese el ID de la solicitud: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        for (SolicitudAdopcion solicitud : solicitudes) {

            if (solicitud.getIdSolicitud() == id) {

                if (!solicitud.getEstado().equalsIgnoreCase("Pendiente")) {
                    System.out.println("Esta solicitud ya fue respondida.");
                    return;
                }

                System.out.println("1. Aceptar solicitud");
                System.out.println("2. Rechazar solicitud");
                System.out.print("Seleccione una opción: ");

                int respuesta = entrada.nextInt();
                entrada.nextLine();

                if (respuesta == 1) {

                    solicitud.setEstado("Aceptada");
                    solicitud.setRespuesta("Solicitud aceptada.");

                    System.out.println("¡Solicitud aceptada correctamente!");

                } else if (respuesta == 2) {

                    solicitud.setEstado("Rechazada");
                    solicitud.setRespuesta("Solicitud rechazada.");

                    System.out.println("Solicitud rechazada.");

                } else {
                    System.out.println("Opción no válida.");
                }

                return;
            }
        }

        System.out.println("No se encontró la solicitud.");
    }
}
