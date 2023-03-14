
package boletin21_2;

import com.miguel.datos.PedirDatos;



public class NotasDAM {
    
    
    public int[] crearArrayInt() {
        int[] notas = new int[30];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = PedirDatos.pedirInt("Ecribe a nota: ");
        }
        return notas;
    }
    
    public void mostrarArray(int[] notas) {
        int numAprobados=0;
        int numSuspensos=0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]>=5){
                numAprobados=numAprobados+1;
            }else{
                numSuspensos=numSuspensos+1;
            }
        
        }
               
        System.out.println("Os aprobados son: "+numAprobados);
        System.out.println("Os suspensos son: "+numSuspensos);
    }
    
    public void mostrarMedia(int[] notas) {
        int contadorAprobado=0;
        int contadorSuspenso=0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]>=5){
                contadorAprobado=contadorAprobado+notas[i]; //para sacar la media
            }else{
                contadorSuspenso=contadorSuspenso+notas[i];
            }
        
        }
        int media= (contadorAprobado+contadorSuspenso)/notas.length;
                
        System.out.println("A media da clase e: "+media);
    }
    
    public void notaMasAlta(int[] notas){
        int notaMayor=0;
        for (int i = 0; i < notas.length; i++){
            if(notaMayor<notas[i]){
                notaMayor=notas[i];                
            }
        }
        System.out.println("A nota mais alta e: "+notaMayor);
    }
}