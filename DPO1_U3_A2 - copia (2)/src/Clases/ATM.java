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
//Clase final del tipo Cajero de otro banco
/*La clase ATM hace uso de la clase abstracta Banca, por lo que se usa la 
palabra reservda extends para especificar que esta heredando todos los atributos de la 
super clase Banca*/
public final class ATM extends Banca{

    //Constructor por defecto que asigna el costo de la operacion
    public ATM() {
        setOperacion(20);
    }

    public void setOperacion(double Operacion) {
        this.Operacion = Operacion;
    }

    //Sobreescritura de metodos
    /*En esta parte del codigo estamos haciendo uso de la caracteristica propia 
    de la POO la sobreescritura, que nos permitira modificar la caracteristica de los
    metodos propios de la interfaz que a su vez son implementados por la super clase 
    Banca, estos se adaptan a las necesidades de cada objeto, siendo estos 
    caracteristicos de un objeto dado, si bien el nombre del metodo y los parametros
    que reciben no pueden ser modificados, su funcion puede variar de acuerdo al
    objeto creado.*/
    
    @Override
    public boolean RealizarDeposito(Deposito deposito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean RealizarRetiro(Retiro retiro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean RecargarTelefono(String numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
