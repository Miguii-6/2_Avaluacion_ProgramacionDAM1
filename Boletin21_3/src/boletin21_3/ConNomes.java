
package boletin21_3;

import com.miguel.datos.PedirDatos;
import java.util.Arrays;


public class ConNomes {
    int[] notas = new int[3];
    String[] alumnos = new String[3];

    public void crearArrayInt() {
        for (int i = 0; i < notas.length; i++) {
            alumnos[i] = PedirDatos.pedirString("Escribe o nome do alumno: ");
            notas[i] = PedirDatos.pedirInt("Ecribe a nota do alumno");
        }
    }

    public int buscarAlumno(String alumnoBuscar) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnoBuscar.equals(alumnos[i])) {
                return i;
            }
        }
        return -1;
    }

    public void imprimirNotaDeUnAlumno(String alumnoBuscar) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnoBuscar.equals(alumnos[i])) {
                System.out.println("A nota de " + alumnos[i] + " es: " + notas[i]);
                return;
            }
        }
        System.out.println("O alumno non existe");
    }

    public void mostrarNumeroAprobadosSupensos(int[] notas) {
        int numAprobados = 0;
        int numSuspensos = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                numAprobados = numAprobados + 1;
            } else {
                numSuspensos = numSuspensos + 1;
            }

        }

        System.out.println("Os aprobados son: " + numAprobados);
        System.out.println("Os suspensos son: " + numSuspensos);
    }

    public void mostrarNombresAprobados() {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.println(alumnos[i] + " está aprobado");
                //System.out.println(String.format("%s está aprobado", alumnos[i]));
            }
        }
    }

    public void mostrarMedia(int[] notas) {
        int contadorAprobado = 0;
        int contadorSuspenso = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                contadorAprobado = contadorAprobado + notas[i]; //para sacar la media
            } else {
                contadorSuspenso = contadorSuspenso + notas[i];
            }

        }
        int media = (contadorAprobado + contadorSuspenso) / notas.length;

        System.out.println("A media e: " + media);
    }

    public void notaMasAlta(int[] notas) {
        int notaMayor = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notaMayor < notas[i]) {
                notaMayor = notas[i];
            }
        }
        System.out.println("A nota mais alta e: " + notaMayor);
    }

    public void ordenarNotas() {
        int aux = 0;
        String auxNombre;

        for (int i = 0; i < notas.length; i++) {
            for (int j = i; j < notas.length; j++) {
                if (notas[i] < notas[j]) {
                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                    auxNombre = alumnos[i];
                    alumnos[i] = alumnos[j];
                    alumnos[j] = auxNombre;
                }
            }
            System.out.println(alumnos[i] + " "+notas[i]);
        }
    }
}
