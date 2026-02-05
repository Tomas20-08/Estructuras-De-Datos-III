//YourJob

package Project;

import javax.swing.JOptionPane;

public class YourJob {

    public static void main(String[] args) {
        
        //Bienvenida
        
        JOptionPane.showMessageDialog(null,"Bienvenido al gestor de Datos de YourJob");
        
        //Variables
        
        int op;
        
        //Bucle
        
        do{
        
        //Menu
        
        System.out.println("\n-----MENU PRINCIPAL-----");
        System.out.println("0. Salir del Programa");
        System.out.println("1. Ingresar Datos de Usuario");
        System.out.println("2. Editar Datos de Usuario");
        System.out.println("3. Eliminar Datos de Usuario");
        System.out.println("4. Historial de Acciones");
        System.out.println("5. Ordenar Datos de Usuarios");
        System.out.println("6. Buscar Datos de Usuario ");
        System.out.println("7. Ver Usuarios de YourJob\n");
        
        //Preguntar al usuario la opción
        
        op = Validador.leerEnteroRango("Ingrese la opción a elegir (0 - 7):", 0, 7);
        
        //Switch Case
        
        switch(op){
            
            //Opciones
            
            case 0: //Salir
                JOptionPane.showMessageDialog(null,"Ha elegido la opcion 0");
                JOptionPane.showMessageDialog(null,"Gracias por utilizar el Gestor de Datos de YourJob");
                System.out.println("Bye Bye");
                break;
            case 1: //
                JOptionPane.showMessageDialog(null,"Ha elegido la opcion 1");
                Opcion1.opcion01();
                break;
            case 2: //
                JOptionPane.showMessageDialog(null,"Ha elegido la opcion 2");
                Opcion2.opcion02();
                break;
            case 3: //
                JOptionPane.showMessageDialog(null,"Ha elegido la opcion 3");
                Opcion3.opcion03();
                break;
            case 4: //
                JOptionPane.showMessageDialog(null,"Ha elegido la opcion 4");
                Opcion4.opcion04();
                break;
            case 5: //
                JOptionPane.showMessageDialog(null,"Ha elegido la opcion 5");
                Opcion5.opcion05();
                break;
            case 6: //
                JOptionPane.showMessageDialog(null,"Ha elegido la opcion 6");
                Opcion6.opcion06();
                break;
            case 7: //
                JOptionPane.showMessageDialog(null,"Ha elegido la opcion 7");
                Opcion7.opcion07();
                break;
            
        }
        
        } while (op != 0);
        
    }
    
}
