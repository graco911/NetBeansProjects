package dpo1.pkg1702.b2.pkg002_ea;

/**
 *
 * @author Carlos Alberto Graniel Córdova
 * ES1611301058
 * Clase Tipo persona que almacena los datos del usuario.
 * 
 */

public class Persona {    
    //DECLARACION DE VARIABLES
    String Nombre;
    String Apellido;
    String FullName;
    
    //PUBLIC CONTRUCTOR
    public Persona(String Nombre, String Apellido){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        FullName = Nombre + " " + Apellido;
    }
    
    //GETTERS & SETTERS
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }
}
