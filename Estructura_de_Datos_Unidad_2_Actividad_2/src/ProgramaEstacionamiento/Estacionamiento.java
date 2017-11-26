package ProgramaEstacionamiento;
import Patentes.Patentes;
/*
 * @author Carlos Alberto
 * Clase estacionamiento
 */
public class Estacionamiento
{
//creamos un objeto del tipo patente
public Patentes patente = new Patentes();
//metodo para buscar dentro del TreeMap
    public boolean Buscar(String patente) {
        boolean flag = false;
        //obtenemos solo el numero
        int numero = Integer.parseInt(patente.substring(2));
        //hacemos la comprobacion
        if(this.patente.getPatentes().containsKey(numero)){
        flag = true;}
        //retornamos el resultado
        return flag;
    }
    //metodo para agregar una nueva patente
    public void AgregarPatente(String p) {
            int numero = Integer.parseInt(p.substring(2));
            String letra = p.substring(0,2);
            //si ya se encuentra, combinamos solo las letras
            if(patente.getPatentes().containsKey(numero)){
                String tmp = patente.getPatentes().get(numero);
                patente.getPatentes().put(numero, tmp + letra);
                System.out.println("Patente anexada: " + p);
            //si no la agregamos
            }else{
                patente.getPatentes().put(numero, letra);
                System.out.println("Patente agregada: " + p);
            }
    }
    //metodo para listas los valores
    public void Listar(){
        System.out.println("Elementos de las Patentes");
    for (Integer key : patente.getPatentes().keySet()) {
        System.out.println("Patente: " + key + " -> Letra: " + patente.getPatentes().get(key));}
    }
}
