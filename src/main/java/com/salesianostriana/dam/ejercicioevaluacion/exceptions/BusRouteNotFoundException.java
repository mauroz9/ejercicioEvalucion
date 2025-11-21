package com.salesianostriana.dam.ejercicioevaluacion.exceptions;

public class BusRouteNotFoundException extends RuntimeException {
    public BusRouteNotFoundException(String message) {
        super(message);
    }

    public BusRouteNotFoundException(Long id){
        super("No se ha encontrado el autobus con ID: " + id);
    }
}
