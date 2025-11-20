/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;


import controlador.DaoCategorias;
import controlador.DaoEntradas;
import controlador.DaoProductos;
import controlador.DaoProveedor;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.entradas;
import modelo.productos;
import modelo.proveedor;

public class Entradas extends javax.swing.JPanel {

     entradas e=new entradas();
     DaoEntradas dao=new DaoEntradas();
     productos p=new productos();
     DaoProductos daoPr=new DaoProductos();
     DefaultTableModel modelo=new DefaultTableModel();
     DaoCategorias daoC=new DaoCategorias();
     DaoProveedor daoP=new DaoProveedor();
     Categoria ct=new Categoria();
     proveedor pr=new proveedor();
    int idProductoAntiguo = 0;
    int cantidadAntigua = 0;
   

     
    public Entradas() {
        initComponents();
        listarEntradas();
        numProducto();
    }
private void listarEntradas() {
    List<entradas> lista = dao.Listar();
    modelo = (DefaultTableModel) tablaEntradas.getModel();
   
    modelo.setRowCount(0); 
    
    Object[] ob = new Object[9]; 
    for (int i = 0; i < lista.size(); i++) {
        ob[0] = lista.get(i).getIdentrada();
        ob[1] = lista.get(i).getNomProdTemporal(); 
        ob[2] = lista.get(i).getStock();
        ob[3] = lista.get(i).getIdCategoria();
        ob[4] = lista.get(i).getFecha();
        ob[5] = lista.get(i).getIdproveedor();
        ob[6] = lista.get(i).getPrecioEntrada();
        ob[7] = lista.get(i).getPrecioVenta();
        ob[8] = lista.get(i).getTotal();
        modelo.addRow(ob);
    }
    tablaEntradas.setModel(modelo);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jpanelRound1 = new modelo.JpanelRound();
        txtstock = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnombreproducto = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtprecioentrada = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtprecioventaa = new javax.swing.JTextField();
        txtidentrada = new javax.swing.JTextField();
        jpanelRound2 = new modelo.JpanelRound();
        jLabel6 = new javax.swing.JLabel();
        txtcategoria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtidcategoria = new javax.swing.JTextField();
        btnBuscarCategoria = new RSMaterialComponent.RSButtonMaterialIconDos();
        jpanelRound3 = new modelo.JpanelRound();
        jLabel13 = new javax.swing.JLabel();
        txtproveedor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtidproveedor = new javax.swing.JTextField();
        btnBuscarProveedor = new RSMaterialComponent.RSButtonMaterialIconDos();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEntradas = new javax.swing.JTable();
        btnGuardar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEliminar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnEditar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnBuscar = new RSMaterialComponent.RSButtonMaterialIconDos();
        jpanelRound4 = new modelo.JpanelRound();
        jLabel16 = new javax.swing.JLabel();
        txtnombreP = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtidproducto = new javax.swing.JTextField();
        btnBuscarProducto = new RSMaterialComponent.RSButtonMaterialIconDos();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(649, 552));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Entradas");

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setRoundBottomLeft(25);
        jpanelRound1.setRoundBottomRight(25);
        jpanelRound1.setRoundTopLeft(25);
        jpanelRound1.setRoundTopRight(25);

        txtstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstockActionPerformed(evt);
            }
        });
        txtstock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtstockKeyReleased(evt);
            }
        });

        jLabel3.setText("ID Entrada");

        jLabel4.setText("Nombre Producto");

        jLabel5.setText("Fecha");

        txtnombreproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreproductoActionPerformed(evt);
            }
        });

        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });

        jLabel7.setText("Stock");

        jLabel8.setText("Precio Entrada");

        txtprecioentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioentradaActionPerformed(evt);
            }
        });
        txtprecioentrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtprecioentradaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtprecioentradaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioentradaKeyTyped(evt);
            }
        });

        jLabel9.setText("Precio Venta");

        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        jLabel10.setText("Total");

        txtprecioventaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioventaaActionPerformed(evt);
            }
        });

        txtidentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidentradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(txtnombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txtprecioentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtidentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprecioventaa, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtidentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtprecioentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(txtprecioventaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jpanelRound2.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound2.setPreferredSize(new java.awt.Dimension(339, 276));
        jpanelRound2.setRoundBottomLeft(25);
        jpanelRound2.setRoundBottomRight(25);
        jpanelRound2.setRoundTopLeft(25);
        jpanelRound2.setRoundTopRight(25);

        jLabel6.setText("ID");

        txtcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcategoriaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Datos de la Categoria ");

        jLabel12.setText("Categoria");

        txtidcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidcategoriaActionPerformed(evt);
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

        javax.swing.GroupLayout jpanelRound2Layout = new javax.swing.GroupLayout(jpanelRound2);
        jpanelRound2.setLayout(jpanelRound2Layout);
        jpanelRound2Layout.setHorizontalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtcategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addComponent(txtidcategoria, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jpanelRound2Layout.createSequentialGroup()
                        .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jpanelRound2Layout.setVerticalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpanelRound2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(btnBuscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtidcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jpanelRound3.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound3.setPreferredSize(new java.awt.Dimension(339, 276));
        jpanelRound3.setRoundBottomLeft(25);
        jpanelRound3.setRoundBottomRight(25);
        jpanelRound3.setRoundTopLeft(25);
        jpanelRound3.setRoundTopRight(25);

        jLabel13.setText("ID");

        txtproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproveedorActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Datos del Proveedor");

        jLabel15.setText("Nombre");

        txtidproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidproveedorActionPerformed(evt);
            }
        });

        btnBuscarProveedor.setBackground(new java.awt.Color(255, 153, 204));
        btnBuscarProveedor.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscarProveedor.setRound(25);
        btnBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound3Layout = new javax.swing.GroupLayout(jpanelRound3);
        jpanelRound3.setLayout(jpanelRound3Layout);
        jpanelRound3Layout.setHorizontalGroup(
            jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel15)
                        .addComponent(txtidproveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addComponent(txtproveedor))
                    .addGroup(jpanelRound3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14))
                    .addComponent(btnBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jpanelRound3Layout.setVerticalGroup(
            jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtidproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        tablaEntradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Stock", "IDCategoria", "Fecha", "IDProveedor", "P.Entrada", "P.Venta", "Total"
            }
        ));
        tablaEntradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEntradasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEntradas);

        btnGuardar.setBackground(new java.awt.Color(14, 76, 117));
        btnGuardar.setText("Guardar");
        btnGuardar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnGuardar.setRound(25);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
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

        jpanelRound4.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound4.setPreferredSize(new java.awt.Dimension(339, 276));
        jpanelRound4.setRoundBottomLeft(25);
        jpanelRound4.setRoundBottomRight(25);
        jpanelRound4.setRoundTopLeft(25);
        jpanelRound4.setRoundTopRight(25);

        jLabel16.setText("ID Producto");

        txtnombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombrePActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 255));
        jLabel17.setText("Producto");

        jLabel18.setText("Nombre");

        txtidproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidproductoActionPerformed(evt);
            }
        });

        btnBuscarProducto.setBackground(new java.awt.Color(204, 0, 255));
        btnBuscarProducto.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscarProducto.setRound(25);
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound4Layout = new javax.swing.GroupLayout(jpanelRound4);
        jpanelRound4.setLayout(jpanelRound4Layout);
        jpanelRound4Layout.setHorizontalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound4Layout.createSequentialGroup()
                        .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17))
                    .addGroup(jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel16)
                        .addComponent(jLabel18)
                        .addComponent(txtidproducto, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addComponent(txtnombreP)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jpanelRound4Layout.setVerticalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jpanelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jpanelRound3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jpanelRound2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstockActionPerformed

    private void txtcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcategoriaActionPerformed

    private void txtnombreproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreproductoActionPerformed

    private void txtprecioentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioentradaActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    private void txtprecioventaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioventaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioventaaActionPerformed

    private void txtidentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidentradaActionPerformed

    private void txtidcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidcategoriaActionPerformed

    private void txtproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproveedorActionPerformed

    private void txtidproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproveedorActionPerformed

    private void tablaEntradasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEntradasMouseClicked
int fila = tablaEntradas.getSelectedRow();
   
    if (fila >= 0) {
        
        try {
           
            int idEntrada = Integer.parseInt(tablaEntradas.getValueAt(fila, 0).toString());
            buscarPorId(idEntrada);      
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al seleccionar la fila. ID inválido: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_tablaEntradasMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        p.setIdproducto(Integer.parseInt(txtidproducto.getText()));
        if(daoPr.buscar (p)){
            agregarEntrada(true);      
        }else{
            agregarEntrada(false); 
        }
        limpiarCampos();
        limpiarTablaEntradas();
        listarEntradas();
        numProducto();
 
    }                                          

                                      

    private void btnBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProveedorActionPerformed
    BuscarDato.tipo=false;
    BuscarDato m=new BuscarDato();
    m.setVisible(true);
    }//GEN-LAST:event_btnBuscarProveedorActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    if (txtidentrada.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Seleccione una Entrada para editar");
        return;
    }
    try {
        int idpNuevo = Integer.parseInt(txtidproducto.getText());
        int cantNueva = Integer.parseInt(txtstock.getText());
        e.setIdentrada(Integer.parseInt(txtidentrada.getText()));
        e.setIdProducto(idpNuevo); //id
        e.setStock(cantNueva);
        e.setIdCategoria(Integer.parseInt(txtidcategoria.getText())); 
        e.setFecha(txtfecha.getText());
        e.setIdproveedor(Integer.parseInt(txtidproveedor.getText()));
        e.setPrecioEntrada(Double.parseDouble(txtprecioentrada.getText().replace(",", ".")));
        e.setPrecioVenta(Double.parseDouble(txtprecioventaa.getText().replace(",", ".")));
        e.setTotal(Double.parseDouble(txttotal.getText().replace(",", ".")));

        if (dao.editar(e)) {
            if (idProductoAntiguo == idpNuevo) {
                if (cantNueva > cantidadAntigua) {
                    int diferencia = cantNueva - cantidadAntigua;
                    daoPr.sumarStock(idProductoAntiguo, diferencia);
                } else {
                    int diferencia = cantidadAntigua - cantNueva;
                    daoPr.restarStock(idProductoAntiguo, diferencia);
                }
            } else {
                daoPr.restarStock(idProductoAntiguo, cantidadAntigua);
                daoPr.sumarStock(idpNuevo, cantNueva);
            }
            JOptionPane.showMessageDialog(null, "Se modificó con exito");
            limpiarCampos();
            limpiarTablaEntradas();
            listarEntradas();
            
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar la entrada");
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Error de formato. Revise los campos numéricos.");
    }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
     String idBusqueda = txtidentrada.getText();
    String nombreBusqueda = txtnombreproducto.getText();
    String precioBusqueda = txtprecioventaa.getText();
    String categoriaBusqueda = txtcategoria.getText();

    try {
        if (!idBusqueda.isEmpty()) {
            buscarPorId(Integer.parseInt(idBusqueda));
            
        } else if (!nombreBusqueda.isEmpty()) {
            buscarPorNombre(nombreBusqueda);
            
        } else if (!precioBusqueda.isEmpty()) {
            buscarPorPrecio(Double.parseDouble(precioBusqueda.replace(",", ".")));
        } else if (!categoriaBusqueda.isEmpty()) { 
            buscarPorCategoria(categoriaBusqueda);
            
        } else {
            JOptionPane.showMessageDialog(null, "Escriba un ID, Nombre o Precio para buscar.");
            limpiarTablaEntradas();
            listarEntradas();
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "El ID o el Precio deben ser números válidos.");
    }
    }//GEN-LAST:event_btnBuscarActionPerformed
