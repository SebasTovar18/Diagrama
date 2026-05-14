package com.plataforma.model;

public class Administrador extends Usuario {

    private String cargo;

    public Administrador(int id, String nombre, String email, String contrasena, String cargo) {
        super(id, nombre, email, contrasena);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}