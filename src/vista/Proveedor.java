/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.DaoProveedor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.proveedor;

/**
 *
 * @author User
 */
public class Proveedor extends javax.swing.JPanel {

   proveedor p=new proveedor();
   DaoProveedor dao=new DaoProveedor();
   DefaultTableModel modelo=new DefaultTableModel();
    public Proveedor() {
        initComponents();
        listarProveedor();
    }
     private void listarProveedor(){
        List<proveedor> lista=dao.Listar();
        modelo=(DefaultTableModel) tablaproveedores.getModel();
        Object[] ob=new Object[8];
        for(int i=0;i<lista.size();i++){
            ob[0]=lista.get(i).getIdProveedor();
            ob[1]=lista.get(i).getNombre();
            ob[2]=lista.get(i).getDocumento();
            ob[3]=lista.get(i).getDireccion();
            ob[4]=lista.get(i).getTelefono();
            ob[5]=lista.get(i).getCorreo();
            modelo.addRow(ob);
        }
       tablaproveedores.setModel(modelo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jpanelRound1 = new modelo.JpanelRound();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtdocumento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jpanelRound2 = new modelo.JpanelRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaproveedores = new javax.swing.JTable();
        btnGuardar1 = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEditar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEliminar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnBuscar = new RSMaterialComponent.RSButtonMaterialIconDos();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Proveedores");

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setRoundBottomLeft(25);
        jpanelRound1.setRoundBottomRight(25);
        jpanelRound1.setRoundTopLeft(25);
        jpanelRound1.setRoundTopRight(25);

        jLabel3.setText("ID");

        jLabel4.setText("Nombre");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        jLabel5.setText("Documento");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jLabel6.setText("Apellido");

        txtdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdocumentoActionPerformed(evt);
            }
        });

        jLabel8.setText("Direccion");

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        jLabel9.setText("Telefono");

        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });

        jLabel10.setText("Correo");

        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(145, 145, 145)
                        .addComponent(jLabel6))
                    .addComponent(jLabel4)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
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
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanelRound2.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound2.setPreferredSize(new java.awt.Dimension(339, 276));
        jpanelRound2.setRoundBottomLeft(25);
        jpanelRound2.setRoundBottomRight(25);
        jpanelRound2.setRoundTopLeft(25);
        jpanelRound2.setRoundTopRight(25);

        tablaproveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Documento", "Direccion", "Telefono", "Correo"
            }
        ));
        tablaproveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaproveedoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaproveedores);

        javax.swing.GroupLayout jpanelRound2Layout = new javax.swing.GroupLayout(jpanelRound2);
        jpanelRound2.setLayout(jpanelRound2Layout);
        jpanelRound2Layout.setHorizontalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jpanelRound2Layout.setVerticalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnGuardar1.setBackground(new java.awt.Color(14, 76, 117));
        btnGuardar1.setText("Guardar");
        btnGuardar1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnGuardar1.setRound(25);
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jLabel1))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdocumentoActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void tablaproveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproveedoresMouseClicked
        int fila=tablaproveedores.getSelectedRow();
        txtid.setText(tablaproveedores.getValueAt(fila, 0).toString());
        txtnombre.setText(tablaproveedores.getValueAt(fila, 1).toString());
        txtdocumento.setText(tablaproveedores.getValueAt(fila, 2).toString());
        txtdireccion.setText(tablaproveedores.getValueAt(fila, 3).toString());
        txttelefono.setText(tablaproveedores.getValueAt(fila, 4).toString());
        txtcorreo.setText(tablaproveedores.getValueAt(fila, 5).toString());
       
    }//GEN-LAST:event_tablaproveedoresMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
     if(!txtid.getText().isEmpty()){
            int confirmacion=JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar el Proveedor?","Confirmar",2);
            if(confirmacion==0){
                p.setIdProveedor(Integer.parseInt(txtid.getText()));
                dao.eliminar(p);
                limpiarCampos();
                limpiarTablaProveedor();
                listarProveedor();
                 JOptionPane.showMessageDialog(null,"Se Elimino con exito el Proveedor");
            }
        }else{
             JOptionPane.showMessageDialog(null,"Seleccione un Proveedor");
        }        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
   String doc = txtdocumento.getText();
    String nom = txtnombre.getText();

    try {
        if (!doc.isEmpty()) {
            
            p.setDocumento(doc);
            if (dao.buscarPorDocumento(p)) {
                txtid.setText(String.valueOf(p.getIdProveedor()));
                txtnombre.setText(p.getNombre());
                txtdocumento.setText(p.getDocumento());
                txtdireccion.setText(p.getDireccion());
                txttelefono.setText(p.getTelefono());
                txtcorreo.setText(p.getCorreo());
                modelo = (DefaultTableModel) tablaproveedores.getModel();
                modelo.setRowCount(0);

            } else {
                JOptionPane.showMessageDialog(null, "No se encontró proveedor con ese documento");
                limpiarCampos();
            }
        } 
        
        
        else if (!nom.isEmpty()) {
            
            
            List<proveedor> lista = dao.ListarPorNombre(nom);
            
            if (lista.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encontraron proveedores con ese nombre");
            }

            modelo = (DefaultTableModel) tablaproveedores.getModel();
            modelo.setRowCount(0); 

            Object[] ob = new Object[6]; 
            for (proveedor item : lista) {
                ob[0] = item.getIdProveedor();
                ob[1] = item.getNombre();
                ob[2] = item.getDocumento();
                ob[3] = item.getDireccion();
                ob[4] = item.getTelefono();
                ob[5] = item.getCorreo();
                modelo.addRow(ob);
            }
            limpiarCampos(); 
        } 
      
        else {
            limpiarCampos();
            listarProveedor(); 
        }
        
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Error en la búsqueda: " + e.getMessage());
    }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        p.setNombre(txtnombre.getText());
        p.setDocumento(txtdocumento.getText());
        p.setDireccion(txtdireccion.getText());
        p.setTelefono(txttelefono.getText());
        p.setCorreo(txtcorreo.getText());
        if(dao.insertar(p)){
            
            JOptionPane.showMessageDialog(null,"Proveedor Registrado Con Exito");
            limpiarCampos();
            limpiarTablaProveedor();
            listarProveedor();
        }else{
           JOptionPane.showMessageDialog(null,"No se pudo registrar el Proveedor");
        }
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int fila=tablaproveedores.getSelectedRow();
        if(fila==-1&&txtid.getText().isEmpty()){
             JOptionPane.showMessageDialog(null,"Seleccione un Proveedor");
        }else{
            p.setIdProveedor(Integer.parseInt(txtid.getText()));
            p.setNombre(txtnombre.getText());
            p.setDocumento(txtdocumento.getText());
            p.setDireccion(txtdireccion.getText());
            p.setTelefono(txttelefono.getText());
            p.setCorreo(txtcorreo.getText());
            if(dao.editar(p)){
                 JOptionPane.showMessageDialog(null,"Se modifico con exito");
                limpiarCampos();
                limpiarTablaProveedor();
                listarProveedor();
            }else{
                 JOptionPane.showMessageDialog(null,"Error al modificar el Proveedor");
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed
 void limpiarCampos(){
        txtid.setText("");
        txtnombre.setText("");
        txtdocumento.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtcorreo.setText("");
       
    }
    
    void limpiarTablaProveedor(){
        for(int i=0;i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=0-1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEditar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEliminar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnGuardar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private modelo.JpanelRound jpanelRound1;
    private modelo.JpanelRound jpanelRound2;
    private javax.swing.JTable tablaproveedores;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

 
}
