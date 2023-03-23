package com.examen.esteban.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "periodo")
public class Periodo {

    private Long id;
    private String periodo;
    private Integer year;
}
