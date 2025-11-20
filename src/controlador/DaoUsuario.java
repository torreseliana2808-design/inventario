/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.conexion;
import modelo.usuarios;
import java.util.List;

public class DaoUsuario {
    
    Connection con;
    conexion cn=new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
      public usuarios login(String usuario, String pass) { 
    usuarios us = new usuarios();
    String sql = "SELECT * FROM usuarios WHERE usuario = ? AND pass = ENCODE(?, 'clave')";

   
    
    try {
        con = cn.conectar(); 
        ps = con.prepareStatement(sql);

        
        ps.setString(1, usuario);
        ps.setString(2, pass);

        rs = ps.executeQuery(); 

        while (rs.next()) {
            us.setIdusuario(rs.getInt(1));
            us.setNombre(rs.getString(2));
            us.setApellido(rs.getString(3));
            us.setDocumento(rs.getString(4));
            us.setDireccion(rs.getString(5));
            us.setTelefono(rs.getString(6));
            us.setCorreo(rs.getString(7));
            us.setTipoUsuario(rs.getString(8));
            us.setUsaurio(rs.getString(9));
            us.setPassword(rs.getString(10));
        }
    } catch (SQLException ex) {
       
        JOptionPane.showMessageDialog(null, "Error de SQL: " + ex.getMessage());
    } finally {
        
         try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar conexión: " + e.getMessage());
        }
    }
    return us;
}
 public boolean insertar(String nombre, String apellido, String documento, String direccion, String telefono, String correo,
                       String tipouser, String user, String pass) {
  
    String SQL = "INSERT INTO usuarios (nombre, apellido, documento, direccion, telefono, correo, tipoUsuario, usuario, pass) "
               + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ENCODE(?, 'clave'))";
    
    Connection con = null;
    PreparedStatement ps = null;
    
    try {
        con = cn.conectar();
        ps = con.prepareStatement(SQL);
        ps.setString(1, nombre);
        ps.setString(2, apellido);
        ps.setString(3, documento);
        ps.setString(4, direccion);
        ps.setString(5, telefono);
        ps.setString(6, correo);
        ps.setString(7, tipouser);
        ps.setString(8, user);
        ps.setString(9, pass); 
        
        int n = ps.executeUpdate();
        return (n != 0);
        
    } catch (Exception e) {
        
        JOptionPane.showMessageDialog(null, "Error al insertar usuario: " + e.getMessage());
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
   public List Listar(){
        List<usuarios> lista=new ArrayList<>();
        String SQL="select * from usuarios";
        try{
            con=cn.conectar();
            ps=con.prepareStatement(SQL);
            rs=ps.executeQuery();
            while(rs.next()){
                usuarios c=new usuarios();
                c.setIdusuario(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setDocumento(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setTelefono(rs.getString(6));
                c.setCorreo(rs.getString(7));
                c.setTipoUsuario(rs.getString(8));
                c.setUsaurio(rs.getString(9));
                c.setPassword(rs.getString(10));
                lista.add(c);
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        return lista;
   }
public boolean buscar(usuarios c) {
    String SQL = "SELECT idUsuario, nombre, apellido, documento, direccion, telefono, " +
                 "correo, tipoUsuario, usuario, DECODE(pass, 'clave') as pass " +
                 "FROM usuarios WHERE documento = ?";
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
        con = cn.conectar();
        ps = con.prepareStatement(SQL);
        ps.setString(1, c.getDocumento());
        rs = ps.executeQuery();
        
        if (rs.next()) {
            c.setIdusuario(rs.getInt(1));
            c.setNombre(rs.getString(2));
            c.setApellido(rs.getString(3));
            c.setDocumento(rs.getString(4));
            c.setDireccion(rs.getString(5));
            c.setTelefono(rs.getString(6));
            c.setCorreo(rs.getString(7));
            c.setTipoUsuario(rs.getString(8));
            c.setUsaurio(rs.getString(9));   
            c.setPassword(rs.getString(10));  
            return true;
        } else {
            return false;
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al buscar usuario: " + e.getMessage());
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
public boolean editar(usuarios c) {
 
    String SQL = "UPDATE usuarios SET nombre = ?, apellido = ?, documento = ?, direccion = ?, " +
                 "telefono = ?, correo = ?, tipoUsuario = ?, usuario = ?, pass = ENCODE(?, 'clave') " +
                 "WHERE idUsuario = ?";
    
    Connection con = null;
    PreparedStatement ps = null;
    
    try {
        con = cn.conectar();
        ps = con.prepareStatement(SQL);
        ps.setString(1, c.getNombre());
        ps.setString(2, c.getApellido());
        ps.setString(3, c.getDocumento());
        ps.setString(4, c.getDireccion());
        ps.setString(5, c.getTelefono());
        ps.setString(6, c.getCorreo());
        ps.setString(7, c.getTipoUsuario());
        ps.setString(8, c.getUsaurio()); 
        ps.setString(9, c.getPassword()); 
        ps.setInt(10, c.getIdusuario());  
        int n = ps.executeUpdate();
        return (n != 0); 
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al editar usuario: " + e.getMessage());
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
public boolean eliminar(usuarios c){
        String SQL="delete from usuarios where idUsuario=?";
         try{
            con=cn.conectar();
            ps=con.prepareStatement(SQL);
            ps.setInt(1, c.getIdusuario());
            int n=ps.executeUpdate();
            if(n!=0){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }}
}