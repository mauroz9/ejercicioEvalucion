package com.salesianostriana.dam.ejercicioevaluacion.service;

import com.salesianostriana.dam.ejercicioevaluacion.dto.BusRouteResponseDto;
import com.salesianostriana.dam.ejercicioevaluacion.exceptions.BusRouteNotFoundException;
import com.salesianostriana.dam.ejercicioevaluacion.model.RutaBus;
import com.salesianostriana.dam.ejercicioevaluacion.repository.BusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BusService {

    private final BusRepository busRepository;
    private final BusRouteResponseDto busRouteResponseDto;

    public List<BusRouteResponseDto> getAll(){
        List<BusRouteResponseDto> busList = busRepository.findAll();



        if (busList.isEmpty()){
            throw new BusRouteNotFoundException("No existen rutas de autobuses");
        }

        return busList;
    }

    public BusRouteResponseDto getById(Long id){
        BusRouteResponseDto resp = busRouteResponseDto.of(busRepository.findById(id));
    }

}
