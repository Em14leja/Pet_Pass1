package gui;

import dominio.HistorialMedico;
import dominio.RegistroMedico;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MenuHistorialMedico {

    public static ArrayList<HistorialMedico> historiales = new ArrayList<>();
    public static ArrayList<RegistroMedico> registros = new ArrayList<>();

    public static void mostrarMenu(Scanner entrada) {

        int opcion;

        do {
            System.out.println("\n================================");
            System.out.println("       HISTORIAL MÉDICO");
            System.out.println("================================");
            System.out.println("1. Registrar historial médico");
            System.out.println("2. Agregar registro médico");
            System.out.println("3. Consultar historial médico");
            System.out.println("4. Actualizar registro médico");
            System.out.println("5. Regresar");
            System.out.println("================================");
            System.out.print("Seleccione una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1:
                    registrarHistorial();
                    break;

                case 2:
                    agregarRegistro(entrada);
                    break;

                case 3:
                    consultarHistorial();
                    break;

                case 4:
                    actualizarRegistro(entrada);
                    break;

                case 5:
                    System.out.println("Regresando al menú del dueño.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);
    }

    public static void registrarHistorial() {

        System.out.println("\n===== REGISTRAR HISTORIAL =====");

        System.out.print("Ingrese el ID del historial: ");
        Scanner entrada = new Scanner(System.in);
        int id = entrada.nextInt();

        HistorialMedico historial = new HistorialMedico(
                id, new Date(), "Activo"
        );

        historiales.add(historial);

        System.out.println("¡Historial médico registrado correctamente!");
        System.out.println(historial);
    }

    public static void agregarRegistro(Scanner entrada) {

        if (historiales.isEmpty()) {
            System.out.println("Primero debe registrar un historial médico.");
            return;
        }

        System.out.println("\n===== AGREGAR REGISTRO MÉDICO =====");

        System.out.print("Ingrese el ID del registro: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Ingrese el motivo de consulta: ");
        String motivo = entrada.nextLine();

        System.out.print("Ingrese el diagnóstico: ");
        String diagnostico = entrada.nextLine();

        System.out.print("Ingrese el tratamiento: ");
        String tratamiento = entrada.nextLine();

        System.out.print("Ingrese las observaciones: ");
        String observaciones = entrada.nextLine();

        System.out.print("Ingrese el estado: ");
        String estado = entrada.nextLine();

        System.out.print("Ingrese la fecha del próximo control (dd/mm/aaaa): ");
        String fechaTexto = entrada.nextLine();

        Date fechaProximoControl = new Date();

        try {
            java.text.SimpleDateFormat formato =
                    new java.text.SimpleDateFormat("dd/MM/yyyy");

            formato.setLenient(false);
            fechaProximoControl = formato.parse(fechaTexto);

        } catch (java.text.ParseException e) {
            System.out.println("Fecha no válida. Se utilizará la fecha actual.");
        }

        RegistroMedico registro = new RegistroMedico(
                id, new Date(), fechaProximoControl,
                motivo, diagnostico, tratamiento,
                observaciones, estado
        );

        registros.add(registro);

        System.out.println("¡Registro médico agregado correctamente!");
        System.out.println(registro);
    }

    public static void consultarHistorial() {

        System.out.println("\n===== CONSULTAR HISTORIAL =====");

        if (historiales.isEmpty()) {
            System.out.println("No existen historiales registrados.");
        } else {
            for (HistorialMedico historial : historiales) {
                System.out.println(historial);
            }
        }

        if (registros.isEmpty()) {
            System.out.println("No existen registros médicos.");
        } else {
            for (RegistroMedico registro : registros) {
                System.out.println(registro);
            }
        }
    }

    public static void actualizarRegistro(Scanner entrada) {

        if (registros.isEmpty()) {
            System.out.println("No existen registros médicos.");
            return;
        }

        System.out.print("Ingrese el ID del registro que desea actualizar: ");
        int id = entrada.nextInt();
        entrada.nextLine();

        for (RegistroMedico registro : registros) {

            if (registro.getIdRegistro() == id) {

                System.out.print("Nuevo diagnóstico: ");
                registro.setDiagnostico(entrada.nextLine());

                System.out.print("Nuevo tratamiento: ");
                registro.setTratamiento(entrada.nextLine());

                System.out.print("Nuevas observaciones: ");
                registro.setObservaciones(entrada.nextLine());

                System.out.print("Nuevo estado: ");
                registro.setEstado(entrada.nextLine());

                System.out.println("¡Registro médico actualizado correctamente!");
                return;
            }
        }

        System.out.println("No se encontró el registro médico.");
    }
}
