/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jardineria;

/**
 *
 * @author diego
 */
public class Cliente extends Tabla {
    
    private int codigoCliente;
    private String nombreCliente;
    private String nombreContacto;
    private String apellidoContacto;
    private String telefono;
    private String fax;
    private String lineaDireccion1;
    private String lineaDireccion2;
    private String ciudad;
    private String pais;
    private String codigoPostal;
    private String codigoEmpleadoRepVentas;
    private String limiteCredito;

    
    public Cliente() {
        this.campos ="codigo_cliente,"
                + "nombre_cliente,"
                + "nombre_contacto,"
                + "apellido_contacto,"
                + "telefono,"
            + "fax,linea_direccion1" +
           ",linea_direccion2" +
           ",ciudad" +
           ",pais" +
           ",codigo_postal" +
           ",codigo_empleado_rep_ventas" +
           ",limite_credito";
         this.camposSeparados = this.campos.split(",");
    }
    
    public Cliente(int codigoCliente, String nombreCliente) {
        this.codigoCliente = codigoCliente;
        this.nombreCliente = nombreCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getApellidoCliente() {
        return apellidoContacto;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoContacto = apellidoCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getLineaDireccion1() {
        return lineaDireccion1;
    }

    public void setLineaDireccion1(String lineaDireccion1) {
        this.lineaDireccion1 = lineaDireccion1;
    }

    public String getLineaDireccion2() {
        return lineaDireccion2;
    }

    public void setLineaDireccion2(String lineaDireccion2) {
        this.lineaDireccion2 = lineaDireccion2;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCodigoEmpleadoRepVentas() {
        return codigoEmpleadoRepVentas;
    }

    public void setCodigoEmpleadoRepVentas(String codigoEmpleadoRepVentas) {
        this.codigoEmpleadoRepVentas = codigoEmpleadoRepVentas;
    }

    public String getLimiteCredito() {
        return limiteCredito;
    }
    
    

    public void setLimiteCredito(String limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
   
    @Override
    public String toString() {
        return "cliente{" +
                "codigo_cliente" + codigoCliente +
                ", nombre_cliente'" + nombreCliente+ "\"" +"}";} 
}
