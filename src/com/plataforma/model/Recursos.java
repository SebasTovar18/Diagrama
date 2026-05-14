package com.plataforma.model;

import com.plataforma.interfaces.Descargable;

public class Recursos extends ContenidoCurso implements Descargable {

    private String nombreArchivo;

    public Recursos(int id, String titulo, int duracion, String nombreArchivo) {
        super(id, titulo, duracion);
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void descargar() {
        System.out.println("Descargando recurso: " + nombreArchivo);
    }

    @Override
    public String mostrarInformacion() {
        return "Recurso: " + titulo;
    }
}