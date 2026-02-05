//Gestor De Llamadas (Estructuras De Datos)
package Stack;
import java.util.Stack;
import javax.swing.JOptionPane;
public class Ejemplo02_Llamadas_ {

    public static void main(String[] args) {
        
        //Inicialización de Variables
         Stack<String> pila = new Stack<>();
         int nElementos, cont = 0;
         String telefono;
         String s = " / ";
        
        //Pedir al Usuario la cantidad de llamadas
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de llamadas a procesar: "));

         //Pedir al usuario los números de telefono
        for (int i = 0; i < nElementos; i++) {
            telefono = JOptionPane.showInputDialog("Ingrese el telefono de la llamada #" + (i + 1));
            pila.push(telefono);
        }
        
        //Bucle para menu de opciones
        while (true) {
            
            //Variables para el menu de opciones
            String opcion;
            String llamadas;
            
        // Mostrar lista de llamadas
            llamadas = "Llamadas en espera:";
            if (pila.isEmpty()) {
                llamadas += "No hay llamadas restantes";
                break;
            } else {
                for (int i = pila.size() - 1; i >= 0; i--) {
                    llamadas += s + pila.get(i);
                }
            }
            
            JOptionPane.showMessageDialog(null, llamadas);
            
            //Switch case 
            System.out.println("\nOpciones:");
            System.out.println("1. Atender Llamada");
            System.out.println("2. Rechazar Llamada");
            System.out.println("3. Salir del programa\n");
            opcion = JOptionPane.showInputDialog("Ingrese la opción a elegir: Para la llamada " + (cont+1));
            
            switch (opcion) {
                
                //Opciones

                case "1": //Llamada Aceptada
                    JOptionPane.showMessageDialog(null, "Ha seleccionado opción No.1");
                    String llamadaAceptada = pila.pop();
                    System.out.println("[INFO] No. llamada: [#" + (cont) + "]  Tel: [" + llamadaAceptada + "]   Estado: [Atendida]");
                    JOptionPane.showMessageDialog(null, "Atendiendo llamada (más INFO en la consola)");
                    cont++;
                    break;

                case "2": //Llamada Rechazada
                    JOptionPane.showMessageDialog(null, "Ha seleccionado opción No.2");
                    String llamadaRechazada = pila.pop();
                    System.out.println("[INFO] No. llamada: [#" + (cont) + "]  Tel: [" + llamadaRechazada + "]   Estado: [Rechazada]");
                    JOptionPane.showMessageDialog(null, "Llamada rechazada (más INFO en la consola)");
                    cont++;
                    break;

                case "3": //Salir del programa
                    JOptionPane.showMessageDialog(null, "Ha seleccionado opción No.3");
                    System.out.println("Profe pongame 5.0 :D");
                    JOptionPane.showMessageDialog(null, "Gracias por usar el gestor de llamadas (revise la consola)");
                    return;

                default: //Error
                    JOptionPane.showMessageDialog(null, "Opción inválida, intente nuevamente.");
            }
        }
    }
}


        
