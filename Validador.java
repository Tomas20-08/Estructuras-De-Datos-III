package Project;

import javax.swing.JOptionPane;

public class Validador {


    public static int leerEntero(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);

                if (input == null) {  // Si cancela
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor.");
                    continue;
                }

                return Integer.parseInt(input.trim());  
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: debe ingresar un número entero válido.");
            }
        }
    }



    public static int leerEnteroRango(String mensaje, int min, int max) {
        while (true) {
            int valor = leerEntero(mensaje);

            if (valor < min || valor > max) {
                JOptionPane.showMessageDialog(null,
                        "Opción inválida. Ingrese un número entre " + min + " y " + max + ".");
                continue;
            }

            return valor;
        }
    }


    public static String leerTexto(String mensaje) {
        while (true) {
            String input = JOptionPane.showInputDialog(mensaje);

            if (input == null || input.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un texto válido.");
                continue;
            }

            return input.trim();
        }
    }



    public static String leerTelefono(String mensaje) {
        while (true) {
            String input = leerTexto(mensaje);

            if (!input.matches("\\d{7,12}")) {
                JOptionPane.showMessageDialog(null, "El teléfono debe tener entre 7 y 12 dígitos numéricos.");
                continue;
            }

            return input;
        }
    }



    public static String leerIdentificacion(String mensaje) {
        while (true) {
            String input = leerTexto(mensaje);

            if (!input.matches("\\d{5,15}")) {
                JOptionPane.showMessageDialog(null, "La identificación debe tener entre 5 y 15 números.");
                continue;
            }

            return input;
        }
    }
    
    public static String leerCadena(String mensaje) {
    String texto;

    while (true) {
        texto = JOptionPane.showInputDialog(mensaje);

        if (texto == null) {
            // Usuario canceló → volver a pedir
            JOptionPane.showMessageDialog(null, "Debe ingresar un texto.");
            continue;
        }

        texto = texto.trim(); // eliminar espacios al inicio/fin

        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El texto no puede estar vacío.");
        } else {
            return texto; // válido
        }
    }
}

    
}