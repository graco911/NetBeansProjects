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
 * 
 */

//Clase Publica con los datos de la cuenta la cual pertenece a un cliente
public class Cuenta {
    
    //Variable del tipo cliente que contiene los datos del cliente titular de la cuenta
    Cliente cliente;

    //Constructor por defecto para este objeto
    public Cuenta(Cliente cliente) {
        this.cliente = cliente;
    }
}
