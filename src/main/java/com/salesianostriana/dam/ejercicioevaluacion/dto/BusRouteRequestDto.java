package com.salesianostriana.dam.ejercicioevaluacion.dto;

import com.salesianostriana.dam.ejercicioevaluacion.model.RutaBus;

public record BusRouteRequestDto(String codigoRuta, String origen, String destino, Double distancia, Long frecuencia, String descripcion) {

    public RutaBus toEntity(){
        RutaBus ruta = new RutaBus();

        ruta.setCodigoRuta(codigoRuta);
        ruta.setOrigen(origen);
        ruta.setDestino(destino);
        ruta.setDistancia(distancia);
        ruta.setFrecuencia(frecuencia);
        ruta.setDescripcion(descripcion);
        return ruta;
    }
}
