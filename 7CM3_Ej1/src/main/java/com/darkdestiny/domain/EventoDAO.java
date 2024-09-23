package com.darkdestiny.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EventoDAO {
    private static final String SQL_INSERTAR =
            "INSERT INTO Evento (nombreEvento, fechaEvento, duracion) VALUES (?, ?, ?)";

    private static final String SQL_ACTUALIZAR =
            "UPDATE Evento SET nombreEvento = ?, fechaEvento = ?, duracion = ? where idEvento = ?";

    private static final String SQL_ELIMINAR =
            "DELETE FROM  Evento  where idEvento = ?";

    private static final String SQL_SELECCIONAR_UNO =
            "SELECT * FROM  Evento  where idEvento = ?";

    private static final String SQL_SELECCIONAR_TODO =
            "SELECT * FROM  Evento";

    private Connection con;

    private void conectate() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/7CM3";
        String user = "root";
        String password = "LaClaveDeSuMySQL";

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void create(Evento evento) throws SQLException {
        conectate();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(SQL_INSERTAR);
            ps.setString(1, evento.getNombreEvento());
            ps.setDate(2, evento.getFechaEvento());
            ps.setInt(3, evento.getDuracion());
            ps.executeUpdate();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    public void update(Evento evento) throws SQLException {
        conectate();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(SQL_ACTUALIZAR);
            ps.setString(1, evento.getNombreEvento());
            ps.setDate(2, evento.getFechaEvento());
            ps.setInt(3, evento.getDuracion());
            ps.setInt(4, evento.getIdEvento());
            ps.executeUpdate();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    public void delete(Evento evento) throws SQLException {
        conectate();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(SQL_ELIMINAR);
            ps.setInt(1, evento.getIdEvento());
            ps.executeUpdate();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }


}
