package com.plataforma.model;

public class Leccion extends ContenidoCurso {

    private String urlVideo;

    public Leccion(int id, String titulo, int duracion, String urlVideo) {
        super(id, titulo, duracion);
        this.urlVideo = urlVideo;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    @Override
    public String mostrarInformacion() {
        return "Leccion: " + titulo;
    }
}