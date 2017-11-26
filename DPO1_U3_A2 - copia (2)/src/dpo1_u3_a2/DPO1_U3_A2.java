/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpo1_u3_a2;

import Clases.ATM;
import Clases.Banca;
import Clases.Cliente;
import Clases.Cuenta;
import Clases.Deposito;
import Clases.Internet;
import Clases.Retiro;
import Clases.Telefonica;
import java.util.Scanner;

/**
 *
 * @author Carlos Alberto
 */
public class DPO1_U3_A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion de objetos
        
        Scanner sc = new Scanner(System.in);
       
        String nombre = "", telefono = "", direccion = "";
        
        //Metodo try que atrapa el error sobre una clase mas escrita o inexistente
        try {
            
            System.out.println("Creacion objeto internet");
            Internet internet = new Internet();
            System.out.println("Creacion objeto telefonica");
            Telefonica relefonica = new Telefonica();
            System.out.println("Creacion objeto atm");
            ATM atm = new ATM();
            
        } catch (ClassFormatError e) {
            
            System.out.println("Error :" + e.getMessage());

        }
        
        //Metodo try que atrapa el error sobre el ingreso de un valor que no
        //corresponse a la variable donde se esta almacenando, en el caso del
        //ejemplo que el usuario quiera ingresar un valor numero cuando se 
        //solicitan caracteres.
        System.out.println("Creacion objeto cliente");
        try {
            System.out.println("ingrese nombre del cliente");
            nombre = sc.nextLine();
            
            System.out.println("ingrese telefono del cliente");
            telefono = sc.nextLine();
        
            System.out.println("ingrese direccion del cliente");
            direccion = sc.nextLine();   
        } catch (java.util.InputMismatchException e ) 
        {
            System.out.println("Error :" + e.getMessage());
        }
        
        Cliente cliente = new Cliente(nombre, telefono, direccion);                    
        
        System.out.println("Creacion de la cuenta de un cliente");
        Cuenta cuenta = new Cuenta(cliente);
        
        System.out.println("Creacion objeto deposito");
        Deposito deposito = new Deposito(cuenta);
        
        //Metodo Try que atrapa la creacion de un objeto
        //basado en una clase abstracta
        try {
            
            System.out.println("Creacion objeto retiro");
            Retiro retiro = new Retiro(cuenta);    
            
        } catch (AbstractMethodError e) {
            
            System.out.println("Error :" + e.getMessage());

        }
    }
}
