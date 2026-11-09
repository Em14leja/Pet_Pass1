package gui;

import java.util.Scanner;

public class MenuPrincipal {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n================================");
            System.out.println("       BIENVENIDO A PETPASS");
            System.out.println("================================");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Registrar usuario");
            System.out.println("3. Salir");
            System.out.println("================================");
            System.out.print("Seleccione una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1:
                    MenuLogin.iniciarSesion(entrada);
                    break;

                case 2:
                    MenuRegistro.registrarUsuario(entrada);
                    break;

                case 3:
                    System.out.println("Gracias por utilizar PetPass.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 3);
    }
}
