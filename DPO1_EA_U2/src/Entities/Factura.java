/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Carlos Alberto Graniel Córdova
 */
public class Factura {
    private String Num_Factura;
    private LocalDateTime Fecha_Compra;
    private float Subtotal = 0;
    private float IVA;
    private float Descuento;
    private float Total;
    private Comprador Comprador;
    private ArrayList<Articulo> Articulo;
    
    public Factura(String Num_Factura, LocalDateTime Fecha_Compra, Comprador Comprador, ArrayList<Articulo> Articulo) {
        this.Num_Factura = Num_Factura;
        this.Fecha_Compra = Fecha_Compra;
        this.Comprador = Comprador;
        this.Articulo = Articulo;
        System.out.println("Subtotal " + Subtotal);
        for (Articulo articulo : Articulo) {
            Subtotal += articulo.getPrecio_Producto();
            System.out.println("Precio " + articulo.getPrecio_Producto());
        }
        if (Subtotal > 1000) {
            Descuento = Subtotal * 0.1f;   
        }
        IVA += Subtotal * 0.16f;
        Total = (Subtotal - Descuento) + IVA;
    }

    public ArrayList<Articulo> getArticulo() {
        return Articulo;
    }

    public void setArticulo(ArrayList<Articulo> Articulo) {
        this.Articulo = Articulo;
    }

    public String getNum_Factura() {
        return Num_Factura;
    }

    public void setNum_Factura(String Num_Factura) {
        this.Num_Factura = Num_Factura;
    }

    public LocalDateTime getFecha_Compra() {
        return Fecha_Compra;
    }

    public void setFecha_Compra(LocalDateTime Fecha_Compra) {
        this.Fecha_Compra = Fecha_Compra;
    }

    public Float getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(Float Subtotal) {
        this.Subtotal = Subtotal;
    }

    public Float getIVA() {
        return IVA;
    }

    public void setIVA(Float IVA) {
        this.IVA = IVA;
    }

    public Float getDescuento() {
        return Descuento;
    }

    public void setDescuento(Float Descuento) {
        this.Descuento = Descuento;
    }

    public Float getTotal() {
        return Total;
    }

    public void setTotal(Float Total) {
        this.Total = Total;
    }

    public Comprador getComprador() {
        return Comprador;
    }

    public void setComprador(Comprador Comprador) {
        this.Comprador = Comprador;
    }
}
