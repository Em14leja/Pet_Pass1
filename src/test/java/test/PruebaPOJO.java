package test;

import dominio.Usuario;
import dominio.Mascota;
import dominio.HistorialMedico;
import dominio.RegistroMedico;
import dominio.PublicacionAdopcion;
import dominio.SolicitudAdopcion;
import dominio.RelatoExperiencia;
import dominio.Veterinaria;
import dominio.CitaVeterinaria;
import dominio.ReporteMascotaPerdida;

public class PruebaPOJO {

    public static void main(String[] args) {

        System.out.println("===== PRUEBA DE USUARIO =====");

        Usuario usuario = new Usuario(
                1, "Carlos", "Pérez", "carlos@gmail.com",
                "0991234567", "Quito", "12345678"
        );

        System.out.println(usuario);
        usuario.setNombres("Carlos Andrés");
        System.out.println("Nombre actualizado: " + usuario.getNombres());


        System.out.println("\n===== PRUEBA DE MASCOTA =====");

        Mascota mascota = new Mascota(
                1, "Max", "Perro", "Labrador", 3,
                "Macho", "Café", "max.jpg", "Activo"
        );

        System.out.println(mascota);
        mascota.setNombre("Maximiliano");
        System.out.println("Nombre actualizado: " + mascota.getNombre());


        System.out.println("\n===== PRUEBA DE HISTORIAL MÉDICO =====");

        HistorialMedico historial = new HistorialMedico(
                1, new java.util.Date(), "Activo"
        );

        System.out.println(historial);


        System.out.println("\n===== PRUEBA DE REGISTRO MÉDICO =====");

        RegistroMedico registro = new RegistroMedico(
                1,
                new java.util.Date(),
                new java.util.Date(),
                "Consulta general",
                "Buen estado de salud",
                "Vitaminas",
                "Control en un mes",
                "Activo"
        );

        System.out.println(registro);


        System.out.println("\n===== PRUEBA DE PUBLICACIÓN DE ADOPCIÓN =====");

        PublicacionAdopcion publicacion = new PublicacionAdopcion(
                1, "2 años", "Mediano",
                "Juguetón y amigable",
                "Tener espacio adecuado", "Disponible"
        );

        System.out.println(publicacion);


        System.out.println("\n===== PRUEBA DE SOLICITUD DE ADOPCIÓN =====");

        SolicitudAdopcion solicitud = new SolicitudAdopcion(
                1, new java.util.Date(),
                "Ana López - 0991234567",
                "Pendiente", "Sin respuesta"
        );

        System.out.println(solicitud);


        System.out.println("\n===== PRUEBA DE RELATO =====");

        RelatoExperiencia relato = new RelatoExperiencia(
                1, "Mi experiencia",
                "Mi mascota ha mejorado mucho.",
                new java.util.Date()
        );

        System.out.println(relato);


        System.out.println("\n===== PRUEBA DE VETERINARIA =====");

        Veterinaria veterinaria = new Veterinaria(
                1, "Veterinaria Amigos",
                "Medicina general",
                "Vacunación y consultas",
                "Quito", "022345678",
                "amigos@gmail.com",
                "08:00 a 17:00", "Activa"
        );

        System.out.println(veterinaria);


        System.out.println("\n===== PRUEBA DE CITA VETERINARIA =====");

        CitaVeterinaria cita = new CitaVeterinaria(
                1, new java.util.Date(),
                "10:00", "Vacunación",
                "Vacuna antirrábica", "Pendiente"
        );

        System.out.println(cita);


        System.out.println("\n===== PRUEBA DE REPORTE DE MASCOTA PERDIDA =====");

        ReporteMascotaPerdida reporte = new ReporteMascotaPerdida(
                1, "max.jpg",
                "Perro café, tamaño mediano",
                new java.util.Date(),
                "Quito", "0991234567",
                "Perdida", null
        );

        System.out.println(reporte);

        System.out.println("\n¡TODAS LAS PRUEBAS POJO FINALIZARON CORRECTAMENTE!");
    }
}