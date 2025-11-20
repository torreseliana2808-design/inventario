/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.DaoUsuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.usuarios;

/**
 *
 * @author User
 */
public class Usuarios extends javax.swing.JPanel {
    usuarios u=new usuarios();
    DaoUsuario dao=new DaoUsuario();
    DefaultTableModel modelo=new DefaultTableModel();
    public Usuarios() {
        initComponents();
        listarUsuarios();
    }

    private void listarUsuarios(){
        List<usuarios> lista=dao.Listar();
        modelo=(DefaultTableModel) tablaUsuarios.getModel();
        Object[] ob=new Object[10];
        for(int i=0;i<lista.size();i++){
            ob[0]=lista.get(i).getIdusuario();
            ob[1]=lista.get(i).getNombre();
            ob[2]=lista.get(i).getApellido();
            ob[3]=lista.get(i).getDocumento();
            ob[4]=lista.get(i).getDireccion();
            ob[5]=lista.get(i).getTelefono();
            ob[6]=lista.get(i).getCorreo();
            ob[7]=lista.get(i).getTipoUsuario();
            ob[8]=lista.get(i).getUsaurio();
            ob[9]=lista.get(i).getPassword();
            modelo.addRow(ob);
        }
       tablaUsuarios.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jpanelRound1 = new modelo.JpanelRound();
        txtapellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtidusuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtdocumento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        cmbTipoUsuario = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar = new RSMaterialComponent.RSButtonMaterialIconDos();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnEditar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnBuscar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEliminar = new RSMaterialComponent.RSButtonMaterialIconDos();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(204, 204, 204));

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setRoundBottomLeft(25);
        jpanelRound1.setRoundBottomRight(25);
        jpanelRound1.setRoundTopLeft(25);
        jpanelRound1.setRoundTopRight(25);

        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });

        jLabel3.setText("ID");

        jLabel4.setText("Nombre");

        txtidusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidusuarioActionPerformed(evt);
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

        jLabel7.setText("Apellido");

        jLabel8.setText("Direccion");

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        jLabel9.setText("Telefono");

        jLabel10.setText("Correo");

        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });

        jLabel11.setText("Usuario");

        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });

        jLabel12.setText("TipoUusario");

        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });

        jLabel13.setText("Password");

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });

        cmbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Vendedor", "Almacen", " " }));

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6))
                    .addComponent(jLabel4)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtcorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                    .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelRound1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtidusuario))
                        .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addContainerGap())
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtidusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Usuarios");

        btnGuardar.setBackground(new java.awt.Color(14, 76, 117));
        btnGuardar.setText("Guardar");
        btnGuardar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnGuardar.setRound(25);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Documento", "Direccion", "Telefono", "Correo", "TipoUusario", "Usuario", "Password"
            }
        ));
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

        btnEditar.setBackground(new java.awt.Color(14, 76, 117));
        btnEditar.setText("Editar");
        btnEditar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        btnEditar.setRound(25);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
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
                .addGap(15, 15, 15)
                .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtidusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidusuarioActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdocumentoActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        u.setNombre(txtnombre.getText());
        u.setApellido(txtapellido.getText());
        u.setDocumento(txtdocumento.getText());
        u.setDireccion(txtdireccion.getText()); 
        u.setTelefono(txttelefono.getText());
        u.setCorreo(txtcorreo.getText());
        u.setTipoUsuario(cmbTipoUsuario.getSelectedItem().toString());
        u.setUsaurio(txtusuario.getText());
        u.setPassword(txtpass.getText());        
        if(dao.insertar(u.getNombre(),u.getApellido(),u.getDocumento(),u.getDireccion(),
            u.getTelefono(),u.getCorreo(),u.getTipoUsuario(),u.getUsaurio(),u.getPassword())){
            JOptionPane.showMessageDialog(null, "Usuario Registrado Con Exito");
            limpiarCampos();
            limpiarTablaUsuarios();
            listarUsuarios();
        }else{
            JOptionPane.showMessageDialog(null, "No se pudo registrar el Usuario");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tablaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUsuariosMouseClicked
        int fila=tablaUsuarios.getSelectedRow();
        txtidusuario.setText(tablaUsuarios.getValueAt(fila, 0).toString());
        txtnombre.setText(tablaUsuarios.getValueAt(fila, 1).toString());
        txtapellido.setText(tablaUsuarios.getValueAt(fila, 2).toString());
        txtdocumento.setText(tablaUsuarios.getValueAt(fila, 3).toString());
        txtdireccion.setText(tablaUsuarios.getValueAt(fila, 4).toString());
        txttelefono.setText(tablaUsuarios.getValueAt(fila, 5).toString());
        txtcorreo.setText(tablaUsuarios.getValueAt(fila, 6).toString());
        cmbTipoUsuario.setSelectedItem(tablaUsuarios.getValueAt(fila, 7).toString());
        txtusuario.setText(tablaUsuarios.getValueAt(fila, 8).toString());
        u.setDocumento(txtdocumento.getText());
        if(dao.buscar(u)){
            txtpass.setText(u.getPassword());
        }
        
    }//GEN-LAST:event_tablaUsuariosMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int fila=tablaUsuarios.getSelectedRow();
        if(fila==-1&&txtidusuario.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Seleccione un Usuario");
        }else{
            u.setIdusuario(Integer.parseInt(txtidusuario.getText()));
            u.setNombre(txtnombre.getText());
            u.setApellido(txtapellido.getText());
            u.setDocumento(txtdocumento.getText());
            u.setDireccion(txtdireccion.getText());
            u.setTelefono(txttelefono.getText());
            u.setCorreo(txtcorreo.getText());
            u.setTipoUsuario(cmbTipoUsuario.getSelectedItem().toString());
            u.setUsaurio(txtusuario.getText());
            u.setPassword(txtpass.getText());
            if(dao.editar(u)) {
               JOptionPane.showMessageDialog(null,"Se modifico con exito");
                limpiarCampos();
                limpiarTablaUsuarios();
                listarUsuarios();
            }else{
               JOptionPane.showMessageDialog(null,"Erorr al modificar el Usuario");
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       u.setDocumento(txtdocumento.getText());
        if(dao.buscar(u)){
            txtidusuario.setText(u.getIdusuario()+"");
            txtnombre.setText(u.getNombre());
            txtapellido.setText(u.getApellido());
            txtdocumento.setText(u.getDocumento());
            txtdireccion.setText(u.getDireccion());
            txttelefono.setText(u.getTelefono());
            txtcorreo.setText(u.getCorreo());
            txtusuario.setText(u.getUsaurio());
            txtpass.setText(u.getPassword());
            cmbTipoUsuario.setSelectedItem(u.getTipoUsuario());
        }else{
            JOptionPane.showMessageDialog(null, "El Usuario No Existe");
            limpiarCampos();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
           if(!txtidusuario.getText().isEmpty()){
            int confirmacion=JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar el Usuario?","Confirmar",2);
            if(confirmacion==0){
                u.setIdusuario(Integer.parseInt(txtidusuario.getText()));
                dao.eliminar(u);
                limpiarCampos();
                limpiarTablaUsuarios();
                listarUsuarios();
                 JOptionPane.showMessageDialog(null, "Se Elimino con exito el Usuario");
            }
        }else{
         JOptionPane.showMessageDialog(null, "Seleccione un Usuario");
        }  
    }//GEN-LAST:event_btnEliminarActionPerformed
 void limpiarCampos(){
        txtidusuario.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtdocumento.setText("");
        txtdireccion.setText("");
        txttelefono.setText("");
        txtcorreo.setText("");
        txtusuario.setText("");
        txtpass.setText("");
    }
    
    void limpiarTablaUsuarios(){
        for(int i=0;i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=0-1;
        }
    }
    // 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEditar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEliminar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnGuardar;
    private javax.swing.JComboBox<String> cmbTipoUsuario;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private modelo.JpanelRound jpanelRound1;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtidusuario;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
