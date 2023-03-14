
package boletin21_4;

import com.miguel.datos.PedirDatos;


public class Boletin21_4 {

    public static void main(String[] args) {
        int numeroDni= PedirDatos.pedirInt("Intoduce número do DNI: ");
        Dni dni=new Dni(numeroDni);
        System.out.println("A letra do DNI e: "+dni.calculoLetraDni());
    }
    
}
