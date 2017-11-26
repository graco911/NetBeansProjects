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
public final class ATM extends Banca{

    //Constructor por defecto que asigna el costo de la operacion
    public ATM() {
        setOperacion(20);
    }

    public void setOperacion(double Operacion) {
        this.Operacion = Operacion;
    }

    //Sobreescritura de metodos
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
