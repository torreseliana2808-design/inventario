
package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import modelo.conexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.proveedor;
import java.util.List;


public class DaoProveedor {
    Connection con;
    conexion cn=new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean insertar(proveedor p){
        String SQL="insert into proveedor (nombre,documento,direccion,telefono,correo) VALUES (?,?,?,?,?)";
        try{
            con=(Connection) cn.conectar();
            ps=(PreparedStatement) con.prepareStatement(SQL);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDocumento());
            ps.setString(3, p.getDireccion());
            ps.setString(4, p.getTelefono());
            ps.setString(5, p.getCorreo());
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
        List<proveedor> lista=new ArrayList<>();
        String SQL="select * from proveedor";
        try{
            con=(Connection) cn.conectar();
            ps=(PreparedStatement) con.prepareStatement(SQL);
            rs=ps.executeQuery();
            while(rs.next()){
                proveedor c=new proveedor();
                c.setIdProveedor(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setDocumento(rs.getString(3));
                c.setDireccion(rs.getString(4));
                c.setTelefono(rs.getString(5));
                c.setCorreo(rs.getString(6));
                lista.add(c);
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        return lista;
    }
public boolean buscar(proveedor c){
        String SQL="select * from proveedor where idproveedor=?";
         try{
            con=(Connection) cn.conectar();
            ps=(PreparedStatement) con.prepareStatement(SQL);
            ps.setInt(1, c.getIdProveedor());
            rs=ps.executeQuery();
            if(rs.next()){
                c.setIdProveedor(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setDocumento(rs.getString(3));
                c.setDireccion(rs.getString(4));
                c.setTelefono(rs.getString(5));
                c.setCorreo(rs.getString(6));
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
public boolean editar(modelo.proveedor p) { // Usa el modelo Proveedor
   
    String SQL = "UPDATE proveedor SET nombre=?, documento=?, direccion=?, telefono=?, correo=? WHERE idProveedor=?";
    
    try {
        con = (Connection) cn.conectar();
        ps = (PreparedStatement) con.prepareStatement(SQL);
        
       
        ps.setString(1, p.getNombre());
        ps.setString(2, p.getDocumento());
        ps.setString(3, p.getDireccion());
        ps.setString(4, p.getTelefono()); 
        ps.setString(5, p.getCorreo());
        
        ps.setInt(6, p.getIdProveedor()); 
        int n = ps.executeUpdate();
        
        return (n != 0); 

    } catch (Exception e) {
        JOptionPane.showConfirmDialog(null, e);
        return false;
    }
}
public boolean eliminar(proveedor c){
        String SQL="delete from proveedor where idproveedor=?";
         try{
            con=(Connection) cn.conectar();
            ps=(PreparedStatement) con.prepareStatement(SQL);
            ps.setInt(1, c.getIdProveedor());
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
public boolean buscarPorDocumento(proveedor c) {
    String SQL = "select * from proveedor where documento=?";
    try {
        con = (Connection) cn.conectar();
        ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setString(1, c.getDocumento());
        rs = ps.executeQuery();
        
        if (rs.next()) {
            c.setIdProveedor(rs.getInt("idProveedor"));
            c.setNombre(rs.getString("nombre"));
            c.setDocumento(rs.getString("documento"));
            c.setDireccion(rs.getString("direccion"));
            c.setTelefono(rs.getString("telefono"));
            c.setCorreo(rs.getString("correo"));
            return true;
        } else {
            return false;
        }
    } catch (Exception e) {
        JOptionPane.showConfirmDialog(null, e);
        return false;
    }
}
public List<proveedor> ListarPorNombre(String nombre) {
    List<proveedor> lista = new ArrayList<>();
    String SQL = "SELECT * FROM proveedor WHERE nombre LIKE ?";
    
    try {
        con = (Connection) cn.conectar();
        ps = (PreparedStatement) con.prepareStatement(SQL);
        ps.setString(1, "%" + nombre + "%"); 
        
        rs = ps.executeQuery();
        
        while (rs.next()) {
            proveedor c = new proveedor();
            c.setIdProveedor(rs.getInt("idProveedor"));
            c.setNombre(rs.getString("nombre"));
            c.setDocumento(rs.getString("documento"));
            c.setDireccion(rs.getString("direccion"));
            c.setTelefono(rs.getString("telefono"));
            c.setCorreo(rs.getString("correo"));
            lista.add(c);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al listar por nombre: " + e.getMessage());
    }
    return lista;
}
}
