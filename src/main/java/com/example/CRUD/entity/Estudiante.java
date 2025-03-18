package com.example.CRUD.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;


@Data //CONTROLA EL USO DE GETTER AND SETTERS Y CONSTRUCTORES DE MANERA INTERNA
@Entity //DEFINE ENTIDAD PRINCIPAL ASOCIADA A LA BASE DE DATOS
@Table (name = "tbl_estudiante") //ASIGNA NOMBRE EN BASE DE DATOS ASOCIADO A ESTUDIANTE- ENTIDAD - NOMBRE DE CLASE
public class Estudiante {

    @Id //DEFINE IDENTIFICADOR UNICO
    @GeneratedValue (strategy = GenerationType.IDENTITY) //AUTOGENERA idEstudiante DE MANERA CORELATIVA
    @JsonProperty("idEstudiante")
    private Long idEstudiante; //SPRING TOMA EL CONTROL DE LA idEstudiante

    @JsonProperty("nombre")
    private String nombre;

    @JsonProperty("apellido")
    private String apellido;

    @JsonProperty("edad")
    private int edad;

    @JsonProperty("Correo_Electronico")
    @Column(name = "Correo_Electronico", unique = true, nullable = false)
    private String email;

    //copeto

}
