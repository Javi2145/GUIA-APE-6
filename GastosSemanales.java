// APE 6 (Primera parte) - Ejercicio 1: Control de gastos semanales y ajuste por inflación
import java.util.Locale;
import java.util.Scanner;

public class GastosSemanales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // permite ingresar decimales con punto

        double[] gastos = new double[7];

        // Registro de los gastos diarios de la semana
        for (int i = 0; i < gastos.length; i++) {
            System.out.print("Gasto del día " + (i + 1) + ": ");
            gastos[i] = sc.nextDouble();
        }

        // Gasto total y promedio diario
        double total = 0;
        for (int i = 0; i < gastos.length; i++) {
            total += gastos[i];
        }
        double promedio = total / gastos.length;

        System.out.printf("%nGasto total: %.2f%n", total);
        System.out.printf("Promedio diario: %.2f%n", promedio);

        // Aumento del 10 % solo a los días que superaron el promedio
        int diasIncrementados = 0;
        for (int i = 0; i < gastos.length; i++) {
            if (gastos[i] > promedio) {
                gastos[i] = gastos[i] * 1.10;
                diasIncrementados++;
            }
        }

        // Arreglo actualizado en orden inverso
        System.out.println("\nArreglo actualizado (orden inverso):");
        for (int i = gastos.length - 1; i >= 0; i--) {
            System.out.printf("Día %d: %.2f%n", (i + 1), gastos[i]);
        }

        System.out.println("\nDías que sufrieron el incremento: " + diasIncrementados);
        sc.close();
    }
}
