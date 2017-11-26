import ProgramaEstacionamiento.Estacionamiento;
/**
 *
 * @author Carlos Alberto Graniel Córdova
 * ES1611301058
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Estacionamiento estacionamiento = new Estacionamiento();
        //Agregamos patentes
        estacionamiento.AgregarPatente("JK1234");
        estacionamiento.AgregarPatente("DF4736");
        estacionamiento.AgregarPatente("RT9834");
        estacionamiento.AgregarPatente("TY1603");
        estacionamiento.AgregarPatente("KI2058");
        estacionamiento.AgregarPatente("DC4871");
        estacionamiento.AgregarPatente("CV2562");
        estacionamiento.AgregarPatente("KI8264");
        System.out.println("//////////////////////////////\n/////////////////////////////");
        //Agregamos patentnes con numeracion repetida
        System.out.println("Anexamos una patente repetida: FG1234 ");
        estacionamiento.AgregarPatente("FG1234");
        System.out.println("Anexamos una patente repetida: JK4871 ");
        estacionamiento.AgregarPatente("JK4871");
        System.out.println("Anexamos una patente repetida: JK2562 ");
        estacionamiento.AgregarPatente("JK2562");
        System.out.println("//////////////////////////////\n/////////////////////////////");
        //listamos patentenes
        estacionamiento.Listar();
        System.out.println("//////////////////////////////\n/////////////////////////////");
        //buscamos patentes
        System.out.println("Buscamos una patente que ya exista: KI8264 ");
        if(estacionamiento.Buscar("KI8264")){
            System.out.println("Patente encontrada");
        }else{
            System.out.println("Patente no encontrada");
        }
        System.out.println("//////////////////////////////\n/////////////////////////////");
        System.out.println("Buscamos una patente que no exista: XX1111 ");
        if(estacionamiento.Buscar("XX1111")){
            System.out.println("Patente encontrada");
        }else{
            System.out.println("Patente no encontrada");
        }   
    }  
}
