/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import java.awt.Dimension;
import java.sql.Connection;
import Conexion.Conexion;
import Controlador.Ctrl_Producto;
import Modelo.Producto;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author DevLuisFF
 */
public class PanelProductos extends javax.swing.JPanel {

    int obtenerIdCategoriaCombo = 0;

    public PanelProductos() {
        initComponents();
        this.setSize(new Dimension(752, 436));
        this.CargarComboCategoria();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        NuevoTituloLabel = new javax.swing.JLabel();
        nombrelabel = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        CantidadLabel = new javax.swing.JLabel();
        PrecioLabel = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        labelDescripcion = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JTextField();
        ivaLabel = new javax.swing.JLabel();
        ComboIva = new javax.swing.JComboBox<>();
        categoriaLabel = new javax.swing.JLabel();
        ComboCategoria = new javax.swing.JComboBox<>();
        BtnGuardar = new javax.swing.JButton();
        BtnGestionarCategoria = new javax.swing.JButton();

        Background.setBackground(new java.awt.Color(255, 255, 255));

        NuevoTituloLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        NuevoTituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NuevoTituloLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cubeBlack.png"))); // NOI18N
        NuevoTituloLabel.setText("Nuevo Producto");

        nombrelabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombrelabel.setText("Nombre:");

        CantidadLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CantidadLabel.setText("Cantidad:");

        PrecioLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PrecioLabel.setText("Precio:");

        labelDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDescripcion.setText("Descripción:");

        ivaLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ivaLabel.setText("I.V.A:");

        ComboIva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione IVA:", "No grava IVA", "5%", "10%" }));

        categoriaLabel.setText("Categoría:");

        ComboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione categoría:", "Item 2", "Item 3", "Item 4" }));
        ComboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCategoriaActionPerformed(evt);
            }
        });

        BtnGuardar.setBackground(new java.awt.Color(0, 110, 144));
        BtnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/disk.png"))); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnGestionarCategoria.setBackground(new java.awt.Color(0, 110, 144));
        BtnGestionarCategoria.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnGestionarCategoria.setForeground(new java.awt.Color(255, 255, 255));
        BtnGestionarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/floppy-disk-pen.png"))); // NOI18N
        BtnGestionarCategoria.setText("Gestión Productos");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CantidadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombrelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PrecioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(ivaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categoriaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ComboIva, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPrecio)
                        .addComponent(txtdescripcion)
                        .addComponent(ComboCategoria, 0, 653, Short.MAX_VALUE)
                        .addComponent(txtcantidad))
                    .addComponent(txtnombre))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(NuevoTituloLabel)
                .addGap(290, 290, 290))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnGestionarCategoria)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(NuevoTituloLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrelabel)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantidadLabel)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrecioLabel)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDescripcion)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ivaLabel)
                    .addComponent(ComboIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriaLabel)
                    .addComponent(ComboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGestionarCategoria)
                    .addComponent(BtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        Producto producto = new Producto();
        Ctrl_Producto ctrl_Producto = new Ctrl_Producto();
        String iva = "";
        String categoria = "";
        iva = ComboIva.getSelectedItem().toString().trim();
        categoria = ComboCategoria.getSelectedItem().toString().trim();
        //validacion de campos
        if (txtnombre.getText().equals("") || txtcantidad.getText().equals("") || txtPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            //consulta para ver si el producto esta registrado
            if (!ctrl_Producto.existeProducto(txtnombre.getText().trim())) {
                if (iva.equalsIgnoreCase("Seleccione IVA:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione el IVA");
                } else {
                    if (categoria.equalsIgnoreCase("Seleccione categoría:")) {
                        JOptionPane.showMessageDialog(null, "Seleccione una categoría");
                    } else {
                        try {
                            producto.setNombre(txtnombre.getText().trim());
                            producto.setCantidad(Integer.parseInt(txtcantidad.getText().trim()));
                            String preciotxt = "";
                            double Precio = 0.0;
                            preciotxt = txtPrecio.getText().trim();
                            boolean aux = false;
                            //validar si el usuario ingresa la coma como punto decimal lo transformamos a punto
                            for (int i = 0; i < preciotxt.length(); i++) {
                                if (preciotxt.charAt(i) == ',') {
                                    String precionuevo = preciotxt.replace(",", ".");
                                    Precio = Double.parseDouble(precionuevo);
                                    aux = true;
                                }
                            }
                            //evaluar la condicion
                            if (aux == true) {
                                producto.setPrecio(Precio);
                            } else {
                                Precio = Double.parseDouble(preciotxt);
                                producto.setPrecio(Precio);
                            }
                            producto.setDescripcion(txtdescripcion.getText().trim());
                            //porcentajeiva
                            if (iva.equalsIgnoreCase("No Grava IVA")) {
                                producto.setPorcentajeIva(0);
                            } else if (iva.equalsIgnoreCase("5%")) {
                                producto.setPorcentajeIva(5);
                            } else if (iva.equalsIgnoreCase("10%")) {
                                producto.setPorcentajeIva(10);
                            }

                            //idcategoria - cargar metodo que obtiene el id de la categoria
                            this.IDCategoria();
                            producto.setIdCategoria(obtenerIdCategoriaCombo);
                            producto.setEstado(1);
                            if (ctrl_Producto.guardar(producto)) {
                                JOptionPane.showMessageDialog(null, "Producto Guardado");
                                this.CargarComboCategoria();
                                this.ComboIva.setSelectedItem("Seleccione IVA:");
                                this.Limpiar();
                            } else {
                                JOptionPane.showMessageDialog(null, "Error Al Guardar");
                            }
                        } catch (HeadlessException | NumberFormatException e) {
                            System.out.println("Error en:" + e);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "El producto ya existe en la base de datos");
            }
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void ComboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton BtnGestionarCategoria;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JLabel CantidadLabel;
    private javax.swing.JComboBox<String> ComboCategoria;
    private javax.swing.JComboBox<String> ComboIva;
    private javax.swing.JLabel NuevoTituloLabel;
    private javax.swing.JLabel PrecioLabel;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JLabel ivaLabel;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel nombrelabel;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables

    //metodo para cargar las categorias
    private void CargarComboCategoria() {
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_categoria";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ComboCategoria.removeAllItems();
            ComboCategoria.addItem("Seleccione categoría:");
            while (rs.next()) {
                ComboCategoria.addItem(rs.getString("descripcion"));
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al cargar Categorias:" + e);
        }
    }

    //metodo de limpieza campos
    private void Limpiar() {
        txtnombre.setText("");
        txtcantidad.setText("");
        txtdescripcion.setText("");
        txtPrecio.setText("");
    }

    //metodo para obtener el id categoria
    private int IDCategoria() {
        String sql = "select * from tb_categoria where descripcion = '" + this.ComboCategoria.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIdCategoriaCombo = rs.getInt("idCategoria");
            }
        } catch (SQLException e) {
            System.out.println("error al obtener id categoria: " + e);
        }
        return obtenerIdCategoriaCombo;
    }

}