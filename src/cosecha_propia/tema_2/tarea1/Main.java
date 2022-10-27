package cosecha_propia.tema_2.tarea1;

import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * genera el menú desde el que se maneja el programa
         */
        Scanner sc = new Scanner(System.in);
        Console c = System.console();
        Palabras lista = new Palabras();

        System.out.println("introduce una lista de palabras separadas por comas: ");
        lista.introducir(c.readLine());
        int op;

        // si se introduce una lista vacía se vuelve a pedir
        if (lista.getLista() == null) {
            do {
                System.out.println("la lista está vacía, prueba a llenarla otra vez.");
                lista.introducir(c.readLine());
            } while (lista.getLista() == null);
        }
        do {
            // Se muestra la lista introducida y el menú.
            System.out.println("lista introducida: ");
            for (int i = 0; i < lista.getLista().length; i++) {
                System.out.println(lista.getLista()[i]);
            }
            System.out.println("-------------------------");

            System.out.println("1) Filtrar.");
            System.out.println("2) Dividir.");
            System.out.println("3) Salir");
            // solo se admite el número 1, 2 o 3.
            System.out.println("Selecciona la opcion 1, 2 o 3. ");
            do {
                op = pideInt(sc);
            } while (op < 1 || op > 3);

            switch (op) {
                case 1:
                    System.out.print("introduce un filtro: ");
                    String filtro = c.readLine();
                    String[] temp = lista.filtrar(filtro);
                    System.out.println("Mostrando resultados filtrados por \"" + filtro + "\": ");
                    for (int i = 0; i < temp.length; i++) {
                        System.out.println(temp[i]);
                    }
                    System.out.println("-------------------------");
                    break;
                case 2:
                    System.out.println("Indica por qué palabra dividir. ");
                    String[][] dividir = lista.dividir(c.readLine());

                    System.out.println("Primera parte de la lista: ");
                    System.out.println("----------");
                    // muestra la primera parte de la lista
                    for (int i = 0; i < dividir[0].length; i++) {
                        System.out.println(dividir[0][i]);
                    }
                    System.out.println("----------");

                    System.out.println("Segunda parte de la lista: ");
                    System.out.println("----------");
                    // muestra la segunda parte de la lista
                    for (int i = 0; i < dividir[1].length; i++) {
                        System.out.println(dividir[1][i]);
                    }
                    System.out.println("-------------------------");
            }
        } while (op != 3);
        System.out.println("Saliendo...");
    }

    public static int pideInt(Scanner sc) {
        int op = -1;
        try {
            op = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Elige 1, 2 o 3. ");
        }
        return op;
    }
}