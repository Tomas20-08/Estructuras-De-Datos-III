//Opcion 05

package Project;

import static Project.Opcion1.clientes;
import static Project.Opcion1.trabajadores;
import javax.swing.JOptionPane;

public class Opcion5 {
    
    public static void opcion05(){
        
        //Menu Secundario
        System.out.println("\n-----TIPO DE USUARIO-----");
        System.out.println("1. Ordenar los ID de Menor a Mayor (0 - 1000)");
        System.out.println("2. Ordenar los ID de Mayor a Menor (1000 - 0)");
        

        int op = Validador.leerEntero("Ingrese la opción para ORGANIZAR los ID");

        int nClientes = clientes.size();
        int nTrabajadores = trabajadores.size();
        
        switch(op){
            
            case 1: //Ordenar los ID Ascendente 0 - 1000
                
                JOptionPane.showMessageDialog(null, "Ha elegido la opción 1");
                
                Historial.registrar("Se ordenaron los ID Ascendentemente. ");
                
                //Ordenamiento por método burbuja (Clientes)
                for(int i=0; i<nClientes; i++){
                    for(int j=0; j<(nClientes-1); j++){
                        if(clientes.get(j).getId().compareTo(clientes.get(j + 1).getId()) > 0){
                            
                            Clientes aux = clientes.get(j);
                            clientes.set(j, clientes.get(j + 1));
                            clientes.set(j + 1, aux);
                        }  
                    }
                }
                
                //Ordenamiento por método burbuja (Trabajadores)
                for(int i=0; i<nTrabajadores; i++){
                    for(int j=0; j<(nTrabajadores-1); j++){
                        if(trabajadores.get(j).getId().compareTo(trabajadores.get(j + 1).getId()) > 0){
                            
                            Trabajadores aux = trabajadores.get(j);
                            trabajadores.set(j, trabajadores.get(j + 1));
                            trabajadores.set(j + 1, aux);
                        }  
                    }
                }
                
                JOptionPane.showMessageDialog(null, 
                        "Los ID de los Clientes y Trabajadores se organizaron correctamente.\n" +
                        "(Usar Opción 7 para revisar)");
                
                break;
                
            case 2: //Ordenar los ID Descendente 1000 - 0
                
                JOptionPane.showMessageDialog(null, "Ha elegido la opción 2");
                
                Historial.registrar("Se ordenaron los ID Descendentemente. ");
                
                //Ordenamiento por burbuja (Clientes)
                for(int i=0; i<nClientes; i++){
                    for(int j=0; j<(nClientes-1); j++){
                        if(clientes.get(j).getId().compareTo(clientes.get(j + 1).getId()) < 0){
                            
                            Clientes aux = clientes.get(j);
                            clientes.set(j, clientes.get(j + 1));
                            clientes.set(j + 1, aux);
                        }  
                    }
                }
                
                //Ordenamiento por burbuja (Trabajadores)
                for(int i=0; i<nTrabajadores; i++){
                    for(int j=0; j<(nTrabajadores-1); j++){
                        if(trabajadores.get(j).getId().compareTo(trabajadores.get(j + 1).getId()) < 0){
                            
                            Trabajadores aux = trabajadores.get(j);
                            trabajadores.set(j, trabajadores.get(j + 1));
                            trabajadores.set(j + 1, aux);
                        }  
                    }
                }
                
                JOptionPane.showMessageDialog(null, 
                        "Los ID de los Clientes y Trabajadores se organizaron correctamente.\n" +
                        "(Usar Opción 7 para revisar)");
               
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
                break;
        }
    }
}
