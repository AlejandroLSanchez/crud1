package com.example.CRUD.repository;

import com.example.CRUD.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository <Estudiante, Long> {
    //INTERFACE EstudianteRepository HEREDA LOS METODOS DE JpaRepository QUE PIDE QUE INTRODUSCAS LA ENTIDAD Y EL VALOR DE LA ID PRINCIPAL /NOMBRE DE CLASE - TIPO DE DATO (ID)
}
