package com.example.CRUD.service;


import com.example.CRUD.entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.CRUD.repository.EstudianteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository estudianteRepository;

    public List<Estudiante> getEstudiantes(){
        return estudianteRepository.findAll();
    }

    public Optional<Estudiante> getEstudiante(Long id){
        return estudianteRepository.findById(id);
    }

    public void guardarOActualizar(Estudiante estudiante){
        estudianteRepository.save(estudiante);
    }

    public void borrar(Long id){
        estudianteRepository.deleteById(id);
    }
}
