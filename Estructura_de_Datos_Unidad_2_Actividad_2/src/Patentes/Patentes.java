package Patentes;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Carlos Alberto Graniel Córdova
 * Estructura de Datos
 * DEDA-1702-b1-002
 * Actividad 2
 * Identificacion de Errores en un metodo de busqueda
 * 
 */

//creamos la clase patentes
public class Patentes {
    //declaramos un TDA del Tipo TreeMap
    Map<Integer, String> Patentes = new TreeMap<>();

    //constructor por defecto
    public Patentes() {
    }  

    //metodo get
    public Map<Integer, String> getPatentes() {
        return Patentes;
    }

    //metodo set
    public void setPatentes(Map<Integer, String> Patentes) {
        this.Patentes = Patentes;
    }
}
