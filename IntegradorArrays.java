// APE 6 (Segunda parte) - Ejercicio 3: Integrador con java.util.Arrays
import java.util.Arrays;

public class IntegradorArrays {
    public static void main(String[] args) {
        int[] datos = {14, 7, 25, 3, 18};

        // Copia real del arreglo original
        int[] copia = Arrays.copyOf(datos, datos.length);

        // Se ordena solo la copia
        Arrays.sort(copia);

        System.out.println("Original: " + Arrays.toString(datos));
        System.out.println("Copia ordenada: " + Arrays.toString(copia));

        // En un arreglo ordenado ascendente, el segundo mayor está en length - 2
        int segundoMayor = copia[copia.length - 2];
        System.out.println("Segundo número mayor: " + segundoMayor);

        // binarySearch solo es válido sobre el arreglo ya ordenado
        int posicion14 = Arrays.binarySearch(copia, 14);
        System.out.println("Posición del 14 en la copia: " + posicion14);
    }
}
