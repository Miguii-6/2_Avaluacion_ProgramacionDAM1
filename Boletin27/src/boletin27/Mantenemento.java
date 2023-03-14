
package boletin27;

import com.miguel.datos.PedirDatos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Mantenemento  {
    FileWriter out = null;
    PrintWriter fich = null;
    Scanner sc;
    
    public void escribirPalabras(File fichero) {
        try {
            out = new FileWriter(fichero);
            fich = new PrintWriter(out);
            fich.println(new Libro(PedirDatos.pedirString("Escribe nombre del libro: "), PedirDatos.pedirString("Escribe el autor del libro: "), PedirDatos.pedirFloat("Escribe el precio del libro: "), PedirDatos.pedirInt("Escribe las unidades existentes: ")));
        } catch (IOException ex) {
            System.out.println("Error de escritura" + ex.getMessage());
        } finally {
            fich.close();
        }
    }
    
    public void agregarPalabras(File fichero) {
        try {
            out = new FileWriter(fichero, true);
            fich = new PrintWriter(out);
            fich.println(new Libro(PedirDatos.pedirString("Escribe nombre del libro: "), PedirDatos.pedirString("Escribe el autor del libro: "), PedirDatos.pedirFloat("Escribe el precio del libro: "), PedirDatos.pedirInt("Escribe las unidades existentes: ")));
        } catch (IOException ex) {
            System.out.println("Error de escritura" + ex.getMessage());
        } finally {
            fich.close();
        }
    }
    
    public ArrayList<Libro> leerObjeto(File fichero) {
        ArrayList<Libro> lista = new ArrayList<>();
        String[] aux;
        try {
            sc = new Scanner(fichero);//abrir fichero
            while (sc.hasNextLine()) { //leer fichero
                aux = sc.nextLine().split(", ");
                lista.add(new Libro(aux[0], aux[1], Float.parseFloat(aux[2]), Integer.parseInt(aux[3])));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se puede leer el fichero");
        } finally {
            sc.close(); //cerramos fichero
        }
        return lista;
    }
    
    public void buscarPorTitulo(ArrayList<Libro> lista) {
        String titulo = PedirDatos.pedirString("Escribe el titulo del libro: ");
        int libroEncontrado = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (titulo.equalsIgnoreCase(lista.get(i).getTitulo())) {
                JOptionPane.showMessageDialog(null, lista.get(i).getPrecio());
                libroEncontrado = 1;
                break;
            }
        }
        if (libroEncontrado == 0) {
            JOptionPane.showMessageDialog(null, "El libro no existe.");
        }
    }
    
    public void mostrar(ArrayList<Libro> lista) {
        for (Libro lib : lista) {
            System.out.println(lib);
        }
    }
    
    public ArrayList<Libro> borrar(ArrayList<Libro> lista) {
        ArrayList<Libro> filtrada = new ArrayList<>();
        for (Libro lib : lista) {
            if (lib.getUnidades() > 0) {
                filtrada.add(lib);
            }
        }
        return filtrada;
    }
    
    public void reemplazarFichero(File fichero, ArrayList<Libro> lista) {
        try {
            out = new FileWriter(fichero);
            fich = new PrintWriter(out);
            for (int i = 0; i < lista.size(); i++) {
                fich.println(lista.get(i));
            }
        } catch (IOException ex) {
            System.out.println("Error de escritura" + ex.getMessage());
        } finally {
            fich.close();
        }
    }
    
    public void modificarPrecio(ArrayList<Libro> lista) {
        String titulo = PedirDatos.pedirString("Escribe el titulo del libro: ");
        int libroEncontrado = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (titulo.equalsIgnoreCase(lista.get(i).getTitulo())) {
                float nuevoPrecio= PedirDatos.pedirFloat("Nuevo precio: ");
                lista.get(i).setPrecio(nuevoPrecio);
                libroEncontrado = 1;
                break;
            }
        }
        if (libroEncontrado == 0) {
            JOptionPane.showMessageDialog(null, "El libro no existe.");
        }
    }
}
