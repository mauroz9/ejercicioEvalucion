package com.salesianostriana.dam.ejercicioevaluacion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RutaBus {

    @Id
    @GeneratedValue
    private Long id;

    private String codigoRuta;
    private String origen;
    private String destino;
    private Double distancia;
    private long frecuencia;
    private String descripcion;

}
