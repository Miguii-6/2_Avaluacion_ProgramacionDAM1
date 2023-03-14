
package boletin21_3;

import com.miguel.datos.PedirDatos;


public class Boletin21_3 {

    
    public static void main(String[] args) {
       ConNomes notalum = new ConNomes();
        notalum.crearArrayInt();

        int indiceAlumno = notalum.buscarAlumno("ana");
        if (indiceAlumno < 0) {
            System.out.println("O umno non existe");
        } else {
            String nombreAlumno = notalum.alumnos[indiceAlumno];
            int notaAlumno = notalum.notas[indiceAlumno];
            System.out.println("La nota de " + nombreAlumno + " es: " + notaAlumno);
        }

        /*
        int indiceAlumno=ArrayUtils.buscar(notalum.alumnos, alumnoBuscar);
        if (indiceAlumno < 0) {
            System.out.println("El alumno no existe");
        } else {
            String nombreAlumno = notalum.alumnos[indiceAlumno];
            int notaAlumno = notalum.notas[indiceAlumno];
            System.out.println("La nota de "+nombreAlumno+" es: "+notaAlumno);
        }*/
        notalum.mostrarNombresAprobados();

        System.out.println("Notas ordenadas:");
        notalum.ordenarNotas();

        String alumnoBuscar = PedirDatos.pedirString("Escribe o nome do alumno para buscalo");
        notalum.imprimirNotaDeUnAlumno(alumnoBuscar);

    }
    
    
}
