// APE 6 (Primera parte) - Ejercicio 3: Análisis de asistencia y rendimiento
import java.util.Scanner;

public class AsistenciaRendimiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de estudiantes: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.print("Debe ser mayor a 0. Ingrese nuevamente: ");
            n = sc.nextInt();
        }

        int[] notas = new int[n];

        // Llenado del arreglo con notas válidas (0 a 20)
        for (int i = 0; i < n; i++) {
            System.out.print("Nota del Estudiante " + (i + 1) + " (0-20): ");
            notas[i] = sc.nextInt();
            while (notas[i] < 0 || notas[i] > 20) {
                System.out.print("Nota inválida. Ingrese una nota entre 0 y 20: ");
                notas[i] = sc.nextInt();
            }
        }

        // Promedio general, aprobados y reprobados
        int suma = 0;
        int aprobados = 0;
        int reprobados = 0;
        for (int i = 0; i < n; i++) {
            suma += notas[i];
            if (notas[i] >= 14) {
                aprobados++;
            } else {
                reprobados++;
            }
        }
        double promedio = (double) suma / n; // evita la división entera

        System.out.printf("%nPromedio general: %.2f%n", promedio);
        System.out.println("Aprobados (nota >= 14): " + aprobados);
        System.out.println("Reprobados: " + reprobados);

        // Estudiantes estrictamente por debajo del promedio
        System.out.println("\nEstudiantes por debajo del promedio:");
        boolean hay = false;
        for (int i = 0; i < n; i++) {
            if (notas[i] < promedio) {
                System.out.println("Estudiante " + (i + 1) + " (nota " + notas[i] + ")");
                hay = true;
            }
        }
        if (!hay) {
            System.out.println("Ninguno");
        }
        sc.close();
    }
}
