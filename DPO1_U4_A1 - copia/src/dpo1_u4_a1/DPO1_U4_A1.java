/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpo1_u4_a1;

import Producto.ProductoData;
import Producto.Productos;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Carlos Alberto
 */
public class DPO1_U4_A1 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        //Scanner para recibir los datos del teclado
        Scanner sc = new Scanner(System.in);
        //Creacion del objeto Productos que contiene el ArrayList
        Productos Productos = new Productos();
        int opcion;
        //Menu
        System.out.println("*************************************************");
        System.out.println("****           Programacion Orientada        ****");
        System.out.println("****                 a Objetos               ****");
        System.out.println("****            Unidad 4 Actividad 1         ****");
        System.out.println("****         Arreglos unidimensionales       ****");        
        System.out.println("****           y multidimensionales          ****");
        System.out.println("****      Carlos Alberto Graniel Córdova     ****");
        System.out.println("****              ES1611301058               ****");
        System.out.println("*************************************************");
        
        do {
            System.out.println("*************************************************");
            System.out.println("Elige una Opcion");
            System.out.println("*************************************************");
            System.out.println("1.- Ingresar producto");
            System.out.println("2.- Mostrar productos");            
            System.out.println("3.- Mostrar total de productos guardados");   
            System.out.println("4.- Mostrar el precio promedio de los productos");
            System.out.println("5.- Mostrar precio mayor de los productos");
            System.out.println("6.- Mostrar precio menor de los productos");
            System.out.println("7.-Salir"); 
                 
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    
                    int n = 1;
                    System.out.println("Ingresar Producto");
                    System.out.println("Ingrese el numero de productos");
                    
                    try {
                        n = sc.nextInt();
                        if (n < 0) {
                            throw new Exception("Numero negativo, intente de nuevo...");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Numero invalido " + e.getMessage());
                    }
                    for (int i = 0; i < n; i++) {
                        try {
                            ProductoData producto = new ProductoData();
                            System.out.println("Ingrese la clave del producto");
                            producto.setClave(sc.next());
                            System.out.println("Ingrese el nombre del producto");
                            producto.setNombre(sc.next());
                            System.out.println("Ingrese el precio del producto");
                            producto.setPrecio(sc.nextFloat());
                            System.out.println("Ingrese la cantidad del producto");
                            producto.setCantidad(sc.nextInt());     
                            Productos.setProductos(producto);
                            System.out.println("Producto agregado correctamente...");
                            
                        } catch (Exception e) {
                        }
                    }
                    break;
                case 2:
                    Productos.getProductos().stream().map(d 
                            -> "Clave " + d.getClave() + 
                                    "Nombre " + d.getNombre() +
                                    "Precio " + d.getPrecio() +
                                    "Cantidad " + d.getCantidad()).forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Total de productos almacenados: " + Productos.getProductos().size());
                    break;
                case 4:
                    if (Productos.getProductos().isEmpty()) {
                        System.out.println("El Arreglo esta vacio");
                    }else{
                        double sum = 0;
                        for (ProductoData arg : Productos.getProductos()) {
                            sum += arg.getPrecio();
                        }
                        System.out.println("El promedio de los productos es: " + sum / Productos.getProductos().size());
                    }
                    break;
                case 5:
                    float min = Productos.getProductos().stream().map(a -> a.getPrecio()).min(Comparator.naturalOrder()).get();
                    System.out.println("Producto Minimo :" + min);
                    break;
                case 6: 
                    float max = Productos.getProductos().stream().map(a -> a.getPrecio()).max(Comparator.naturalOrder()).get();
                    System.out.println("Producto Maximo :" + max);
                    break;
            }    
        } while (opcion != 7);
        System.out.println("Programa terminado..");
    }
    
}
