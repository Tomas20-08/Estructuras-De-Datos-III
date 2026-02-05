//ArrayList
 
package ArrayList;
 
//Llamar al ArrayList
 
import java.util.ArrayList;
 
public class Ejemplo01 {
 
    public static void main(String[] args) {
        //Declaración e Inicialización del SArra
        ArrayList<Integer>ejList = new ArrayList<>();
        ejList.add(1);
        ejList.add(2);
        ejList.add(3);
        ejList.add(4);
        ejList.add(5);

        //Imprimir los Elementos de la lista
        System.out.println("Elementos de la lista: ");
        System.out.println(ejList);
        //Imprimir Las Posiciones
        System.out.println("Posiciones de la lista: ");
        for(int i=0; i<ejList.size(); i++){
            System.out.println(i);
        }
        //Imprimir los elementos de la lista
        System.out.println("Elementos de la lista: ");
        for(int i=0; i<ejList.size();i++){
            System.out.println(ejList.get(i));
        }
        //imprimir el tamaño de la lista
        System.out.println("Tamaño de la lista: ");
        System.out.println(ejList.size());
        //Remover un elemento
        System.out.println("Se removio el elemento 3 (que estaba en la posiscion 2): ");
        ejList.remove(2);
        //Agregar Un Elemento a la lista
        System.out.println("Se agrago un elemento a la lista (el 7): ");
        ejList.set(2,7);
        //Elementos de la lista
        System.out.println("Elementos de la lista: ");
        System.out.print(ejList);
        //La lista esta vacia
        System.out.println("La lista esta vacia o no?: ");
        System.out.println(ejList.isEmpty());
        //Esta algún número?
        System.out.println("Esta el numero 7?: ");
        System.out.println(ejList.contains(7));

 
    }
}