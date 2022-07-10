/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author Nel
 */
public class conexionBD {
    
    //llamamos a la base de datos por medio de la url
   public static String url = "jdbc:mysql://agenciabrishmancl.com:3306/ykypmkom_brish";
    //llamamos a los parametros locales  de la base de datos 
    public static String usuario = "ykypmkom_pixel";
    public static String contraseña ="canoleonbrishman";
    public static String clase = "com.mysql.cj.jdbc.Driver";

    //realizamos el metodo de conectar 
    public static Connection conectar() {
        //retornamos el valor 
        Connection conexion = null;

        try {
            //llamamos al parametro clase
            Class.forName(clase);
            //nos pide los parametros 
            conexion = (Connection) DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conexion;
    }}
     /**
     private String driver="com.mysql.jdbc.Driver";
    private String connectString="jdbc:mysql://127.0.0.1/login_bd";
    private String user="root";
    private String password="123456789";
    public Connection con;
        
    public Connection conexion(){
        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(connectString, user , password);
        }catch ( Exception e ){
            System.out.println("error: no se pudo conectar a la base de datos: "+e.getMessage());
        }
        return con;
   } }  */