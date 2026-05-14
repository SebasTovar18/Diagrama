package com.plataforma.model;

import com.plataforma.interfaces.Evaluable;

public class Examen extends ContenidoCurso implements Evaluable {

    public Examen(int id, String titulo, int duracion, int numeroPreguntas) {
        super(id, titulo, duracion);
    }

    @Override
    public void presentarExamen() {
        System.out.println("Presentando examen: " + titulo);
    }

    @Override
    public String mostrarInformacion() {
        return "Examen: " + titulo;
    }
}