package com.hilavine.proyectobase;

import com.hilavine.proyectobase.domain.entidades.Evento;
import com.hilavine.proyectobase.domain.repositorio.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class ProyectoBaseApplication implements CommandLineRunner {
    @Autowired
    private EventoRepository eventoRepository;
    @Override
    public void run(String... args) throws Exception {
        Evento e = new Evento();
        e.setIdEvento(1L);
        e.setNombreEvento("Jornada de ciencia y tecnologia");
        e.setFechaEvento(new Date());
        e.setDuracionEvento(5);



        Evento e2 = Evento.builder().idEvento(2L).nombreEvento("expo Escom").fechaEvento(new Date()).duracionEvento(10).build();


        System.out.println(e);
        System.out.println(e2);
        eventoRepository.save(e);
    }

    public static void main(String[] args) {
        SpringApplication.run(ProyectoBaseApplication.class, args);
    }

}
