/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author DevLuisFF
 */
public class FrmDashboard extends javax.swing.JFrame {

    /**
     * Creates new form FrmDashboard
     */
    public FrmDashboard() {
        initComponents();
        InitStyles();
        SetDate();
        InitContent();
        this.setTitle("Billify");
        
    }
    
    private void InitStyles() {
        Mensaje.putClientProperty("FlatLaf.style", "font: 14 $h1.light.font");
        Mensaje.setForeground(Color.BLACK);
        Titulo.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
        Titulo.setForeground(Color.WHITE);
        datetext.putClientProperty("FlatLaf.style", "font: 24 $light.font");
        datetext.setForeground(Color.WHITE);
        billifytext.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
        billifytext.setForeground(Color.WHITE);
        
    }
    
    private void SetDate() {
        //fecha del dia
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        datetext.setText("Hoy es " + dia + " de " + meses[month - 1] + " de " + year);
    }
    
    private void InitContent() {
        //mostrar el apartado de bienvenida
        BienvenidaPanel bienvenidaPanel = new BienvenidaPanel();
        bienvenidaPanel.setSize(752, 436);
        bienvenidaPanel.setLocation(0, 0);
        Content.removeAll();
        Content.add(bienvenidaPanel, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
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
        Menu = new javax.swing.JPanel();
        billifytext = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        btnprincipal = new javax.swing.JButton();
        BtnUsuarios = new javax.swing.JButton();
        BtnProductos = new javax.swing.JButton();
        BtnClientes = new javax.swing.JButton();
        BtnCategorias = new javax.swing.JButton();
        BtnFacturar = new javax.swing.JButton();
        BtnReportes = new javax.swing.JButton();
        BtnHistorial = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        datetext = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();
        Mensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(255, 255, 255));

        Menu.setBackground(new java.awt.Color(0, 110, 144));

        billifytext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        billifytext.setText("Billify");

        separador.setBackground(new java.awt.Color(255, 255, 255));
        separador.setForeground(new java.awt.Color(255, 255, 255));

        btnprincipal.setBackground(new java.awt.Color(0, 110, 144));
        btnprincipal.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnprincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        btnprincipal.setText("Principal");
        btnprincipal.setBorder(null);
        btnprincipal.setBorderPainted(false);
        btnprincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnprincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprincipalActionPerformed(evt);
            }
        });

        BtnUsuarios.setBackground(new java.awt.Color(0, 110, 144));
        BtnUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        BtnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/users-alt.png"))); // NOI18N
        BtnUsuarios.setText("Usuarios");
        BtnUsuarios.setBorder(null);
        BtnUsuarios.setBorderPainted(false);
        BtnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnUsuarios.setPreferredSize(new java.awt.Dimension(82, 22));
        BtnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUsuariosActionPerformed(evt);
            }
        });

        BtnProductos.setBackground(new java.awt.Color(0, 110, 144));
        BtnProductos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnProductos.setForeground(new java.awt.Color(255, 255, 255));
        BtnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cube.png"))); // NOI18N
        BtnProductos.setText("Productos");
        BtnProductos.setBorder(null);
        BtnProductos.setBorderPainted(false);
        BtnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProductosActionPerformed(evt);
            }
        });

        BtnClientes.setBackground(new java.awt.Color(0, 110, 144));
        BtnClientes.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        BtnClientes.setForeground(new java.awt.Color(255, 255, 255));
        BtnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/portrait.png"))); // NOI18N
        BtnClientes.setText("Clientes");
        BtnClientes.setBorder(null);
        BtnClientes.setBorderPainted(false);
        BtnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClientesActionPerformed(evt);
            }
        });

        BtnCategorias.setBackground(new java.awt.Color(0, 110, 144));
        BtnCategorias.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnCategorias.setForeground(new java.awt.Color(255, 255, 255));
        BtnCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layers.png"))); // NOI18N
        BtnCategorias.setText("Categorías");
        BtnCategorias.setBorder(null);
        BtnCategorias.setBorderPainted(false);
        BtnCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCategoriasActionPerformed(evt);
            }
        });

        BtnFacturar.setBackground(new java.awt.Color(0, 110, 144));
        BtnFacturar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnFacturar.setForeground(new java.awt.Color(255, 255, 255));
        BtnFacturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/receipt.png"))); // NOI18N
        BtnFacturar.setText("Facturar");
        BtnFacturar.setBorder(null);
        BtnFacturar.setBorderPainted(false);
        BtnFacturar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BtnReportes.setBackground(new java.awt.Color(0, 110, 144));
        BtnReportes.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnReportes.setForeground(new java.awt.Color(255, 255, 255));
        BtnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stats.png"))); // NOI18N
        BtnReportes.setText("Reportes");
        BtnReportes.setBorder(null);
        BtnReportes.setBorderPainted(false);
        BtnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BtnHistorial.setBackground(new java.awt.Color(0, 110, 144));
        BtnHistorial.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnHistorial.setForeground(new java.awt.Color(255, 255, 255));
        BtnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/time-forward.png"))); // NOI18N
        BtnHistorial.setText("Historial");
        BtnHistorial.setBorder(null);
        BtnHistorial.setBorderPainted(false);

        jButton1.setBackground(new java.awt.Color(0, 110, 144));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sign-in-alt.png"))); // NOI18N
        jButton1.setText("Cerrar Sesión");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(billifytext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addComponent(BtnProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnFacturar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(billifytext, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnFacturar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Header.setBackground(new java.awt.Color(0, 110, 144));

        Titulo.setText("Sistema de ventas y facturación");

        datetext.setText("Hoy es {dayname} {day} de {month} de {year}");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(datetext, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(datetext, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        Content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        Mensaje.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Mensaje.setText("¡Factura Fácil!");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(143, Short.MAX_VALUE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprincipalActionPerformed
        InitContent();
    }//GEN-LAST:event_btnprincipalActionPerformed

    private void BtnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProductosActionPerformed
        PanelProductos panelProductos = new PanelProductos();
        panelProductos.setSize(752, 436);
        panelProductos.setLocation(0, 0);
        Content.removeAll();
        Content.add(panelProductos, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
        
    }//GEN-LAST:event_BtnProductosActionPerformed

    private void BtnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUsuariosActionPerformed
        JOptionPane.showMessageDialog(null, "Este apartado es de usuarios");
    }//GEN-LAST:event_BtnUsuariosActionPerformed

    private void BtnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCategoriasActionPerformed
        //mostrar el apartado de bienvenida
        NuevaCategoriaPanel categoriaPanel = new NuevaCategoriaPanel();
        categoriaPanel.setSize(752, 436);
        categoriaPanel.setLocation(0, 0);
        Content.removeAll();
        Content.add(categoriaPanel, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_BtnCategoriasActionPerformed

    private void BtnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClientesActionPerformed
        ClientesPanel clientesPanel = new ClientesPanel();
        clientesPanel.setSize(752, 436);
        clientesPanel.setLocation(0,0);
        Content.removeAll();
        Content.add(clientesPanel, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_BtnClientesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //se inicializa el look and feel para darle una apariencia moderna a la aplicacion
        FlatMaterialLighterIJTheme.setup();
        //</editor-fold

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton BtnCategorias;
    private javax.swing.JButton BtnClientes;
    private javax.swing.JButton BtnFacturar;
    private javax.swing.JButton BtnHistorial;
    private javax.swing.JButton BtnProductos;
    private javax.swing.JButton BtnReportes;
    private javax.swing.JButton BtnUsuarios;
    public static javax.swing.JPanel Content;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel billifytext;
    private javax.swing.JButton btnprincipal;
    private javax.swing.JLabel datetext;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables
}
