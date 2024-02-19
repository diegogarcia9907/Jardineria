/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jardineria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wsant
 */
public class Crudgama_producto {
    private Connection connection;
    
    public Crudgama_producto(){
        Conexion_basededatos conectar = new Conexion_basededatos();
        connection = conectar.establecerConexion();
    }
    
    public void cerrarConexion() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

     public List<Gama_producto> consultaTodoLosClientes() {
        List<Gama_producto> gama_productos = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM gama_producto");

            while (resultSet.next()) {
                Gama_producto gama_producto = new Gama_producto(resultSet.getString("gama"), resultSet.getString("descripcion_texto"));
                // Puedes añadir más atributos según la estructura de tu tabla
                gama_productos.add(gama_producto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return gama_productos;
    }
public void crearGama_producto(Gama_producto gama_producto) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Gama_producto (gama) VALUES (?)");
            preparedStatement.setString(1, gama_producto.getGama());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

 public void editarGama_producto(Gama_producto gama_producto) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Gama_producto SET Gama = ? WHERE Descripcion_texto = ?");
            preparedStatement.setString(1, gama_producto.getGama());
            // Puedes añadir más atributos según la estructura de tu tabla
            preparedStatement.setString(2, gama_producto.getDescripcion_texto());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
 public void eliminarGama_producto(String Descripcion_texto) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Gama_producto WHERE Descripcion_texto = ?");
            preparedStatement.setString(1,Descripcion_texto);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
    



