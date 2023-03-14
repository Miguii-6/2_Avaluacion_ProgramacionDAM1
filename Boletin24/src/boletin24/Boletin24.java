
package boletin24;

import com.miguel.datos.PedirDatos;
import java.util.ArrayList;

public class Boletin24 {

    public static void main(String[] args) {
        ArrayList<Libro> ListaLibros = new ArrayList<>();
        Libreria obj = new Libreria();
        //para que haga siempre lo mismo ponemos un bucle
        int opcion;
        do{
        
        //hacemos menu
        opcion =PedirDatos.pedirInt("***MENU*** \n\n 1---> Añadir libro \n 2---> Vender \n 3---> Ordenar \n 4---> Mostrar \n 5---> Baja a libros con unidades en cero \n 6---> Consultar un libro determinado \n\n Teclea una opcion de las anteriores");
        switch (opcion){
            case 1: obj.añadirLibro(ListaLibros);
                    break;
                    
            case 2: obj.borrarLibroPorIsbn(ListaLibros);
                    break;
                    
            case 3: obj.ordenar(ListaLibros);
                    break;
                
            case 4: obj.mostrar(ListaLibros);
                    break;
                    
            case 5: obj.borrarLibroPorUnidad(ListaLibros);
                    break;
            
            case 6: obj.buscarLibroDeterminado(ListaLibros);
                    break;
                    
            default: System.out.println("Opcion incorrecta");
                    break;
        }
        
        }while (opcion<=5); 
    }
    
    
}
