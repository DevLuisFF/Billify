/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Ctrl_Categoria;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;

/**
 *
 * @author DevLuisFF
 */
public class InterGestionarCategoria extends javax.swing.JInternalFrame {

    private int idCategoria;

    public InterGestionarCategoria() {
        initComponents();
        this.setSize(new Dimension(600, 400));
        this.setTitle("Gestionar Categorías");
        this.CargarTablaCategorias();
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
        titulolabel = new javax.swing.JLabel();
        FondoTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCategorias = new javax.swing.JTable();
        actualizarlabel = new javax.swing.JLabel();
        eliminarlabel = new javax.swing.JLabel();
        descripcionlabel = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background.setBackground(new java.awt.Color(255, 255, 255));

        titulolabel.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        titulolabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulolabel.setText("Administrar categorías");

        FondoTabla.setBackground(new java.awt.Color(255, 255, 255));

        TablaCategorias.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TablaCategorias.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        TablaCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaCategorias);

        javax.swing.GroupLayout FondoTablaLayout = new javax.swing.GroupLayout(FondoTabla);
        FondoTabla.setLayout(FondoTablaLayout);
        FondoTablaLayout.setHorizontalGroup(
            FondoTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        FondoTablaLayout.setVerticalGroup(
            FondoTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );

        actualizarlabel.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        actualizarlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actualizarlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        actualizarlabel.setText("Actualizar");
        actualizarlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        actualizarlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarlabelMouseClicked(evt);
            }
        });

        eliminarlabel.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        eliminarlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        eliminarlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash.png"))); // NOI18N
        eliminarlabel.setText("Eliminar");
        eliminarlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarlabelMouseClicked(evt);
            }
        });

        descripcionlabel.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        descripcionlabel.setText("Descripción:");

        txt_descripcion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(titulolabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FondoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(actualizarlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminarlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(descripcionlabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(624, 624, 624))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulolabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FondoTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(actualizarlabel)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarlabel)
                        .addGap(27, 27, 27)
                        .addComponent(descripcionlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actualizarlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarlabelMouseClicked
        if (!txt_descripcion.getText().isEmpty()) {
            Categoria categoria = new Categoria();
            Ctrl_Categoria controlcategoria = new Ctrl_Categoria();
            categoria.setDescripcion(txt_descripcion.getText().trim());
            if (controlcategoria.Actualizar(categoria, idCategoria)) {
                FrmOperacionExitosa frmOperacionExitosa = new FrmOperacionExitosa();
                frmOperacionExitosa.setVisible(true);
                this.CargarTablaCategorias();
            } else {
                FrmErrorOperacion frmErrorOperacion = new FrmErrorOperacion();
                frmErrorOperacion.setVisible(true);
                txt_descripcion.setText("");
                this.CargarTablaCategorias();
            }
        } else {
            FrmSeleccionarRegistro frmSeleccionarRegistro = new FrmSeleccionarRegistro();
            frmSeleccionarRegistro.setVisible(true);
        }
    }//GEN-LAST:event_actualizarlabelMouseClicked

    private void eliminarlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarlabelMouseClicked
        if (!txt_descripcion.getText().isEmpty()) {
            Categoria categoria = new Categoria();
            Ctrl_Categoria controlcategoria = new Ctrl_Categoria();
            categoria.setDescripcion(txt_descripcion.getText().trim());
            if (controlcategoria.Eliminar(idCategoria)) {
                FrmOperacionExitosa frmOperacionExitosa = new FrmOperacionExitosa();
                frmOperacionExitosa.setVisible(true);
                this.CargarTablaCategorias();
            } else {
                FrmErrorOperacion frmErrorOperacion = new FrmErrorOperacion();
                frmErrorOperacion.setVisible(true);
                txt_descripcion.setText("");
                this.CargarTablaCategorias();
            }
        } else {
            FrmSeleccionarRegistro frmSeleccionarRegistro = new FrmSeleccionarRegistro();
            frmSeleccionarRegistro.setVisible(true);
        }
    }//GEN-LAST:event_eliminarlabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel FondoTabla;
    public static javax.swing.JTable TablaCategorias;
    private javax.swing.JLabel actualizarlabel;
    private javax.swing.JLabel descripcionlabel;
    private javax.swing.JLabel eliminarlabel;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titulolabel;
    private javax.swing.JTextField txt_descripcion;
    // End of variables declaration//GEN-END:variables

    //metodo para mostrar todas las categorias registradas
    private void CargarTablaCategorias() {
        Connection cn = conexion.Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select idCategoria,descripcion,estado from tb_categoria";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InterGestionarCategoria.TablaCategorias = new JTable(model);
            InterGestionarCategoria.jScrollPane1.setViewportView(InterGestionarCategoria.TablaCategorias);
            model.addColumn("idCategoria");
            model.addColumn("descripcion");
            model.addColumn("estado");
            while (rs.next()) {
                Object fila[] = new Object[3];
                for (int i = 0; i < 3; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla categoria: " + e);
        }

        TablaCategorias.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = TablaCategorias.rowAtPoint(e.getPoint());
                int columna_point = 0;
                if (fila_point > -1) {
                    idCategoria = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosCategoriaSeleccionada(idCategoria);
                }
            }
        });

    }

    private void EnviarDatosCategoriaSeleccionada(int idCategoria) {
        try {
            Connection cn = conexion.Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from tb_categoria where idCategoria = '" + idCategoria + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txt_descripcion.setText(rs.getString("descripcion"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error cargar categorias" + e);
        }
    }

}