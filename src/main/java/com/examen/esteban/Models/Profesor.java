package com.examen.esteban.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@Document(collection = "profesor")
public class Profesor {

    private Long id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;
    private String direccion;

    private List<Ciclo> cicloList;

}
