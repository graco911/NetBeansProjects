
import Persona.Persona;
import java.util.ArrayList;

/**
 *
 * @author Carlos Alberto Graniel Córdova
 * Asignacion a Cargo del Docente
 * Estructura de Datos
 */

//Clase ListaPersonas
public class ListaPersonas {
    private ArrayList<Persona> ListaPersonas = new ArrayList<>();
    
//Constructor por Defecto
    public ListaPersonas() {
    }
    
    //GETTERS & SETTERS
    public ArrayList<Persona> getListaPersonas() {
        return ListaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> ListaPersonas) {
        this.ListaPersonas = ListaPersonas;
    }

    //Metodos para el manejo de la Lista
    public Persona Buscar (int index){
        return ListaPersonas.get(index);
    }
    
    public int longitud() {
        return ListaPersonas.size();
    }

    public boolean esVacia() {
        if(ListaPersonas.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public boolean ingresar(Persona item) {
        if(ListaPersonas.add(item)){
            return true;
        }else{
            return false;
        }
        
    }

    public boolean Eliminar() {
        if(ListaPersonas.isEmpty()){
            return false;
        }else{
            int ultimapos = ListaPersonas.size() - 1;
            ListaPersonas.remove(ultimapos);
            return false;
        }
    }

    public boolean Mostrar() {
        if(this.esVacia()){
            return true;
        }else{
            for(int i = 0; i < ListaPersonas.size(); i++){
                System.out.println("Dato " + i + ": " + ListaPersonas.get(i));
            }
            return false;   
        }
    }

    public boolean esLlena() {
        return false;
    }

    public boolean Eliminar(int position) {
            if(ListaPersonas.isEmpty()){
            return false;
        }else{
            ListaPersonas.remove(position);
            return true;
        }}    
}
