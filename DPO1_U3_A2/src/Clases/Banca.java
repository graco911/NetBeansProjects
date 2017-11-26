/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import Interfaces.IOperable;

/**
 *
 * @author Carlos Alberto Graniel Córdova
 * 
 * 
 */
//Super Clase que implementa la interfaz Operable
/*La clase banca es la case abstracta que implementa la interfaz operable para
el manejo de las funciones propias de un sistema bancario
esta clase es publica y abstracta por lo cual puede ser heredada por cualquier clase
que desee hacer uso de los metodos de la interdaz IOperable y modificar el atributo operacion
para hacer override sobre este valor.*/
public abstract class Banca implements IOperable{
    public double Operacion;
}
