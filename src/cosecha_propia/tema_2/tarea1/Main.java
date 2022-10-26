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
        System.out.println("introduce una lista separada por comas: ");
        lista.introducir(c.readLine());
        int op;

        if (lista.getLista() == null){
            do {
                System.out.println("la lista está vacía, prueba a llenarla orta vez.");
                lista.introducir(c.readLine());
            }while (lista.getLista() == null);
        }
        System.out.println("lista introducida: ");
        for(int i =0;i<lista.getLista().length;i++){
            System.out.println(lista.getLista()[i]);
        }
        System.out.println("-------------------------");
        
            System.out.println("1) Filtrar.");
            System.out.println("2) Dividir.");
        do{    
            op = pideInt(sc);
            if (op<1 || op >2) System.out.println("Selecciona la opcion 1 o 2. ");
        }while (op<1 || op >2);

        switch (op) {
            case 1 :
                System.out.print("introduce un filtro: ");
                String filtro=c.readLine();
                String[] temp = lista.filtrar(filtro);
                System.out.println("Mostrando resultados filtrados por \"" + filtro + "\": ");
                for(int i =0;i<temp.length;i++){
                    System.out.println(temp[i]);
                }
                System.out.println("-------------------------");
                break;
            case 2 :
                System.out.println("indica por qué palabra dividir. ");
                String[][] dividir = lista.dividir(c.readLine());

                System.out.println("primera parte de la lista: ");
                System.out.println("----------");
                for (int i=0;i<dividir[0].length;i++){
                    System.out.println(dividir[0][i]);
                }
                System.out.println("----------");

                System.out.println("segunda parte de la lista: ");
                System.out.println("----------");
                for (int i=0;i<dividir[1].length;i++){
                    System.out.println(dividir[1][i]);
                }
                System.out.println("------------------");
        }
    }

    public static int pideInt(Scanner sc){
        int op=-1;
        try {
            op=sc.nextInt();
        } catch (Exception e) {
            System.out.println("elige 1 o 2. ");
        }
        return op;
    }
}