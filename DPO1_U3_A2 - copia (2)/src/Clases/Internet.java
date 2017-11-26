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

//Clase Publica y final del tipo Internet que extiende a la super clase Banca e implementa los metodos de la interfaz IOperable
public final class Internet extends Banca { 

    public Internet() {
        setOperacion(0);
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
