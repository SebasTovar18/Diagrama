package com.plataforma;

import com.plataforma.model.*;
import com.plataforma.service.ServicioNotificacion;

public class Main {

    public static void main(String[] args) {

        System.out.println("========== SISTEMA DE CURSOS ONLINE ==========");

        // =========================================
        // USUARIOS
        // =========================================

        Estudiante estudiante = new Estudiante(
                1,
                "Sebastian Tovar",
                "sebastian@gmail.com",
                "12345",
                "Universitario"
        );

        Instructor instructor = new Instructor(
                2,
                "Jonattan Mosquera",
                "jonattan@gmail.com",
                "12345",
                "Programacion Java"
        );

        Administrador administrador = new Administrador(
                3,
                "Carlos Admin",
                "admin@gmail.com",
                "12345",
                "Coordinador"
        );

        System.out.println("\n===== USUARIOS =====");

        System.out.println("Estudiante: " + estudiante.getNombre());
        System.out.println("Nivel academico: " + estudiante.getNivelAcademico());

        System.out.println("\nInstructor: " + instructor.getNombre());
        System.out.println("Especialidad: " + instructor.getEspecialidad());

        System.out.println("\nAdministrador: " + administrador.getNombre());
        System.out.println("Cargo: " + administrador.getCargo());

        // =========================================
        // CURSO
        // =========================================

        Curso curso = new Curso(
                1,
                "Programacion Java",
                "Curso basico de Java"
        );

        System.out.println("\n===== CURSO =====");

        System.out.println("Curso: " + curso.getTitulo());
        System.out.println("Descripcion: " + curso.getDescripcion());

        // =========================================
        // MODULO
        // =========================================

        Modulo modulo1 = new Modulo(
                1,
                "Programacion Orientada a Objetos"
        );

        curso.agregarModulo(modulo1);

        System.out.println("\n===== MODULO =====");

        System.out.println("Modulo: " + modulo1.getNombre());

        // =========================================
        // CONTENIDOS DEL CURSO
        // =========================================

        Leccion leccion = new Leccion(
                1,
                "Herencia",
                40,
                "https://youtube.com/java"
        );

        Recursos recurso = new Recursos(
                2,
                "PDF Java",
                10,
                "java-poo.pdf"
        );

        Actividad actividad = new Actividad(
                3,
                "Taller de Herencia",
                30,
                "Crear clases usando herencia"
        );

        Examen examen = new Examen(
                4,
                "Examen Final",
                60,
                20
        );

        modulo1.agregarContenido(leccion);
        modulo1.agregarContenido(recurso);
        modulo1.agregarContenido(actividad);
        modulo1.agregarContenido(examen);

        // =========================================
        // POLIMORFISMO
        // =========================================

        System.out.println("\n===== CONTENIDOS DEL CURSO =====");

        for (ContenidoCurso contenido : modulo1.getContenidos()) {
            System.out.println(contenido.mostrarInformacion());
        }

        // =========================================
        // INTERFACES
        // =========================================

        System.out.println("\n===== INTERFACES =====");

        recurso.descargar();

        examen.presentarExamen();

        // =========================================
        // COMENTARIO
        // =========================================

        Comentario comentario = new Comentario(
                1,
                "Excelente curso de Java",
                estudiante,
                curso
        );

        System.out.println("\n===== COMENTARIO =====");

        System.out.println("Comentario: " + comentario.getMensaje());
        System.out.println("Autor: " + comentario.getEstudiante().getNombre());

        // =========================================
        // NOTIFICACION
        // =========================================

        Notificacion notificacion = new Notificacion(
                1,
                "Bienvenido al curso",
                estudiante
        );

        ServicioNotificacion servicio = new ServicioNotificacion();

        System.out.println("\n===== NOTIFICACION =====");

        System.out.println("Mensaje: " + notificacion.getMensaje());
        System.out.println("Usuario: " + notificacion.getUsuario().getNombre());

        servicio.enviarNotificacion(notificacion.getMensaje());

        // =========================================
        // HERENCIA
        // =========================================

        System.out.println("\n===== HERENCIA =====");

        System.out.println(
                estudiante.getNombre() +
                        " hereda de Usuario"
        );

        System.out.println(
                instructor.getNombre() +
                        " hereda de Usuario"
        );

        System.out.println(
                administrador.getNombre() +
                        " hereda de Usuario"
        );

        // =========================================
        // FINAL
        // =========================================

        System.out.println("\n========== FIN DEL SISTEMA ==========");
    }
}