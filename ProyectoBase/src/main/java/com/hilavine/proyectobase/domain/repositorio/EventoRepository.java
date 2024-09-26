package com.hilavine.proyectobase.domain.repositorio;


import com.hilavine.proyectobase.domain.entidades.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository<Evento, Long> {
}
