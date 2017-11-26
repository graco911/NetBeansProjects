/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 *
 * @author Carlos Alberto Graniel Córdova
 * 
 */

//Clase publica del tipo deposito que contiene los datos de la cuenta a la que le realiza el deposito
public class Deposito{
    
    Cuenta cuenta;
    
    //constructor por defecto
    public Deposito(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
}
