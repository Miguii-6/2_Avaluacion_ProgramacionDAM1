
package boletin22;

import com.miguel.datos.PedirDatos;

public class Boletin22 {

    public static void main(String[] args) {
        int num;
        
        Metodos obx = new Metodos();
        int [][]auxGoles = null;
        int []auxXornadas;
        auxGoles = obx.crearArrayGoles();
        auxXornadas = obx.crearXornadas();
        do{
            num = PedirDatos.pedirInt("1. Ver tabla\n2. Ordenar por goles máximos");
            switch(num){
                case 1:
                    obx.verTabla(auxXornadas, obx.equipos, auxGoles);
                    break;
                case 2:
                    obx.ordenarTabla(obx.equipos, auxGoles);
                    break;
                case 3:
                    obx.verMaximoGoleadorXornada(obx.equipos, auxXornadas, auxGoles);
                    break;
                case 5:
                    obx.verEquipoXornadaPorGoles(obx.equipos, auxXornadas, auxGoles);
                    break;
            }
        }while(num>0);
    }
    
    
}
