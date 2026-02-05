//Opcion 06

package Project;

import static Project.Opcion1.clientes;
import static Project.Opcion1.trabajadores;
import javax.swing.JOptionPane;

public class Opcion6 {
    
    public static void opcion06(){
        
        int iniC = 0;
        int iniT = 0;
        int finC = clientes.size() - 1;
        int finT = trabajadores.size() - 1;
        String datoC; 
        String datoT;
        int p = 0, resultado = -1;
        
        // Menu Secundario
        System.out.println("\n-----TIPO DE USUARIO-----");
        System.out.println("1. Cliente");
        System.out.println("2. Trabajador");
        
        // 🔥 Uso de Validador para evitar errores
        int op = Validador.leerEntero("Ingrese la opción del tipo de usuario a BUSCAR");
        
        switch(op){
            
            case 1: // Buscar CLIENTES por ID
                
                JOptionPane.showMessageDialog(null, "Ha elegido la opción 1");
                
                System.out.println("\n---- LISTA DE CLIENTES ----");
                System.out.println(clientes);
                
                datoC = Validador.leerCadena("Ingrese el ID del cliente a buscar");
                
                Historial.registrar("Se buscó el cliente con ID: " + datoC + " ");
                
                // Búsqueda Binaria
                resultado = -1;
                iniC = 0;
                finC = clientes.size() - 1;
                
                while(iniC <= finC){
                    p = (iniC + finC) / 2;
                    
                    int comp = clientes.get(p).getId().compareTo(datoC);
                    
                    if(comp == 0){
                        resultado = p;
                        break;
                    } else if (comp < 0){
                        iniC = p + 1;
                    } else {
                        finC = p - 1;
                    }
                }
                
                // Resultado
                if (resultado != -1) {
                    JOptionPane.showMessageDialog(null,
                        "El cliente con ID " + datoC + " está en la posición " + resultado);
                } else {
                    JOptionPane.showMessageDialog(null,
                        "No se encontró ningún cliente con el ID: " + datoC);
                }
                
                break;
                
                
            case 2: // Buscar TRABAJADORES por ID
                
                JOptionPane.showMessageDialog(null, "Ha elegido la opción 2");
                
                System.out.println("\n---- LISTA DE TRABAJADORES ----");
                System.out.println(trabajadores);
                
                datoT = Validador.leerCadena("Ingrese el ID del trabajador a buscar");
                
                Historial.registrar("Se buscó el trabajador con ID: " + datoT + " ");
                
                resultado = -1;
                iniT = 0;
                finT = trabajadores.size() - 1;
                
                // Búsqueda Binaria
                while(iniT <= finT){
                    p = (iniT + finT) / 2;
                    
                    int comp = trabajadores.get(p).getId().compareTo(datoT);
                    
                    if(comp == 0){
                        resultado = p;
                        break;
                    } else if (comp < 0){
                        iniT = p + 1;
                    } else {
                        finT = p - 1;
                    }
                }
                
                // Resultado
                if (resultado != -1) {
                    JOptionPane.showMessageDialog(null,
                        "El trabajador con ID " + datoT + " está en la posición " + resultado);
                } else {
                    JOptionPane.showMessageDialog(null,
                        "No se encontró ningún trabajador con el ID: " + datoT);
                }
                
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
                break;
        }
    
    }
    
}
