package Actividades;

import java.util.Arrays;

/**
 *
 * @author Carlos Alberto Graniel Córdova
 * ES1611301058
 * Actividad  Evidencia de Aprendizaje de la Unidad 2 de la Materia
 * Estructura de Datos
 */
public class RegistroPlacas {
    //creacion de un arreglo de tipo string
    String[] placa;
    //variable contados
    int cont = 0;

    //constructor
    public RegistroPlacas(int tamanio) {
        placa = new String[tamanio];
    }

    //constructor por Defecto
    public RegistroPlacas() {
        placa = new String[999];
    }

    //metodo para el agregado de placas
    public void AgregarPlaca(String item){
        //comprueba si el array esta lleno
        if(cont >= placa.length){
            System.out.println("Array lleno");
        }else{
        //sino permite introducir un elemento nuevo
            placa[cont] = item;
        cont++;
        System.out.println("Placa agregada: " + item);
        }
    }
    
    //metodo que lista las placas agregadas
    public void ListarPlacas()
    {
        for (int i = 0; i < placa.length; i++) {
            if(placa[i] == null){
                System.out.println(i + ": " + "Espacio vacio.");
            }else
            {
                System.out.println(i + ": " + placa[i]);
            }
        }
    }
    
    //ordenamiento de las placas
    public void OrdenarPlacas()
    {
        Arrays.sort(placa);
        //listado de las placas ordenadas
        for(String s : placa)
            System.out.println(s);
    }
    
    //metodo que busca las placas agregadas
    public boolean BuscarPlaca(String item)
    {
        for (int i = 0; i < placa.length; i++)
        {
            if(item == placa[i])
            {
                System.out.println(item + "Encontrado en la pocision: " + i);
                return true;
            }
        }
        return false;
    }
}
