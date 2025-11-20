/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.DaoClientes;
import controlador.DaoDetalleSalida;
import controlador.DaoEntradas;
import controlador.DaoProductos;
import controlador.DaoSalida;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.clientes;
import modelo.entradas;
import modelo.salidas;

public class Salidas extends javax.swing.JPanel {

salidas s=new salidas();
DaoSalida dao  =new DaoSalida();
DaoDetalleSalida daoDS=new DaoDetalleSalida();
clientes c=new clientes();
DaoClientes daoC=new DaoClientes();
DefaultTableModel modelo=new DefaultTableModel();
entradas e=new entradas();
DaoEntradas DaoE=new DaoEntradas();
DaoProductos daoPr = new DaoProductos();
int filaSeleccionada;

    public Salidas() {
        initComponents();
       
       
    }
  

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jpanelRound1 = new modelo.JpanelRound();
        jLabel2 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtidcliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnombrecliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtdocumento = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnBuscarCliente = new RSMaterialComponent.RSButtonMaterialIconDos();
        jpanelRound2 = new modelo.JpanelRound();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtproducto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtidproducto = new javax.swing.JTextField();
        txtstock = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        btnBuscarEntrada = new RSMaterialComponent.RSButtonMaterialIconDos();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSalidas = new javax.swing.JTable();
        jpanelRound3 = new modelo.JpanelRound();
        jLabel15 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btnAgregar = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnGenerar1 = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnnuevaSalida = new RSMaterialComponent.RSButtonMaterialIconDos();
        btnDelete = new RSMaterialComponent.RSButtonMaterialIconDos();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(649, 552));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Salidas");

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setRoundBottomLeft(25);
        jpanelRound1.setRoundBottomRight(25);
        jpanelRound1.setRoundTopLeft(25);
        jpanelRound1.setRoundTopRight(25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Datos de Clientes ");

        txttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefonoActionPerformed(evt);
            }
        });

        jLabel5.setText("Documento");

        jLabel3.setText("ID");

        txtidcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidclienteActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre");

        txtnombrecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreclienteActionPerformed(evt);
            }
        });

        jLabel6.setText("Telefono");

        txtdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdocumentoActionPerformed(evt);
            }
        });

        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });

        jLabel8.setText("Correo");

        btnBuscarCliente.setBackground(new java.awt.Color(50, 130, 181));
        btnBuscarCliente.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscarCliente.setRound(25);
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(45, 45, 45)
                        .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)))
                    .addComponent(txtnombrecliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanelRound2.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound2.setRoundBottomLeft(25);
        jpanelRound2.setRoundBottomRight(25);
        jpanelRound2.setRoundTopLeft(25);
        jpanelRound2.setRoundTopRight(25);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Datos de Producto");

        jLabel9.setText("ID");

        txtproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproductoActionPerformed(evt);
            }
        });

        jLabel10.setText("Nombre");

        txtidproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidproductoActionPerformed(evt);
            }
        });

        txtstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstockActionPerformed(evt);
            }
        });

        jLabel11.setText("Precio");

        jLabel12.setText("Stock Disponible");

        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });

        jLabel13.setText("Cantidad");

        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });

        jLabel7.setText("Fecha");

        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });

        btnBuscarEntrada.setBackground(new java.awt.Color(255, 153, 204));
        btnBuscarEntrada.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscarEntrada.setRound(25);
        btnBuscarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound2Layout = new javax.swing.GroupLayout(jpanelRound2);
        jpanelRound2.setLayout(jpanelRound2Layout);
        jpanelRound2Layout.setHorizontalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14)
                    .addComponent(jLabel10)
                    .addComponent(txtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel7)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelRound2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        jpanelRound2Layout.setVerticalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(25, 25, 25)
                        .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)))
                    .addComponent(btnBuscarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        tablaSalidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDESalida", "ID Entrada", "Producto", "Precio U", "Cantidad", "Importe"
            }
        ));
        tablaSalidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSalidasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaSalidas);

        jpanelRound3.setBackground(new java.awt.Color(153, 204, 255));
        jpanelRound3.setRoundBottomLeft(25);
        jpanelRound3.setRoundBottomRight(25);
        jpanelRound3.setRoundTopLeft(25);
        jpanelRound3.setRoundTopRight(25);

        jLabel15.setText("Total");

        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound3Layout = new javax.swing.GroupLayout(jpanelRound3);
        jpanelRound3.setLayout(jpanelRound3Layout);
        jpanelRound3Layout.setHorizontalGroup(
            jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jpanelRound3Layout.setVerticalGroup(
            jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        btnAgregar.setBackground(new java.awt.Color(14, 76, 117));
        btnAgregar.setText("Agregar");
        btnAgregar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnAgregar.setRound(25);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnGenerar1.setBackground(new java.awt.Color(14, 76, 117));
        btnGenerar1.setText("Generar");
        btnGenerar1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        btnGenerar1.setRound(25);
        btnGenerar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerar1ActionPerformed(evt);
            }
        });

        btnnuevaSalida.setBackground(new java.awt.Color(255, 153, 204));
        btnnuevaSalida.setText("Nueva Salida");
        btnnuevaSalida.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PLUS_ONE);
        btnnuevaSalida.setRound(25);
        btnnuevaSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevaSalidaActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        btnDelete.setRound(25);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnnuevaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpanelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnGenerar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnnuevaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpanelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonoActionPerformed

    private void txtidclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidclienteActionPerformed

    private void txtnombreclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreclienteActionPerformed

    private void txtdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdocumentoActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaActionPerformed

    private void txtproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproductoActionPerformed

    private void txtidproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidproductoActionPerformed

    private void txtstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstockActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    agregaEntrada();
    sumarTotal();
    limpiarDatosPod();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
       c.setDocumento(txtdocumento.getText());
        if(daoC.buscar(c)){
            txtidcliente.setText(c.getIdCliente()+"");
            txtnombrecliente.setText(c.getNombre()+" "+c.getApellido());
            txtdocumento.setText(c.getDocumento());
            txttelefono.setText(c.getTelefono());
            txtcorreo.setText(c.getCorreo());
        }else{
             JOptionPane.showMessageDialog(null, "El cliente no existe");
           
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
          if(filaSeleccionada==-1){
         JOptionPane.showMessageDialog(null, "Seleccione un producto de la tabla para eliminar");
        }else{
            modelo.removeRow(filaSeleccionada);
            sumarTotal();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnGenerar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerar1ActionPerformed
        try {
        s.setIdCliente(Integer.parseInt(txtidcliente.getText()));
        s.setTotal(Double.parseDouble(txttotal.getText()));
        s.setFecha(txtfecha.getText());
        if (dao.insertar(s)) {
            guardarDetalle();
            restaStock();
             
            JOptionPane.showMessageDialog(null, "Salida Registrada con Exito");
      limpaDatosCliente();
      limpiarDatosPod();
      limpiarTablaSalida();
      txttotal.setText("");
            
        } else {
           
            JOptionPane.showMessageDialog(
                this, 
                "No se pudo registrar la Salida", 
                "Error", 
                JOptionPane.ERROR_MESSAGE
            );
        }
        
    } catch (NumberFormatException e) {
       
        JOptionPane.showMessageDialog(
            this, 
            "Error: El ID del cliente y el Total deben ser números válidos.", 
            "Error de Formato", 
            JOptionPane.WARNING_MESSAGE
        );
        
    } catch (Exception e) {
        
        JOptionPane.showMessageDialog(
            this, 
            "Ocurrió un error inesperado: " + e.getMessage(), 
            "Error", 
            JOptionPane.ERROR_MESSAGE
        );
    }
    }//GEN-LAST:event_btnGenerar1ActionPerformed

    private void tablaSalidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSalidasMouseClicked
        filaSeleccionada=tablaSalidas.getSelectedRow();
        txtidproducto.setText(tablaSalidas.getValueAt(filaSeleccionada, 1).toString());
        txtcantidad.setText(tablaSalidas.getValueAt(filaSeleccionada, 4).toString());
        txtproducto.setText(tablaSalidas.getValueAt(filaSeleccionada, 2).toString());
        txtprecio.setText(tablaSalidas.getValueAt(filaSeleccionada, 3).toString());

        e.setIdentrada(Integer.parseInt(txtidproducto.getText()));
        if(DaoE.buscar(e)){
           txtstock.setText(e.getStock()+"");
        }
    }//GEN-LAST:event_tablaSalidasMouseClicked

    private void btnnuevaSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevaSalidaActionPerformed
             limpiarDatosPod();
             limpaDatosCliente();
             txttotal.setText("");
             txtfecha.setText("");
             limpiarTablaSalida();
    }//GEN-LAST:event_btnnuevaSalidaActionPerformed

    private void btnBuscarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEntradaActionPerformed
        BuscarProductos.tipo = true;
        BuscarProductos m =new BuscarProductos();
        m.setVisible(true);
    }//GEN-LAST:event_btnBuscarEntradaActionPerformed

