/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import java.util.Random;

/**
 *
 * @author Carlos Alberto Graniel Córdova
 */

//Clase Persona
public class Persona {
    String nombre;
    String ap_p;
    String ap_m;
    String genero;
    String dia;
    int mes;
    String anio;
    int ent;
    String CURP;
    Random random = new Random();
   
    public  String arregloentidades[] = {"AGUASCALIENTES","BAJA CALIFORNIA NTE.","BAJA CALIFORNIA SUR","CAMPECHE","COAHUILA","COLIMA","CHIAPAS","CHIHUAHUA","DISTRITO FEDERAL","DURANGO","GUANAJUATO","GUERRERO","HIDALGO","JALISCO","MEXICO","MICHOACAN","MORELOS","NAYARIT","NUEVO LEON","OAXACA","PUEBLA","QUERETARO","QUINTANA ROO","SAN LUIS POTOSI","SINALOA","SONORA","TABASCO","TAMAULIPAS","TLAXCALA","VERACRUZ","YUCATAN","ZACATECAS"};
    public static String[] ENTIDAD_FEDERATIVA_VALOR = {"AS",
                                                       "BC",
                                                       "BS",
                                                       "CC",
                                                       "CL",
                                                       "CM",
                                                       "CS",
                                                       "CH",
                                                       "DF",
                                                       "DG",
                                                       "GT",
                                                       "GR",
                                                       "HG",
                                                       "JC",
                                                       "MC",
                                                       "MN",
                                                       "MS",
                                                       "NT",
                                                       "NL",
                                                       "OC",
                                                       "PL",
                                                       "QT",
                                                       "QR",
                                                       "SP",
                                                       "SL",
                                                       "SR",
                                                       "TC",
                                                       "TS",
                                                       "TL",
                                                       "VZ",
                                                       "YN",
                                                       "ZS",
                                                       "SM",
                                                       "NE"};
    public static final String[] MESES_VALOR = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};

    //Constructor de la clase Persona que se encarga de crear el objeto 
    //y generar la CURP
    public Persona(String nombre, String ap_p, 
            String ap_m, String genero, String dia, 
            int mes, String anio, int ent) {
        this.nombre = nombre;
        this.ap_p = ap_p;
        this.ap_m = ap_m;
        this.genero = genero;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.ent = ent;
        StringBuilder curp = new StringBuilder();
        curp.append(ap_p.charAt((0)));
        curp.append(PrimeraVocal(ap_p));
        curp.append(ap_m.charAt(0));
        curp.append(nombre.charAt(0));
        curp.append(anio.substring(2));
        curp.append(MESES_VALOR[mes]);
        curp.append(dia);
        curp.append(genero);
        curp.append(ENTIDAD_FEDERATIVA_VALOR[ent]);
        curp.append(PrimeraLetra(ap_p.substring(1)));
        curp.append(PrimeraLetra(ap_m.substring(1)));
        curp.append(PrimeraLetra(nombre.substring(1)));
        curp.append(0);
        curp.append(random.nextInt(10));
        this.CURP = curp.toString();
        this.CURP.toUpperCase();
    }
    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_p() {
        return ap_p;
    }

    public void setAp_p(String ap_p) {
        this.ap_p = ap_p;
    }

    public String getAp_m() {
        return ap_m;
    }

    public void setAp_m(String ap_m) {
        this.ap_m = ap_m;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return MESES_VALOR[mes];
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getEnt() {
        return arregloentidades[ent];
    }

    public void setEnt(int ent) {
        this.ent = ent;
    }    

    //metodo que devuelve la primer vocal de una palabra
    private static char PrimeraVocal(String s) {
        //To change body of generated methods, choose Tools | Templates.
        char desplazamiento = 0;
        int primervocal = 0;
            for (int j = 1;(primervocal==0&&j<s.length()); j++) {
            desplazamiento = s.charAt(j);
                if(desplazamiento==('A'))
                primervocal++;
                else if(desplazamiento==('E'))
                    primervocal++;
                else if(desplazamiento==('I'))
                    primervocal++;
                else if(desplazamiento==('O'))
                    primervocal++;
                else if(desplazamiento==('U'))
                    primervocal++;             
            }
        return desplazamiento;
    }

    //metodo que devuelve la primer letra de una palabra
    private static char PrimeraLetra(String s) {
        char consonantes[] = {'B','C','D','F','G','H','J','K','L','M','N','Ñ','P','Q','R','S','T','V','W','X','Y','Z'};
    	int primerconsonante = 0;
    	char recorrido =0;
 
        for (int i = 0;(primerconsonante==0&&i<s.length()); i++) {
            for (int j = 0;(j< consonantes.length&&primerconsonante==0); j++) {
                recorrido = s.charAt(i);
                if(recorrido==consonantes[j])
                    primerconsonante++;
            }
        }
        
        return recorrido;
    }
}
