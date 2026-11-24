/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.gestorcolecciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author usuario
 */
public class AccesoBD {
   
    private static final String USER = "root";
    private static final String PASSWORD = "1234";
    private static final String URL = "jdbc:mysql://localhost:3306/mi_base_datos";
    
    public static Connection getConn() throws SQLException{
    
        return DriverManager.getConnection(USER,PASSWORD,URL);
    }
    
    private static void crearBD(){}

}
