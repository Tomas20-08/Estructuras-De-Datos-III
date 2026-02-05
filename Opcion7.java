//Opcion 07

package Project;

import static Project.Opcion1.clientes;
import static Project.Opcion1.trabajadores;
import javax.swing.JOptionPane;

public class Opcion7 {
    
    public static void opcion07(){
        
        // Menu Secundario
        System.out.println("\n-----TIPO DE USUARIO-----");
        System.out.println("1. Cliente");
        System.out.println("2. Trabajador");
        

        int op = Validador.leerEntero("Ingrese la opción del tipo de usuario a VER");
        
        switch(op){
            
            case 1:
                
                // CLIENTES REGISTRADOS
                System.out.println("\n---- LISTA DE CLIENTES ----");
                System.out.println(clientes);
                
                JOptionPane.showMessageDialog(null,"INFORMACIÓN EN CONSOLA");
                
                break;
                
            case 2:
                
                // TRABAJADORES REGISTRADOS
                System.out.println("\n---- LISTA DE TRABAJADORES ----");
                System.out.println(trabajadores);
                
                JOptionPane.showMessageDialog(null,"INFORMACIÓN EN CONSOLA");
                
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
                break;
        }
    }
}

