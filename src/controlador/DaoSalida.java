package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import modelo.conexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.salidas;
import java.util.List;
import java.sql.*; // (Importa java.sql.SQLException)

public class DaoSalida {
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean insertar(salidas c) {
        String SQL = "INSERT INTO salidas (idCliente, fecha, total) VALUES (?,?,?)";
        
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);
            
            ps.setInt(1, c.getIdCliente());
            ps.setString(2, c.getFecha());
            ps.setDouble(3, c.getTotal());

            int n = ps.executeUpdate();
            return (n != 0);
            
        } catch (Exception e) {
           
            JOptionPane.showMessageDialog(null, "Error al insertar salida: " + e.getMessage());
            return false;
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar conexión: " + ex.getMessage());
            }
        }
    }
    
    public List<salidas> Listar() {
        List<salidas> lista = new ArrayList<>();
        String SQL = "select * from salidas";
        
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                salidas s = new salidas();
                s.setIdSalida(rs.getInt("idSalidas"));
                s.setIdCliente(rs.getInt("idCliente"));
                s.setFecha(rs.getString("fecha")); 
                s.setTotal(rs.getDouble("total"));
                lista.add(s);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar salidas: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
        return lista;
    }
    
}
