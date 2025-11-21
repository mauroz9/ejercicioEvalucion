package com.salesianostriana.dam.ejercicioevaluacion.dto;

import com.salesianostriana.dam.ejercicioevaluacion.model.RutaBus;

public record BusRouteResponseDto(long id, String codigoRuta, String origen, String destino, Double distancia, Long frecuencia, String descripcion) {

    public BusRouteResponseDto of(RutaBus r){



        return new BusRouteResponseDto({
                id(r.getId()),
                codigoRuta(r.getCodigoRuta()),
                origen(r.getOrigen()),
                destino(r.getDestino()),
                distancia(r.getDistancia()),
                frecuencia(r.getFrecuencia()),
                descripcion(r.getDescripcion())
        });
    }


}
