package dpo1.pkg1702.b2.pkg002_ea;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos Alberto Graniel Córdova
 * Clase main con un menu de usuario
 */
public class DPO11702B2002_EA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARACION DE VARIABLES
        //ARRAY DE STRINGS QUE ALMACENA LOS DIAS DE LA SEMANA
        String[] DIAS = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        //INSTANCIA DE LA CLASE PERSONA  Y VENTA (NO INICIALIZADO)
        Persona persona;
        Venta Venta;
        //ARRAYLIST PARA ALMACENAR LOS USUARIOS Y LAS VENTAS
        ArrayList<Venta> Ventas = new ArrayList<>();
        ArrayList<Persona> Personas = new ArrayList<>();
        //leer datos de teclado
        Scanner sc = new Scanner(System.in);
        //variables globales
        int opcion;
        
        //Menu
        System.out.println("*************************************************");
        System.out.println("****           Programacion Orientada        ****");
        System.out.println("****                 a Objetos               ****");
        System.out.println("****          Evidencia de Aprendizaje       ****");
        System.out.println("****      Carlos Alberto Graniel Córdova     ****");
        System.out.println("****              ES1611301058               ****");
        System.out.println("*************************************************");
        System.out.println("****                   MENU                  ****");        
        System.out.println("*************************************************");
        
        //menu con filtrado de opcion elegida por el usuario
        do{
        System.out.println("*************************************************");
        System.out.println("Elige una Opcion");
        System.out.println("*************************************************");
        System.out.println("1.-Registrar Venta");
        System.out.println("2.-Registrar usuario");
        System.out.println("3.-Listar Ventas");
        System.out.println("4.-Listar Usuarios");
        System.out.println("5.-Salir");
        
        opcion = sc.nextInt();
        
        //switch de opciones
            switch(opcion){
                case 1:
                Float[] dias = new Float[7];
                int cont = 0;
                if(Personas.isEmpty()){
                    System.out.println("Debe agregar primero un usuario.");
                }else{
                    //LECTURA DE LOS TOTALES DIARIOS
                    for (int i = 0; i < DIAS.length; i++) {
                        System.out.println("Ingrese la venta del dia: " + DIAS[i]);
                        dias[i] = sc.nextFloat();
                    }
                    //ASIGNACION DE LOS TOTALES DIARIOS A UN USUARIO REGISTRADO
                    System.out.println("Seleccione a la persona que realizo la venta");
                    for(Persona nombre : Personas){
                        System.out.println(cont + ".-" + nombre.FullName);
                        cont++;
                    }
                    cont = sc.nextInt();
                    Venta = new Venta(Personas.get(cont), dias);
                    System.out.println("Subtotal: " + Venta.getSubtotal());
                    for (int i = 0; i < Venta.getDias().length; i++) {
                        System.out.println("venta del dia: " + DIAS[i] + "\n" + Venta.getDias()[i]);
                    }
                    Ventas.add(Venta);
                    System.out.println("Venta agregada al usuario " + Venta.getPersona().FullName);
                }
                    break;
                case 2:
                    //CREACION DE UN USUARIO
                    String nombre,apellido;
                    System.out.println("Ingrese nombre...");
                    nombre = sc.next();
                    System.out.println("Ingrese apellido...");
                    apellido = sc.next();
                    persona = new Persona(nombre, apellido);
                    Personas.add(persona);
                    System.out.println("usuario agregado correctamente.");
                    break;
                case 3:
                if(Personas.isEmpty()){
                    System.out.println("Debe agregar primero un usuario..");
                }else if (Ventas.isEmpty()) {
                    System.out.println("Debe agregar una venta..");
                } else{
                    int op;
                    do{
                        System.out.println("*************************************************");
                        System.out.println("Elige una Opcion");
                        System.out.println("*************************************************");
                        System.out.println("1.-Por Usuario");
                        System.out.println("2.-Por Venta");
                        System.out.println("3.-Salir");
                        op = sc.nextInt();
                        switch(op){
                            case 1:
                                int c = 0;                                                         
                                System.out.println("Elige un usuario para mostrar sus ventas");
                                for(Persona p : Personas){
                                    System.out.println(c + ".-" + p.FullName);
                                    c++;
                                }
                                c = sc.nextInt();
                                System.out.println("Ventas del usuario: " + Personas.get(c).FullName);
                                c = 0;
                                for(Venta v : Ventas){
                                    if (v.Persona.FullName.equals(Personas.get(c).FullName)) {
                                        System.out.println("venta: " + c);
                                        System.out.println(v.GetVenta());
                                        c++;
                                    }
                                }
                                break;
                            case 2:
                                int d = 0;
                                for(Venta v : Ventas){
                                    System.out.println("venta: " + d);
                                    System.out.println(v.GetVenta());
                                    d++;
                                }
                                break;
                            default:
                                System.out.println("Opcion incorrecta.");
                                break;
                        }
                    }while(op != 3);
                }
                    break;    
                case 4:
                    System.out.println("Usuarios Dados de alta: " + Personas.size());
                    for(Persona a : Personas){
                        System.out.println(a.FullName);
                    }
                    break;
            }
        }
        while(opcion != 5);
        System.out.println("Programa terminado.");
        
    }
    
}