private void buscarPorId(int idEntrada) {
    e.setIdentrada(idEntrada);
    if (dao.buscar(e)) {
        txtidentrada.setText(e.getIdentrada() + "");
        txtstock.setText(e.getStock() + "");
        txtprecioentrada.setText(e.getPrecioEntrada() + "");
        txtprecioventaa.setText(e.getPrecioVenta() + "");
        txttotal.setText(e.getTotal() + "");
        txtfecha.setText(e.getFecha()); 
        txtidproducto.setText(e.getIdProducto() + "");
        txtidproveedor.setText(e.getIdproveedor() + "");
        txtidcategoria.setText(e.getIdCategoria() + "");

        p.setIdproducto(e.getIdProducto()); 
        if (daoPr.buscar(p)) {
            txtnombreP.setText(p.getNomProd());
            txtnombreproducto.setText(p.getNomProd());
        } else {
            txtnombreP.setText("Error Prod.");
            txtnombreproducto.setText("Error Prod.");
        }
        pr.setIdProveedor(e.getIdproveedor());
        if (daoP.buscar(pr)) {
            txtproveedor.setText(pr.getNombre());
        } else {
            txtproveedor.setText("Error Prov.");
        }
        ct.setIdCategoria(e.getIdCategoria());
        if (daoC.buscar(ct)) {
            txtcategoria.setText(ct.getNomCategoria()); 
        } else {
            txtcategoria.setText("Error Cat.");
        }
        idProductoAntiguo = e.getIdProducto();
        cantidadAntigua = e.getStock();
        
    } else {
        JOptionPane.showMessageDialog(null, "La Entrada con ID " + idEntrada + " no existe.");
        limpiarCampos();
    }
}
private void buscarPorNombre(String nombre) {
    List<entradas> lista = dao.ListarPorNombre(nombre); 
    
    if (lista.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No se encontraron entradas con ese nombre.");
    }
    
    limpiarTablaEntradas();
    modelo = (DefaultTableModel) tablaEntradas.getModel();
    Object[] ob = new Object[9]; 
    for (entradas item : lista) {
        ob[0] = item.getIdentrada();
        ob[1] = item.getNomProdTemporal(); 
        ob[2] = item.getStock();
        ob[3] = item.getIdCategoria();
        ob[4] = item.getFecha();
        ob[5] = item.getIdproveedor();
        ob[6] = item.getPrecioEntrada();
        ob[7] = item.getPrecioVenta();
        ob[8] = item.getTotal();
        modelo.addRow(ob);
    }
}

