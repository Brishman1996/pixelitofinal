/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos_sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * @author Nel
 */
public class Metodos_sql {
    //instancioamos 

    public static conexionBD conexion = new conexionBD();
    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;
    public static String sql;
    public static int resultado_numero = 0;

    //creamos metodos  para guardar usuario 
    // le damos parametros
    public int guardar(String nombre, String apellidos, String correo, String contraseña) {
        int resultado = 0;
        Connection conexion = null;

        String sentencia_guardar = ("INSERT INTO usuarios(nombre,apellidos,correo,contraseña) VALUES(?,?,?,?)");
        try {
            conexion = conexionBD.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellidos);
            sentencia_preparada.setString(3, correo);
            sentencia_preparada.setString(4, contraseña);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();

            conexion.close();
        } catch (Exception e) {

            System.out.println(e);

        }
        return resultado;

    }

    public static String buscarNombre(String correo) {
        String busqueda_nombre = null;
        Connection conexion = null;

        try {
            conexion = conexionBD.conectar();
            String sentencia_buscar = ("SELECT nombre,apellidos FROM usuarios WHERE correo ='" + correo + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String apellidos = resultado.getString("apellidos");
                busqueda_nombre = (nombre +" "+ apellidos);
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_nombre;
    }

    public static int buscarUsuarioRegistrado(String correo, String contraseña) {

        int busqueda_usuario = 0;
        Connection conexion = null;

        try {
            conexion = conexionBD.conectar();
            String sentencia_buscar_usuario = ("SELECT nombre,correo,contraseña FROM usuarios WHERE correo ='" + correo + "'&& contraseña ='" + contraseña + "'");
           sentencia_preparada = conexion.prepareStatement(sentencia_buscar_usuario);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                busqueda_usuario = 1;
            } else {
                busqueda_usuario = 0;
            }
            conexion .close();
        } catch (SQLException e) {
            System.out.println(e);

        }
        return busqueda_usuario;

    }

    

}
