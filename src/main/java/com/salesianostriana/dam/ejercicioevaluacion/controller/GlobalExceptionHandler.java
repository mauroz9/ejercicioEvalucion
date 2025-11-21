package com.salesianostriana.dam.ejercicioevaluacion.controller;

import com.salesianostriana.dam.ejercicioevaluacion.exceptions.BusRouteNotFoundException;
import com.salesianostriana.dam.ejercicioevaluacion.exceptions.InvalidBusRouteDataException;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    public ProblemDetail busNotFound(BusRouteNotFoundException ex){
        return new ProblemDetail().setDetail(ex.getMessage());
    }

    public ProblemDetail invalidRouteData(InvalidBusRouteDataException ex){
        return new ProblemDetail().setDetail(ex.getMessage());
    }

}
