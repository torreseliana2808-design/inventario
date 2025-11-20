package controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import modelo.conexion;
import modelo.productos;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;
import java.sql.*; 

public class DaoProductos {
    Connection con;
    conexion cn = new conexion();
    PreparedStatement ps;
    ResultSet rs;

    public boolean insertar(productos c) {
        String SQL = "insert into productos (idproducto,nombre,stock,idCategoria,precioV) VALUES (?,?,?,?,?)";
        
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setInt(1, c.getIdproducto());
            ps.setString(2, c.getNomProd());
            ps.setInt(3, c.getStock());
            ps.setInt(4, c.getIdCategoria());
            ps.setDouble(5, c.getPrecioV());
            int n = ps.executeUpdate();
            return (n != 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar producto: " + e.getMessage());
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

    public int numProducto() {
        int numero = 0;
        String SQL = "select max(idproducto) from productos";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);
            rs = ps.executeQuery();

            while (rs.next()) {
                numero = rs.getInt(1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener numProducto: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
        return numero;
    }
    public List<productos> Listar() {
        List<productos> lista = new ArrayList<>();
        String SQL = "select * from productos";
        
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                productos c = new productos();
                c.setIdproducto(rs.getInt("idproducto"));
                c.setNomProd(rs.getString("nombre"));
                c.setStock(rs.getInt("stock"));
                c.setIdCategoria(rs.getInt("idcategoria"));
                c.setPrecioV(rs.getDouble("precioV"));
                lista.add(c);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar productos: " + e.getMessage());
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

    public boolean buscar(productos c) {
        String SQL = "select * from productos where idproducto = ?";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setInt(1, c.getIdproducto());
            rs = ps.executeQuery();

            if (rs.next()) {
                c.setIdproducto(rs.getInt("idproducto"));
                c.setNomProd(rs.getString("nombre"));
                c.setStock(rs.getInt("stock"));
                c.setIdCategoria(rs.getInt("idcategoria"));
                c.setPrecioV(rs.getDouble("precioV"));
                return true;
            } else {
                return false; 
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar producto: " + e.getMessage());
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

    public List<productos> ListarPorNombre(String nombre) {
        List<productos> lista = new ArrayList<>();
        String SQL = "SELECT * FROM productos WHERE nombre LIKE ?";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setString(1, "%" + nombre + "%"); 
            rs = ps.executeQuery();

            while (rs.next()) {
                productos c = new productos();
                c.setIdproducto(rs.getInt("idproducto"));
                c.setNomProd(rs.getString("nombre"));
                c.setStock(rs.getInt("stock"));
                c.setIdCategoria(rs.getInt("idcategoria"));
                c.setPrecioV(rs.getDouble("precioV"));
                lista.add(c);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar por nombre: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }finally {
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

    public List<productos> ListarPorCategoria(int idCat) {
        List<productos> lista = new ArrayList<>();
        String SQL = "SELECT * FROM productos WHERE idcategoria = ?";
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setInt(1, idCat);
            rs = ps.executeQuery();

            while (rs.next()) {
                productos c = new productos();
                c.setIdproducto(rs.getInt("idproducto"));
                c.setNomProd(rs.getString("nombre"));
                c.setStock(rs.getInt("stock"));
                c.setIdCategoria(rs.getInt("idcategoria"));
                c.setPrecioV(rs.getDouble("precioV"));
                lista.add(c);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar por categoría: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexión: " + e.getMessage());
            }finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar conexión: " + e.getMessage());
        }
    }
        }
        return lista;
    }
    

    public boolean sumarStock(int idproducto, int cant) {
        String SQL = "UPDATE productos SET stock = stock + ? WHERE idproducto = ?";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setInt(1, cant); 
            ps.setInt(2, idproducto); 
            int n = ps.executeUpdate();
            return (n != 0); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al sumar stock: " + e.getMessage());
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

    public boolean restarStock(int idp, int cant) {
        String SQL = "UPDATE productos SET stock = stock - ? WHERE idproducto = ?";
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setInt(1, cant); 
            ps.setInt(2, idp); 
            int n = ps.executeUpdate();
            return (n != 0); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al restar stock: " + e.getMessage());
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

    public boolean editar(productos c) {
        String SQL = "update productos set nombre=?, stock=?, idCategoria=?, precioV=? where idproducto=?";
        
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setString(1, c.getNomProd());
            ps.setInt(2, c.getStock());
            ps.setInt(3, c.getIdCategoria());
            ps.setDouble(4, c.getPrecioV());
            ps.setInt(5, c.getIdproducto()); 
            
            int n = ps.executeUpdate();
            return (n != 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al editar producto: " + e.getMessage());
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

    public boolean eliminar(int idp) {
        String SQL = "delete from productos where idproducto=?";
        
        Connection con = null;
        PreparedStatement ps = null;
        
        try {
            con = (Connection) cn.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL);
            ps.setInt(1, idp);
            int n = ps.executeUpdate();
            return (n != 0);
        } catch (Exception e) {
            if (e.getMessage().contains("foreign key constraint")) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar: El producto está en uso en Entradas o Salidas.", "Error de Borrado", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar producto: " + e.getMessage());
            }
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
    public boolean editarPrecioV(productos p) {
    // Este método actualiza SOLO el precio de venta de un producto
    String SQL = "UPDATE productos SET precioV = ? WHERE idproducto = ?";
    
    Connection con = null;
    PreparedStatement ps = null;
    
    try {
        con = (Connection) cn.conectar();
        ps = (PreparedStatement) con.prepareStatement(SQL);
        
        ps.setDouble(1, p.getPrecioV());
        ps.setInt(2, p.getIdproducto());
        
        int n = ps.executeUpdate();
        return (n != 0);
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al editar precio: " + e.getMessage());
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
}
