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

//Clase publica y final que extiende a la clase Banca e implementa la interfaz IOperable
public final class Telefonica extends Banca {

    public Telefonica() {
        setOperacion(6);
    }

    public void setOperacion(double Operacion) {
        this.Operacion = Operacion;
    }

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