private void agregaEntrada() {
    modelo = (DefaultTableModel) tablaSalidas.getModel();

    try {
      
        int idEntrada = Integer.parseInt(txtidproducto.getText());
        int cantidad = Integer.parseInt(txtcantidad.getText());
        double precio = Double.parseDouble(txtprecio.getText());
        int stock = Integer.parseInt(txtstock.getText());
        String producto = txtproducto.getText(); 
        int idSalida = 1; 
        if (cantidad <= 0) {
             JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a cero");
             return; // Detiene la ejecución
        }
       
        if (stock > 0 && cantidad <= stock) {
         
            double importe = cantidad * precio;

            Object[] fila = new Object[6];
            fila[0] = idSalida;    
            fila[1] = idEntrada;    
            fila[3] = precio;    
            fila[4] = cantidad;    
            fila[5] = importe;      
            modelo.addRow(fila);

        } else {
            JOptionPane.showMessageDialog(null, "Stock Insuficiente");
        }
        
    } catch (NumberFormatException e) {
       
        JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos correctamente.");
    }
}
  void guardarDetalle(){
        for(int i=0;i<tablaSalidas.getRowCount();i++){
        int idSalida=Integer.parseInt(tablaSalidas.getValueAt(i, 0).toString());
        int idEntrada=Integer.parseInt(tablaSalidas.getValueAt(i, 1).toString());
        int cant=Integer.parseInt(tablaSalidas.getValueAt(i, 4).toString());
        Double importe=Double.parseDouble(tablaSalidas.getValueAt(i, 5).toString());
        daoDS.insertar(idSalida, idEntrada, cant, importe);
       
        }
    }
 
