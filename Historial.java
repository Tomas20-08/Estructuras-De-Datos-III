//Historial

package Project;

import java.util.Stack;

public class Historial {
        
    public static Stack<String> acciones = new Stack<>();
    
    // Método auxiliar opcional (para registrar más fácilmente)
    public static void registrar(String accion) {
        acciones.push(accion);
    }

}
