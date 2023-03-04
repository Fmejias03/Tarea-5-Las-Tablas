import java.util.Scanner;
public class Ejercicio_3 {
    //Este algoritmo calcula la media de valores (por ejemplo, de las notas), introducidos por el usuario. En primer lugar, el usuario indica el número de valores cuyo promedio desea conocer. Seguidamente, introduce todos estos valores. Finalmente, se muestra la media de estos valores.
    //
    //A continuación se muestra un ejemplo de posibles visualizaciones y valores introducidos, durante una ejecución del algoritmo (los valores introducidos por el usuario, están escritos en negrita y cursiva):
    //
    //Introduzca el número de notas:
    //
    //3
    //
    //Nota:
    //
    //12
    //
    //Nota:
    //
    //17,5
    //
    //Nota:
    //
    //14
    //
    //La media es 14,5

    /*public static void main(String[] args) {

        int n;
        double nota, suma, media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número de notas:");
        n = teclado.nextInt();
        suma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Nota:");
            nota = teclado.nextDouble();
            suma = suma + nota;
        }
        media = suma / n;
        System.out.println("La media es " + media);
    }*/

    //------------------------------------------------------------------------------------------------------------------

    //Ejercicio 1 V2

    //El objetivo sigue siendo realizar el cálculo de la media de un conjunto de valores introducidos por el usuario, pero el usuario ya no tiene que indicar inicialmente el número de valores. Introduce los valores y cuando ha terminado, introduce un valor concreto (-1), para indicar que ha terminado de introducir valores.
    //
    //Ejemplo de ejecución del algoritmo:
    //
    //¿Nota (-1 para terminar)?
    //
    //9
    //
    //¿Nota (-1 para terminar)?
    //
    //18
    //
    //¿Nota (-1 para terminar)?
    //
    //-1
    //
    //La nota media es 13,5

    /*public static void main(String[] args) {

        double nota, suma, media;
        int n;
        Scanner teclado = new Scanner(System.in);
        suma = 0;
        n = 0;
        System.out.println("¿Nota (-1 para terminar)?");
        nota = teclado.nextDouble();
        while (nota != -1) {
            suma = suma + nota;
            n = n + 1;
            System.out.println("¿Nota (-1 para terminar)?");
            nota = teclado.nextDouble();
        }
        media = suma / n;
        System.out.println("La nota media es " + media);
    }*/

    //------------------------------------------------------------------------------------------------------------------

    //Ejercicio 1 V3

    //Modificar el algoritmo anterior para mostrar además el porcentaje de notas superiores a 10/20.
    //
    //Ejemplo de ejecución del algoritmo:
    //
    //¿Nota (-1 para terminar)?
    //
    //14
    //
    //¿Nota (-1 para terminar)?
    //
    //12
    //
    //¿Nota (-1 para terminar)?
    //
    //9
    //
    //¿Nota (-1 para terminar)?
    //
    //7
    //
    //¿Nota (-1 para terminar)?
    //
    //10
    //
    //¿Nota (-1 para terminar)?
    //
    //-1
    //
    //Media = 10,4 (60 % ≥10)

   /* public static void main(String[] args) {

        double nota, suma, media;
        int n, superiores;
        Scanner teclado = new Scanner(System.in);
        suma = 0;
        n = 0;
        superiores = 0;
        System.out.println("¿Nota (-1 para terminar)?");
        nota = teclado.nextDouble();
        while (nota != -1) {
            suma = suma + nota;
            n = n + 1;
            if (nota >= 10) {
                superiores = superiores + 1;
            }
            System.out.println("¿Nota (-1 para terminar)?");
            nota = teclado.nextDouble();
        }
        media = suma / n;
        System.out.println("Media = " + media + " (" + (superiores * 100 / n) + "% ≥10)");
    }*/

    //------------------------------------------------------------------------------------------------------------------
    //Ejercicio 1 V4

    /*Producir un algoritmo agregando notas en una tabla. Al final, mostrar todas las calificaciones y su media.

Ejemplo de ejecución del algoritmo:

¿Nota?

12

¿Nota?

15

¿Nota?

8

¿Nota?

7

¿Nota?

-1

La media de las notas (12; 15; 8; 7) es 10,5.*/


    public static void main(String[] args) {
        double[] notas = new double[100];
        double nota, suma, media;
        int n;
        Scanner teclado = new Scanner(System.in);
        suma = 0;
        n = 0;
        System.out.println("¿Nota?");
        nota = teclado.nextDouble();
        while (nota != -1) {
            notas[n] = nota;
            suma = suma + nota;
            n = n + 1;
            System.out.println("¿Nota?");
            nota = teclado.nextDouble();
        }
        media = suma / n;
        System.out.print("La media de las notas (");
        for (int i = 0; i < n; i++) {
            System.out.print(notas[i]);
            if (i < n - 1) {
                System.out.print("; ");
            }
        }
        System.out.println(") es " + media);
    }









}
