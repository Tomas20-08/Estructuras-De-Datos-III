//Generador ID 

package Project;

public class IDGenerator {
    
    private static int contadorClientes = 1;
    private static int contadorTrabajadores = 1;

    private static int contador = 1;  

    public static String generarID(String tipo){
        
        //Al Agregar Usuario se le asigna un ID DEPENDIENDO SI ES CLIENTE (C000) O TRABAJADOR (T0000) 
                if (tipo.equalsIgnoreCase("Cliente")) {
            return "C" + String.format("%04d", contadorClientes++);
        } else if (tipo.equalsIgnoreCase("Trabajador")) {
            return "T" + String.format("%04d", contadorTrabajadores++);
        } else {
            return "X" + String.format("%04d", 0); // en caso de error
        }
        
        
    }

}
