// APE 6 (Primera parte) - Ejercicio 2: Filtro y suma condicionada de producción
import java.util.Scanner;

public class ProduccionFiltro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] piezas = new int[10];

        // Ingreso de las piezas fabricadas por turno
        for (int i = 0; i < piezas.length; i++) {
            System.out.print("Piezas fabricadas en el turno " + (i + 1) + ": ");
            piezas[i] = sc.nextInt();
        }

        int sumaPares = 0;   // suma de los índices 0, 2, 4...
        int contador = 0;    // turnos impares y mayores a 15
        int sumaTotal = 0;

        for (int i = 0; i < piezas.length; i++) {
            if (i % 2 == 0) {
                sumaPares += piezas[i];
            }
            if (piezas[i] % 2 != 0 && piezas[i] > 15) {
                contador++;
            }
            sumaTotal += piezas[i];
        }

        double promedio = (double) sumaTotal / piezas.length;

        System.out.println("\nSuma de piezas en índices pares: " + sumaPares);
        System.out.println("Turnos con cantidad impar y mayor a 15: " + contador);
        System.out.printf("Promedio general de producción: %.2f%n", promedio);
        sc.close();
    }
}
