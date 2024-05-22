/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DevLuisFF
 */
public class Ctrl_Producto {
        //metodo para registrar los productos
    public boolean guardar(Producto objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_producto values(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0); //id
            consulta.setString(2, objeto.getNombre()); //se obtiene el nombre
            consulta.setInt(3, objeto.getCantidad()); //se obtiene la cantidad
            consulta.setDouble(4, objeto.getPrecio()); //se obtiene el precio
            consulta.setString(5, objeto.getDescripcion()); //se obtiene la descripcion
            consulta.setInt(6, objeto.getPorcentajeIva()); //se obtiene el porcentaje iva
            consulta.setInt(7, objeto.getIdCategoria()); //se obtiene el porcentaje iva
            consulta.setInt(8, objeto.getEstado()); // se obtiene el estado

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar producto: " + e);
        }

        return respuesta;
    }

    //metodo para consultar si existe el producto
    public boolean existeProducto(String Producto) {
        boolean respuesta = false;
        String sql = "select nombre from tb_producto where nombre = '" + Producto + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar producto: " + e);
        }

        return respuesta;
    }
}
