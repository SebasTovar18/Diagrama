package com.plataforma.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private int id;
    private String titulo;
    private String descripcion;
    private List<Modulo> modulos;

    public Curso(int id, String titulo, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.modulos = new ArrayList<>();
    }

    public void agregarModulo(Modulo modulo) {
        modulos.add(modulo);
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}