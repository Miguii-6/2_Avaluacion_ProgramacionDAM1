
package boletin.pkg21_1;

import com.miguel.datos.PedirDatos;
import java.util.Arrays;



public class Numeros {
    
   public int[] crearArrayInt() {
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = PedirDatos.pedirInt("Inserte 6 números entre o 1 e o 50: ");
        }
        return numeros;
    }
    
    public void mostrarArray(int[] numeros) {
        Arrays.sort(numeros);
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.println("posición " + (i+1) + "--> " + numeros[i]);
        }
    }
}