void restaStock() {
   
    
    for (int i = 0; i < tablaSalidas.getRowCount(); i++) {
        
        Object idObj = tablaSalidas.getValueAt(i, 1);
        Object cantObj = tablaSalidas.getValueAt(i, 4); 

      
        if (idObj != null && cantObj != null) {
            
            try {
             
                int idProducto = Integer.parseInt(idObj.toString());
                int cant = Integer.parseInt(cantObj.toString());
                
               
                daoPr.restarStock(idProducto, cant);
                
            } catch (NumberFormatException e) {
               
                JOptionPane.showMessageDialog(null, "Error de formato al leer la tabla, fila " + i);
            }
            
        } else {
          
            System.out.println("Se omitió una fila con datos nulos en restaStock(), fila: " + i);
        }
    }
}

void sumarTotal() {
    double total = 0.00;
    for (int i = 0; i < tablaSalidas.getRowCount(); i++) {
        try {
            double importeFila = Double.parseDouble(tablaSalidas.getValueAt(i, 5).toString());
            total += importeFila;
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al sumar la fila " + i + ". Verifique los datos.");
            System.out.println("Error de formato en fila " + i + ": " + e.getMessage());
        }
    }
    txttotal.setText(String.format("%.2f", total).replace(",", "."));
}
  void limpiarDatosPod(){
        txtidproducto.setText("");
        txtproducto.setText("");
        txtstock.setText("");
        txtprecio.setText("");
        txtcantidad.setText("");
    }
   void limpaDatosCliente(){
        txttelefono.setText("");
        txtdocumento.setText("");
        txtidcliente.setText("");
        txtnombrecliente.setText("");
        txtcorreo.setText("");
    }
       void limpiarTablaSalida(){
        for(int i=0;i<modelo.getRowCount();i++){
            modelo.removeRow(i);
            i=0-1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialIconDos btnAgregar;
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscarCliente;
    private RSMaterialComponent.RSButtonMaterialIconDos btnBuscarEntrada;
    private RSMaterialComponent.RSButtonMaterialIconDos btnDelete;
    private RSMaterialComponent.RSButtonMaterialIconDos btnGenerar1;
    private RSMaterialComponent.RSButtonMaterialIconDos btnnuevaSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTable tablaSalidas;
    public static javax.swing.JTextField txtcantidad;
    public static javax.swing.JTextField txtcorreo;
    public static javax.swing.JTextField txtdocumento;
    public static javax.swing.JTextField txtfecha;
    public static javax.swing.JTextField txtidcliente;
    public static javax.swing.JTextField txtidproducto;
    public static javax.swing.JTextField txtnombrecliente;
    public static javax.swing.JTextField txtprecio;
    public static javax.swing.JTextField txtproducto;
    public static javax.swing.JTextField txtstock;
    public static javax.swing.JTextField txttelefono;
    public static javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
