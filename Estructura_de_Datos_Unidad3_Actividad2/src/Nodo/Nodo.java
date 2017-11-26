package Nodo;

import Interface.ITree;
import java.util.ArrayList;

/*
 * @author Carlos Alberto Graniel Córdova
 * Actividad 2 Unidad 3 - Programación de un Arbol
 */
public class Nodo
{
    public ArrayList nodosHijos= new ArrayList();
    private String info="";
    private int preorden=0;
    private int postOrden=0;
    public Nodo(String theInfo)
    {
        this.setInfo(theInfo);
    }
    public String getInfo()
    {
        return this.info;
    }
    public void setInfo(String theInfo)
    {
        this.info=theInfo;
    }
    public int getPostOrden() 
    {
        return postOrden;
    }
    public void setPostOrden(int postOrden)
    {
        this.postOrden = postOrden;
    }
    public int getPreorden() {
        return preorden;
    }
    public void setPreorden(int preorden) 
    {
        this.preorden = preorden;
    }
}