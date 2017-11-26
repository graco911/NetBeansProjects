/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entities.Articulo;
import Entities.Comprador;
import Entities.Factura;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Carlos Alberto
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        //Inicializacion de Variables
        Factura factura;
        Comprador comprador;
        Articulo articulo;
        ArrayList<Articulo> Articulos = new ArrayList<>();
        ArrayList<Comprador> Compradores = new ArrayList<>();
        //Scanner para aceptar entradas del teclado
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        //Menu
        System.out.println("*************************************************");
        System.out.println("****           Programacion Orientada        ****");
        System.out.println("****                 a Objetos               ****");
        System.out.println("****          Evidencia de Aprendizaje       ****");
        System.out.println("****                                         ****");
        System.out.println("****      Carlos Alberto Graniel Córdova     ****");
        System.out.println("****              ES1611301058               ****");
        System.out.println("*************************************************");
        
        //menu con filtrado de opcion elegida por el usuario
        do{
        System.out.println("*************************************************");
        System.out.println("Elige una Opcion");
        System.out.println("*************************************************");
        System.out.println("1.-Crear Factura");
        System.out.println("6.-Salir");
        
        opcion = sc.nextInt();
        
        //switch de opciones
            switch(opcion){
                //Crear factura
                case 1:
                    System.out.println("Crear factura");
                    int cont = 0;
                    String clave, nombre, descripcion;
                    float precio = 0;
                    do {
                        System.out.println("Ingrese la clave del articulo");
                        clave = sc.next();
                        System.out.println("Ingrese el nombre del articulo");
                        nombre = sc.next();
                        System.out.println("Ingrese la descripcion del articulo");
                        descripcion = sc.next();
                        System.out.println("Ingrese el precio del articulo");
                        precio = sc.nextFloat();
                        articulo = new Articulo(clave, nombre, descripcion, precio);
                        Articulos.add(articulo);
                        
                        cont++;
                    } while (cont < 2);
                    
                    String nom = "" ,ap_p = "", ap_m = "", tel = "", rfc = "", dir = "";
                    
                    if (Compradores.isEmpty()) {
                        System.out.println("Registrar Comprador");
                        System.out.println("Ingrese Nombre");
                        nom = sc.next();
                        System.out.println("Ingrese Apellido Paterno");
                        ap_p = sc.next();
                        System.out.println("Ingrese Apellido Materno");
                        ap_m = sc.next();
                        System.out.println("Ingrese telefono");
                        tel = sc.next();
                        System.out.println("Ingrese RFC");
                        rfc = sc.next();
                        System.out.println("Ingrese direccion");
                        dir = sc.next();
                        comprador = new Comprador(nom,ap_p,ap_m,tel,rfc,dir);
                        System.out.println("Comprador agregado correctamente");
                        Compradores.add(comprador);
                        
                        System.out.println("Generando factura");
                        factura = new Factura(java.util.UUID.randomUUID().toString(),
                            LocalDateTime.now(), 
                            comprador, 
                            Articulos);
                        System.out.println(factura.getFecha_Compra() + "\n"
                        + factura.getNum_Factura() + "\n"
                        + factura.getComprador().getNombre());

                    }else{
                        System.out.println("Elige al cliente ya registrado:");
                        cont = 0;
                        for (Comprador Comprador : Compradores) {
                            System.out.println(cont 
                                    + ".-" + Comprador.getNombre() 
                                    + " " + Comprador.getApellido_Paterno() 
                                    + " " + Comprador.getApellido_Materno() 
                                    + " " + Comprador.getRFC());
                        }
                        cont = sc.nextInt(); 
                        System.out.println("Generando factura");
                        factura = new Factura(java.util.UUID.randomUUID().toString(),
                            LocalDateTime.now(), 
                            Compradores.get(cont), 
                            Articulos);
                    }

                    System.out.println("*************************************************");
                    System.out.println("Datos de Factura");
                    System.out.println("*************************************************");
                    System.out.println("No de Factura" + " " + factura.getNum_Factura());
                    System.out.println("*************************************************");
                    System.out.println("Fecha de Factura" + " " + factura.getFecha_Compra());
                    System.out.println("*************************************************");
                    System.out.println("Cliente de Factura" + " " + factura.getComprador().getRFC());
                    System.out.println("*************************************************");
                    System.out.println("Articulos");
                    for (Articulo a : Articulos) {
                        System.out.println("*************************************************");
                        System.out.println(a.getClave_Producto() 
                                + "||" + a.getNombre_Producto() 
                                + "11" + a.getDescripcion_Producto() + "||" + a.getPrecio_Producto());
                    }
                    System.out.println("*************************************************");
                    System.out.println("Subtotal" + " " + factura.getSubtotal());
                    System.out.println("*************************************************");
                    System.out.println("IVA" + " " + factura.getIVA());
                    System.out.println("*************************************************");
                    if (factura.getDescuento() == 0) {
                        System.out.println("Descuento no aplica");
                    }else{
                        System.out.println("Descuento" + " " + factura.getDescuento());
                    }
                    System.out.println("*************************************************");
                    System.out.println("Total" + " " + factura.getTotal());
                    System.out.println("*************************************************");
                    break;
            }
        }
        while(opcion != 6);
        System.out.println("Programa terminado.");   
    }
}
