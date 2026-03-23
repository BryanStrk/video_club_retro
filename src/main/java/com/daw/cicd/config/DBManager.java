package com.daw.cicd.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

    private static final String URL = "jdbc:mysql://localhost:3306/video_club_db";
    private static final String USER = "root";
    private static final String PASSWORD = "Slender980430486";

    private static Connection connection;

    public static Connection initConnection(){
        try{
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión a la BBDD exitosa");

        } catch (SQLException exception) {
            System.out.println("Conexion fallida : " + exception.getMessage());
        }

        return connection;
    }

    public static void closeConnection(){
        try{
            if (connection != null) {
                connection.close();
                System.out.println("Conexión cerrada con Éxito");
            }
        } catch (SQLException exception) {
            System.out.println("Error al cerrar la BBDD : " + exception.getMessage());
        }
    }
}