//Trabajadores

package Project;

public class Trabajadores {

    String idTrabajadores;
    String nombre;
    String identificacion;
    String telefono;
    String ciudad;
    String trabajo;

    public Trabajadores(String idTrabajadores, String nombre, String identificacion,
                        String telefono, String ciudad, String trabajo) {

        this.idTrabajadores = idTrabajadores;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.trabajo = trabajo;
    }

    public String getId() {
        return idTrabajadores;
    }

    @Override
    public String toString() {
        return "ID: " + idTrabajadores + " | Nombre: " + nombre + " | CC: " + identificacion + " | Tel: " + telefono + " | Ciudad: " + ciudad + " | Trabajo: " + trabajo + "\n";
      
    }
}