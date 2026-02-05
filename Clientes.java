//Clientes

package Project;

public class Clientes {
    
    String idClientes;
    String nombre;
    String identificacion;
    String telefono;
    String ciudad;

    public Clientes(String idClientes, String nombre, String identificacion,
                    String telefono, String ciudad) {

        this.idClientes = idClientes;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }
    
    public String getId() {
        return idClientes;
    }

    @Override
    public String toString() {
        return "ID: " + idClientes + " | Nombre: " + nombre + " | CC: " + identificacion + " | Tel: " + telefono + " | Ciudad: " + ciudad + "\n";
    }
}