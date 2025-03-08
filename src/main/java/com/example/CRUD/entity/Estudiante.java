package com.example.CRUD.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data //CONTROLA EL USO DE GETTER AND SETTERS Y CONSTRUCTORES DE MANERA INTERNA
@Entity //DEFINE ENTIDAD PRINCIPAL ASOCIADA A LA BASE DE DATOS
@Table (name = "tbl_estudiante") //ASIGNA NOMBRE EN BASE DE DATOS ASOCIADO A ESTUDIANTE- ENTIDAD - NOMBRE DE CLASE
public class Estudiante {

    @Id //DEFINE IDENTIFICADOR UNICO
    @GeneratedValue (strategy = GenerationType.IDENTITY) //AUTOGENERA idEstudiante DE MANERA CORELATIVA
    private Long idEstudiante; //SPRING TOMA EL CONTROL DE LA idEstudiante

    private String nombre;

    private String apellido;

    private int edad;

    @Column(name = "Correo_Electronico", unique = true, nullable = false)
    private String email;


}
