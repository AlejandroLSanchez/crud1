package com.example.CRUD.controller;

import com.example.CRUD.entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.CRUD.service.EstudianteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/estudiante")
public class EstudianteController {

@Autowired
private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @GetMapping ("/valor")//DEFINE METODO DE BUSQUEDA GET_-_
    public List<Estudiante> getAll(){
        return estudianteService.getEstudiantes();
    }

    @GetMapping("/{idEstudiante}")
    public Optional<Estudiante> getBId(@PathVariable("idEstudiante") Long idEstudiante){
        return estudianteService.getEstudiante(idEstudiante);
    }

    @PostMapping //USADO PARA GUARDAR O ACTUALIZAR EN BASE DE DATOS
    public void guardarActualizar(@RequestBody Estudiante estudiante){
        estudianteService.guardarOActualizar(estudiante);
    }

    @DeleteMapping("/{idEstudiante}")
    public void borrar(@PathVariable("idEstudiante") Long idEstudiante){
        estudianteService.borrar(idEstudiante);
    }


}
