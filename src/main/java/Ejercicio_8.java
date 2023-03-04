import java.util.Scanner;

public class Ejercicio_8 {
    /*Realizar un algoritmo que permita jugar a los barcos con las siguientes simplificaciones:

Solo hay un jugador.

Solo hay cuatro filas y cuatro columnas.

Solo hay un barco que ocupa una única celda (este espacio se elige al azar).

Ejemplo de ejecución:

????

????

????

????

¿Qué columna? 2

¿Qué línea? 2

Agua

????

?~??

????

????

¿Qué columna? 4

¿Qué línea? 1

Agua

??~

?~??

????

????

¿Qué columna? 1

¿Qué línea? 3

Tocado y hundido

Ha ganado*/

    public static void main(String[] args) {
        int[][] tabla = new int[4][4];
        int val = 0;
        for (int j = 0; j < tabla.length; j++) {
            for (int i = 0; i < tabla[j].length; i++) {
                tabla[j][i] = val;
                val++;
            }
        }
        int barco = (int) (Math.random() * 16);
        int columna = 0;
        int linea = 0;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        while (contador < 16) {
            System.out.println("¿Qué columna?");
            columna = sc.nextInt();
            System.out.println("¿Qué línea?");
            linea = sc.nextInt();
            if (tabla[linea - 1][columna - 1] == barco) {
                System.out.println("Tocado y hundido");
                contador = 16;
            } else {
                System.out.println("Agua");
                contador++;
            }
        }
        if (contador == 16) {
            System.out.println("Ha ganado");
        }
    }


}
