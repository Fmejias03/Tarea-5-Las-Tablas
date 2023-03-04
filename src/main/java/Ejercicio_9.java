import java.util.Scanner;

public class Ejercicio_9 {
    /*Crear un algoritmo para jugar a tres en raya: en una cuadrícula de tres celdas por tres, los jugadores se turnan para escribir su símbolo (X y O) en una celda vacía. El primer jugador que logre alinear (en fila, columna o diagonal) tres de sus símbolos, gana.*/

    public static void main(String[] args) {
        String[][] tabla = new String[3][3];
        int val = 0;
        for (int j = 0; j < tabla.length; j++) {
            for (int i = 0; i < tabla[j].length; i++) {
                tabla[j][i] = " ";
            }
        }
        while (val != -1) {
            for (int j = 0; j < tabla.length; j++) {
                for (int i = 0; i < tabla[j].length; i++) {
                    System.out.print(tabla[j][i]);
                }
                System.out.println();
            }
            System.out.println("¿Qué columna?");
            int columna = new Scanner(System.in).nextInt();
            System.out.println("¿Qué línea?");
            int linea = new Scanner(System.in).nextInt();
            if (tabla[linea - 1][columna - 1].equals(" ")) {
                if (val % 2 == 0) {
                    tabla[linea - 1][columna - 1] = "X";
                } else {
                    tabla[linea - 1][columna - 1] = "O";
                }
                val++;
            } else {
                System.out.println("Esa celda ya está ocupada");
            }
        }
    }
}
