/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

/**
 *
 * @author Carlos Alberto Graniel Córdova
 */
public class Articulo {
    
    private String Clave_Producto;
    private String Nombre_Producto;
    private String Descripcion_Producto;
    private float Precio_Producto;

    public Articulo(String Clave_Producto, String Nombre_Producto, String Descripcion_Producto, float Precio_Producto) {
        this.Clave_Producto = Clave_Producto;
        this.Nombre_Producto = Nombre_Producto;
        this.Descripcion_Producto = Descripcion_Producto;
        this.Precio_Producto = Precio_Producto;
    }
    
    public Float getPrecio_Producto() {
        return Precio_Producto;
    }

    public void setPrecio_Producto(Float Precio_Producto) {
        this.Precio_Producto = Precio_Producto;
    }

    public String getClave_Producto() {
        return Clave_Producto;
    }

    public void setClave_Producto(String Clave_Producto) {
        this.Clave_Producto = Clave_Producto;
    }

    public String getNombre_Producto() {
        return Nombre_Producto;
    }

    public void setNombre_Producto(String Nombre_Producto) {
        this.Nombre_Producto = Nombre_Producto;
    }

    public String getDescripcion_Producto() {
        return Descripcion_Producto;
    }

    public void setDescripcion_Producto(String Descripcion_Producto) {
        this.Descripcion_Producto = Descripcion_Producto;
    }
    
    
}
