
package boletin24;


public class Libro implements Comparable {

    String titulo;
    String autor;
    String isbn;
    float precio;
    int numeroUnidades;

     public Libro(String titulo, String autor, String isbn, float precio, int numeroUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.numeroUnidades = numeroUnidades;
    }
    
    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNumeroUnidades() {
        return numeroUnidades;
    }

    public void setNumeroUnidades(int numeroUnidades) {
        this.numeroUnidades = numeroUnidades;
    }

    @Override
    public String toString() {
        return "Libro: " + "Título= " + titulo + ", autor= " + autor + ", ISBN= " + isbn + ", precio= " + precio + ", número de unidades= " + numeroUnidades;
    }

    @Override
    public int compareTo(Object o) {
        Libro x=(Libro)o;
        if(this.titulo.compareToIgnoreCase(x.titulo)>0)
             return 1;
         
         else if(this.titulo.compareToIgnoreCase(x.titulo)<0)
              return -1;
         
             else
              return 0;
    }
}
