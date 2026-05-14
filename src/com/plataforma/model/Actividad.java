package com.plataforma.model;

public class Actividad extends ContenidoCurso {

    private String descripcion;

    public Actividad(int id, String titulo, int duracion, String descripcion) {
        super(id, titulo, duracion);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String mostrarInformacion() {
        return "Actividad: " + titulo;
    }
}