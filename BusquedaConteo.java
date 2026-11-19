// APE 6 (Segunda parte) - Ejercicio 1: Búsqueda y conteo
import java.util.Scanner;

public class BusquedaConteo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {14, 7, 25, 3, 18, 7, 30};

        System.out.print("Ingrese un número a buscar: ");
        int buscado = sc.nextInt();

        int veces = 0;
        int posicion = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                veces++;
                if (posicion == -1) {
                    posicion = i; // solo guarda la primera aparición
                }
            }
        }

        if (posicion == -1) {
            System.out.println("No existe (posicion = " + posicion + ")");
        } else {
            System.out.println("El número " + buscado + " aparece " + veces + " vez/veces.");
            System.out.println("Primera posición: " + posicion);
        }
        sc.close();
    }
}
