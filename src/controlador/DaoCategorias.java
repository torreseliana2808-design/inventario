/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import modelo.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Categoria;

/**
 *
 * @author User
 */
public class DaoCategorias {
    Connection con;
    conexion cn=new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean insertar(Categoria c){
        String SQL="insert into categorias (categoria) VALUES (?)";
        try{
            con=(Connection) cn.conectar();
            ps=(PreparedStatement) con.prepareStatement(SQL);
            ps.setString(1, c.getNomCategoria());
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
    public List Listar(){
        List<Categoria> lista=new ArrayList<>();
        String SQL="select * from categorias";
        try{
            con=(Connection) cn.conectar();
            ps=(PreparedStatement) con.prepareStatement(SQL);
            rs=ps.executeQuery();
            while(rs.next()){
                Categoria c=new Categoria();
                c.setIdCategoria(rs.getInt(1));
                c.setNomCategoria(rs.getString(2));
                lista.add(c);
            }
        }catch(SQLException e){
            JOptionPane.showConfirmDialog(null, e);
        }
        return lista;
    }
    
     public boolean editar(Categoria c){
        String SQL="update categorias set categoria=? where idCategoria=?";
        try{
            con=(Connection) cn.conectar();
            ps=(PreparedStatement) con.prepareStatement(SQL);
            ps.setString(1, c.getNomCategoria());
            ps.setInt(2, c.getIdCategoria());
            int n=ps.executeUpdate();
            if(n!=0){
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
      public boolean eliminar(Categoria c){
        String SQL="delete from categorias where idCategoria=?";
         try{
            con=(Connection) cn.conectar();
            ps=(PreparedStatement) con.prepareStatement(SQL);
            ps.setInt(1, c.getIdCategoria());
            int n=ps.executeUpdate();
            if(n!=0){
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
       public boolean buscar(Categoria c){
        String SQL="select * from categorias where idCategoria=?";
         try{
            con=(Connection) cn.conectar();
            ps=(PreparedStatement) con.prepareStatement(SQL);
            ps.setInt(1, c.getIdCategoria());
            rs=ps.executeQuery();
            if(rs.next()){
                c.setIdCategoria(rs.getInt(1));
                c.setNomCategoria(rs.getString(2));
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
}
