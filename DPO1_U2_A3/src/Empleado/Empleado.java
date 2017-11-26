package Empleado;

/**
 *
 * @author Carlos Alberto Graniel Córdova
 */

//Clase Empleados
public class Empleado {
    //inicializacion de variables
    private String Nombre;
    private String Apellido_paterno;
    private String Apellido_materno;
    private String CURP;
    private String FullName;
    private float[] Horas = new float[5];
    private float Sueldo_neto;
    private float Horas_extras;
    private float Horas_laboradas;
    private int faltas;
    private float aguinaldo;
    private int Anios_antiguedad;
    //Constructor por defecto
    public Empleado(String Nombre, String Apellido_paterno, String Apellido_materno, String CURP, int Anios_antiguedad) {
        this.Nombre = Nombre;
        this.Apellido_paterno = Apellido_paterno;
        this.Apellido_materno = Apellido_materno;
        this.CURP = CURP;
        this.Anios_antiguedad = Anios_antiguedad;
        this.FullName = Nombre + " " + Apellido_paterno + " " + Apellido_materno;
    }
    //GETTERS & SETTERS
    public int getAnios_antiguedad() {
        return Anios_antiguedad;
    }

    public void setAnios_antiguedad(int Anios_antiguedad) {
        this.Anios_antiguedad = Anios_antiguedad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido_paterno() {
        return Apellido_paterno;
    }

    public void setApellido_paterno(String Apellido_paterno) {
        this.Apellido_paterno = Apellido_paterno;
    }

    public String getApellido_materno() {
        return Apellido_materno;
    }

    public void setApellido_materno(String Apellido_materno) {
        this.Apellido_materno = Apellido_materno;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public float[] getHoras() {
        return Horas;
    }

    public void setHoras(float[] Sueldo) {
        this.Horas = Sueldo;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public float getSueldo_neto() {
        return Sueldo_neto = Horas_laboradas + Horas_extras;
    }

    public void setSueldo_neto(float Sueldo_neto) {
        this.Sueldo_neto = Sueldo_neto;
    }

    public float getHoras_extras() {
        return Horas_extras;
    }

    public void setHoras_extras(float Horas_extras) {
        this.Horas_extras = Horas_extras;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public float getAguinaldo() {
        return aguinaldo;
    }

    public void setAguinaldo(float aguinaldo) {
        this.aguinaldo = aguinaldo;
    }

    public float getHoras_laboradas() {
        return Horas_laboradas;
    }

    public void setHoras_laboradas(float Horas_laboradas) {
        this.Horas_laboradas = Horas_laboradas;
    }
    
    
    
    
}
