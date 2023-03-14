
package boletin27;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Boletin27 {

 
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mantenemento objeto = new Mantenemento();
        File f=new File ("libreria.txt");
        ArrayList<Libro> lista=objeto.leerObjeto(f);
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n1---> AÑADIR LIBRO \n2---> CONSULTAR \n3---> MOSTRAR \n4--->BORRAR \n5--->MODIFICAR \n6--->SALIR \nTeclea opción"));
            switch (opcion) {
                case 1:
                    objeto.agregarPalabras(f);
                    lista=objeto.leerObjeto(f);
                    break;
                case 2:
                    objeto.buscarPorTitulo(lista);
                    break;
                case 3:
                    objeto.mostrar(lista);
                    break;
                case 4:
                    ArrayList<Libro> filtrada=objeto.borrar(lista);
                    objeto.reemplazarFichero(f, filtrada);
                    lista=objeto.leerObjeto(f);
                    break;
                case 5:
                    objeto.modificarPrecio(lista);
                    objeto.reemplazarFichero(f, lista);
                    lista=objeto.leerObjeto(f);
                    break;
                default:
                    break;       
            }

        } while (opcion <= 5);
    }
    
    
}
