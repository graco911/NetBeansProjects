package dpo1_u2_a2;

import Empleado.Empleado;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * @author Carlos Alberto Graniel´Córdova
 */
public class DPO1_U2_A2 {

    //Clase Main
    public static void main(String[] args) {
        // TODO code application logic here
        //Inicializacion de Variables
        String[] DIAS = {"Lunes","Martes","Miercoles","Jueves","Viernes"};
        Empleado empleado;
        ArrayList<Empleado> Empleados = new ArrayList<>();
        
        //Scanner para aceptar entradas del teclado
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        //Menu
        System.out.println("*************************************************");
        System.out.println("****           Programacion Orientada        ****");
        System.out.println("****                 a Objetos               ****");
        System.out.println("****          Actividad 2 Deteccion de       ****");
        System.out.println("****                   errores               ****");
        System.out.println("****      Carlos Alberto Graniel Córdova     ****");
        System.out.println("****              ES1611301058               ****");
        System.out.println("*************************************************");
        
        //menu con filtrado de opcion elegida por el usuario
        do{
        System.out.println("*************************************************");
        System.out.println("Elige una Opcion");
        System.out.println("*************************************************");
        System.out.println("1.-Calcular Sueldo");
        System.out.println("2.-Registrar Empleado");
        System.out.println("3.-Listar Sueldo Empleados");
        System.out.println("4.-Listar Empleados");
        System.out.println("5.-Salir");
        
        opcion = sc.nextInt();
        
        //switch de opciones
            switch(opcion){
                case 1:
                int cont = 0;
                float sueldo = 0;
                    if (Empleados.isEmpty()) {
                        System.out.println("Debe agregar primero un empleado.");
                    }else{
                        //ELECCION DEL USUARIO
                        System.out.println("Seleccione al empleado.");
                        for(Empleado nombre : Empleados){
                            System.out.println(cont + ".-" + nombre.getFullName());
                            cont++;
                        }
                        cont = sc.nextInt();
                        empleado = Empleados.get(cont);
                        float[] array = empleado.getHoras();
                        //LECTURA DE LAS HORAS LABORADAS
                        System.out.println("Ingreso de las horas laboradas.");
                        for (int i = 0; i < DIAS.length; i++) {
                            do {
                                if (cont > 8) {
                                   System.out.println("Las horas laboradas deben ser menores o igual a 8"); 
                                }
                                System.out.println("Ingrese las horas laboradas correspondientes al dia: " + DIAS[i]);
                                sueldo = sc.nextFloat();
                                array[i] = sueldo;
                                
                            } while (cont > 8);   
                        }
                        empleado.setHoras(array);
                        cont = 0;
                        //Lectura de las horas extras
                        do {
                                if (cont > 8) {
                                   System.out.println("Las horas extras laboradas deben ser menores o igual a 8."); 
                                }
                                System.out.println("Ingrese las horas extra laboradas");
                                sueldo = sc.nextFloat();
                                empleado.setHoras_extras(sueldo);       
                            } while (cont > 8);
                        CalcularHoras(empleado);
                        CalcularHorasExtras(empleado);                        
                    }
                    break;
                case 2:
                    //CREACION DE UN USUARIO
                    String nombre,apellido_p, apellido_m, curp;
                    int anios;
                    for (int i = 0; i < 3; i++) {
                    System.out.println("Ingrese nombre del empleado " + i);
                    nombre = sc.next();
                    System.out.println("Ingrese apellido paterno");
                    apellido_p = sc.next();
                    System.out.println("Ingrese apellido materno");
                    apellido_m = sc.next();
                    curp = "";
                    do {
                        if ((curp.length() < 18) || (curp.length() > 18)) {
                            System.out.println("la longitud es incorrecta"); 
                        }
                        System.out.println("Ingrese la CURP del empleado");
                        curp = sc.next();
                    } while ((curp.length() < 18) || (curp.length() > 18));
                    
                    System.out.println("Ingrese los años de antiguedad del empleado.");
                    anios = sc.nextInt();
                    empleado = new Empleado(nombre, apellido_p, apellido_m, curp, anios);
                    System.out.println("usuario agregado correctamente.");
                    Empleados.add(empleado);
                    }
                    break;
                case 3:
                if(Empleados.isEmpty()){
                    System.out.println("Debe agregar primero un empleado.");
                } else{
                    System.out.println("Sueldo de usuarios: " + Empleados.size());
                    for(Empleado a : Empleados){
                        System.out.println(a.getFullName() + " " + "Sueldo nero: " + a.getSueldo_neto());
                    }
                }
                    break;    
                case 4:
                    System.out.println("Usuarios Dados de alta: " + Empleados.size());
                    for(Empleado a : Empleados){
                        System.out.println(a.getFullName());
                    }
                    break;
            }
        }
        while(opcion != 5);
        System.out.println("Programa terminado.");
        
    }

    private static void CalcularHoras(Empleado empleado) {
        int horas_laboradas = 0;
        for (int i = 0; i < empleado.getHoras().length; i++) {
            horas_laboradas += empleado.getHoras()[i];
        }
        empleado.setHoras_laboradas(horas_laboradas);
        System.out.println("El total de horas laboradas es: " 
        + " " + (horas_laboradas * 100));
    }

    private static void CalcularHorasExtras(Empleado empleado) {
        float horas_extras = empleado.getHoras_extras();
        System.out.println("El total de horas extras laboradas es: " 
        + " " + (empleado.getHoras_extras() * 150));
    }

}
