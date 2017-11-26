package Nodo;
import java.util.LinkedList;
import java.util.Queue;

/*
 * @author Carlos Alberto Graniel Córdova
 * Actividad 3 Unidad 3 - Busquedas y Recorridos
 */
public class ArbolBinario{
    
    //Creacion de un objeto dato que acepte cualquier tipo de dato
    private Object dato;
    //Creacion de los nodos
    private ArbolBinario izq = null;
    private ArbolBinario der = null;
    
    //Constructor por defecto
    public ArbolBinario(Object dato){
        this.dato = dato;
    }
    
    //Getters y Setters
    public Object getDato() {
        return dato;
    }
    public void setDato(Object dato) {
        this.dato = dato;
    }
    public ArbolBinario getIzq() {
        return izq;
    }
    public void setIzq(ArbolBinario izq) {
        this.izq = izq;
    }
    public ArbolBinario getDer() {
        return der;
    }
    public void setDer(ArbolBinario der) {
        this.der = der;
    } 
    //ordenamiento Preorden
    public void PreOrden(ArbolBinario raiz) {
        if (raiz != null) {
            System.out.print(raiz.getDato() + " - ");
            PreOrden(raiz.getIzq());
            PreOrden(raiz.getDer());
        }
    }
    public void InOrden(ArbolBinario raiz) {
        if (raiz != null) {
            InOrden(raiz.getIzq());
            System.out.print(raiz.getDato() + " - ");
            InOrden(raiz.getDer());            
        }
    }
    
    //ordenamiento posorden
    public void PosOrden(ArbolBinario raiz) {
        if (raiz != null) {
            PosOrden(raiz.getIzq());
            PosOrden(raiz.getDer());
            System.out.print(raiz.getDato() + " - ");
        }
    }
    //ordenamiento de amplitud
    public void Amplitud(ArbolBinario a) {
        //Declaracion de variables auxiliares
        Queue<ArbolBinario> cola, colaux;
        cola = new LinkedList();
        colaux = new LinkedList();
        ArbolBinario aux;
        //comprobar que el arbol contenga nodos
        if (a != null) {
            //agregamos la instancia raiz a la cola
            cola.add(a);
            System.out.print(a.dato + " - ");
            //mientras existan elementos en la cola
            while (cola.peek()!= null) 
            {
                //agregamos el elemento a la variable auxiliar, lo borramos de 
                //la cola y lo copiamos en la cola auxiliar
                colaux.add(aux = cola.poll());
                //comprobamos que tenga un nodo a la izquierda
                if (aux.izq != null) {
                    cola.add(aux.getIzq()); 
                    System.out.print(aux.getIzq().dato + " - ");
                //comprobamos que tenga un elemento a la derecha
                }if (aux.der != null) {
                    cola.add(aux.getDer());
                    System.out.print(aux.getDer().dato + " - ");
                }
            } 
        }
    }

    public boolean removeNodo( ArbolBinario nodo ) {
 
    /* Creamos variables para saber si tiene hijos izquierdo y derecho */
    boolean tieneNodoDerecha = nodo.der != null ? true : false;
    boolean tieneNodoIzquierda = nodo.izq != null ? true : false;
 
    /* Verificamos los 3 casos diferentes y llamamos a la función correspondiente */
 
    /* Caso 1: No tiene hijos */
    if (!tieneNodoDerecha && !tieneNodoIzquierda) {
        return removeNodoCaso1( nodo );
    }
 
    /* Caso 2: Tiene un hijo y el otro no */
    if ( tieneNodoDerecha && !tieneNodoIzquierda ) {
        return removeNodoCaso2( nodo );
    }
 
    /* Caso 2: Tiene un hijo y el otro no */
    if ( !tieneNodoDerecha && tieneNodoIzquierda ) {
        return removeNodoCaso2( nodo );
    }
 
    /* Caso 3: Tiene ambos hijos */
    if ( tieneNodoDerecha && tieneNodoIzquierda ) {
        return removeNodoCaso3( nodo );
    }
 
    return false;
}

    private boolean removeNodoCaso1(ArbolBinario nodo) {
    /* lo único que hay que hacer es borrar el nodo y establecer el apuntador de su padre a nulo */
 
    /*
     * Guardemos los hijos del padre temporalmente para saber cuál de sus hijos hay que 
     * eliminar
     */
    ArbolBinario hijoIzquierdo = nodo.izq;
    ArbolBinario hijoDerecho = nodo.der;
 
    if ( hijoIzquierdo == nodo ) {
        nodo.izq = null;
        return true;
    }
 
    if ( hijoDerecho == nodo) {
        nodo.der = null;
        return true;
    }
 
    return false;}

    private boolean removeNodoCaso2(ArbolBinario nodo) {
    /* Borrar el Nodo y el subárbol que tenía pasa a ocupar su lugar */
 
    /*
     * Guardemos los hijos del padre temporalmente para saber cuál de sus hijos hay que 
     * eliminar
     */
    ArbolBinario hijoIzquierdo = nodo.izq;
    ArbolBinario hijoDerecho = nodo.der;
 
    /*
     * Buscamos el hijo existente del nodo que queremos eliminar
     */
    ArbolBinario hijoActual = nodo.izq != null ? 
            nodo.der : nodo.der;
 
    if ( hijoIzquierdo == nodo ) {
        nodo.izq = hijoActual ;
 
        /* Eliminando todas las referencias hacia el nodo */
        nodo.der = null;
        nodo.izq = null;
 
        return true;
    }
 
    if ( hijoDerecho == nodo) {
        nodo.der = hijoActual;
 
        /* Eliminando todas las referencias hacia el nodo */
        nodo.der = null;
        nodo.izq = null;
 
        return true;
    } 
 
    return false;}

    private boolean removeNodoCaso3(ArbolBinario nodo) {
    /* Tomar el hijo derecho del Nodo que queremos eliminar */
    ArbolBinario nodoMasALaIzquierda = recorrerIzquierda( nodo.getDer() );
    if ( nodoMasALaIzquierda != null ) {
        /*
         * Reemplazamos el valor del nodo que queremos eliminar por el nodo que encontramos 
         */
        nodo.dato = nodoMasALaIzquierda.getDato();
        /* 
         * Eliminar este nodo de las formas que conocemos ( caso 1, caso 2 ) 
         */
        removeNodo( nodoMasALaIzquierda );
        return true;
    }
        return false;
    }
 
    /* Recorrer de forma recursiva hasta encontrar el nodo más a la izquierda */
    private ArbolBinario recorrerIzquierda(ArbolBinario nodo) {
    if (nodo.izq != null) {
        return recorrerIzquierda( nodo.getIzq() );
    }
    return nodo;    }
}

