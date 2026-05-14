package com.plataforma.model;

public abstract class ContenidoCurso {

    protected int id;
    protected String titulo;
    protected int duracion;
    protected boolean completado;

    public ContenidoCurso(int id, String titulo, int duracion) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
        this.completado = false;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public abstract String mostrarInformacion();
}