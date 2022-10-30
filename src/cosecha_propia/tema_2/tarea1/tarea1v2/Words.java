package cosecha_propia.tema_2.tarea1.tarea1v2;

import java.io.Console;
import java.util.Arrays;

public class Words {
    /*
     * Esta es otra versión de la tarea 1 en la que hago más uso de librearías ya
     * existentes y métodos estáticos.
     * De esta forma el código queda más simplificado y compacto.
     */
    public static void main(String[] args) {
        /*
         * Muestra un menú por la salida estándar y pide que se introduzca una opción
         * por teclado. Después ejecuta la opción solicitada.
         */

        Console c = System.console();
        String[] words;
        int op;

        System.out.print("Introduce palabras separadas por \", \": ");
        words = fill(c);

        do {
            System.out.println("############-Menu-############");
            System.out.println("Opcion 1: Filtrar.           #");
            System.out.println("Opcion 2: Dividir y ordenar. #");
            System.out.println("Opcion 3: Salir.             #");
            System.out.println("##############################");
            op = selectOption(c);
            switch (op) {
                case 1:
                    filter(words, c);
                    break;
                case 2:
                    divide(words, c);
                    break;
            }
        } while (op != 3);
    }

    public static String[] fill(Console c) {
        /*
         * Pide una String de palabras separadas por ", " y devuelve una Array con una
         * palabra en cada posición. Como mínimo admite una palabra.
         */
        String[] res;
        String resStr;
        resStr = c.readLine();
        do {
            if (resStr.length() == 0) {
                System.out.print("introduce al menos una palabra: ");
                resStr = c.readLine();
            }
        } while (resStr.length() == 0);
        res = resStr.split(", ");

        return res;
    }

    public static int selectOption(Console c) {
        /*
         * Pide al usuario que introduzca una opción. Sólo admite números del 1 al 3.
         */
        int temp = -1;

        do {
            System.out.print("Escoge 1, 2 o 3: ");
            try {
                temp = Integer.parseInt(c.readLine());
            } catch (Exception NumberFormatException) {
                System.out.println("Debes introducir un numero. ");
            }
        } while (temp < 1 && temp > 3);
        return temp;
    }

    private static void filter(String[] words, Console c) {
        /**
         * Recibe una Array de Strings @param words y pide al usuario que introduzca un
         * filtro.
         * Busca palabras que empiecen por dicho filtro dentro del array y las muestra.
         */
        String filter;
        System.out.print("Introduce algo por lo que filtrar: ");
        do {
            filter = c.readLine();
        } while (filter.isEmpty() || filter.isBlank());
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(filter) == 0) {
                System.out.println(words[i]);
            }
        }
    }

    private static void divide(String[] words, Console c) {
        /**
         * Recibe un Array de Strings. Solicita al usuario que introduzca una cadena.
         * Ordena el array lexicográficamente y muestra las palabras anteriores y
         * posteriores o iguales a la cadena antes solicitada.
         */
        String[] ordered = words.clone();
        Arrays.sort(ordered);
        String div;
        int key;
        System.out.println("Introduce una cadena por la que dividir: ");
        do {
            div = c.readLine();
        } while (div.isEmpty() || div.isBlank());

        if (Arrays.binarySearch(ordered, div) < 0) {
            key = Math.abs(Arrays.binarySearch(ordered, div)) - 1;
        } else {
            key = Arrays.binarySearch(ordered, div);
        }

        System.out.println("Palabras anteriores a \"" + div + "\": ");
        for (int i = 0; i < key; i++) {
            System.out.println(ordered[i]);
        }
        System.out.println("Palabras iguales o posteriores a \"" + div + "\": ");
        for (int i = key; i < ordered.length; i++) {
            System.out.println(ordered[i]);
        }
    }
}