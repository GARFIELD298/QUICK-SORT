import java.io.*;
import java.util.*;

public class QuickSort {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Entrada.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lista.add(Integer.parseInt(linea.trim()));
            }
        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
            return;
        }

        int[] arr = lista.stream().mapToInt(i -> i).toArray();
        quickSort(arr, 0, arr.length - 1);
        try (PrintWriter pw = new PrintWriter(new FileWriter("Salida.txt"))) {
            for (int num : arr) {
                pw.println(num);
            }
        } catch (Exception e) {
            System.out.println("Error al escribir archivo: " + e.getMessage());
        }

        System.out.println("Ordenamiento terminado. Revisa Salida.txt");
    }

    public static void quickSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int pivoteIndex = particion(arr, inicio, fin);
            quickSort(arr, inicio, pivoteIndex - 1);
            quickSort(arr, pivoteIndex + 1, fin);
        }
    }

    public static int particion(int[] arr, int inicio, int fin) {
        int pivote = arr[fin];
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (arr[j] <= pivote) {
                i++;
                intercambiar(arr, i, j);
            }
        }
        intercambiar(arr, i + 1, fin);
        return i + 1;
    }

    public static void intercambiar(int[]    arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}