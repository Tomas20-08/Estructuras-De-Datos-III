//Opcion 03

package Project;

import static Project.Opcion1.clientes;
import static Project.Opcion1.trabajadores;

import javax.swing.JOptionPane;

public class Opcion3 {
    
    public static void opcion03(){
        
         //Menu Secundario
        
        System.out.println("\n-----TIPO DE USUARIO-----");
        System.out.println("1. Cliente");
        System.out.println("2. Trabajador");
        
        int op = Validador.leerEntero("Ingrese la opcion del tipo de usuario a ELIMINAR");
        
        switch(op){
            
            case 1:
               
                JOptionPane.showMessageDialog(null, "Ha elegido CLIENTE");

                //CLINTES REGISTRADOS
                System.out.println("\n---- LISTA DE CLIENTES ----");
                System.out.println(clientes);

                // ID DEL CLIENTE A ELIMINAR
                String idClienteEliminar = Validador.leerCadena("Ingrese el ID del cliente a eliminar");
                
                Historial.registrar("Cliente eliminado con ID: " + idClienteEliminar + " ");

                for (int i = 0; i < clientes.size(); i++) {
                     if (clientes.get(i).getId().equals(idClienteEliminar)) {

                        clientes.remove(i);
                        JOptionPane.showMessageDialog(null,"Cliente eliminado correctamente.");
                        return;
                    }
                }

                // ID NO REGISTRADA
                JOptionPane.showMessageDialog(null,"No se encontró un cliente con ese ID.");

                break;
                
            case 2:
                
                JOptionPane.showMessageDialog(null, "Ha elegido TRABAJADOR");

                //TRABAJADORES REGISTRADOS
                System.out.println("\n---- LISTA DE TRABAJADORES ----");
                System.out.println(trabajadores);

                // ID DEL TARBAJADOR A ELIMINAR
                String idTrabajadorEliminar = Validador.leerCadena("Ingrese el ID del trabajador a eliminar");
                
                Historial.registrar("Trabajador eliminado con ID: " + idTrabajadorEliminar + " ");

                for (int i = 0; i < trabajadores.size(); i++) {
                    if (trabajadores.get(i).getId().equals(idTrabajadorEliminar)) {

                        trabajadores.remove(i);
                        JOptionPane.showMessageDialog(null,"Trabajador eliminado correctamente.");
                        return;
                    }
                }

                // ID NO REGISTRADA
                JOptionPane.showMessageDialog(null,"No se encontró un trabajador con ese ID.");
                
                break;
                
        }
    
    }
    
}
