/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.DaoDetalleSalida;
import controlador.DaoProductos;
import controlador.DaoSalida;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.detalleSalida;
import modelo.productos;
import modelo.salidas;

/**
 *
 * @author User
 */
public class ListaSalidas extends javax.swing.JPanel {
DefaultTableModel modelo = new DefaultTableModel();
DaoSalida dao = new DaoSalida();

    public ListaSalidas() {
        initComponents();
         listarSalidas();
    }
    
  private void listarSalidas() {
        
        List<salidas> lista = dao.Listar();
        
        modelo = (DefaultTableModel) tablaSalidas.getModel();
        modelo.setRowCount(0); 
        
        Object[] ob = new Object[4];
        
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdSalida();
            ob[1] = lista.get(i).getIdCliente();
            ob[2] = lista.get(i).getFecha();
            ob[3] = lista.get(i).getTotal();
            modelo.addRow(ob);
        }
    }     
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSalidas = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Lista  de Salidas");

        tablaSalidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUMERO", "ID CLIENTE", "FECHA", "TOTAL"
            }
        ));
        tablaSalidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSalidasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaSalidas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(479, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(110, 110, 110)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tablaSalidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSalidasMouseClicked
   
    }//GEN-LAST:event_tablaSalidasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaSalidas;
    // End of variables declaration//GEN-END:variables
}
