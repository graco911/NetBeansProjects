/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura_de_datos_2017_unidad2_ea;

import Actividades.DirectorioTelefonico;
import Actividades.RegistroPlacas;

/**
 *
 * @author Carlos Alberto
 */
public class Estructura_de_Datos_2017_Unidad2_EA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RegistroPlacas act1 = new RegistroPlacas(11);
        DirectorioTelefonico act2 = new DirectorioTelefonico(6);
        System.out.println("Agregado de Placas");
        System.out.println("//////////////////////////");
        act1.AgregarPlaca("PDF3456");
        act1.AgregarPlaca("DFR4567");
        act1.AgregarPlaca("ERT5678");
        act1.AgregarPlaca("SWE5689");
        act1.AgregarPlaca("PDW4325");
        act1.AgregarPlaca("PDF3456");
        act1.AgregarPlaca("IYT8765");
        act1.AgregarPlaca("CFT2387");
        act1.AgregarPlaca("CDE4567");
        act1.AgregarPlaca("VGH7654");
        act1.AgregarPlaca("OIU5678");
        act1.AgregarPlaca("AZX3456");
        System.out.println("Listado de Placas");
        System.out.println("//////////////////////////");
        act1.ListarPlacas();
        System.out.println("Listado de Placas ordenadas");
        System.out.println("//////////////////////////");
        act1.OrdenarPlacas();
        System.out.println("Busqueda de Placa no agregada");
        System.out.println("//////////////////////////");
        if(!act1.BuscarPlaca("QQQ1234"))
        {
            System.out.println("Placa no encontrada");
        }
        System.out.println("Busqueda de Placa si agregada");
        System.out.println("//////////////////////////");
        if(!act1.BuscarPlaca("AZX3456"))
        {
            System.out.println("Placa encontrada");
        }
        
        System.out.println("Directorio de Contactos");
        System.out.println("Agregado de Contactos");
        System.out.println("//////////////////////////");
        act2.AgregarContacto("Pedro", "9331234567");  
        act2.AgregarContacto("Paco", "234567894");
        act2.AgregarContacto("Luis", "784736251");
        act2.AgregarContacto("Miguel", "9837653987");
        act2.AgregarContacto("Jose", "8756473625");
        act2.AgregarContacto("Julio", "999999999");
        act2.AgregarContacto("Guillermo", "1111111111");
        act2.AgregarContacto("Roxana", "5555555555");
        System.out.println("Listado de Contactos");
        System.out.println("//////////////////////////");
        act2.ListarContactos();        
        System.out.println("Busqueda de Contacto no agregado");
        System.out.println("//////////////////////////");
        if(!act2.BuscarContacto("Juanito"))
        {
            System.out.println("Contacto no encontrada");
        }
        System.out.println("Busqueda de Contacto si agregado");
        System.out.println("//////////////////////////");
        if(act2.BuscarContacto("Paco"))
        {
            System.out.println("Contacto encontrado");
        }
        System.out.println("Busqueda de Numero no agregado");
        System.out.println("//////////////////////////");
        if(!act2.BuscarNumero("234123123"))
        {
            System.out.println("Numero no encontrada");
        }
        System.out.println("Busqueda de Numero si agregado");
        System.out.println("//////////////////////////");
        if(!act2.BuscarNumero("8756473625"))
        {
            System.out.println("Numero encontrado");
        }
        

    }
}
