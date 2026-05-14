package com.plataforma.model;

public class Instructor extends Usuario {

    private String especialidad;

    public Instructor(int id, String nombre, String email, String contrasena, String especialidad) {
        super(id, nombre, email, contrasena);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}