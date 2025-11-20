/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.DaoCategorias;
import controlador.DaoProductos;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.productos;

/**
 *
 * @author User
 */
public class Productos extends javax.swing.JPanel {

   productos p = new productos();
    DaoProductos daoP = new DaoProductos();
    DefaultTableModel modelo = new DefaultTableModel();
    Categoria ct = new Categoria();
    DaoCategorias daoCt = new DaoCategorias();
    
    public Productos() {
        initComponents();
        listarProductos();
        numProducto();
    }
private void listarProductos() {
        List<productos> lista = daoP.Listar();
        modelo = (DefaultTableModel) tablaProductos.getModel();
        modelo.setRowCount(0); 
        Object[] ob = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdproducto();
            ob[1] = lista.get(i).getNomProd();
            ob[2] = lista.get(i).getStock();
            ob[3] = lista.get(i).getIdCategoria();
            ob[4] = lista.get(i).getPrecioV();
            modelo.addRow(ob);
        }
    }
     void numProducto() {
        int numero = daoP.numProducto(); 
        if (numero == 0) {
            txtid.setText("1");
        } else {
            int i = numero;
            i = i + 1;
            txtid.setText(i + "");
        }
    }
      private void limpiarTablaProductos() {
        modelo = (DefaultTableModel) tablaProductos.getModel();
        modelo.setRowCount(0);
    }
      private void limpiarCampos() {
        txtid.setText("");
        txtnombreproducto.setText("");
        txtcategoria.setText("");
        txtidcategoria.setText("");
        numProducto(); 
    }


   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jpanelRound1 = new modelo.JpanelRound();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnombreproducto = new javax.swing.JTextField();
        txtidcategoria = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcategoria = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        btnBuscarCategoria = new RSMaterialComponent.RSButtonMaterialIconDos();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnGuardar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEditar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEliminar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnBuscar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnLimpiar = new RSMaterialComponent.RSButtonMaterialIconDos();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Productos");

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setRoundBottomLeft(25);
        jpanelRound1.setRoundBottomRight(25);
        jpanelRound1.setRoundTopLeft(25);
        jpanelRound1.setRoundTopRight(25);

        jLabel3.setText("ID ");

        jLabel4.setText("Nombre Producto");

        jLabel5.setText("IDCategoria");

        txtnombreproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreproductoActionPerformed(evt);
            }
        });

        txtidcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcategoriaActionPerformed(evt);
            }
        });

        jLabel8.setText("Categoria");

        txtcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcategoriaActionPerformed(evt);
            }
        });
        txtcategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcategoriaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcategoriaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcategoriaKeyTyped(evt);
            }
        });

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        btnBuscarCategoria.setBackground(new java.awt.Color(50, 130, 181));
        btnBuscarCategoria.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscarCategoria.setRound(25);
        btnBuscarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(txtnombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtidcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtidcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre ", "Stock", "IDCategoria", "P.Venta"
            }
        ));
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        btnGuardar.setBackground(new java.awt.Color(14, 76, 117));
        btnGuardar.setText("Guardar");
        btnGuardar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnGuardar.setRound(25);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(14, 76, 117));
        btnEditar.setText("Editar");
        btnEditar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btnEditar.setRound(25);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(14, 76, 117));
        btnEliminar.setText("Eliminar");
        btnEliminar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        btnEliminar.setRound(25);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(14, 76, 117));
        btnBuscar.setText("Buscar");
        btnBuscar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscar.setRound(25);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(14, 76, 117));
        btnLimpiar.setText("Limpiar Datos");
        btnLimpiar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CANCEL);
        btnLimpiar.setRound(25);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 91, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtidcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidcategoriaActionPerformed

    private void txtcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcategoriaActionPerformed

    private void txtcategoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcategoriaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcategoriaKeyPressed

    private void txtcategoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcategoriaKeyReleased
     
    }//GEN-LAST:event_txtcategoriaKeyReleased

    private void txtcategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcategoriaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcategoriaKeyTyped

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
  int fila = tablaProductos.getSelectedRow();
        if (fila == -1) return;

        try {
            int idProducto = Integer.parseInt(tablaProductos.getValueAt(fila, 0).toString());
            p.setIdproducto(idProducto);
            
            
            if (daoP.buscar(p)) { 
               
                txtid.setText(String.valueOf(p.getIdproducto()));
                txtnombreproducto.setText(p.getNomProd());
                txtidcategoria.setText(String.valueOf(p.getIdCategoria()));
                ct.setIdCategoria(p.getIdCategoria());
                if (daoCt.buscar(ct)) { 
                    txtcategoria.setText(ct.getNomCategoria());
                } else {
                    txtcategoria.setText("Error");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al seleccionar fila.");
        }        
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    if (txtid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione un Producto");
            return;
        }
        
        try {
            p.setIdproducto(Integer.parseInt(txtid.getText()));
            p.setNomProd(txtnombreproducto.getText());
            p.setIdCategoria(Integer.parseInt(txtidcategoria.getText()));
            if (daoP.editar(p)) { 
                JOptionPane.showMessageDialog(null, "Se modifico con exito");
                limpiarCampos();
                limpiarTablaProductos();
                listarProductos();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar el Producto");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error de formato. Revise los campos numéricos.");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    if (txtid.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto para eliminar");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
            "¿Seguro que quieres borrar este PRODUCTO del catálogo?\nEsta acción es PERMANENTE.",
            "Confirmar Borrado",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE);

        if (confirm == 0) { 
            try {
                int idp = Integer.parseInt(txtid.getText());
                if (daoP.eliminar(idp)) { 
                    JOptionPane.showMessageDialog(null, "Producto eliminado con éxito.");
                    limpiarCampos();
                    listarProductos();
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "ID inválido.");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
String id = txtid.getText();
    String nombre = txtnombreproducto.getText();
    String idCategoria = txtidcategoria.getText();
   

    try {
        if (!id.isEmpty()) {
           
            p.setIdproducto(Integer.parseInt(id)); 
            if (daoP.buscar(p)) {
               
                txtid.setText(String.valueOf(p.getIdproducto()));
                txtnombreproducto.setText(p.getNomProd());
                txtidcategoria.setText(String.valueOf(p.getIdCategoria()));
               

                ct.setIdCategoria(p.getIdCategoria());
                if(daoCt.buscar(ct)) { txtcategoria.setText(ct.getNomCategoria()); }
                
            } else {
                JOptionPane.showMessageDialog(this, "Producto no encontrado.");
            }

        } else if (!nombre.isEmpty()) {
           
            List<productos> lista = daoP.ListarPorNombre(nombre);
            actualizarTabla(lista, "nombre");

        } else if (!idCategoria.isEmpty()) {
           
            List<productos> lista = daoP.ListarPorCategoria(Integer.parseInt(idCategoria));
            actualizarTabla(lista, "categoría");

            
        } else {
         
            listarProductos(); 
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID o Categoría deben ser números.");
    }

    }//GEN-LAST:event_btnBuscarActionPerformed
    private void actualizarTabla(List<productos> lista, String criterio) {
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontraron productos por " + criterio);
        }

        limpiarTablaProductos();
        modelo = (DefaultTableModel) tablaProductos.getModel();
        Object[] ob = new Object[5]; 

        for (productos prod : lista) {
            ob[0] = prod.getIdproducto();
            ob[1] = prod.getNomProd();
            ob[2] = prod.getStock();
            ob[3] = prod.getIdCategoria();
            ob[4] = prod.getPrecioV();
            modelo.addRow(ob);
        }
    }
    private void txtnombreproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreproductoActionPerformed

    private void btnBuscarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCategoriaActionPerformed
        BuscarDato.tipo=true;
        BuscarDato.entrada=false;
        BuscarDato m=new BuscarDato();
        m.setVisible(true);
    }//GEN-LAST:event_btnBuscarCategoriaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
try {
       
        p.setIdproducto(Integer.parseInt(txtid.getText()));
        p.setNomProd(txtnombreproducto.getText());
        p.setIdCategoria(Integer.parseInt(txtidcategoria.getText()));
        
        p.setStock(0); 
        p.setPrecioV(0.0); 

       
        if (daoP.insertar(p)) {
            JOptionPane.showMessageDialog(null, "Producto Registrado Con Exito");
            limpiarCampos();
            limpiarTablaProductos(); 
            listarProductos();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo registrar el Producto");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Error de formato. Revise los campos numéricos.");
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscarCategoria;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEditar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEliminar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnGuardar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private modelo.JpanelRound jpanelRound1;
    private javax.swing.JTable tablaProductos;
    public static javax.swing.JTextField txtcategoria;
    private javax.swing.JTextField txtid;
    public static javax.swing.JTextField txtidcategoria;
    public static javax.swing.JTextField txtnombreproducto;
    // End of variables declaration//GEN-END:variables
}

