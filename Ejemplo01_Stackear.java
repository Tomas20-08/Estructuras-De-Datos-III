

package Stack;
 
import java.util.Stack;
 
public class Ejemplo01_Stackear {
 
    public static void main(String[] args) {

        Stack pila = new Stack();

        // .push(elemento e)

        pila.push(1);

        pila.push(2);

        pila.push(3);

        pila.push(4);

        // .pop()

        pila.pop();

        for(int i=0; i<pila.size();i++){

            // .get(i) para ver los elementos

            System.out.println(pila.get(i));

        }

        // .peek()

        System.out.println("El ultimo elemento agregado es: " + pila.peek());

        // .empty()

        System.out.println("¿Esta Vacio? " + pila.empty());

        // .search(Object o)

        System.out.println("¿Esta el número 3? " + pila.search(3));

        System.out.println("¿Esta el número 4? " + pila.search(4));
 
    }

}
 