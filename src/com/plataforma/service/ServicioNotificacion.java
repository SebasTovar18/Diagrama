package com.plataforma.service;

import com.plataforma.interfaces.Notificable;

public class ServicioNotificacion implements Notificable {

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Notificacion enviada: " + mensaje);
    }
}