public class Ejercicio_6 {
    //1.
    /*¿Qué contiene la tabla generada por el algoritmo siguiente?

Algo QueHace
# ??
Constante TAMAÑO       : entero <- 3
Variable i, j, val: entero
Variable tab2d: entero[TAMAÑO][TAMAÑO]
Inicio
 val <- 1
 Para j <- 0 a TAMAÑO - 1
   Para i <- 0 a TAMAÑO - 1
     tab2d[j][i] <- val
     val <- val + 1
   FPara
 FPara
Fin */

    //La tabla contiene los valores del 1 al 9, en orden ascendente, de izquierda a derecha y de arriba a abajo.

    //2.
    /*Modificar el algoritmo anterior para que la tabla tenga cuatro filas y cuatro columnas con los valores de uno a dieciséis, completando en primer lugar la primera columna, luego la segunda, posteriormente la tercera y por último la cuarta.*/

   /* public static void main(String[] args) {
        int[][] tabla = new int[4][4];
        int val = 1;
        for (int j = 0; j < tabla.length; j++) {
            for (int i = 0; i < tabla[j].length; i++) {
                tabla[j][i] = val;
                val++;
            }
        }
        for (int j = 0; j < tabla.length; j++) {
            for (int i = 0; i < tabla[j].length; i++) {
                System.out.print(tabla[j][i] + " ");
            }
            System.out.println();
        }
    }*/

    //3
    /*Modificar el algoritmo nuevamente, para tener los siguientes valores en la tabla:

0

1

2

3

1

2

3

4

2

3

4

5

3

4

5

6*/

    public static void main(String[] args) {
        int[][] tabla = new int[4][4];
        int val = 0;
        for (int j = 0; j < tabla.length; j++) {
            for (int i = 0; i < tabla[j].length; i++) {
                tabla[j][i] = val;
                val++;
            }
            val = j + 1;
        }
        for (int j = 0; j < tabla.length; j++) {
            for (int i = 0; i < tabla[j].length; i++) {
                System.out.print(tabla[j][i] + " ");
            }
            System.out.println();
        }
    }
}
