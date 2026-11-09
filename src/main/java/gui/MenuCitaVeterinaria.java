package gui;

import dominio.CitaVeterinaria;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class MenuCitaVeterinaria {

    public static ArrayList<CitaVeterinaria> citas = new ArrayList<>();

    public static void mostrarMenu(Scanner entrada) {

        int opcion;

        do {
            System.out.println("\n================================");
            System.out.println("       CITAS VETERINARIAS");
            System.out.println("================================");
            System.out.println("1. Solicitar cita");
            System.out.println("2. Consultar citas");
            System.out.println("3. Modificar cita");
            System.out.println("4. Cancelar cita");
            System.out.println("5. Regresar");
            System.out.println("================================");
            System.out.print("Seleccione una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1:
                    solicitarCita(entrada);
                    break;

                case 2:
                    consultarCitas();
                    break;

                case 3:
                    modificarCita(entrada);
                    break;

                case 4:
                    cancelarCita(entrada);
                    break;

                case 5:
                    System.out.println("Regresando al menú del dueño.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);
    }

    public static void solicitarCita(Scanner entrada) {

        System.out.println("\n===== SOLICITAR CITA =====");

        System.out.print("Ingrese el ID de la cita: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        Date fecha;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false);

        while (true) {

            System.out.print("Ingrese la fecha (dd/MM/yyyy): ");
            String fechaTexto = entrada.nextLine();

            try {
                fecha = formato.parse(fechaTexto);

                Calendar fechaCita = Calendar.getInstance();
                fechaCita.setTime(fecha);
                fechaCita.set(Calendar.HOUR_OF_DAY, 0);
                fechaCita.set(Calendar.MINUTE, 0);
                fechaCita.set(Calendar.SECOND, 0);
                fechaCita.set(Calendar.MILLISECOND, 0);

                Calendar hoy = Calendar.getInstance();
                hoy.set(Calendar.HOUR_OF_DAY, 0);
                hoy.set(Calendar.MINUTE, 0);
                hoy.set(Calendar.SECOND, 0);
                hoy.set(Calendar.MILLISECOND, 0);

                if (fechaCita.before(hoy)) {
                    System.out.println("No puede solicitar una cita con fecha pasada.");
                    continue;
                }

                break;

            } catch (ParseException e) {
                System.out.println("Fecha incorrecta. Use el formato dd/MM/yyyy.");
            }
        }

        System.out.print("Ingrese la hora: ");
        String hora = entrada.nextLine();

        System.out.print("Ingrese el motivo de la cita: ");
        String motivo = entrada.nextLine();

        System.out.print("Ingrese el servicio solicitado: ");
        String servicio = entrada.nextLine();

        String estado = "Pendiente";

        CitaVeterinaria cita = new CitaVeterinaria(
                id, fecha, hora, motivo, servicio, estado
        );

        citas.add(cita);

        System.out.println("\n¡Cita solicitada correctamente!");
        System.out.println(cita);
    }

    public static void consultarCitas() {

        System.out.println("\n===== CONSULTAR CITAS =====");

        if (citas.isEmpty()) {
            System.out.println("No existen citas registradas.");
            return;
        }

        for (CitaVeterinaria cita : citas) {
            System.out.println(cita);
        }
    }

    public static void modificarCita(Scanner entrada) {

        if (citas.isEmpty()) {
            System.out.println("No existen citas registradas.");
            return;
        }

        System.out.print("Ingrese el ID de la cita: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        for (CitaVeterinaria cita : citas) {

            if (cita.getIdCita() == id) {

                System.out.print("Nueva hora: ");
                cita.setHora(entrada.nextLine());

                System.out.print("Nuevo motivo: ");
                cita.setMotivo(entrada.nextLine());

                System.out.print("Nuevo servicio: ");
                cita.setServicio(entrada.nextLine());

                System.out.println("¡Cita modificada correctamente!");
                return;
            }
        }

        System.out.println("No se encontró la cita.");
    }

    public static void cancelarCita(Scanner entrada) {

        if (citas.isEmpty()) {
            System.out.println("No existen citas registradas.");
            return;
        }

        System.out.print("Ingrese el ID de la cita: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        for (CitaVeterinaria cita : citas) {

            if (cita.getIdCita() == id) {

                cita.setEstado("Cancelada");

                System.out.println("¡Cita cancelada correctamente!");
                return;
            }
        }

        System.out.println("No se encontró la cita.");
    }
}