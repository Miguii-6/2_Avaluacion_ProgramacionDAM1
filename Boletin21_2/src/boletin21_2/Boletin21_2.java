
package boletin21_2;


public class Boletin21_2 {

    
    public static void main(String[] args) {
        NotasDAM nota=new NotasDAM();
        
        
        int[] aux=nota.crearArrayInt();
        
        nota.mostrarArray(aux);
        nota.mostrarMedia(aux);
        nota.notaMasAlta(aux);
    }
    
    
}
