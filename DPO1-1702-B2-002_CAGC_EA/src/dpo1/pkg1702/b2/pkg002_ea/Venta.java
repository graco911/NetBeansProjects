package dpo1.pkg1702.b2.pkg002_ea;

import java.time.LocalDateTime;

/**
 *
 * @author Carlos Alberto Graniel Córdova
 * Clase Venta con los datos de las ventas
 * 
 */
public class Venta {
    
    //DECLARACION DE VARIABLES
    LocalDateTime Fecha;
    Float[] Dias;
    Float Subtotal = 0f;
    Float Total;
    Float iva;
    Persona Persona;
    float IVA = 0.16f;

    //CONSTRUCTOR POR DEFECTO
    public Venta(Persona persona, Float[] dias){
        Fecha = LocalDateTime.now();
        this.Persona = persona;
        this.Dias = dias;
        //CALCULO DEL SUBTOTAL
        for(Float dia : Dias){
            Subtotal += dia;
        }
        //CALCULO DEL IVA
        this.iva = Subtotal*IVA;
        //CALCULO DEL TOTAL GENERAL
        this.Total = Subtotal + iva;
    }
    //GETTERS & SETTERS
    public LocalDateTime getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDateTime Fecha) {
        this.Fecha = Fecha;
    }

    public Float[] getDias() {
        return Dias;
    }

    public void setDias(Float[] Dias) {
        this.Dias = Dias;
    }

    public Float getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(Float Subtotal) {
        this.Subtotal = Subtotal;
    }

    public Float getTotal() {
        return Total;
    }

    public void setTotal(Float Total) {
        this.Total = Total;
    }

    public Persona getPersona() {
        return Persona;
    }

    public void setPersona(Persona Persona) {
        this.Persona = Persona;
    }

    public Float getIva() {
        return iva;
    }

    public void setIva(Float iva) {
        this.iva = iva;
    }
    
    //METODO QUE DEVUELVE LOS DATOS DE LA VENTA
    public String GetVenta(){
        return "Registro del dia: " + this.getFecha() +
                "\n" + 
                "Correspondiente al Usuario " + getPersona().FullName + 
                "\n" + 
                "Subtotal: " + getSubtotal() +
                "\n" +
                "IVA: " + getIva() + 
                "\n" +
                "Total: " + getTotal();
    }
}
