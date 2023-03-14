
package boletin18;

import java.util.Scanner;


public class Boletin18 {

    public static void main(String[] args) {
        
        ConversorTemperaturas obj = new ConversorTemperaturas();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la temperatura en grados centigrados: ");
        float temperatura = sc.nextFloat();
        
        try{
            System.out.println("Grados Fharenheit: " + obj.centigradosAFharenheit(temperatura));
            System.out.println("Grados Reamur: " + obj.centigradosAReamur(temperatura));
        }catch(TemperaturaErradaExcepcion ex){
            System.out.println("La temperatura no puede ser menor a 80º\n" + ex.toString());
        }
    }
    
}
