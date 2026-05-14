package com.plataforma.model;

import java.util.ArrayList;
import java.util.List;

public class Modulo {

    private int id;
    private String nombre;
    private List<ContenidoCurso> contenidos;

    public Modulo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.contenidos = new ArrayList<>();
    }

    public void agregarContenido(ContenidoCurso contenido) {
        contenidos.add(contenido);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<ContenidoCurso> getContenidos() {
        return contenidos;
    }

    @Override
    public String toString() {
        return "Modulo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}