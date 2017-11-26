package estrucura_de_datos_unidad_3_actividad3_arbolbinario;

import Nodo.ArbolBinario;
import java.util.Random;
import java.util.Scanner;

public class Estrucura_De_Datos_Unidad_3_Actividad3_ArbolBinario {

    public static void main(String[] args) {
        //Creacion del nodo Raiz
        ArbolBinario raiz = new ArbolBinario(5);
        Random aleatorio = new Random(System.currentTimeMillis());

        int n = 20;
        if(n > 0){}
                
        Scanner sc = new Scanner(System.in);
        //variables globales
        int opcion;
        
        //Menu
        System.out.println("*************************************************");
        System.out.println("****            Estructura de Datos          ****");
        System.out.println("****Evidencia de Aprendizaje almacenamiento  r****");
        System.out.println("****      Carlos Alberto Graniel Córdova     ****");
        System.out.println("****              ES1611301058               ****");
        System.out.println("*************************************************");
        System.out.println("****                   MENU                  ****");        
        System.out.println("*************************************************");
        
        //menu con filtrado de opcion elegida por el usuario
        do{
        System.out.println("*************************************************");
        System.out.println("Elige la opcion");
        System.out.println("*************************************************");
        System.out.println("1 - insertar numero aleatorio");
        System.out.println("2 - Eliminar el nodo menor");
        System.out.println("3 - PreOrden");
        System.out.println("4 - InOrden");
        System.out.println("5 - PosOrden");
        System.out.println("6 - Recorrido en amplitud");
        System.out.println("Cualquier tecla - Salir");
        
        opcion = sc.nextInt();
        
        //switch de opciones
            switch(opcion){
                case 1:
        //Creacion de los nodos hijo
        ArbolBinario Izquierdo = new ArbolBinario(aleatorio.nextInt(100));
        ArbolBinario Derecho = new ArbolBinario(aleatorio.nextInt(100));
        //Creacion de un nodo hijo
        ArbolBinario hijoiz_iz = new ArbolBinario(aleatorio.nextInt(100));
        ArbolBinario hijoiz_der = new ArbolBinario(aleatorio.nextInt(100));
        ArbolBinario hijoder_iz = new ArbolBinario(aleatorio.nextInt(100));
        ArbolBinario hijoder_der = new ArbolBinario(aleatorio.nextInt(100));
        //creacion de nodos hoja
        hijoiz_iz.setIzq(new ArbolBinario(aleatorio.nextInt(100)));
        hijoiz_der.setDer(new ArbolBinario(aleatorio.nextInt(100)));
        hijoder_iz.setDer(new ArbolBinario(aleatorio.nextInt(100)));
        //asignacion de los nodos al nodo raiz
        raiz.setIzq(Izquierdo);
        raiz.setDer(Derecho);
        //Asignacion de los nodos hoja
        Izquierdo.setIzq(hijoiz_iz);
        Izquierdo.setDer(hijoiz_der);
        //asignacion de los nodos binarios
        Derecho.setIzq(hijoder_iz);
        Derecho.setDer(hijoder_der);
                    break;
                case 2:
        
                    break;
                case 3:
        //Recorridos del arbol
        System.out.println("Recorrido Preorden: ");
        raiz.PreOrden(raiz);
                    break;
                case 4:
        System.out.println("Recorrido Posorden: ");
        raiz.PosOrden(raiz);
                    break;
                case 5:
        System.out.println("Recorrido Inorden: ");
        raiz.InOrden(raiz);
                    break;
                case 6:
        System.out.println("Recorrido en Amplitud:");
        raiz.Amplitud(raiz);
                    break;
            }
        }
        while(opcion != 6);
        System.out.println("Programa terminado.");
    }
}
