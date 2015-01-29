package boletin.pkg18.pkg2;

public class Metodos {

    public static int[] notas(int notas[]) {
        for (int i = 0; i < notas.length; i++) {
            int a = (int) (Math.random() * 10 + 1);
            notas[i] = a;
        }

        return notas;
    }

    public static void notasTotales(int notas[]) {
        System.out.println("Notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + ",");
        }
        System.out.println("\n");
    }

    public static void totalAS(int nota[]) {

        int contadorA = 0, contadorB = 0;
        for (int i = 0; i < nota.length; i++) {
            if (nota[i] >= 5) {
                contadorA++;

            }
            if (nota[i] < 5) {
                contadorB++;
            }

        }
        System.out.println("Aprobados: " + contadorA + "\tSuspensos: " + contadorB);
    }

    public static void aprobadosSuspensos(int nota) {

        if (nota >= 5) {

            System.out.println("Aprobado \n");

        } else {
            System.out.println("Suspenso \n");
        }
    }

    public static void notaAlta(int nota[]) {
        int notaAlta = 0;
        for (int i = 0; i < nota.length; i++) {
            if (nota[i] > notaAlta) {
                notaAlta = nota[i];
            }
        }
        System.out.println("Nota mas alta: " + notaAlta);
    }

    public static void notaMedia(int media[]) {
        int suma = 0, res;
        for (int i = 0; i < media.length; i++) {
            suma = suma + media[i];
        }
        suma = suma / media.length;

        System.out.println("Media de la Clase: " + suma);
    }

    public static void verNotas(int nota[], String nombre[]) {

        System.out.println("Desordenado\nNota Alumnos : \n");
        for (int i = 0; i < nota.length; i++) {
            //ordenarBurbuja(nota);
            System.out.println(nombre[i] + " " + nota[i]);
            aprobadosSuspensos(nota[i]);
        }
        System.out.println("Ordenado\nNota Alumnos: \n");
        for (int i = 0; i < nota.length; i++) {
            ordenarBurbuja(nota,nombre);
            System.out.println(nombre[i] + " " + nota[i]);
            aprobadosSuspensos(nota[i]);
        }
    }

    public static void ordenarBurbuja(int nota[], String nombre[]) {
        String auxS;
        int aux, cambio = 0, i;
        do {
            cambio = 0;
            for (i = 0; i < nota.length - 1; i++) {
                if (nota[i] > nota[i + 1]) {
                    aux = nota[i];
                    nota[i] = nota[i + 1];
                    nota[i + 1] = aux;
                    
                    auxS = nombre[i];
                    nombre[i] = nombre[i + 1];
                    nombre[i + 1] = auxS;
                    cambio = 1;
                }
            }
        } while (cambio != 0);
    }

}
