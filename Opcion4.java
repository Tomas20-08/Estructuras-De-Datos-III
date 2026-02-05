package Project;

import java.util.Stack;
import javax.swing.JOptionPane;

public class Opcion4 {
    
    public static void opcion04(){
        
        System.out.println("---HISTORIAL DE ACCIONES---");
        System.out.println("1. Usuarios Agregados");
        System.out.println("2. Usuarios Editados");
        System.out.println("3. Usuarios Eliminados");
        System.out.println("4. Orden de los ID actual");
        System.out.println("5. Usuarios Buscados");
        System.out.println("6. Elimar Historial de acciones");
        
        int op = Validador.leerEntero("Ingrese la opción a elegir");

        String mensaje = "";
        Stack<String> pilaTemporal = new Stack<>();
        
        switch(op){
        
            case 1:
                for (String accion : Historial.acciones) {
                    if (accion.contains("agregado")) {
                        mensaje += accion;
                    }
                }
                break;
                
            case 2: 
                for (String accion : Historial.acciones) {
                    if (accion.contains("editado")) {
                        mensaje += accion;
                    }
                }
                break;
            
            case 3:
                for (String accion : Historial.acciones) {
                    if (accion.contains("eliminado")) {
                        mensaje += accion;
                    }
                }
                break;
                
            case 4:
                for (String accion : Historial.acciones) {
                    if (accion.contains("ordenaron")) {
                        mensaje += accion;
                    }
                }
                break;
                
            case 5:
                for (String accion : Historial.acciones) {
                    if (accion.contains("busco")) {
                        mensaje += accion;
                    }
                }
                break;
                
            case 6: 
                if(Historial.acciones.empty()){
                    System.out.println("El historial ya está vacío (¿porque será?)");
                } else {
                    Historial.acciones.clear();
                    System.out.println("Historial borrado correctamente.");
                    JOptionPane.showMessageDialog(null,"Pero Recuerda eso nunca se borra totalmente :0");
                }
                break;
                
            default:
                mensaje = "Opción no válida.";
                break;
        }
        
        if (mensaje.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ha habido acciones registradas en el historial.");
        } else {
            JOptionPane.showMessageDialog(null, mensaje);
        }
    } 
}
