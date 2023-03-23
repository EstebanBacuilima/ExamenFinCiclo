package com.examen.esteban.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@Document(collection = "ciclo")
public class Ciclo {

    private Long id;
    private String nombre;
    private String descripcion;

    private List<Carrera> carreraList;

}
