package com.salesianostriana.dam.ejercicioevaluacion.repository;

import com.salesianostriana.dam.ejercicioevaluacion.model.RutaBus;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class BusRepository implements JpaRepository<RutaBus, Long> {

}
