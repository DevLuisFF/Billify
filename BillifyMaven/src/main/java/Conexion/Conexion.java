/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DevLuisFF
 */
public class Conexion {

    //metodo para una conexion local
    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Billify", "root", "1234");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local: " + e);
        }
        return null;
    }
}
