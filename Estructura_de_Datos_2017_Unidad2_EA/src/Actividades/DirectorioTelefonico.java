package Actividades;
/**
 *
 * @author Carlos Alberto Graniel Córdova
 * Programa que permite almacenar nombres de contactos
 * con su numero de telefono usando
 * arreglos bidimensionales
 */

public class DirectorioTelefonico {
    //declaración de un arreglo bidimensional
        String[][] agenda;
        //variables auxiliares
        final int nombre = 0;
        final int telefono =1;
        //contados de elementos agregados
        int cont = 0;

        //constructor
    public DirectorioTelefonico(int filas) {
        agenda = new String[filas][2];
    }

    //constructor por defecto
    public DirectorioTelefonico() {
        agenda = new String[30][2];
    }

    //metodo que agrega un nuevo contacto
    public void AgregarContacto(String nombre,String telefono){
        if(cont >= agenda.length){
            System.out.println("Array lleno");
        }else{
            agenda[cont][0] = nombre;
            agenda[cont][1] = telefono;
        cont++;
        System.out.println("Usuario " + nombre + " con el numero: " + telefono + " agregado en el registro "
                + "nombre:[" + cont + "]" + "[0]"
                + "telefono:]" + cont + "]" + "[1]");
        }
    }
    
    //listado de los elementos almacenados
    public void ListarContactos()
    {
        for (int i = 0; i < agenda.length; i++) {
            if(agenda[i] == null){
                System.out.println(i + ": " + "Espacio vacio.");
            }else
            {
                System.out.println(i + ": " + "Nombre :" + agenda[i][0] + " Telefono: " + agenda[i][1]);
            }
        }
    }    
    //busqueda de un elementos por nombre de contacto
    public boolean BuscarContacto(String item)
    {
        for (int i = 0; i < agenda.length; i++)
        {
            if(item == agenda[i][nombre])
            {
                System.out.println(item + ": Encontrado en la pocision: " + i);
                return true;
            }else{
                System.out.println(item + ": No encontrado en la pocision: " + i);
            }
        }
        return false;
    }
    //busqueda de un elemento por numero telefonico
    public boolean BuscarNumero(String item)
    {
                for (int i = 0; i < agenda.length; i++)
        {
            if(item == agenda[i][telefono])
            {
                System.out.println(item + ": Encontrado en la pocision: " + i);
                return true;
            }else{
                System.out.println(item + ": No encontrado en la pocision: " + i);
            }
        }
        return false;
    }   
}
