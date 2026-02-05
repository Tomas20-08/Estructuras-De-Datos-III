//Opcion 02

package Project;

import static Project.Opcion1.clientes;
import static Project.Opcion1.trabajadores;
import javax.swing.JOptionPane;

public class Opcion2 {
    
    //
    
    public static void opcion02(){
        
        //Menu Secundario
        
        System.out.println("\n-----TIPO DE USUARIO-----");
        System.out.println("1. Cliente");
        System.out.println("2. Trabajador");
        
        int op = Validador.leerEntero("Ingrese la opcion del tipo de usuario a EDITAR");
        
        switch(op){
            
            case 1:
                
                JOptionPane.showMessageDialog(null, "Ha elegido CLIENTE");

                //CLINTES REGISTRADOS
                System.out.println("\n---- LISTA DE CLIENTES ----");
                System.out.println(clientes);
                
                String idClienteEditar = Validador.leerCadena("Ingrese el ID del cliente a editar:");
                 
                Historial.registrar("Cliente editado con ID: " + idClienteEditar + " ");

                for (int i = 0; i < clientes.size(); i++) {
                    if (clientes.get(i).getId().equals(idClienteEditar)) {

                        Clientes temp = clientes.get(i);

                        String nuevoNombre = Validador.leerCadena("Nuevo nombre:");
                        String nuevaCC = Validador.leerCadena("Nueva identificación:");
                        String nuevoTel = Validador.leerCadena("Nuevo teléfono:");
                        String nuevaCiudad = Validador.leerCadena("Nueva ciudad:");

                        Clientes edit = new Clientes(idClienteEditar, nuevoNombre, nuevaCC, nuevoTel, nuevaCiudad);

                        clientes.set(i, edit); 

                        JOptionPane.showMessageDialog(null, "CLIENTE editado correctamente.");
                        return;
                    }
                }

                JOptionPane.showMessageDialog(null, "No se encontró un cliente con ese ID.");
                
                break;
                
            case 2:
                
                JOptionPane.showMessageDialog(null, "Ha elegido TRABAJADOR");

                //TRABAJADORES REGISTRADOS
                System.out.println("\n---- LISTA DE TRABAJADORES ----");
                System.out.println(trabajadores);
                
                String idTrabajadorEditar = Validador.leerCadena("Ingrese el ID del trabajador a editar:");
                
                Historial.registrar("Trabajador editado con ID: " + idTrabajadorEditar + " ");

                for (int i = 0; i < trabajadores.size(); i++) {
                    if (trabajadores.get(i).getId().equals(idTrabajadorEditar)) {

                        Trabajadores temp = trabajadores.get(i);

                        String nuevoNombre = Validador.leerCadena("Nuevo nombre:");
                        String nuevaCC = Validador.leerCadena("Nueva identificación:");
                        String nuevoTel = Validador.leerCadena("Nuevo teléfono:");
                        String nuevaCiudad = Validador.leerCadena("Nueva ciudad:");
                        String nuevoTrabajo = Validador.leerCadena("Nuevo trabajo:");

                        Trabajadores edit = new Trabajadores(idTrabajadorEditar, nuevoNombre, nuevaCC, nuevoTel, nuevaCiudad, nuevoTrabajo);

                        trabajadores.set(i, edit);

                        JOptionPane.showMessageDialog(null, "TRABAJADOR editado correctamente.");
                        return;
                    }
                }

                JOptionPane.showMessageDialog(null, "No se encontró un trabajador con ese ID.");
 
                break;
                
        }
    
    }
    
}
