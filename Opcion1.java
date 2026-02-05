//Opcion 01

package Project;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Opcion1 {
    
    
    //ArrayList
static ArrayList<Clientes> clientes = new ArrayList<>();
static ArrayList<Trabajadores> trabajadores = new ArrayList<>();
    
    public static void opcion01(){
        
        //Menu Secundario
        
        System.out.println("\n-----TIPO DE USUARIO-----");
        System.out.println("1. Cliente");
        System.out.println("2. Trabajador");
        
        int op = Validador.leerEnteroRango("Ingrese la opción del tipo de usuario a AGREGAR", 1, 2);
        
        switch(op){
            
            case 1:
               
                JOptionPane.showMessageDialog(null,"Ha elegido la opción 1: CLIENTE");
                
                //El usuario ingrasa su información
                 
                 JOptionPane.showMessageDialog(null,"Ingrese la información del cliente");
                 
                System.out.println("\n-----INFORMACION CLIENTE-----");
                System.out.println("1. Nombre(s) y Apellido(s)");
                System.out.println("2. Numero de Identidicación");
                System.out.println("3. Telefono");
                System.out.println("4. Ciudad");

        // Captura de datos
               
            String idCliente = IDGenerator.generarID("Cliente");
            String nomCliente = Validador.leerCadena("1. Ingrese Nombre(s) y apellidos:");
            String ccCliente = Validador.leerCadena("2. Ingrese el Número de Identificación:");
            String telCliente = Validador.leerCadena("3. Ingrese el Teléfono:");
            String ciudadCliente = Validador.leerCadena("4. Ingrese la Ciudad de Residencia:");

                Clientes nuevoCliente = new Clientes(idCliente,nomCliente, ccCliente, telCliente, ciudadCliente);
                clientes.add(nuevoCliente);

                System.out.println("\n-----CLIENTE GUARDADO-----");
                System.out.println("1. Nombre: " + nuevoCliente.nombre);
                System.out.println("2. Numero de Identificacion: " + nuevoCliente.identificacion);
                System.out.println("3. Telefono: " + nuevoCliente.telefono);
                System.out.println("4. Ciudad: " + nuevoCliente.ciudad);

                JOptionPane.showMessageDialog(null,"El CLIENTE ha sido guardado correctamente en el sistema \n(Esta información se puede editar en el MENU PRINCIPAL)");
                
                Historial.registrar("Cliente agregado con ID: " + idCliente + " ");
                
                break;
                
            case 2:

    JOptionPane.showMessageDialog(null,"Ha elegido la opción 2: TRABAJADOR");

    JOptionPane.showMessageDialog(null,"Ingrese la información del trabajador");

    System.out.println("\n-----INFORMACION TRABAJADOR-----");
    System.out.println("1. Nombre(s) y Apellido(s)");
    System.out.println("2. Numero de Identidicación");
    System.out.println("3. Telefono");
    System.out.println("4. Ciudad");
    System.out.println("5. Trabajo");

    // Captura de datos

    String idTrabajador = IDGenerator.generarID("Trabajador");
    String nomTrabajador = Validador.leerCadena("1. Ingrese Nombre(s) y apellidos:");
    String ccTrabajador = Validador.leerCadena("2. Ingrese el Número de Identificación:");
    String telTrabajador = Validador.leerCadena("3. Ingrese el Teléfono:");
    String ciudadTrabajador = Validador.leerCadena("4. Ingrese la Ciudad de Residencia:");



    String[] categorias = {
        "1. Tecnologia & Informatica",
        "2. Hogar & Construccion",
        "3. Belleza & Cuidado Personal",
        "4. Mudanzas & Transporte",
        "5. Clases & Tutorias",
        "6. Eventos & Entretenimiento",
        "7. Jardineria & Exteriores",
        "8. Reparaciones & Mantenimiento",
        "9. Automotriz",
        "10. Bienestar & Cuidado",
        "11. Oficina & Administracion"
    };

    String[][] trabajos = {
        { "Tecnico en Reparacion de Computadoras", "Especialista en Soporte Tecnico",
          "Instalador de Redes y Wi-Fi", "Desarrollador Web",
          "Desarrollador de Aplicaciones Moviles", "Asesor de Software y Tecnologia",
          "Especialista en Domotica (Smart Home)" },

        { "Plomero", "Electricista", "Pintor", "Cerrajero", "Instalador de Muebles",
          "Montador de Persianas y Cortinas" },

        { "Peluquero a Domicilio", "Barbero a Domicilio", "Maquillador Profesional",
          "Manicurista", "Masoterapeuta (Masajista)", "Especialista en Depilacion" },

        { "Empresa de Mudanzas", "Conductor de Fletes", "Ayudante de Mudanzas",
          "Conductor Particular para Encargos" },

        { "Tutor Académico", "Entrenador Personal", "Profesor de Música"
                , "Instructor de GYM", "Chef Instructor de Cocina" },

        { "Fotografo de Eventos", "DJ", "Animador Infantil", "Chef de Eventos",
          "Decorador de Fiestas" },

        { "Jardinero y Paisajista", "Especialista en Poda de arboles",
          "Limpiador de Patios y Terrazas", },

        { "Tecnico en Electrodomesticos", "Tecnico en Celulares y Computacion",
          "Mecánico de Bicicletas", },

        { "Mecánico Automotriz a Domicilio", "Especialista en Lavado",
          "Operador de Grúa y Auxilio Mecánico", "Instalador de Accesorios Automotrices" },

        { "Cuidador de Niños", "Paseador de Mascotas",
          "Cuidador de Mascotas", "Asistente para Adultos Mayores",
          "Organizador del Hogar" },

        { "Asistente Virtual", "Contador", "Diseñador Grafico"}
    };


    String menuCategorias = "\n---MENU CATEGORIAS---\n";
    for (String c : categorias) menuCategorias += c + "\n";

    System.out.println(menuCategorias);
    int catSel = Validador.leerEnteroRango("Seleccione una opcion", 1, categorias.length);

    int indiceCategoria = catSel - 1;


    String menuTrabajos = "\n---MENU TRABAJOS---\n";

    for (int i = 0; i < trabajos[indiceCategoria].length; i++) {
        menuTrabajos += (i + 1) + ". " + trabajos[indiceCategoria][i] + "\n";
    }
                System.out.println(menuTrabajos);
    int trabSel = Validador.leerEnteroRango("Seleccione un opcion", 1, trabajos[indiceCategoria].length);

    String trabajoTrabajador = trabajos[indiceCategoria][trabSel - 1];


    Trabajadores nuevoTrabajador = new Trabajadores(
        idTrabajador, nomTrabajador, ccTrabajador,
        telTrabajador, ciudadTrabajador, trabajoTrabajador
    );

    trabajadores.add(nuevoTrabajador);

    System.out.println("\n-----TRABAJADOR GUARDADO-----");
    System.out.println("1. Nombre: " + nuevoTrabajador.nombre);
    System.out.println("2. Numero de Identificacion: " + nuevoTrabajador.identificacion);
    System.out.println("3. Telefono: " + nuevoTrabajador.telefono);
    System.out.println("4. Ciudad: " + nuevoTrabajador.ciudad);
    System.out.println("5. Trabajo: " + nuevoTrabajador.trabajo);

    JOptionPane.showMessageDialog(null,"El TRABAJADOR ha sido guardado correctamente en el sistema");

    Historial.registrar("Trabajador agregado con ID: " + idTrabajador + " ");

    break;

            
        }
        
    }
    
}
