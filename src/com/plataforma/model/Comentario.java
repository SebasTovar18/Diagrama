package com.plataforma.model;

public class Comentario {

    private int id;
    private String mensaje;
    private Estudiante estudiante;
    private Curso curso;

    public Comentario(int id, String mensaje, Estudiante estudiante, Curso curso) {
        this.id = id;
        this.mensaje = mensaje;
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "id=" + id +
                ", mensaje='" + mensaje + '\'' +
                ", estudiante=" + estudiante.getNombre() +
                ", curso=" + curso.getTitulo() +
                '}';
    }
}