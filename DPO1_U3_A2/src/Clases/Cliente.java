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

//Clase que extiende de la Super Clase Persona
public class Cliente extends Persona {
/*Todos los datos del cliente aqui*/
    
    private String Nombre;
    private String Telefono;
    private String Direccion;

    public Cliente(String Nombre, String Telefono, String Direccion) {
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
}
