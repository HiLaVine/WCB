package com.darkdestiny;

import com.darkdestiny.domain.Evento;
import com.darkdestiny.domain.EventoDAO;

import java.sql.Date;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Evento evento = new Evento();
        evento.setNombreEvento("El Grito");
        evento.setFechaEvento(new Date(System.currentTimeMillis()));
        evento.setDuracion(5);
        System.out.println(evento);

        EventoDAO dao = new EventoDAO();

        try {
            dao.create(evento);
        } catch (SQLException e) {
           e.printStackTrace();
        }

    }
}