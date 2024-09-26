package com.hilavine.proyectobase.domain.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Evento") //si la tabla se llama igual podemos omitir, pero ponerlo siempre esta mas chido
public class Evento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto funciona, pero no te hace notar. Mejor identity para MySQL
    private long idEvento;
    @Column(name = "nombreEvento", length = 100, nullable = false)
    private String nombreEvento;
    @Temporal(TemporalType.DATE)
    @Column(name = "fechaEvento", nullable = false)
    private Date fechaEvento;
    @Column(name = "duracion", nullable = false) //se llama duracion porque asi esta en el diagrama, aunque el atributo de la clase no se llame igual
    private int duracionEvento;




}
