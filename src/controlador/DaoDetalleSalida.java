/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import modelo.conexion;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.detalleSalida;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;


public class DaoDetalleSalida {
    Connection con;
    conexion cn=new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
     public boolean insertar(int idSalida, int idEntrada, int cant, double importe) {
 
    String SQL = "INSERT INTO detallesalida (idSalida, idEntrada, cantidad, importe) VALUES (?, ?, ?, ?)";
    
    try {
        con = (Connection) cn.conectar();
        ps = (PreparedStatement) con.prepareStatement(SQL);
        
        ps.setInt(1, idSalida);    
        ps.setInt(2, idEntrada);   
        ps.setInt(3, cant);        
        ps.setDouble(4, importe); 
     
        int n = ps.executeUpdate();
        return (n != 0); 
        
    } catch (Exception e) {
       JOptionPane.showMessageDialog(null, "Error al guardar detalle: " + e.getMessage());
        return false;
    } finally {
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (Exception e) {
            System.out.println("Error al cerrar conexión: " + e.getMessage());
        }
    }
     }
   
}
