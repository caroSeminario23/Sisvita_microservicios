package com.carrera.service;

import com.carrera.model.Carrera;
import com.carrera.repository.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CarreraService {

    @Autowired
    private CarreraRepository carreraRepository;

    public List<Carrera> getCarreras() {
        return carreraRepository.findAll();
    }

    public Carrera saveCarrera(Carrera carrera) {
        return carreraRepository.save(carrera);
    }

    public Carrera getCarreraById(int id) {
        return carreraRepository.findById(id).orElse(null);
    }

    public void deleteCarrera(int id) {
        carreraRepository.deleteById(id);
    }
}