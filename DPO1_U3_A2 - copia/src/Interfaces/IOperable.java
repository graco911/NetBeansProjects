/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Deposito;
import Clases.Retiro;

/**
 *
 * @author Carlos Alberto
 */
public interface IOperable {
    public boolean RealizarDeposito(Deposito deposito);
    public boolean RealizarRetiro(Retiro retiro);
    public boolean RecargarTelefono(String numero);
}
