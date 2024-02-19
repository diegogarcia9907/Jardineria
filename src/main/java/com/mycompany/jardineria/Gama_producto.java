/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jardineria;

/**
 *
 * @author wsant
 */
public class Gama_producto {
    private String gama;
    private String descripcion_texto;
    private String descripcion_html;
    private String imagen;

    public Gama_producto(String gama, String descripcion_texto) {
        this.gama = gama;
        this.descripcion_texto = descripcion_texto;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public String getDescripcion_texto() {
        return descripcion_texto;
    }

    public void setDescripcion_texto(String descripcion_texto) {
        this.descripcion_texto = descripcion_texto;
    }

    public String getDescripcion_html() {
        return descripcion_html;
    }

    public void setDescripcion_html(String descripcion_html) {
        this.descripcion_html = descripcion_html;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

  @Override
    public String toString() {
        return "Gama_producto{" +
                "gama" + gama +
                ", descripcio_texto'" + descripcion_texto + "\"" +"}";} 
}
 
    


