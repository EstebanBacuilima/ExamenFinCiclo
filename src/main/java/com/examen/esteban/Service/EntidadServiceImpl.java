package com.examen.esteban.Service;

import com.examen.esteban.Models.Asignatura;
import com.examen.esteban.Repositorys.EntidadRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class EntidadServiceImpl extends GenericServiceImpl<Asignatura, Long> implements EntidadService {

    @Autowired
    EntidadRespository entidadRepository;
    @Override
    public CrudRepository<Asignatura, Long> getDao() {
        return entidadRepository;
    }
}