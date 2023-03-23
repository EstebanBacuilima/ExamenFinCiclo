package com.examen.esteban.Repositorys;

import com.examen.esteban.Models.Asignatura;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EntidadRespository extends MongoRepository<Asignatura, Long> {
}
