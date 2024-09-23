package com.darkdestiny.domain;

import java.io.Serializable;
import java.sql.Date;
/*
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder*/
public class Evento implements Serializable {
    private int idEvento;
    private String nombreEvento;
    private Date fechaEvento;
    private int duracion;

    public Evento() {

    }

    public Evento(int idEvento, String nombreEvento, Date fechaEvento, int duracion) {
        this.idEvento = idEvento;
        this.nombreEvento = nombreEvento;
        this.fechaEvento = fechaEvento;
        this.duracion = duracion;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Evento{").append("idEvento=").append(idEvento).append(", nombreEvento='").append(nombreEvento).append('\'').append(", fechaEvento=").append(fechaEvento).append(", duracion=").append(duracion).append('}').toString();
    }

}