private void buscarPorPrecio(double precio) {
    List<entradas> lista = dao.ListarPorPrecio(precio); 
    
    if (lista.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No se encontraron entradas con ese precio.");
    }
    
    limpiarTablaEntradas();
    modelo = (DefaultTableModel) tablaEntradas.getModel();
    Object[] ob = new Object[9];
    for (entradas item : lista) {
        ob[0] = item.getIdentrada();
        ob[1] = item.getNomProdTemporal();
        ob[2] = item.getStock();
        ob[3] = item.getIdCategoria();
        ob[4] = item.getFecha();
        ob[5] = item.getIdproveedor();
        ob[6] = item.getPrecioEntrada();
        ob[7] = item.getPrecioVenta();
        ob[8] = item.getTotal();
        modelo.addRow(ob);
    }
}
private void buscarPorCategoria(String nombreCategoria) {
   
    List<entradas> lista = dao.ListarPorCategoria(nombreCategoria); 
    
    if (lista.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No se encontraron entradas con esa categoría.");
    }
    
  
    limpiarTablaEntradas();
    modelo = (DefaultTableModel) tablaEntradas.getModel();
    Object[] ob = new Object[9]; 
    for (entradas item : lista) {
        ob[0] = item.getIdentrada();
        ob[1] = item.getNomProdTemporal();
        ob[2] = item.getStock();
        ob[3] = item.getIdCategoria();
        ob[4] = item.getFecha();
        ob[5] = item.getIdproveedor();
        ob[6] = item.getPrecioEntrada();
        ob[7] = item.getPrecioVenta();
        ob[8] = item.getTotal();
        modelo.addRow(ob);
    }
}


    private void btnBuscarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCategoriaActionPerformed
     BuscarDato.tipo=true;
     BuscarDato.entrada=true;
     BuscarDato m=new BuscarDato();
     m.setVisible(true);
    }//GEN-LAST:event_btnBuscarCategoriaActionPerformed

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaActionPerformed

    private void txtprecioentradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioentradaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioentradaKeyTyped

    private void txtprecioentradaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioentradaKeyReleased
        // TODO add your handling code here:
        double cant,precio;
    if(!txtstock.getText().isEmpty()){
        cant=Double.parseDouble(txtstock.getText());
        precio=Double.parseDouble(txtprecioentrada.getText());
        txttotal.setText(cant*precio+"");
    }else{
    }
    }//GEN-LAST:event_txtprecioentradaKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
  if (!txtidentrada.getText().isEmpty()) {
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar esta entrada?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirmacion == 0) {
            try {
                int idEntrada = Integer.parseInt(txtidentrada.getText());
                e.setIdentrada(idEntrada);
                if (dao.buscar(e)) {
                    int idP = e.getIdProducto(); 
                    int cant = e.getStock();     

                    boolean stockRestado = daoPr.restarStock(idP, cant);
                    
                    if (stockRestado) {
                      
                        dao.eliminar(e);
                        
                        limpiarCampos();
                        limpiarTablaEntradas();
                        listarEntradas();
                        
                     
             JOptionPane.showMessageDialog(this, "Se Eliminó con éxito la Entrada (y se actualizó el stock)", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        
             JOptionPane.showMessageDialog(this, "No se pudo actualizar el stock del producto.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    
                } else {
                    
             JOptionPane.showMessageDialog(this, "No se encontró la entrada para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "El ID de la entrada no es válido.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }
    } else {
       
        JOptionPane.showMessageDialog(this, "Seleccione una Entrada", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtprecioentradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioentradaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioentradaKeyPressed

    private void txtstockKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstockKeyReleased
          double cant,precio;
    if(!txtprecioentrada.getText().isEmpty()){
        cant=Double.parseDouble(txtstock.getText());
        precio=Double.parseDouble(txtprecioentrada.getText());
        txttotal.setText(cant*precio+"");
    }else{
    }
    }//GEN-LAST:event_txtstockKeyReleased

    private void txtnombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombrePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombrePActionPerformed

    private void txtidproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproductoActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
      BuscarProductos.tipo=false;
      BuscarProductos m=new BuscarProductos();
      m.setVisible(true);
    }//GEN-LAST:event_btnBuscarProductoActionPerformed
void limpiarCampos(){
        txtidentrada.setText("");
        txtnombreproducto.setText("");
        txtstock.setText("");
        txtfecha.setText("");
        txtprecioentrada.setText("");
        txtprecioventaa.setText("");
        txttotal.setText("");
        txtidproveedor.setText("");
        txtproveedor.setText("");
    }
    
    void limpiarTablaEntradas(){
        for(int i=0;i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=0-1;
        }
    }
      void numProducto(){
        int numero=daoPr.numProducto();
        if(numero==0){
        txtidproducto.setText("1");
        }else{
        int i=numero;
        i=i+1;
        txtidproducto.setText(i+"");
        }
    }

void agregarEntrada(boolean verifica) {
    try {
        
        e.setIdProducto(Integer.parseInt(txtidproducto.getText()));
        e.setStock(Integer.parseInt(txtstock.getText()));
        e.setIdCategoria(Integer.parseInt(txtidcategoria.getText()));
        e.setFecha(txtfecha.getText());
        e.setIdproveedor(Integer.parseInt(txtidproveedor.getText()));
        e.setPrecioEntrada(Double.parseDouble(txtprecioentrada.getText().replace(",", "."))); 
        double precioVentaNuevo = Double.parseDouble(txtprecioventaa.getText().replace(",", ".")); // Guardo el precio
        e.setPrecioVenta(precioVentaNuevo); 
        e.setTotal(Double.parseDouble(txttotal.getText().replace(",", "."))); 

       
        p.setIdproducto(Integer.parseInt(txtidproducto.getText()));
        p.setPrecioV(precioVentaNuevo); 
        
       
        if (verifica == true) {
          
            
            int stockASumar = Integer.parseInt(txtstock.getText());
            
           
            if (dao.insertar(e) && 
                daoPr.sumarStock(p.getIdproducto(), stockASumar) && 
                daoPr.editarPrecioV(p)) { 
                JOptionPane.showMessageDialog(null, "Entrada Registrada Con Exito");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar la entrada (falló BD)");
            }

        } else {
       
            p.setNomProd(txtnombreproducto.getText());
            p.setStock(Integer.parseInt(txtstock.getText()));
            p.setIdCategoria(Integer.parseInt(txtidcategoria.getText()));
            
            if (dao.insertar(e) && daoPr.insertar(p)) {
                JOptionPane.showMessageDialog(null, "Entrada Registrada Con Exito");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar la entrada"); 
            }
        }
    
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Error de formato. Revise que todos los campos numéricos sean válidos.");
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscarCategoria;
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscarProducto;
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscarProveedor;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEditar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnEliminar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private modelo.JpanelRound jpanelRound1;
    private modelo.JpanelRound jpanelRound2;
    private modelo.JpanelRound jpanelRound3;
    private modelo.JpanelRound jpanelRound4;
    private javax.swing.JTable tablaEntradas;
    public static javax.swing.JTextField txtcategoria;
    private javax.swing.JTextField txtfecha;
    public static javax.swing.JTextField txtidcategoria;
    private javax.swing.JTextField txtidentrada;
    public static javax.swing.JTextField txtidproducto;
    public static javax.swing.JTextField txtidproveedor;
    public static javax.swing.JTextField txtnombreP;
    public static javax.swing.JTextField txtnombreproducto;
    private javax.swing.JTextField txtprecioentrada;
    public static javax.swing.JTextField txtprecioventaa;
    public static javax.swing.JTextField txtproveedor;
    private javax.swing.JTextField txtstock;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
