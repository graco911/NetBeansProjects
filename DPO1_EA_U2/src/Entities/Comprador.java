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
public class Comprador {
    private String Nombre;
    private String Apellido_Materno;
    private String Apellido_Paterno;
    private String Telefono;
    private String RFC;
    private String Direccion;

    public Comprador(String Nombre, String Apellido_Materno, String Apellido_Paterno, String Telefono, String RFC, String Direccion) {
        this.Nombre = Nombre;
        this.Apellido_Materno = Apellido_Materno;
        this.Apellido_Paterno = Apellido_Paterno;
        this.Telefono = Telefono;
        this.RFC = RFC;
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

    public String getApellido_Materno() {
        return Apellido_Materno;
    }

    public void setApellido_Materno(String Apellido_Materno) {
        this.Apellido_Materno = Apellido_Materno;
    }

    public String getApellido_Paterno() {
        return Apellido_Paterno;
    }

    public void setApellido_Paterno(String Apellido_Paterno) {
        this.Apellido_Paterno = Apellido_Paterno;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
}
