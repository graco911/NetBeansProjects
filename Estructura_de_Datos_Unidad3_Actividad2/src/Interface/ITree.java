/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Nodo.Nodo;

/**
 *
 * @author Carlos Alberto
 */
//Interface para el mostrado de los datos del arbol
public interface ITree {
    public void PreOrden(Nodo raiz);
    public void InOrden(Nodo raiz);
    public void PosOrden(Nodo raiz);
}
