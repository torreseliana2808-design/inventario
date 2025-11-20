/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.DaoCategorias;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;

public class Categorias extends javax.swing.JPanel {

    Categoria ct=new Categoria();
    DaoCategorias daoCt=new DaoCategorias();
    DefaultTableModel modeloCategoria=new DefaultTableModel();
    
    
    
    public Categorias() {
        initComponents();
        listarCategorias();
       
    }
    
       private void listarCategorias(){
        List<Categoria> lista=daoCt.Listar();
        modeloCategoria=(DefaultTableModel) tblcategorias.getModel();
        Object[] ob=new Object[2];
        for(int i=0;i<lista.size();i++){
            ob[0]=lista.get(i).getIdCategoria();
            ob[1]=lista.get(i).getNomCategoria();
            modeloCategoria.addRow(ob);
        }
       tblcategorias.setModel(modeloCategoria);
    }


    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jpanelRound1 = new modelo.JpanelRound();
        txtnomCategoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtidcategoria = new javax.swing.JTextField();
        btnBuscar = new RSMaterialComponent.RSButtonMaterialIconDos();
        jpanelRound2 = new modelo.JpanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcategorias = new javax.swing.JTable();
        btnGuardar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEditar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEliminar = new RSMaterialComponent.RSButtonMaterialIconDos();

        jLabel2.setText("jLabel2");

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(649, 552));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Categorias");

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setRoundBottomLeft(25);
        jpanelRound1.setRoundBottomRight(25);
        jpanelRound1.setRoundTopLeft(25);
        jpanelRound1.setRoundTopRight(25);

        txtnomCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomCategoriaActionPerformed(evt);
            }
        });

        jLabel3.setText("ID");

        jLabel4.setText("Nombre");

        txtidcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(159, 159, 159))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtidcategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnomCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtidcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnomCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        btnBuscar.setBackground(new java.awt.Color(14, 76, 117));
        btnBuscar.setText("Buscar");
        btnBuscar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscar.setRound(25);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jpanelRound2.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound2.setPreferredSize(new java.awt.Dimension(339, 276));
        jpanelRound2.setRoundBottomLeft(25);
        jpanelRound2.setRoundBottomRight(25);
        jpanelRound2.setRoundTopLeft(25);
        jpanelRound2.setRoundTopRight(25);

        tblcategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Categoria"
            }
        ));
        tblcategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcategorias);

        javax.swing.GroupLayout jpanelRound2Layout = new javax.swing.GroupLayout(jpanelRound2);
        jpanelRound2.setLayout(jpanelRound2Layout);
        jpanelRound2Layout.setHorizontalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jpanelRound2Layout.setVerticalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(328, 328, 328)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomCategoriaActionPerformed

    private void txtidcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidcategoriaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
           ct.setIdCategoria(Integer.parseInt(txtidcategoria.getText()));
        if(daoCt.buscar(ct)){
            txtidcategoria.setText(ct.getIdCategoria()+"");
            txtnomCategoria.setText(ct.getNomCategoria());
        }else{
            JOptionPane.showMessageDialog(null, "La categoría no existe");
            limpiarCampos();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
         ct.setNomCategoria(txtnomCategoria.getText());
         if(daoCt.insertar(ct)){
         JOptionPane.showMessageDialog(null, "Categoria Registrada Con Exito");
     
       }else{
           JOptionPane.showMessageDialog(null, "No se pudo registrar la Categoria");
    }//GEN-LAST:event_btnGuardarActionPerformed
   limpiarTablaCategoria();
   listarCategorias();
   limpiarCampos();
    }
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    int fila=tblcategorias.getSelectedRow();
    if(fila==-1&&txtidcategoria.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Seleccione una categoria");   
        }else{
            ct.setIdCategoria(Integer.parseInt(txtidcategoria.getText()));
            ct.setNomCategoria(txtnomCategoria.getText());
            if(daoCt.editar(ct)){
                JOptionPane.showMessageDialog(null, "Se modifico con exito");
                limpiarTablaCategoria();
                listarCategorias();
                limpiarCampos();
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         if(!txtidcategoria.getText().isEmpty()){
            int confirmacion=JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar la categoria?","Confirmar",2);
            if(confirmacion==0){
                ct.setIdCategoria(Integer.parseInt(txtidcategoria.getText()));
                daoCt.eliminar(ct);
                limpiarTablaCategoria();
                listarCategorias();
                limpiarCampos();
               JOptionPane.showMessageDialog(null, "Se eliminó con exito la categoria");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una categoria");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblcategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcategoriasMouseClicked
   int fila=tblcategorias.getSelectedRow();
        txtidcategoria.setText(tblcategorias.getValueAt(fila, 0).toString());
        txtnomCategoria.setText(tblcategorias.getValueAt(fila, 1).toString());
    }//GEN-LAST:event_tblcategoriasMouseClicked

void limpiarCampos(){
        txtidcategoria.setText("");
        txtnomCategoria.setText("");
    }

 void limpiarTablaCategoria(){
        for(int i=0;i<modeloCategoria.getRowCount();i++){
            modeloCategoria.removeRow(i);
            i=0-1;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEditar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEliminar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private modelo.JpanelRound jpanelRound1;
    private modelo.JpanelRound jpanelRound2;
    private javax.swing.JTable tblcategorias;
    private javax.swing.JTextField txtidcategoria;
    private javax.swing.JTextField txtnomCategoria;
    // End of variables declaration//GEN-END:variables
}
