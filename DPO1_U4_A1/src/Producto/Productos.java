/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Producto;

import java.util.ArrayList;

/**
 *
 * @author Carlos Alberto Graniel Córdova
 */
public class Productos {
    /*Objeto contenedor del ArrayList Productos
    que almacena objetos del tipo ProductoData*/
    private ArrayList<ProductoData> productos;

    /*Constructos por defedcto*/
    public Productos() {
        this.productos = new ArrayList<ProductoData>();
    }

    //GETTERS & SETTERS
    public ArrayList<ProductoData> getProductos() {
        return productos;
    }

    public void setProductos(ProductoData producto) {
        productos.add(producto);
    }
}
