package com.plataforma.model;

public class Notificacion {

    private int id;
    private String mensaje;
    private Usuario usuario;

    public Notificacion(int id, String mensaje, Usuario usuario) {
        this.id = id;
        this.mensaje = mensaje;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Notificacion{" +
                "id=" + id +
                ", mensaje='" + mensaje + '\'' +
                ", usuario=" + usuario.getNombre() +
                '}';
    }
}