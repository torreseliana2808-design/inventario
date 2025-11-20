/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import modelo.conexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.entradas;
import java.util.List;
import java.sql.*;
public class DaoEntradas {
    
    Connection con;
    conexion cn=new conexion();
    PreparedStatement ps;
    ResultSet rs;
   

public boolean insertar(entradas e) {
    String SQL = "INSERT INTO entrada (idproducto, stock, idCategoria, fecha, idproveedor, precioEntrada, precioVenta, total) VALUES (?,?,?,?,?,?,?,?)";
    Connection con = null;
    PreparedStatement ps = null;
    
    try {
        con = (Connection) cn.conectar();
        ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setInt(1, e.getIdProducto());
        ps.setInt(2, e.getStock());
        ps.setInt(3, e.getIdCategoria());
        ps.setString(4, e.getFecha());
        ps.setInt(5, e.getIdproveedor());
        ps.setDouble(6, e.getPrecioEntrada());
        ps.setDouble(7, e.getPrecioVenta());
        ps.setDouble(8, e.getTotal());

        int n = ps.executeUpdate();
        
        return (n != 0);

    } catch (Exception error) {
        JOptionPane.showMessageDialog(null, "Error al insertar entrada: " + error.getMessage());
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
   public List Listar() {
    List<entradas> lista = new ArrayList<>();
    String SQL = "SELECT e.*, p.nombre FROM entrada e JOIN productos p ON e.idproducto = p.idproducto";
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
        con = (Connection) cn.conectar();
        ps = (PreparedStatement) con.prepareStatement(SQL);
        rs = ps.executeQuery();
        
        while (rs.next()) {
            entradas c = new entradas();
            
            c.setIdentrada(rs.getInt("identrada"));
            c.setIdProducto(rs.getInt("idproducto")); 
            c.setStock(rs.getInt("stock"));
            c.setIdCategoria(rs.getInt("idCategoria"));
            c.setFecha(rs.getString("fecha"));
            c.setIdproveedor(rs.getInt("idproveedor"));
            c.setPrecioEntrada(rs.getDouble("precioEntrada"));
            c.setPrecioVenta(rs.getDouble("precioVenta"));
            c.setTotal(rs.getDouble("total"));
            c.setNomProdTemporal(rs.getString("nombre")); 
            
            lista.add(c);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al listar entradas: " + e.getMessage());
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
   public boolean editar(entradas c) {
    String SQL = "UPDATE entrada SET idproducto=?, stock=?, idCategoria=?, fecha=?, idproveedor=?, precioEntrada=?, precioVenta=?, total=? WHERE identrada=?";
    
    try {
        con = (Connection) cn.conectar();
        ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setInt(1, c.getIdProducto());
        ps.setInt(2, c.getStock());
        ps.setInt(3, c.getIdCategoria());
        ps.setString(4, c.getFecha());
        ps.setInt(5, c.getIdproveedor());
        ps.setDouble(6, c.getPrecioEntrada());
        ps.setDouble(7, c.getPrecioVenta());
        ps.setDouble(8, c.getTotal());
        ps.setInt(9, c.getIdentrada());

        int n = ps.executeUpdate();
        
        return (n != 0); 

    } catch (Exception e) {
        JOptionPane.showConfirmDialog(null, e);
        return false;
    }
}
     public boolean eliminar(entradas c){
        String SQL="delete from entrada where identrada=?";
         try{
            con=(Connection) cn.conectar();
            ps=(PreparedStatement) con.prepareStatement(SQL);
            ps.setInt(1, c.getIdentrada());
            int n=ps.executeUpdate();
            if(n!=0){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    public boolean buscar(entradas c) {
    String SQL = "select * from entrada where identrada=?";
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
        con = (Connection) cn.conectar();
        ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setInt(1, c.getIdentrada());
        rs = ps.executeQuery();
        
        if (rs.next()) {
            c.setIdentrada(rs.getInt(1));
            c.setIdProducto(rs.getInt(2));
            c.setStock(rs.getInt(3));
            c.setIdCategoria(rs.getInt(4));
            c.setFecha(rs.getString(5));
            c.setIdproveedor(rs.getInt(6));
            c.setPrecioEntrada(rs.getDouble(7));
            c.setPrecioVenta(rs.getDouble(8));
            c.setTotal(rs.getDouble(9));
            return true;
        } else {
            return false;
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar entrada: " + e.getMessage());
        return false;
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar conexión: " + e.getMessage());
        }
    }
}
     
     public List<entradas> ListarPorNombre(String nombre) {
    List<entradas> lista = new ArrayList<>();
    String SQL = "SELECT e.*, p.nombre FROM entrada e JOIN productos p ON e.idproducto = p.idproducto WHERE p.nombre LIKE ?";
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
        con = (Connection) cn.conectar();
        ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setString(1, "%" + nombre + "%"); // Busca coincidencias
        
        rs = ps.executeQuery();
        
        while (rs.next()) {
            entradas e = new entradas();
            e.setIdentrada(rs.getInt("identrada"));
            e.setIdProducto(rs.getInt("idproducto"));
            e.setStock(rs.getInt("stock"));
            e.setIdCategoria(rs.getInt("idCategoria"));
            e.setFecha(rs.getString("fecha"));
            e.setIdproveedor(rs.getInt("idproveedor"));
            e.setPrecioEntrada(rs.getDouble("precioEntrada"));
            e.setPrecioVenta(rs.getDouble("precioVenta"));
            e.setTotal(rs.getDouble("total"));
             e.setNomProdTemporal(rs.getString("nombre")); 
            lista.add(e);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar por nombre: " + e.getMessage());
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
public List<entradas> ListarPorPrecio(double precio) {
    List<entradas> lista = new ArrayList<>();
    
    String SQL = "SELECT e.*, p.nombre FROM entrada e JOIN productos p ON e.idproducto = p.idproducto WHERE e.precioVenta = ?";
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
        con = (Connection) cn.conectar();
        ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setDouble(1, precio);
        
        rs = ps.executeQuery();
        
        while (rs.next()) {
            entradas e = new entradas();
            
            e.setIdentrada(rs.getInt("identrada"));
            e.setIdProducto(rs.getInt("idproducto"));
            e.setStock(rs.getInt("stock"));
            e.setIdCategoria(rs.getInt("idCategoria"));
            e.setFecha(rs.getString("fecha"));
            e.setIdproveedor(rs.getInt("idproveedor"));
            e.setPrecioEntrada(rs.getDouble("precioEntrada"));
            e.setPrecioVenta(rs.getDouble("precioVenta"));
            e.setTotal(rs.getDouble("total"));
            e.setNomProdTemporal(rs.getString("nombre"));
            lista.add(e);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar por precio: " + e.getMessage());
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

public List<entradas> ListarPorCategoria(String nombreCategoria) {
    List<entradas> lista = new ArrayList<>();
   String SQL = "SELECT e.*, p.nombre FROM entrada e " +
             "JOIN productos p ON e.idproducto = p.idproducto " +
             "JOIN categorias c ON e.idCategoria = c.idCategoria " + // (Corregido a minúscula)
             "WHERE c.categoria LIKE ?";
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
        con = (Connection) cn.conectar();
        ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setString(1, "%" + nombreCategoria + "%"); 
        
        rs = ps.executeQuery();
        
        while (rs.next()) {
            entradas e = new entradas();
            e.setIdentrada(rs.getInt("identrada"));
            e.setIdProducto(rs.getInt("idproducto"));
            e.setStock(rs.getInt("stock"));
            e.setIdCategoria(rs.getInt("idCategoria"));
            e.setFecha(rs.getString("fecha"));
            e.setIdproveedor(rs.getInt("idproveedor"));
            e.setPrecioEntrada(rs.getDouble("precioEntrada"));
            e.setPrecioVenta(rs.getDouble("precioVenta"));
            e.setTotal(rs.getDouble("total"));
            e.setNomProdTemporal(rs.getString("nombre")); 
            lista.add(e);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar por categoría: " + e.getMessage());
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
