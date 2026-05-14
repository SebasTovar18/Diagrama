package com.plataforma.model;

public class Estudiante extends Usuario {

    private String nivelAcademico;

    public Estudiante(int id, String nombre, String email, String contrasena, String nivelAcademico) {
        super(id, nombre, email, contrasena);
        this.nivelAcademico = nivelAcademico;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", nivelAcademico='" + nivelAcademico + '\'' +
                '}';
    }
}