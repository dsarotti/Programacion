package cosecha_propia.tema_2.tarea1;
import java.io.Console;
public class Main {
    public static void main(String[] args) {
        Palabras lista = new Palabras();
        Console c = System.console();
        System.out.println("introduce una lista separada por comas :");
        lista.introducir(c.readLine());

    }
    
}
