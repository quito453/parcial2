/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.parcial2;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Daiki
 */
public class Parcial2 {

    public static void main(String[] args) throws SQLException {
       final String DB_URL = "jdbc:mysql://localhost/";
       final String USERNAME  = "root";
       final String PASSWORD = "";
   
       Connection conn = null;
       Statement stmt = null;
      
       try{
           conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
           stmt = (Statement) conn.createStatement();
           
           String sql = "INSERT INTO estudiantes (id_estudiante, carnet, nombres, apellidos, direccion, telefono, genero, email, fecha_nacimiento)" + "VALUES (a, b, c, d, e, f, g, h, i)"; 
           stmt.executeUpdate(sql);
           System.out.println("Se ha agregado el Estudiante");
           
       }catch(Exception e){
           e.printStackTrace();
          
        String query1 = "DELETE FROM estudiantes " +
          "where text_eliminar.";
          stmt.executeUpdate(query1);
          System.out.println("Record is deleted from the table successfully..................");
       } catch (SQLException excep) {
          excep.printStackTrace();
       } catch (Exception excep) {
          excep.printStackTrace();
       } finally {
          try {
             if (stmt != null)
             conn.close();
          } catch (SQLException se) {}
          try {
             if (conn != null)
             conn.close();
          } catch (SQLException se) {
             se.printStackTrace();
          }
       }
       System.out.println("Please check it in the MySQL Table. Record is now deleted.......");
    }
       }
    }
}
